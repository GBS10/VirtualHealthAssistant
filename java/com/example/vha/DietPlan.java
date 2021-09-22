package com.example.vha;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;


public class DietPlan extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diet_plan);
        ImageButton breakfast;
        ImageButton lunch;
        ImageButton snack;
        ImageButton dinner;
        breakfast=(ImageButton) findViewById(R.id.bf);
        lunch=(ImageButton) findViewById(R.id.lunch);
        snack=(ImageButton) findViewById(R.id.snack);
        dinner=(ImageButton) findViewById(R.id.dinner);
        breakfast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent activity4Intent = new Intent(getApplicationContext(), BreakFast.class);
                startActivity(activity4Intent);
            }
        });
        lunch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent activity4Intent = new Intent(getApplicationContext(), Lunch.class);
                startActivity(activity4Intent);
            }
        });
        snack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent activity4Intent = new Intent(getApplicationContext(), Snack.class);
                startActivity(activity4Intent);
            }
        });
        dinner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent activity4Intent = new Intent(getApplicationContext(), Dinner.class);
                startActivity(activity4Intent);
            }
        });
    }
}
