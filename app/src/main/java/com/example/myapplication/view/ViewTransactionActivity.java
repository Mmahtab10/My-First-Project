package com.example.myapplication.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import com.example.myapplication.R;
import com.example.myapplication.core.Transaction;

public class ViewTransactionActivity extends AppCompatActivity {

    private TextView usernameValueTextView;
    private TextView balanceValueTextView;
    private TextView transaction_History_label;
    private TextView

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_transaction);

        usernameValueTextView = (TextView) findViewById(R.id.username_textview_value);
        balanceValueTextView = (TextView) findViewById(R.id.balance_textview_value);
        transaction_History_label = (TextView) findViewById(R.id.transaction_History_label);

        String username = getIntent().getStringExtra("Username");
        usernameValueTextView.setText(username);

        // use sharedpreferences to get balance value - if it does not exist, then initialize to 0.0
    }
}
