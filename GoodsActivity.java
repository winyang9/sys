package com.example.html5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.graphics.drawable.Drawable;
import android.media.Image;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class GoodsActivity extends AppCompatActivity {
    private TextView goods_1;
    private Button gbutton_1;
    private EditText gedit_1;
    private SharedPreferences share1;
    private ImageView image_1;
    private SharedPreferences.Editor editor1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_goods);
        Bundle bundle=getIntent().getExtras();
        String s1=bundle.getString("number");
        String s2="goods_"+s1+".txt";



        goods_1=findViewById(R.id.ad_tv2);
        goods_1.setText(read(s2));
        image_1=findViewById(R.id.ad_iv);
        if(s1.equals("01")){
            image_1.setImageResource(R.drawable.apple);
        }
        if(s1.equals("02")){
            image_1.setImageResource(R.drawable.banana);
        }
        if(s1.equals("03")){
            image_1.setImageResource(R.drawable.watermallon);
        }
        if(s1.equals("04")){
            image_1.setImageResource(R.drawable.potatochips);
        }
        if(s1.equals("05")){
            image_1.setImageResource(R.drawable.chocolate);
        }
        if(s1.equals("06")){
            image_1.setImageResource(R.drawable.hairdryer);
        }

        gbutton_1=findViewById(R.id.ad_bt);
        gedit_1=findViewById(R.id.ad_et);
        share1=getSharedPreferences("1",MODE_PRIVATE);
        editor1=share1.edit();
        gbutton_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               editor1.putInt(s1,Integer.parseInt(gedit_1.getText().toString()));
               editor1.apply();
                Toast.makeText(GoodsActivity.this,"加入购物车成功",Toast.LENGTH_SHORT).show();
            }
        });



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