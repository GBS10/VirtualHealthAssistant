package com.example.vha;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import static android.view.View.*;
public class Remedies extends  AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_remedies);
        Button button1;
        Button button2;
        Button button3;
        Button button4;
        button1 = (Button)findViewById(R.id.Button01);
        button2 = (Button)findViewById(R.id.Button02);
        button3 = (Button)findViewById(R.id.Button03);
        button4 = (Button)findViewById(R.id.Button04);
        button1.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        button1.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent activity4Intent = new Intent(getApplicationContext(), ColdFever.class);
                startActivity(activity4Intent);
            }
        });
        button2.setOnClickListener(new OnClickListener()
                                   {
                                       @Override
                                       public void onClick(View v) {
                                           Intent intent = new Intent(Remedies.this, HairFall.class);
                                           startActivity(intent);
                                       }
                                   }
        );
        button3.setOnClickListener(new OnClickListener()
                                   {
                                       @Override
                                       public void onClick(View v) {
                                           Intent intent = new Intent(Remedies.this, StomachPain.class);
                                           startActivity(intent);
                                       }
                                   }
        );
        button4.setOnClickListener(new OnClickListener()
                                   {
                                       @Override
                                       public void onClick(View v) {
                                           Intent intent = new Intent(Remedies.this, Headache.class);
                                           startActivity(intent);

                                       }


                                   }

        );



    }
}