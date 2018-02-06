package com.example.mcaguest.w2;

import android.content.Context;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telephony.gsm.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private static final int MY_PERMISSIONS_REQUEST_SEND_SMS =0 ;
    Button button2,button3;
    private Context context = this;
    EditText editText2,editText3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button3=(Button)findViewById(R.id.button2);
        editText2=(EditText)findViewById(R.id.editText2);
        editText3=(EditText)findViewById(R.id.editText3);
        button2=(Button)findViewById(R.id.button);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder alert= new AlertDialog.Builder(context);
                alert.setTitle("Close application");
                alert.setMessage("Do you want to close ? ").setPositiveButton("YES", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        MainActivity.this.finish();

                    }
                }).setNegativeButton("NO", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }
                });
                AlertDialog ale=alert.create();
                ale.show();
            }
        });

        // DISPLAYING ALERT BOX WITHOUT BUTTON CLICK "TOUCH"
   /*     AlertDialog.Builder alert= new AlertDialog.Builder(context);
        alert.setTitle("close");
        alert.setMessage("Do you want to close ? ").setPositiveButton("YES", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                MainActivity.this.finish();

            }
        }).setNegativeButton("NO", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

            }
        });
        AlertDialog ale=alert.create();
        ale.show();

        */

    }
    public  void send(View v) {
        String message = editText3.getText().toString();
        String number = editText2.getText().toString();
        try {
            SmsManager smsManager = SmsManager.getDefault();
            //smsManager.sendTextMessage(number, null, message, null, null);
            smsManager.sendTextMessage(message,null,number,null,null);
            Toast.makeText(context, "MESSAGE SENT", Toast.LENGTH_SHORT).show();


        }
        catch (Exception e)
        {
            Toast.makeText(getApplicationContext(),
                    "SMS faild, please try again later!",
                    Toast.LENGTH_LONG).show();
            e.printStackTrace();

        }
    }

}
/*try {
				SmsManager smsManager = SmsManager.getDefault();
				smsManager.sendTextMessage(phoneNo, null, sms, null, null);
				Toast.makeText(getApplicationContext(), "SMS Sent!",
							Toast.LENGTH_LONG).show();
			  } catch (Exception e) {
				Toast.makeText(getApplicationContext(),
					"SMS faild, please try again later!",
					Toast.LENGTH_LONG).show();
				e.printStackTrace();
			  }

			}*/