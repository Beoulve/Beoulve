package com.mycompany.myapp;
import android.app.*;
import android.os.*;
import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends Activity 
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        TextView textView1 = (TextView) findViewById(R.id.textView1);
        textView1.setText ("Next text in TextView");
        Button button1 = (Button) findViewById(R.id.button1);
        button1.setText ("My button");
        button1.setEnabled (false);
        
    }
}
