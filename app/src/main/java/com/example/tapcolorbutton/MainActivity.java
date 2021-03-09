package com.example.tapcolorbutton;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.text.Html;
import java.text.BreakIterator;


public class MainActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView textView =(TextView)findViewById(R.id.textView);
        final Button button1 = (Button)findViewById(R.id.button);
        final Button button2 = (Button) findViewById(R.id.button2);
        final Button button3 = (Button) findViewById(R.id.button3);
        final Button button4 = (Button) findViewById(R.id.button4);
        final Button button5 = (Button) findViewById(R.id.button5);
        final Button button6 = (Button) findViewById(R.id.button6);
        final Button button7 = (Button) findViewById(R.id.button7);
        final Button button8 = (Button)findViewById(R.id.button8);
        final Button button9 = (Button) findViewById(R.id.button9);

        button1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                String text1 = "You clicked on <font color=#F44336>Red</font> color";
                textView.setText(Html.fromHtml(text1));

            }
        });

        button2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                String text2 = "You clicked on <font color=#4CAF50>Green</font> color";
                textView.setText(Html.fromHtml(text2));
            }
        });

        button3.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                String text3 = "You clicked on <font color=#2196F3>Blue</font> color";
                textView.setText(Html.fromHtml(text3));
            }
        });

        button4.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                String text4 = "You clicked on <font color=#FFEB3B>Yellow</font> color";
                textView.setText(Html.fromHtml(text4));
            }
        });

        button5.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                String text5 = "You clicked on <font color=#020202>Black</font> color";
                textView.setText(Html.fromHtml(text5));
            }
        });

        button6.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                String text6 = "You clicked on <font color=#673AB7>Purple</font> color";
                textView.setText(Html.fromHtml(text6));
            }
        });

        button7.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                String text7 = "You clicked on <font color=#FF9800>Orange</font> color";
                textView.setText(Html.fromHtml(text7));
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String text8 = "You clicked on <font color=#009688>Cyan</font> color";
                textView.setText(Html.fromHtml(text8));
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                textView.setText("Tap on any button to see the color");
            }
        });
    }
}
