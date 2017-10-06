package edu.upc.eseiaat.pma.simplecounter;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class CounterActivity extends AppCompatActivity {

    TextView txt_number;
    int num;

    public static final String NUM = "num";

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

        outState.putInt(NUM, num);}

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_counter);
        txt_number = (TextView) findViewById(R.id.txt_number);

        if(savedInstanceState == null) {
            txt_number.setText("2"); }

        else {
            Bundle state = savedInstanceState;
            String number = String.valueOf(Integer.valueOf(state.getInt(NUM)));
            txt_number.setText(number);
            }}

   public void clicplus (View v) {
       Button btn = (Button) v;
       String number = txt_number.getText().toString();
       num = Integer.parseInt(number);
       num = num + 1;
       number = String.valueOf(num);
       txt_number.setText(number);

    }

    public void clicminus (View v) {
        Button btn = (Button) v;
        String number = txt_number.getText().toString();
        num = Integer.parseInt(number);
        num = num - 1;
        number = String.valueOf(num);
        txt_number.setText(number);

    }

    public void clicexit (View v) {
        Button btn = (Button) v;

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle(R.string.close);
        builder.setMessage(R.string.wannago);
        builder.setPositiveButton(R.string.yes, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                finish();}});
        builder.setNegativeButton(R.string.no, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.cancel(); }});

        builder.create().show();
    }

    }

