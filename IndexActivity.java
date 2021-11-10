package com.example.html5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class IndexActivity extends AppCompatActivity {
    private ImageButton bt1,bt2,bt3,bt4,bt5,bt6;

    private Button btd3,btd4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_index);
        bt1=findViewById(R.id.ap_1);
        bt2=findViewById(R.id.ap_2);
        bt3=findViewById(R.id.ap_3);
        bt4=findViewById(R.id.ap_4);
        bt5=findViewById(R.id.ap_5);
        bt6=findViewById(R.id.ap_6);
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(IndexActivity.this,GoodsActivity.class);
                Bundle bundle=new Bundle();
                bundle.putString("number","01");//苹果
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });

        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(IndexActivity.this,GoodsActivity.class);
                Bundle bundle=new Bundle();
                bundle.putString("number","02");//香蕉
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(IndexActivity.this,GoodsActivity.class);
                Bundle bundle=new Bundle();
                bundle.putString("number","03");//西瓜
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
        bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(IndexActivity.this,GoodsActivity.class);
                Bundle bundle=new Bundle();
                bundle.putString("number","04");//薯片
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
        bt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(IndexActivity.this,GoodsActivity.class);
                Bundle bundle=new Bundle();
                bundle.putString("number","05");//巧克力
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
        bt6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(IndexActivity.this,GoodsActivity.class);
                Bundle bundle=new Bundle();
                bundle.putString("number","06");//吹风机
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
        btd3=findViewById(R.id.bp_1);
        btd4=findViewById(R.id.bp_2);
        btd3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(IndexActivity.this,ShoppingcartActivity.class);

                startActivity(intent);

            }
        });
        btd4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(IndexActivity.this,OrderActivity.class);

                startActivity(intent);

            }
        });

    }
}