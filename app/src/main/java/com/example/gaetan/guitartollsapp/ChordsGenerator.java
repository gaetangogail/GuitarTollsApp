package com.example.gaetan.guitartollsapp;

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
    ArrayAdapter<CharSequence> adapter_chords;
    ArrayAdapter<CharSequence> adapter_chordstype;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chords_generator);

        final ImageView imageView = (ImageView) findViewById(R.id.chords_image);

        button_selected = (Button) findViewById(R.id.button_selected);

        spinner_chords = (Spinner) findViewById(R.id.chords);
        adapter_chords = ArrayAdapter.createFromResource(this, R.array.chords_array, android.R.layout.simple_spinner_item);
        adapter_chords.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner_chords.setAdapter(adapter_chords);

        spinner_chords.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                switch(position) {
                    default:
                        Toast.makeText(getApplicationContext(), "vous choisissez C", Toast.LENGTH_LONG).show();
                        imageView.setImageResource(R.drawable.c);
                        break; // optional

                    case 1 :
                        Toast.makeText(getApplicationContext(), "vous choisissez Db", Toast.LENGTH_LONG).show();
                        imageView.setImageResource(R.drawable.db);
                        break; // optional

                    case 2 :
                        Toast.makeText(getApplicationContext(), "vous choisissez D", Toast.LENGTH_LONG).show();
                        imageView.setImageResource(R.drawable.d);
                        break;

                    case 3 :
                        Toast.makeText(getApplicationContext(), "vous choisissez Eb", Toast.LENGTH_LONG).show();
                        imageView.setImageResource(R.drawable.eb);
                        break;

                    case 4 :
                        Toast.makeText(getApplicationContext(), "vous choisissez E", Toast.LENGTH_LONG).show();
                        imageView.setImageResource(R.drawable.e);
                        break;

                    case 5 :
                        Toast.makeText(getApplicationContext(), "vous choisissez F", Toast.LENGTH_LONG).show();
                        imageView.setImageResource(R.drawable.f);
                        break;

                    case 6 :
                        Toast.makeText(getApplicationContext(), "vous choisissez Gb", Toast.LENGTH_LONG).show();
                        imageView.setImageResource(R.drawable.gb);
                        break;

                    case 7 :
                        Toast.makeText(getApplicationContext(), "vous choisissez G", Toast.LENGTH_LONG).show();
                        imageView.setImageResource(R.drawable.g);
                        break; // optional

                    case 8 :
                        Toast.makeText(getApplicationContext(), "vous choisissez Ab", Toast.LENGTH_LONG).show();
                        imageView.setImageResource(R.drawable.ab);
                        break;

                    case 9 :
                        Toast.makeText(getApplicationContext(), "vous choisissez A", Toast.LENGTH_LONG).show();
                        imageView.setImageResource(R.drawable.a);
                        break;

                    case 10 :
                        Toast.makeText(getApplicationContext(), "vous choisissez Bb", Toast.LENGTH_LONG).show();
                        imageView.setImageResource(R.drawable.bb);
                        break;

                    case 11 :
                        Toast.makeText(getApplicationContext(), "vous choisissez B", Toast.LENGTH_LONG).show();
                        imageView.setImageResource(R.drawable.b);
                        break;

                    case 12 :
                        Toast.makeText(getApplicationContext(), "vous choisissez B", Toast.LENGTH_LONG).show();
                        imageView.setImageResource(R.drawable.b);
                        break;


                }


            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    }

    // Spinner item selection Listener
    //   addListenerOnSpinnerItemSelection();


    // Add spinner data
    public void addListenerOnSpinnerItemSelection() {
        spinner_chords.setOnItemSelectedListener(new CustomOnItemSelectedListener());
    }
}

