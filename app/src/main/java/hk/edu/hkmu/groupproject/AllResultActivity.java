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

            SimpleAdapter adapter = new SimpleAdapter(
                    this,
                    ResultInfo.resultList,
                    R.layout.list_view_layout,

//                    contact.put(Title_en, title);
//            contact.put(District_en, district);
//            contact.put(Route_en, route);
//            contact.put(HowToAccess_en, howToAccess);
//            contact.put(MapURL_en, mapURL);
//            contact.put(Latitude, latitude);
//            contact.put(Longitude, longitude);
                    new String[] { ResultInfo.Title_en, ResultInfo.District_en, ResultInfo.Route_en,
                            ResultInfo.HowToAccess_en, ResultInfo.MapURL_en, ResultInfo.Latitude,
                            ResultInfo.Longitude},  // represent the three data that display in an item
                    new int[] { R.id.Title_en, R.id.District_en, R.id.Route_en, R.id.HowToAccess_en, R.id.MapURL_en,
                            R.id.Latitude, R.id.Longitude, }  // represent where the item is displayed
            );
            listView.setAdapter(adapter);

            // 2.
            listView.setOnItemClickListener(
                    new AdapterView.OnItemClickListener() {
                        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                            HashMap<String, String> contact = ResultInfo.resultList.get(position);
                            AlertDialog.Builder builder = new AlertDialog.Builder(AllResultActivity.this);// dialog creation

                            builder.setTitle(contact.get(ResultInfo.Latitude));
                            builder.setMessage("Mobile: " + contact.get(ResultInfo.Longitude));
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