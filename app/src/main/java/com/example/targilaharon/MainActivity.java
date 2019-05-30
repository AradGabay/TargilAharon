package com.example.targilaharon;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    double a;
    double b;
    double c;
    EditText et1,et2,et3;
    String s,s1,s2;
    Random rnd = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1=(EditText)findViewById(R.id.et1);
        et2=(EditText)findViewById(R.id.et2);
        et3=(EditText)findViewById(R.id.et3);

    }
    public void sol(View view) {
        s=et1.getText().toString();
        s1=et2.getText().toString();
        s2=et3.getText().toString();
        if(s.equals("")||s1.equals("")||s2.equals(""))
            Toast.makeText(this, "Enter mekadmim please", Toast.LENGTH_SHORT).show();


            else {
            Intent in1 = new Intent(this, Main2Activity.class);
            a = Double.parseDouble(et1.getText().toString());
            b = Double.parseDouble(et2.getText().toString());
            c = Double.parseDouble(et3.getText().toString());
            in1.putExtra("n", a);
            in1.putExtra("nn", b);
            in1.putExtra("nnn", c);
            startActivityForResult(in1, 1);
        }

    }

    public void gennum(View view) {
        a = rnd.nextDouble();
        b = rnd.nextDouble();
        c = rnd.nextDouble();
        et1.setText((a+rnd.nextInt(10)+1)+"");
        et2.setText((b+rnd.nextInt(10)+1)+"");
        et3.setText((c+rnd.nextInt(10)+1)+"");
    }
}
