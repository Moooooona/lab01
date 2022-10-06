package com.example.lab01;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button b1, b2 ;
    TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1 = (Button) findViewById(R.id.btn1);
        b2=(Button) findViewById(R.id.btn2);
        tv1 = (TextView) findViewById(R.id.tv);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View argo) {
                tv1.setText("Welcome Dear!");
            }
        });
        b2.setOnClickListener(new View.OnClickListener(){
                                  @Override
                                  public void onClick(View argo){
                                      tv1.setTextColor(Color.RED);
                                  }
        });

    }

}