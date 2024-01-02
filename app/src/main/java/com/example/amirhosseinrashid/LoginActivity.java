package com.example.amirhosseinrashid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Button btnlogin = findViewById(R.id.btnlogin);
        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText editusername =findViewById(R.id.textfildUserName);
                EditText editpassword =findViewById(R.id.textfildPassword);

                String username =editusername.getText().toString();
                String password =editpassword.getText().toString();

                if(username.isEmpty()){
                    Toast.makeText(getApplicationContext(),"Username must have value",Toast.LENGTH_LONG);

                    return;

                }if (password.isEmpty()){
                    Toast.makeText(getApplicationContext(),"Password must have value",Toast.LENGTH_LONG);
                    return;

                }if(username.length()>20 || username.length() < 8){
                    Toast.makeText(getApplicationContext(),"Username must be 8 to 20 charecters length! :(",Toast.LENGTH_LONG);
                    return;
                }
            }
        });
    }
}