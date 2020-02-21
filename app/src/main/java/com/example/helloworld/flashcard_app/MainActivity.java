package com.example.helloworld.flashcard_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        findViewById(R.id.answer1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((TextView)findViewById(R.id.answer1)).setBackgroundColor(getResources().getColor(R.color.red));
                ((TextView)findViewById(R.id.answer3)).setBackgroundColor(getResources().getColor(R.color.green));
            }
        });

        findViewById(R.id.answer2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((TextView)findViewById(R.id.answer2)).setBackgroundColor(getResources().getColor(R.color.red));
                ((TextView)findViewById(R.id.answer3)).setBackgroundColor(getResources().getColor(R.color.green));
            }
        });

        findViewById(R.id.answer3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((TextView)findViewById(R.id.answer3)).setBackgroundColor(getResources().getColor(R.color.green));
            }
        });

        findViewById(R.id.rootView).setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {

                ((TextView) findViewById(R.id.answer1)).setBackgroundColor(getResources().getColor(R.color.orange));
                ((TextView) findViewById(R.id.answer2)).setBackgroundColor(getResources().getColor(R.color.orange));
                ((TextView) findViewById(R.id.answer3)).setBackgroundColor(getResources().getColor(R.color.orange));
            }
        });

        findViewById(R.id.toggle_choices_visibility).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                boolean isShowingAnswers=(findViewById(R.id.answer1).getVisibility()==View.VISIBLE);
                if(isShowingAnswers) {
                    ((ImageView) findViewById(R.id.toggle_choices_visibility)).setImageResource(R.drawable.eye_invisible);
                    findViewById(R.id.answer1).setVisibility(View.INVISIBLE);
                    findViewById(R.id.answer2).setVisibility(View.INVISIBLE);
                    findViewById(R.id.answer3).setVisibility(View.INVISIBLE);

                }else{
                    ((ImageView) findViewById(R.id.toggle_choices_visibility)).setImageResource(R.drawable.eye_visible);
                    findViewById(R.id.answer1).setVisibility(View.VISIBLE);
                    findViewById(R.id.answer2).setVisibility(View.VISIBLE);
                    findViewById(R.id.answer3).setVisibility(View.VISIBLE);
                }
            }
        });

    }
}
