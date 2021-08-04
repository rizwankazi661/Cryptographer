package com.example.crypto;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ThirdUI extends AppCompatActivity {

    public static String decode(String a){
        int i, ascii;
        char ch;
        String str = "", b;

//        b=a.replace("e1","a");
//        a=b.replace("7gdt*"," ");

        for (i = 0; i < a.length(); i++) {
            ch = a.charAt(i);
            ascii = (int) ch + 2;
            ch = (char) ascii;
            str = str + ch;
        }
        System.out.println(str);
        return str;
    }

    EditText input_text;         //Creating Objects
    Button btnClickHere;
    TextView display_text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third_u_i);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        input_text=(EditText)findViewById(R.id.input_text); // Creating Instances of an Object
        btnClickHere=(Button)findViewById(R.id.btnClickHere);
        display_text=(TextView)findViewById(R.id.display_text);

        btnClickHere.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String a= input_text.getText().toString();
                decode(a);
                display_text.setText(decode(a));
            }
        });
    }
}