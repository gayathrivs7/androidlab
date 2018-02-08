package com.example.mca16a.gayath_eliz;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.mcaguest.gayath_eliz.R;

public class MainActivity extends AppCompatActivity {
    Button button,send2,brow;
    EditText text2;
    TextView text3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button= (Button)findViewById(R.id.button1);
        send2=(Button)findViewById(R.id.button2);
        text2=(EditText)findViewById(R.id.editText);
        text3=(TextView) findViewById(R.id.textView3);
        brow=(Button)findViewById(R.id.button3);
        Intent i = getIntent();
        String str = i.getStringExtra("message");
        text3.setText(str);



    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this, "Starting", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this, "Stopping", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "Destroying", Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "Resuming", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "Pausing", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(this, "Restarting", Toast.LENGTH_SHORT).show();
    }

    public void nextPage(View view)
    {
        Intent intent = new Intent(getApplicationContext(),Main2Activity.class);
        startActivity(intent);
    }
    public void send2A(View v)
    {
        String message = text2.getText().toString();
        Intent intent = new Intent(getApplicationContext(),Main2Activity.class);
        intent.putExtra("message",message);
        startActivity(intent);
    }
    public void browser(View v)
    {
        Uri uri1=Uri.parse("https://www.google.co.in/");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri1);
        startActivity(intent);
    }
}
