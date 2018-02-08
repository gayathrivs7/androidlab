package com.example.mca16a.gayath_eliz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.mca16a.gayath_eliz.MainActivity;
import com.example.mca16a.gayath_eliz.R;

public class Main2Activity extends AppCompatActivity {
    TextView textView;
    Button back;
    EditText text;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        textView=(TextView)findViewById(R.id.textView);
        back=(Button)findViewById(R.id.button);
        text=(EditText) findViewById(R.id.editText);
        Intent intent=getIntent();
        String str=intent.getStringExtra("message");
        textView.setText(str);

    }
    public void callback(View v)
    {
        Intent intent = new Intent(getApplicationContext(),MainActivity.class);
        String message=text.getText().toString();
        intent.putExtra("message",message);
        startActivity(intent);

    }
}
