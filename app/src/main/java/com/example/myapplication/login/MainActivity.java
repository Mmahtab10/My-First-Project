package com.example.myapplication.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.myapplication.R;
import com.example.myapplication.view.ViewTransactionActivity;

public class MainActivity extends AppCompatActivity {
    public EditText usernameEditText;
    private EditText passwordEditText;
    private Button loginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        usernameEditText = (EditText) findViewById(R.id.username_edittext);
        passwordEditText = (EditText) findViewById(R.id.password_edittext);
        loginButton = (Button) findViewById(R.id.login_button);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                validate(usernameEditText.getText().toString(),passwordEditText.getText().toString());
            }
        });
    }
    private void validate(String username, String password){
        if(username.equals("Sajid")&& password.equals("007")){
            Intent intent= new Intent(MainActivity.this, ViewTransactionActivity.class);
            intent.putExtra("Username", username);
            startActivity(intent);
        }
        else{
            Toast.makeText(getApplicationContext(), "Incorrect username / password", Toast.LENGTH_LONG).show();
        }
    }


}
