package com.example.vha;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class StomachPain extends AppCompatActivity {
    Button button1;
    @Override
    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(R.layout.activity_stomachpain);
        button1 = (Button)findViewById(R.id.Button01);
        button1.setOnClickListener(new OnClickListener() {
            public void onClick(View view)
            {
                Intent i = new Intent(getApplicationContext(),
                        Remedies.class);
                startActivity(i);
            }
        });
    }
}