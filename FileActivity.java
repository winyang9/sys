package com.example.html5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileActivity extends AppCompatActivity {
    private EditText edt1;
    private Button but1,but2;
    private TextView texv1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_file);
        edt1=findViewById(R.id.fi_e);
        but1=findViewById(R.id.fi_b1);
        but2=findViewById(R.id.fi_b2);
        texv1=findViewById(R.id.fi_t);
        but1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                try {
                    save(edt1.getText().toString());
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        });
        but2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    texv1.setText(read());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });
    }
    private void save(String content) throws IOException {
        FileOutputStream fileOutputStream = null;
        String s1="11\n";
        String s2="22";

        try {
            fileOutputStream=openFileOutput("test.txt",MODE_PRIVATE);
            fileOutputStream.write(content.getBytes());
            fileOutputStream.write(s1.getBytes());
            fileOutputStream.write(s2.getBytes());


        }  catch (IOException e) {
            e.printStackTrace();
        }
        finally {if(fileOutputStream!=null){
            fileOutputStream.close();
        }
        }
    }
    private String read() throws IOException {
        FileInputStream fileInputStream=null;
        try {
            fileInputStream=openFileInput("test.txt");
            byte[] buff=new byte[1024];
            StringBuilder SB=new StringBuilder("");
            int len=0;
            while((len=fileInputStream.read(buff))>0){
                SB.append(new String(buff,0,len));
                return SB.toString();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }        finally {if(fileInputStream!=null){
            fileInputStream.close();
        }
        }
        return null;
    }
    private void datato() throws IOException {

        String snumber1="编号：01\n",sname1="名称：苹果\n",sprice1="价格：8\n";
        FileOutputStream fileOutputStream=null;
        try {
            fileOutputStream=openFileOutput("goods_01.txt",MODE_PRIVATE);
            fileOutputStream.write(snumber1.getBytes());
            fileOutputStream.write(sname1.getBytes());
            fileOutputStream.write(sprice1.getBytes());
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        finally {if(fileOutputStream!=null){
            fileOutputStream.close();
        }
        }
        //
        String snumber2="编号：02\n",sname2="名称：香蕉\n",sprice2="价格：10\n";
        fileOutputStream=null;
        try {
            fileOutputStream=openFileOutput("goods_02.txt",MODE_PRIVATE);
            fileOutputStream.write(snumber2.getBytes());
            fileOutputStream.write(sname2.getBytes());
            fileOutputStream.write(sprice2.getBytes());
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        finally {if(fileOutputStream!=null){
            fileOutputStream.close();
        }
        }
        //
        String snumber3="编号：03\n",sname3="名称：西瓜\n",sprice3="价格：12\n";
        fileOutputStream=null;
        try {
            fileOutputStream=openFileOutput("goods_03.txt",MODE_PRIVATE);
            fileOutputStream.write(snumber3.getBytes());
            fileOutputStream.write(sname3.getBytes());
            fileOutputStream.write(sprice3.getBytes());
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        finally {if(fileOutputStream!=null){
            fileOutputStream.close();
        }
        }
        //
        String snumber4="编号：04\n",sname4="名称：薯片\n",sprice4="价格：15\n";
        fileOutputStream=null;
        try {
            fileOutputStream=openFileOutput("goods_04.txt",MODE_PRIVATE);
            fileOutputStream.write(snumber4.getBytes());
            fileOutputStream.write(sname4.getBytes());
            fileOutputStream.write(sprice4.getBytes());
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        finally {if(fileOutputStream!=null){
            fileOutputStream.close();
        }
        }
        //
        String snumber5="编号：05\n",sname5="名称：巧克力\n",sprice5="价格：56\n";
        fileOutputStream=null;
        try {
            fileOutputStream=openFileOutput("goods_05.txt",MODE_PRIVATE);
            fileOutputStream.write(snumber5.getBytes());
            fileOutputStream.write(sname5.getBytes());
            fileOutputStream.write(sprice5.getBytes());
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        finally {if(fileOutputStream!=null){
            fileOutputStream.close();
        }
        }
        //
        String snumber6="编号：06\n",sname6="名称：吹风机\n",sprice6="价格：89\n";
        fileOutputStream=null;
        try {
            fileOutputStream=openFileOutput("goods_06.txt",MODE_PRIVATE);
            fileOutputStream.write(snumber6.getBytes());
            fileOutputStream.write(sname6.getBytes());
            fileOutputStream.write(sprice6.getBytes());
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        finally {if(fileOutputStream!=null){
            fileOutputStream.close();
        }
        }
    }

}