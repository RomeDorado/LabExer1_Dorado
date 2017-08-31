package com.example.simon.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class SecondActivity extends AppCompatActivity {
    TextView tv_Raw;
    TextView tv_Final;
    Button btn_Back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        tv_Raw = (TextView) findViewById(R.id.tvRaw);
        tv_Final = (TextView) findViewById(R.id.tvFinal);
        btn_Back = (Button) findViewById(R.id.btnBack);

        String RA = getIntent().getStringExtra("RawG");
        tv_Raw.setText("Your RA is " + RA);

        String FG = getIntent().getStringExtra("FinalG");
        tv_Final.setText("Your Final Grade is " + FG);
    }
    public void goBack(View view){
        Intent intent2 = new Intent(this, MainActivity.class);
        startActivity(intent2);
    }

}
