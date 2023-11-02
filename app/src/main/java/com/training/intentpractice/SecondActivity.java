package com.training.intentpractice;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        TextView txtView= findViewById(R.id.txtView);
        TextView txtGreetView=findViewById(R.id.txtGreetView);

        Bundle extras= getIntent().getExtras();
        if(extras!=null)
        {
            String string= extras.getString("myName");
            txtView.setText(""+string);


        }

        Bundle extras2= getIntent().getExtras();
        if(extras2==null)
        {
            return;
        }

            String greetString=extras2.getString("greetName");
            txtGreetView.setText("Wish you happy Birthday "+greetString);

    }
}