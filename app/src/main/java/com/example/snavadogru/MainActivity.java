package com.example.snavadogru;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button bEnterace;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bEnterace = findViewById(R.id.button);

        bEnterace.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case (R.id.button):
                Intent i= new Intent(MainActivity.this,Options.class);
                startActivity(i);
                break;

        }
    }
}
