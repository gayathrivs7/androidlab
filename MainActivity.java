package com.example.mcaguest.workshop1;

import android.content.Intent;
import android.media.Rating;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.widget.Button;
import android.view.View;
import android.widget.EditText;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button button1,button4,button5;
    EditText ed1, ed2;
    Button add;
    TextView tresult;
    RatingBar ratingBar1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       button1 = (Button) findViewById(R.id.button);
        ed1 = (EditText) findViewById(R.id.editText3);
        ed2 = (EditText) findViewById(R.id.editText4);
        add = (Button) findViewById(R.id.button3);
        tresult = (TextView) findViewById(R.id.textView);
        button4=(Button)findViewById(R.id.button4);
        button5=(Button)findViewById(R.id.button5);
        ratingBar1=(RatingBar)findViewById(R.id.ratingBar);
        ratingBar1.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                Toast.makeText(MainActivity.this, String.valueOf(ratingBar1.getRating()), Toast.LENGTH_SHORT).show();
                return false;
            }
        });

       /* first try..............
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "hello", Toast.LENGTH_SHORT).show();
            }
        });*/


    }

   /* public void toast(View View)
    {
        Toast.makeText(this, "SENDING...", Toast.LENGTH_SHORT).show();
    }*/

    public void add(View View)
    {
        double var1 = Double.parseDouble(ed1.getText().toString());
        double var2=Double.parseDouble(ed2.getText().toString());
        double result= var1+var2;
         tresult.setText(String.valueOf(result));
         button1.setVisibility(View.INVISIBLE);
         Intent intent=new  Intent(getApplicationContext(),Main2Activity.class);
         startActivity(intent);

    }
    public void concat(View View) {

        button1.setVisibility(View.INVISIBLE);
        String var1 = (ed1.getText().toString());
        String var2=(ed2.getText().toString());
        String result= var1+var2;
        tresult.setText(String.valueOf(result));

    }
    public void rate(View View)
    {
        button1.setVisibility(View.INVISIBLE);
        button4.setVisibility(View.INVISIBLE);
       // button2.setVisibility(View.INVISIBLE);
       // button3.setVisibility(View.INVISIBLE);
     String rt=String.valueOf(ratingBar1.getRating());
        Toast.makeText(this,rt, Toast.LENGTH_SHORT).show();

    }
}
