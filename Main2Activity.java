package com.example.mcaguest.saturday;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity {
    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        b1=(Button)findViewById(R.id.button);
    }
    public void logout(View view)
    {
        Intent i2= new Intent(getApplicationContext(),MainActivity.class);
        startActivity(i2);
    }
}
