package com.example.html5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


public class ShoppingcartActivity extends AppCompatActivity {
    private SharedPreferences share1;
    private TextView text1,text2,text3,text4,text5,text6;
    private Button button1;
    private SharedPreferences.Editor edit1;

    String []s=new String[6];
    int []n1=new  int[6];//数量
    int []n2=new  int[6];//单价
    int []n3=new  int[6];//总价
    //单价赋值

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shoppingcart);
        text1=findViewById(R.id.shop_1);
        text2=findViewById(R.id.shop_2);
        text3=findViewById(R.id.shop_3);
        text4=findViewById(R.id.shop_4);
        text5=findViewById(R.id.shop_5);
        text6=findViewById(R.id.shop_6);
        share1=getSharedPreferences("1",MODE_PRIVATE);
        edit1=share1.edit();

        n2[0]=8;n2[1]=10;n2[2]=12;n2[3]=15;n2[4]=56;n2[5]=89;

        for(int i=0;i<6;i++) {//数量赋值
            String ns="0"+(i+1);
            n1[i] = share1.getInt(ns,0);

        }
       for(int i=0;i<6;i++){
               n3[i]=n1[i]*n2[i];

        }

        s[0]="苹果 "+n1[0]+" "+n3[0];
        s[1]="香蕉 "+n1[1]+" "+n3[1];
        s[2]="西瓜 "+n1[2]+" "+n3[2];
        s[3]="薯片 "+n1[3]+" "+n3[3];
        s[4]="巧克力 "+n1[4]+" "+n3[4];
        s[5]="吹风机 "+n1[5]+" "+n3[5];

        text1.setText(s[0]);
        text2.setText(s[1]);
        text3.setText(s[2]);
        text4.setText(s[3]);
        text5.setText(s[4]);
        text6.setText(s[5]);

        button1=findViewById(R.id.but_1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ShoppingcartActivity.this,"提交成功",Toast.LENGTH_SHORT).show();
                filego();
                edit1.putInt("01",0);edit1.putInt("02",0);edit1.putInt("03",0);edit1.putInt("04",0);edit1.putInt("05",0);edit1.putInt("06",0);
                edit1.apply();

            }
        });



    }
    public void filego(){
        FileOutputStream file;
        try {
            file=openFileOutput("order.txt",MODE_APPEND);
            file.write(s[0].getBytes());
            file.write("\n".getBytes());
            file.write(s[1].getBytes());
            file.write("\n".getBytes());
            file.write(s[2].getBytes());
            file.write("\n".getBytes());
            file.write(s[3].getBytes());
            file.write("\n".getBytes());
            file.write(s[4].getBytes());
            file.write("\n".getBytes());
            file.write(s[5].getBytes());
            file.write("\n".getBytes());
            file.write("\n".getBytes());


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}