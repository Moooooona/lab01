package com.example.lab01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button b1;
    TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1 = (Button) findViewById(R.id.btn1);
        tv1 = (TextView) findViewById(R.id.tv);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View argo) {
                tv1.setText("Welcome Dear!");
            }
        });
    }
}