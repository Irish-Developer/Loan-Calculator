package com.example.youcef.assignment2;
/*
@uthor Youcef O'Connor
*/

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button result = (Button) findViewById(R.id.Calbtn);

        result.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {

                  EditText first = (EditText) findViewById(R.id.Principle) ;
                EditText second = (EditText) findViewById(R.id.years);
                EditText third = (EditText) findViewById(R.id.rate);
                int res = Integer.parseInt(first.getText().toString());

                int res2 = Integer.parseInt(second.getText().toString());
                int res3 = Integer.parseInt(third.getText().toString()) ;


                TextView view = (TextView) findViewById((R.id.result));
                double result = 0;

               res3 = res3/100/12;
//                res2 = res2 * 12;
               result = (res * res3) / (1 - Math.pow(1 + res, -res2));


                view.setText("The amount is:" + result);
            }
        });
    }
}
