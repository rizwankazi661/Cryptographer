package com.example.crypto;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button move;
    private Button move2;
    private Button secondback;
    private Button thirdback;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        move2=findViewById(R.id.move2);
        move2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent( MainActivity.this,ThirdUI.class);
                startActivity(intent);
            }
        });

        move=findViewById(R.id.move);
        move.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent( MainActivity.this,SecondUI.class);
                startActivity(intent);
            }
        });

//        secondback=findViewById(R.id.secondback);
//        secondback.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent =new Intent( SecondUI.this,ThirdUI.class);
//                startActivity(intent);
//            }
//        });
////
//        thirdback=findViewById(R.id.thirdback);
//        thirdback.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent =new Intent( ThirdUI.this,MainActivity.class);
//                startActivity(intent);
//            }
//        });
    }
}