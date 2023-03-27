package hk.edu.hkmu.groupproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.google.android.material.textfield.TextInputEditText;

import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;
import java.util.UUID;

public class CommentActivity extends AppCompatActivity {

    public static SharedPreferences login_pref;
    LinearLayout layout;

    Button btn_send;

    TextInputEditText textbox;

    SharedPreferences.Editor editor;

    ScrollView scrollView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comment);

        String testpref = LoginActivity.login_pref.getString("login","test");
        textbox  = findViewById(R.id.textbox);
        layout = findViewById(R.id.container);
        btn_send = findViewById(R.id.btn_send);
        scrollView = findViewById(R.id.scrollView);
        btn_send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String msg = textbox.getText().toString();
                if(!msg.equals("")) {
                    addCard(testpref, msg);
                    saveCardData(testpref, msg);
                    textbox.setText("");
                }
            }
        });

        editor = getSharedPreferences("CardData", MODE_PRIVATE).edit();
        SharedPreferences prefs = getSharedPreferences("CardData", MODE_PRIVATE);
        TreeMap<Long, String> cardDataMap = new TreeMap<>();
        for (Map.Entry<String, ?> entry : prefs.getAll().entrySet()) {
            String cardId = entry.getKey();
            String message = entry.getValue().toString();
            String[] cardData = message.split(",");
            String username = "";
            String cardText = "";
            long time = 0;
            if (cardData.length > 0) {
                username = cardData[0];
            }
            if (cardData.length > 1) {
                cardText = cardData[1];
            }
            if (cardData.length > 2) {
                time = Long.parseLong(cardData[2]);
            }
            cardDataMap.put(time, username + "," + cardText);
        }
        for (Map.Entry<Long, String> entry : cardDataMap.entrySet()) {
            String message = entry.getValue();
            String[] cardData = message.split(",");
            String username = "";
            String cardText = "";
            if (cardData.length > 0) {
                username = cardData[0];
            }
            if (cardData.length > 1) {
                cardText = cardData[1];
            }
            addCard(username, cardText);
        }
    }

    public void addCard(String testpref, String msg){
        View view = getLayoutInflater().inflate(R.layout.card, null);

        TextView nameView = view.findViewById(R.id.name);
        nameView.setText(testpref);
        TextView text = view.findViewById(R.id.textbox);
        text.setText(msg);

        layout.addView(view);

        layout.post(new Runnable() {
            @Override
            public void run() {
                scrollView.fullScroll(View.FOCUS_DOWN);
            }
        });
    }

    public void saveCardData(String testpref, String msg){
        String cardId = generateUniqueId();
        String cardData = testpref + "," + msg + "," + System.currentTimeMillis();
        editor.putString(cardId, cardData);
        editor.apply();
    }

    private String generateUniqueId() {
        return UUID.randomUUID().toString();
    }
}
