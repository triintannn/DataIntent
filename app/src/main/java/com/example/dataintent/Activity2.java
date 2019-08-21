package com.example.dataintent;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class Activity2 extends AppCompatActivity implements View.OnClickListener {

    Button order;
    EditText nama;
    EditText alamat;
    EditText pesan;

    public static String EXTRA_SELECTED_VALUE = "extra_selected_value";
    public static int RESULT_CODE = 110;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        order = findViewById(R.id.button_order);
        order.setOnClickListener((View.OnClickListener)this);
    }

    @Override
    public void (View view){
        Intent button_order = new Intent(Activity2.this,Activity3.class);
        nama = findViewById(R.id.nama);
        order.putExtra("Nama",nama.getText().toString());

        alamat = findViewById(R.id.alamat);
        order.putExtra("Alamat",alamat.getText().toString());

        pesan = findViewById(R.id.nama);
        order.putExtra("Pesan",pesan.getText().toString());

        startActivity(order);
    }

}
