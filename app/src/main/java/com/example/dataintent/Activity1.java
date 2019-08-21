package com.example.dataintent;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class Activity1 extends AppCompatActivity implements View.OnClickListener {
    ImageButton imageView4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_1);
        imageView4 = (ImageButton) findViewById(R.id.imageView4);
        imageView4.setOnClickListener((View.OnClickListener) this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.imageView4:
                Intent gofood = new Intent(Activity1.this, Activity2.class);
                startActivity(gofood);
                break;
        }
    }
}

