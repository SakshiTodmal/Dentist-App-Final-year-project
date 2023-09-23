package com.example.finalyearproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class IntroductionPage extends AppCompatActivity {

    Button create_account_button;
    TextView login_click;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_introduction_page);
        create_account_button=findViewById(R.id.create_account_button);
        login_click=findViewById(R.id.login_click);

        create_account_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(IntroductionPage.this,Registration.class);
                startActivity(intent);
                finish();
            }
        });

        login_click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(IntroductionPage.this,Login.class);
                startActivity(intent);
                finish();
            }
        });
    }
}