package com.yml.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText edit1, edit2;
    Button plus,sub,mul,div;
    TextView txt;
    String n1,n2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edit1 = (EditText) findViewById(R.id.e1);
        edit2 = (EditText) findViewById(R.id.e2);
        txt = (TextView) findViewById(R.id.txt1);
        plus = (Button) findViewById(R.id.b1);
        sub = (Button) findViewById(R.id.b2);
        mul = (Button) findViewById(R.id.b3);
        div = (Button) findViewById(R.id.b4);


            plus.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String n1=edit1.getText().toString();
                    String n2=edit2.getText().toString();
                    if(TextUtils.isEmpty(n1)||TextUtils.isEmpty(n2))
                    {
                        Toast.makeText(getApplicationContext(),"Please enter values",Toast.LENGTH_SHORT).show();

                    }
                    else {

                        int num1 = Integer.parseInt(edit1.getText().toString());
                        int num2 = Integer.parseInt(edit2.getText().toString());
                        int ans = num1 + num2;
                        txt.setText(String.valueOf(ans));
                    }

                }
            });
            sub.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String n1=edit1.getText().toString();
                    String n2=edit2.getText().toString();
                    if(TextUtils.isEmpty(n1)||TextUtils.isEmpty(n2))
                    {
                        Toast.makeText(getApplicationContext(),"Please enter values",Toast.LENGTH_SHORT).show();

                    }
                    else {
                        int num1 = Integer.parseInt(edit1.getText().toString());
                        int num2 = Integer.parseInt(edit2.getText().toString());
                        int ans = num1 - num2;
                        txt.setText(String.valueOf(ans));
                    }
                }
            });
            mul.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String n1=edit1.getText().toString();
                    String n2=edit2.getText().toString();
                    if(TextUtils.isEmpty(n1)||TextUtils.isEmpty(n2))
                    {
                        Toast.makeText(getApplicationContext(),"Please enter values",Toast.LENGTH_SHORT).show();

                    }
                    else {
                        int num1 = Integer.parseInt(edit1.getText().toString());
                        int num2 = Integer.parseInt(edit2.getText().toString());
                        int ans = num1 * num2;
                        txt.setText(String.valueOf(ans));
                    }
                }
            });
            div.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String n1=edit1.getText().toString();
                    String n2=edit2.getText().toString();
                    if(TextUtils.isEmpty(n1)||TextUtils.isEmpty(n2))
                    {
                        Toast.makeText(getApplicationContext(),"Please enter values",Toast.LENGTH_SHORT).show();

                    }
                    else {
                        int num1 = Integer.parseInt(edit1.getText().toString());
                        int num2 = Integer.parseInt(edit2.getText().toString());
                        int ans = num1 / num2;
                        txt.setText(String.valueOf(ans));
                    }
                }
            });



    }
}
