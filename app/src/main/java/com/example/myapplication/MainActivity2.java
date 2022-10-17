package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Button button = (Button) findViewById(R.id.button3);
        button.setOnClickListener(v -> openMainActivity3());
    }

    public void openMainActivity3() {
        Intent intent = new Intent(this, MainActivity3.class);
        startActivity(intent);
    }
}
