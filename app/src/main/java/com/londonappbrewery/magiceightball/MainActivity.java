package com.londonappbrewery.magiceightball;

import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ImageView imageBall = findViewById(R.id.image_eightballs);
        Button askButton = findViewById(R.id.btnAsk);

        final int[] ballArray = {R.drawable.ball1,
                R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball4,
                R.drawable.ball5
        };

        askButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Random gen_random = new Random();
                int ran_number = 0;

                ran_number = gen_random.nextInt(5);

                imageBall.setImageResource(ballArray[ran_number]);

            }
        });




    }
}
