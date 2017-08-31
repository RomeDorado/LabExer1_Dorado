package com.example.simon.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import static com.example.simon.myapplication.R.id.btnCompute;

public class MainActivity extends AppCompatActivity {
    EditText et_Qone;
    EditText et_Qtwo;
    EditText et_SW;
    EditText et_LE;
    EditText et_ME;
    Button btn_Compute;


    String FG;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et_Qone = (EditText) findViewById(R.id.etQone);
        et_Qtwo = (EditText) findViewById(R.id.etQTwo);
        et_SW = (EditText) findViewById(R.id.etSW);
        et_LE  = (EditText) findViewById(R.id.etLE);
        et_ME = (EditText) findViewById(R.id.etME);
        btn_Compute = (Button) findViewById(R.id.btnCompute);

    }
    public void computeGrades(View view){
        Intent intent = new Intent(this, SecondActivity.class);


        double quiz1 = Double.parseDouble(et_Qone.getText().toString());
        double quiz2 = Double.parseDouble(et_Qtwo.getText().toString());
        double seatwork = Double.parseDouble(et_SW.getText().toString());
        double labexer = Double.parseDouble(et_LE.getText().toString());
        double major = Double.parseDouble(et_ME.getText().toString());

        double raw = (quiz1 * .10) + (quiz2 * .10) + (seatwork * .10) + (labexer * .40) + (major * .30);
        String rawgrade = String.valueOf(raw);
        intent.putExtra("RawG", rawgrade);

        if(raw <60){
            FG = "Failed";

        }else if(raw < 65 && raw >= 60){
            FG = "3.0";
        }else if(raw <= 70 && raw > 65){
            FG = "2.75";
        }else if(raw <= 75 && raw > 70){
            FG = "2.5";
        }else if(raw <= 80 && raw > 75){
            FG = "2.25";
        }else if(raw <= 85 && raw > 80){
            FG = "2.00";
        }else if(raw <= 90 && raw > 85){
            FG="1.75";
        }else if(raw <= 92 && raw > 90){
            FG = "1.50";
        }else if(raw <=94 && raw > 92){
            FG="1.25";
        }else if(raw <= 100 && raw > 94){
            FG="1.00";
        }

        intent.putExtra("FinalG", FG);
        startActivity(intent);


    }
}
