package com.example.mcaguest.saturday;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
Button b1,b2;
EditText ed1,ed2;
TextView tv1,tv2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=(Button)findViewById(R.id.button);
        b2=(Button)findViewById(R.id.button3);
        ed1=(EditText)findViewById(R.id.editText);
        ed2=(EditText)findViewById(R.id.editText3);
        tv1=(TextView)findViewById(R.id.textView);
        tv2=(TextView)findViewById(R.id.textView2);

    }
    public void exit(View v)
    {
       Intent i = new Intent(Intent.ACTION_MAIN);
       i.addCategory(Intent.CATEGORY_HOME);
       startActivity(i);

    }
    public void  next(View v)
    {
        String user="username";
        String pass="pass";
        String newuser=ed1.getText().toString();
        String newpass=ed2.getText().toString();
        try {
            if(user.equals(newuser) && pass.equals(newpass))
            {
                Intent i = new Intent(getApplicationContext(), Main2Activity.class);
                startActivity(i);
            }
            else
            {
                Toast.makeText(this, "Invalid login", Toast.LENGTH_SHORT).show();
            }



        }
        catch (Exception e)
        {

            Toast.makeText(this, "Exception caught", Toast.LENGTH_SHORT).show();
            //e.getMessage();
            e.printStackTrace();
        }
    }
}
