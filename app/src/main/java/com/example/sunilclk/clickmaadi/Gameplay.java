package com.example.sunilclk.clickmaadi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Random;

public class Gameplay extends AppCompatActivity {
    int flag=0;
    String str = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gameplay);


       final  Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18,b19,b20,b21,b22,b23,b24,b25;
        b1= (Button) findViewById(R.id.button1);
        b2= (Button) findViewById(R.id.button2);
        b3= (Button) findViewById(R.id.button3);
        b4= (Button) findViewById(R.id.button4);
        b5= (Button) findViewById(R.id.button5);
        b6= (Button) findViewById(R.id.button6);
        b7= (Button) findViewById(R.id.button7);
        b8= (Button) findViewById(R.id.button8);
        b9= (Button) findViewById(R.id.button9);
        b10= (Button) findViewById(R.id.button10);
        b11= (Button) findViewById(R.id.button11);
        b12= (Button) findViewById(R.id.button12);
        b13= (Button) findViewById(R.id.button13);
        b14= (Button) findViewById(R.id.button14);
        b15= (Button) findViewById(R.id.button15);
        b16= (Button) findViewById(R.id.button16);
        b17= (Button) findViewById(R.id.button17);
        b18= (Button) findViewById(R.id.button18);
        b19= (Button) findViewById(R.id.button19);
        b20= (Button) findViewById(R.id.button20);
        b21= (Button) findViewById(R.id.button21);
        b22= (Button) findViewById(R.id.button22);
        b23= (Button) findViewById(R.id.button23);
        b24= (Button) findViewById(R.id.button24);
        b25= (Button) findViewById(R.id.button25);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(flag==0)
                {
                    b1.setText("26");
                    flag=1;
                }

            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(flag==1)
                {
                    b2.setText("27");
                    flag=2;
                }

            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(flag==2)
                {
                    b3.setText("28");
                    flag=3;
                }

            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(flag==3)
                {
                    b4.setText("29");
                    flag=4;
                }

            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(flag==4)
                {
                    b5.setText("28");
                    flag=5;
                }

            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(flag==5)
                {
                    str = Integer.toString(flag);
                    b6.setText(str);
                    flag=6;
                }

            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(flag==6)
                {
                    Random r = new Random();
                    flag= r.nextInt(50-25)+25;

                    str = Integer.toString(flag);
                    b7.setText(str);
                    flag=7;
                }

            }
        });
































    }
}
