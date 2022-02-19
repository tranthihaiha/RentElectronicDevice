package com.haiha.login_register;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView btnChangeRegisterPage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnChangeRegisterPage = findViewById(R.id.btnChangeRegisterPage);
        btnChangeRegisterPage.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent inten = new Intent(MainActivity.this,RegisterActivity.class);
                        startActivity(inten);
                    }
                }
        );
    }

}