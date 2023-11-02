package com.training.intentpractice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnSecondActivity= findViewById(R.id.btnSecondAcitvity);

        Button btnGoGoogle= findViewById(R.id.btnGoGoogle);
        EditText etName= findViewById(R.id.etName);

        Button btnGreetme=findViewById(R.id.btnGreetme);


        btnSecondActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {




                // Explicit Intent
                Intent intent= new Intent(view.getContext(),SecondActivity.class);
                intent.putExtra("myName","Hello my friends!");
                startActivity(intent);
            }
        });

        btnGoGoogle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Implicit Intent
                Intent i= new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com"));

                startActivity(i);
            }
        });

        btnGreetme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // etName.getText().toString();
                Intent intent3= new Intent(view.getContext(),SecondActivity.class);
                intent3.putExtra("greetName",etName.getText().toString());
            startActivity(intent3);
            }

        });
    }
}