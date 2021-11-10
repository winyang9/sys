package com.example.html5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    private Button b1;//登录
    private Button b2;//注册
    private EditText e1;//用户名
    private EditText e2;//密码
    private String s1,s2;//
    private SharedPreferences share1,share2;
    private SharedPreferences.Editor editor1,editor2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        b1=findViewById(R.id.le_3);
        share1=getSharedPreferences("1",MODE_PRIVATE);
        share2=getSharedPreferences("2",MODE_PRIVATE);
        editor1= share1.edit();
        editor2= share2.edit();
        Bundle bundle=getIntent().getExtras();
        if(bundle!=null){
        s1=bundle.getString("name");
        s2=bundle.getString("password");
        editor1.putString("name",s1);
        editor2.putString("password",s2);
        editor1.apply();
        editor2.apply();
        ;}


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                e1=findViewById(R.id.le_1);
                e2=findViewById(R.id.le_2);
                if(e1.getText().toString().equals(share1.getString("name",""))&&e2.getText().toString().equals(share2.getString("password",""))) {
                    Toast.makeText(LoginActivity.this, "登录成功", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(LoginActivity.this, IndexActivity.class);
                    startActivity(intent);
                }
                else{
                    Toast.makeText(LoginActivity.this, "登录失败", Toast.LENGTH_SHORT).show();


                }

            }
        });
        b2=findViewById(R.id.le_4);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(LoginActivity.this,RegisterActivity.class);
                startActivity(intent);

            }
        });
    }
}