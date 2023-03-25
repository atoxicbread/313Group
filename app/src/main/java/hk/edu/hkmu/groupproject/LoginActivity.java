package hk.edu.hkmu.groupproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    EditText user_name;
    EditText user_password;

    Button login;
    Button signup;

    Mysql mysql;
    SQLiteDatabase db;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        user_name = this.findViewById(R.id.user_name);
        user_password = this.findViewById(R.id.user_password);

        login = this.findViewById(R.id.login);
        signup = this.findViewById(R.id.signup);

        mysql = new Mysql(this,"Userinfo",null,1);
        db = mysql.getReadableDatabase();
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String storage_username = user_name.getText().toString();
                String storage_userpassword = user_password.getText().toString();

                Cursor cursor = db.query("logins",new String[]{"usname","uspwd"}," usname=? and uspwd=?",
                        new String[]{storage_username,storage_userpassword},null,null,null);
                int flag = cursor.getCount();
                if (flag!=0){
                    Toast.makeText(getApplicationContext(), "Login Success！", Toast.LENGTH_SHORT).show();
                    Intent intent = null;
                    intent = new Intent(LoginActivity.this, HomeActivity.class);
                    startActivity(intent);
                }
                else {
                    if (storage_username.equals("admin") && storage_userpassword.equals("admin")) {
                        Toast.makeText(getApplicationContext(), "Admin Login Success！", Toast.LENGTH_SHORT).show();
                        Intent intent = null;
                        intent = new Intent(LoginActivity.this, HomeActivity.class);
                        startActivity(intent);
                    }
                    else{
                        Toast.makeText(getApplicationContext(), "Invalid username or password！", Toast.LENGTH_SHORT).show();
                    }
                }

            }
        });
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = null;
                intent = new Intent(LoginActivity.this, RegisterActivity.class);
                startActivity(intent);
            }
        });
    }
}