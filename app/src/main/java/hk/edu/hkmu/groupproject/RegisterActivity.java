package hk.edu.hkmu.groupproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {

    Button signup_success;
    EditText signup_user_name;
    EditText signup_user_password;
    EditText signup_user_password_again;

    Mysql mysql;
    SQLiteDatabase db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        signup_success = this.findViewById(R.id.signup_success);
        signup_user_name = this.findViewById(R.id.signup_user_name);
        signup_user_password = this.findViewById(R.id.signup_user_password);
        signup_user_password_again= this.findViewById(R.id.signup_user_password_again);

        mysql = new Mysql(this,"Userinfo",null,1);
        db = mysql.getReadableDatabase();
        signup_success.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String name = signup_user_name.getText().toString();
                String pwd01 = signup_user_password.getText().toString();
                String pwd02 = signup_user_password_again.getText().toString();

                if(name.equals("")||pwd01 .equals("")||pwd02.equals("")){

                    Toast.makeText(getApplicationContext(),"Empty Username or Password!",Toast.LENGTH_SHORT).show();
                }
                else {

                    if(pwd01.equals(pwd02)){

                        ContentValues cv = new ContentValues();

                        cv.put("usname",name);
                        cv.put("uspwd",pwd01);
                        db.insert("logins",null,cv);

                        Intent intent = new Intent();
                        intent.setClass(RegisterActivity.this,LoginActivity.class);
                        startActivity(intent);
                        Toast.makeText(getApplicationContext(),"Sign Up Success!",Toast.LENGTH_SHORT).show();
                    }
                    else {
                        Toast.makeText(getApplicationContext(),"Password Different!",Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
    }
}
