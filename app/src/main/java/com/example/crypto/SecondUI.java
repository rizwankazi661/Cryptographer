package com.example.crypto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class SecondUI extends AppCompatActivity {

    public static String encode(String a){
        int i, ascii;
        char ch;
        String str = "", b;

//        b=a.replace("a","e1");
//        a=b.replace(" ","7gdt*");

        for (i = 0; i < a.length(); i++) {
            ch = a.charAt(i);
            ascii = (int) ch - 2;
            ch = (char) ascii;
            str = str + ch;
        }
        System.out.println(str);
        return str;
    }

    EditText input_text;         //Creating Objects
    Button btnClickHere;
    TextView display_text;
    Button btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_u_i);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        input_text=(EditText)findViewById(R.id.input_text); // Creating Instances of an Object
        btnClickHere=(Button)findViewById(R.id.btnClickHere);
        display_text=(TextView)findViewById(R.id.display_text);
        btn=(Button)findViewById(R.id.btn);

        btnClickHere.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String a= input_text.getText().toString();
                encode(a);
                display_text.setText(encode(a));
            }
        });

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ClipboardManager clipboard=(ClipboardManager) getSystemService(CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText("EditText",display_text.getText().toString());
                clipboard.setPrimaryClip(clip);

                Toast.makeText(SecondUI.this,"copied.",Toast.LENGTH_SHORT).show();
            }
        });

    }
}