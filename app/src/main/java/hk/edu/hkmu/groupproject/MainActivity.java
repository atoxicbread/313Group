package hk.edu.hkmu.groupproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.welcome);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //实现界面跳转，从登录界面跳转到注册界面
                Intent intent = new Intent(MainActivity.this, LoginActivity.class);//跳转界面
                startActivity(intent);
                finish();
            }
        });
        }
    }
