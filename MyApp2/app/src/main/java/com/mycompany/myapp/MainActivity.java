package com.mycompany.myapp;
import android.app.*;
import android.os.*;
import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.view.View.OnClickListener;

public class MainActivity extends Activity implements onClickListener
{
    final Button button1 = (Button)findViewById(R.id.button1);
    final Button button2 = (Button)findViewById(R.id.button2);
    final Button button3 = (Button)findViewById(R.id.button3);
    final Button button4 = (Button)findViewById(R.id.button4);

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        TextView textView1 = (TextView) findViewById(R.id.textView1);
        textView1.setText ("Next text in TextView");
        Button button1 = (Button) findViewById(R.id.button1);
        button1.setText ("My button");
        button1.setEnabled (true);
        CheckBox chb1 = (CheckBox) findViewById (R.id.chb1);
        chb1.setChecked (true);

    //один обработчки для всех кнопок
    button1.setOnClickListener(this);
    button2.setOnClickListener(this);
    button3.setOnClickListener(this);
    button4.setOnClickListener(this);
    }

    //проверяем, какая кнопка нажата.
    @Override
    public void onClick(View v){
        switch (v.getId()){
            case R.id.button1: editText.setText("Нажата кнопка button1"); break;
            case R.id.button2: editText.setText("Нажата кнопка button2"); break;
            case R.id.button3: editText.setText("Нажата кнопка button3"); break;
            case R.id.button4: editText.setText("Нажата кнопка button4"); break;
        }
    }

}
