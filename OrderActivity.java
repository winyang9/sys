package com.example.html5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class OrderActivity extends AppCompatActivity {
    private TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);
        text=findViewById(R.id.ord);

        String s=read("order.txt");
        text.setText(s);


    }
    private  String read(String s2){
        FileInputStream fileInputStream=null;
        try {
            fileInputStream=openFileInput(s2);
            byte[] buff=new byte[1024];
            StringBuilder SB=new StringBuilder("");
            int len=0;
            while((len=fileInputStream.read(buff))>0){
                SB.append(new String(buff,0,len));
                return SB.toString();
            }
        }  catch (IOException e) {
            e.printStackTrace();
        }
        return null;

    }
}