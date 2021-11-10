package com.example.html5;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {
    private Button reg1;
    private EditText reg2,reg3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        reg1=findViewById(R.id.re_1);
        reg2=findViewById(R.id.register_0);//用户名
        reg3=findViewById(R.id.register_1);//密码



        reg1.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                Toast.makeText(RegisterActivity.this, "注册成功", Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(RegisterActivity.this,LoginActivity.class);

                Bundle bundle=new Bundle();
                bundle.putString("name",reg2.getText().toString());
                bundle.putString("password",reg3.getText().toString());

                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
    }
}