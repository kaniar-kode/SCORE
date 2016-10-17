package com.kaniar_kode.score;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        System.out.println("Test!");

        final Button honneur = (Button) findViewById(R.id.H);
        honneur.setText("HONNEUR");

        honneur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.activity_score);
            }
        });

        final Button promotion = (Button) findViewById(R.id.PH);
        promotion.setText("PROMOTION HONNEUR");

        promotion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        final Button phliponeau = (Button) findViewById(R.id.U18);
        phliponeau.setText("PHLIPONEAU (U18)");

        phliponeau.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        final Button teuliere = (Button) findViewById(R.id.U16);
        teuliere.setText("TEULIÈRE (U16)");

        teuliere.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }

    public void selfDestruct(View view) {

    }
}





































