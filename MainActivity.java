package com.example.mca16a.alertbox;

import android.content.Context;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button button;
    Context context = this;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=(Button)findViewById(R.id.button);
    }
    public void alert(View v)
    {
        AlertDialog.Builder alertbuilder = new AlertDialog.Builder(context);
        alertbuilder.setTitle("Alert !!!");
        alertbuilder.setMessage("Whats your action ?");
        alertbuilder.setPositiveButton("yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(context, "You Clicked Yes ", Toast.LENGTH_SHORT).show();

            }
        });
        alertbuilder.setNeutralButton("May be", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(context, "You clicked Maybe", Toast.LENGTH_SHORT).show();


            }
        });

        alertbuilder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(context, "You clicked No", Toast.LENGTH_SHORT).show();
            }
        });

        AlertDialog alertDialog = alertbuilder.create();
        alertbuilder.show();
    }
}
