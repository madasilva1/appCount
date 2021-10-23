package com.example.andrtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button floor,update;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        floor = (Button) findViewById(R.id.floor);
        update = (Button) findViewById(R.id.data);
        floor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"floor" ,Toast.LENGTH_LONG).show();
            }
        });
       update = (Button) findViewById(R.id.data);
       update.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {

startActivity(new Intent(MainActivity.this,UpdateAtivity.class));
           }
       });
floor = (Button) findViewById(R.id.floor);
floor.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        startActivity(new Intent(MainActivity.this, FloorActivity.class));
    }
});
    }

}
