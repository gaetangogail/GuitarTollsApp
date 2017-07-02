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


        //Ce que je souhaiterais utiliser dans la classe CustomOnItemSelectedListener.java
        final ImageView imageView = (ImageView) findViewById(R.id.chords_image);

        button_selected = (Button) findViewById(R.id.button_selected);

        spinner_chords = (Spinner) findViewById(R.id.chords);
        adapter_chords = ArrayAdapter.createFromResource(this, R.array.chords_array, android.R.layout.simple_spinner_item);
        adapter_chords.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner_chords.setAdapter(adapter_chords);

        // Spinner item selection Listener
        //A voir pour utiliser avec un bouton
        addListenerOnSpinnerItemSelection();

    }


    // Add spinner data
    public void addListenerOnSpinnerItemSelection() {
        spinner_chords.setOnItemSelectedListener(new CustomOnItemSelectedListener());
    }
}

