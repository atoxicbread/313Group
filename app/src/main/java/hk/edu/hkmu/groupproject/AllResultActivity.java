package hk.edu.hkmu.groupproject;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import java.util.HashMap;

public class AllResultActivity extends AppCompatActivity {
    private String TAG = "AllResultActivity";
    private ListView listView; // ui component for displaying all contacts (x8 contacts)

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.acrivity_allresult);

        // initialize the listView ui component by using findViewById method
        listView = (ListView) findViewById(R.id.listview);

        // Get contact list with thread class
        JsonHandlerThread jsonHandlerThread = new JsonHandlerThread();
        jsonHandlerThread.start();

        try {
            jsonHandlerThread.join();

            // after retrieved the json contents and stored into the "contactList", i.e. contactList is ready for display
            // 1. setup ListView component to display the contact list
            // 2. implement the item click event handling

            // 1.
            // Create an adapter object that accommodates a data list of items to views that becomes children of an adapter view
            // i.e. the Adapter object acts as a bridge between an ListView and the contacts for that view
            SimpleAdapter adapter = new SimpleAdapter(
                    this,
                    ResultInfo.contactList,  // "contactList" that stores all the retrieved contacts, defined in ContactInfo
                    R.layout.list_view_layout, // layout resource represent item layout design
                    new String[] { ResultInfo.title_en, ResultInfo.district_en, ResultInfo.route_en
                            , ResultInfo.howToAccess_en, ResultInfo.mapURL_en},  // represent the three data that display in an item
                    new int[] { R.id.Title_en, R.id.District_en, R.id.Route_en, R.id.HowToAccess_en, R.id.MapURL_en }  // represent where the item is displayed
            );
            // Associate the adapter with the ListView
            listView.setAdapter(adapter);

            // 2.
            listView.setOnItemClickListener(
                    new AdapterView.OnItemClickListener() {
                        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                            HashMap<String, String> contact = ResultInfo.contactList.get(position);
                            AlertDialog.Builder builder = new AlertDialog.Builder(AllResultActivity.this);// dialog creation

                            builder.setTitle(contact.get(ResultInfo.latitude));
                            builder.setMessage("Mobile: " + contact.get(ResultInfo.longitude));
                            AlertDialog alertDialog = builder.create();
                            alertDialog.show();
                        }
                    }
            );

        } catch (InterruptedException e) {
            Log.e(TAG, "InterruptedException: " + e.getMessage());
        }
    }
}