package com.example.gaetan.guitartollsapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

public class ChordsGenerator extends AppCompatActivity {

    Spinner spinner_chords;
    Spinner spinner_chordstype;
    Button button_selected;
    ImageView chords_image;
    TextView textView;
    ArrayAdapter<CharSequence> adapter_chords;
    ArrayAdapter<CharSequence> adapter_chordstype;

    int position_chords = 0 ;
    int position_chordstype = 0 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chords_generator);

        chords_image = (ImageView) findViewById(R.id.chords_image);
        button_selected = (Button) findViewById(R.id.button_selected);
        spinner_chords = (Spinner) findViewById(R.id.chords);
        spinner_chordstype = (Spinner) findViewById(R.id.chordstype);
        textView = (TextView) findViewById(R.id.textView);

        //Initialisation du spinner
        adapter_chords = ArrayAdapter.createFromResource(this, R.array.chords_array, android.R.layout.simple_spinner_item);
        adapter_chords.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner_chords.setAdapter(adapter_chords);

        adapter_chordstype = ArrayAdapter.createFromResource(this, R.array.chordstype_array, android.R.layout.simple_spinner_item);
        adapter_chordstype.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner_chordstype.setAdapter(adapter_chordstype);

       spinner_chordstype.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
           @Override
           public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
               switch (position)
               {
                   case 0:
                       position_chordstype = 0;
                       break;

                   case 1:
                       position_chordstype = 1;
                       break;
               }
           }
           @Override
           public void onNothingSelected(AdapterView<?> parent) {
           }
       });

        spinner_chords.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch (position)
                {
                    case 0:
                        position_chords = 0;
                        break;

                    case 1:
                        position_chords = 1;
                        break;

                    case 2:
                        position_chords = 2;
                        break;

                    case 3:
                        position_chords = 3;
                        break;

                    case 4:
                        position_chords = 4;
                        break;

                    case 5:
                        position_chords = 5;
                        break;

                    case 6:
                        position_chords = 6;
                        break;

                    case 7:
                        position_chords = 7;
                        break;

                    case 8:
                        position_chords = 8;
                        break;

                    case 9:
                        position_chords = 9;
                        break;

                    case 10:
                        position_chords = 10;
                        break;

                    case 11:
                        position_chords = 11;
                        break;
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });
    }
    //set display button click to show result
    public void diplayResult(View view)
    {
        switch (position_chords){
            case 0:
                if(position_chordstype == 0){
                    chords_image.setImageResource(R.drawable.c);
                    textView.setText("C");
                }

                else if (position_chordstype == 1){
                    chords_image.setImageResource(R.drawable.cm);
                    textView.setText("Cm");
                }
                break;

            case 1:
                if(position_chordstype == 0) {
                    chords_image.setImageResource(R.drawable.db);
                    textView.setText("Db");
                }
                else if (position_chordstype == 1){
                    chords_image.setImageResource(R.drawable.dbm);
                    textView.setText("Dbm");
                }
                break;

            case 2:
                if(position_chordstype == 0){
                    chords_image.setImageResource(R.drawable.d);
                    textView.setText("D");
                }
                else if (position_chordstype == 1){
                    chords_image.setImageResource(R.drawable.dm);
                    textView.setText("Dm");
                }
                break;

            case 3:
                if(position_chordstype == 0){
                    chords_image.setImageResource(R.drawable.eb);
                    textView.setText("Eb");
                }
                else if (position_chordstype == 1){
                    chords_image.setImageResource(R.drawable.ebm);
                    textView.setText("Ebm");
                }
                break;

            case 4:
                if(position_chordstype == 0){
                    chords_image.setImageResource(R.drawable.e);
                    textView.setText("E");
                }
                else if (position_chordstype == 1){
                    chords_image.setImageResource(R.drawable.em);
                    textView.setText("Em");
                }
                break;

            case 5:
                if(position_chordstype == 0){
                    chords_image.setImageResource(R.drawable.f);
                    textView.setText("F");
                }
                else if (position_chordstype == 1){
                    chords_image.setImageResource(R.drawable.fm);
                    textView.setText("Fm");
                }
                break;

            case 6:
                if(position_chordstype == 0){
                    chords_image.setImageResource(R.drawable.gb);
                    textView.setText("Gb");
                }
                else if (position_chordstype == 1){
                    chords_image.setImageResource(R.drawable.gbm);
                    textView.setText("Gbm");
                }
                break;

            case 7:
                if(position_chordstype == 0){
                    chords_image.setImageResource(R.drawable.g);
                    textView.setText("G");
                }
                else if (position_chordstype == 1){
                    chords_image.setImageResource(R.drawable.gm);
                    textView.setText("Gm");
                }
                break;

            case 8:
                if(position_chordstype == 0){
                    chords_image.setImageResource(R.drawable.ab);
                    textView.setText("Ab");
                }
                else if (position_chordstype == 1){
                    chords_image.setImageResource(R.drawable.abm);
                    textView.setText("Abm");
                }
                break;

            case 9:
                if(position_chordstype == 0){
                    chords_image.setImageResource(R.drawable.a);
                    textView.setText("A");
                }
                else if (position_chordstype == 1){
                    chords_image.setImageResource(R.drawable.am);
                    textView.setText("Am");
                }
                break;

            case 10:
                if(position_chordstype == 0){
                    chords_image.setImageResource(R.drawable.bb);
                    textView.setText("Bb");
                }
                else if (position_chordstype == 1){
                    chords_image.setImageResource(R.drawable.bbm);
                    textView.setText("Bbm");
                }
                break;

            case 11:
                if(position_chordstype == 0){
                    chords_image.setImageResource(R.drawable.b);
                    textView.setText("B");
                }
                else if (position_chordstype == 1){
                    chords_image.setImageResource(R.drawable.bm);
                    textView.setText("Bm");
                }
                break;
        }
    }
}