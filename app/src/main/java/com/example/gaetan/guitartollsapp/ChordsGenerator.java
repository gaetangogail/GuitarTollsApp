package com.example.gaetan.guitartollsapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.Toast;


public class ChordsGenerator extends AppCompatActivity {

    Spinner spinner_chords;
    Spinner spinner_chordstype;
    Button button_selected;
    ImageView chords_image;
    ArrayAdapter<CharSequence> adapter_chords;
    ArrayAdapter<CharSequence> adapter_chordstype;

    int pos = 0 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chords_generator);


        //Ce que je souhaiterais utiliser dans la classe CustomOnItemSelectedListener.java
        chords_image = (ImageView) findViewById(R.id.chords_image);

        button_selected = (Button) findViewById(R.id.button_selected);

        spinner_chords = (Spinner) findViewById(R.id.chords);
        adapter_chords = ArrayAdapter.createFromResource(this, R.array.chords_array, android.R.layout.simple_spinner_item);
        adapter_chords.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner_chords.setAdapter(adapter_chords);

       /* button_selected.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "vous cliquer", Toast.LENGTH_LONG).show();

                //agit dès que l'on clique sur le spinner alors qu'il devrait attendre le clique du boutton non ?
                spinner_chords.setOnItemSelectedListener(new CustomOnItemSelectedListener());
            }
        });*/

        spinner_chords.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override

            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                //use postion value

                switch (position)
                {
                    case 0:
                        pos = 0;
                        break;

                    case 1:
                        pos = 1;
                        break;

                    case 2:
                        pos = 2;
                        break;

                    case 3:
                        pos = 3;
                        break;

                    case 4:
                        pos = 4;
                        break;

                    case 5:
                        pos = 5;
                        break;

                    case 6:
                        pos = 6;
                        break;

                    case 7:
                        pos = 7;
                        break;

                    case 8:
                        pos = 8;
                        break;

                    case 9:
                        pos = 9;
                        break;

                    case 10:
                        pos = 10;
                        break;

                    case 11:
                        pos = 11;
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

        switch (pos){
            case 0:
                chords_image.setImageResource(R.drawable.c);
                break;

            case 1:
                chords_image.setImageResource(R.drawable.db);
                break;

            case 2:
                chords_image.setImageResource(R.drawable.d);
                break;

            case 3:
                chords_image.setImageResource(R.drawable.eb);
                break;

            case 4:
                chords_image.setImageResource(R.drawable.e);
                break;

            case 5:
                chords_image.setImageResource(R.drawable.f);
                break;

            case 6:
                chords_image.setImageResource(R.drawable.gb);
                break;

            case 7:
                chords_image.setImageResource(R.drawable.g);
                break;

            case 8:
                chords_image.setImageResource(R.drawable.ab);
                break;

            case 9:
                chords_image.setImageResource(R.drawable.a);
                break;

            case 10:
                chords_image.setImageResource(R.drawable.bb);
                break;

            case 11:
                chords_image.setImageResource(R.drawable.b);
                break;
        }

    }
}






