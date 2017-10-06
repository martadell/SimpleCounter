package edu.upc.eseiaat.pma.simplecounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class CounterActivity extends AppCompatActivity {

    TextView txt_number;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_counter);
        txt_number = (TextView) findViewById(R.id.txt_number);}

   public void clicplus (View v) {
       Button btn = (Button) v;
       String number = txt_number.getText().toString();
       int num = Integer.parseInt(number);
       num = num + 1;
       number = String.valueOf(num);
       txt_number.setText(number);

    }

    public void clicminus (View v) {
        Button btn = (Button) v;
        String number = txt_number.getText().toString();
        int num = Integer.parseInt(number);
        num = num - 1;
        number = String.valueOf(num);
        txt_number.setText(number);

    }

    }

