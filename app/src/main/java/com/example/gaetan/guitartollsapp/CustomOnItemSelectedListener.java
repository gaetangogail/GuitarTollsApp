package com.example.gaetan.guitartollsapp;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.Toast;

public class CustomOnItemSelectedListener implements OnItemSelectedListener {

    public void onItemSelected(AdapterView<?> parent, View view, int pos,
                               long id) {

      /*  Toast.makeText(parent.getContext(),
                "On Item Select : \n" + parent.getItemAtPosition(pos),
                Toast.LENGTH_LONG).show();*/

        switch(pos) {
            default:
                Toast.makeText(parent.getContext(), "vous choisissez C", Toast.LENGTH_LONG).show();
                break; // optional

            case 1 :
                Toast.makeText(parent.getContext(), "vous choisissez D", Toast.LENGTH_LONG).show();
                break; // optional

            case 2 :
                Toast.makeText(parent.getContext(), "vous choisissez E", Toast.LENGTH_LONG).show();
                break;

            case 3 :
                Toast.makeText(parent.getContext(), "vous choisissez F", Toast.LENGTH_LONG).show();
                break;

            case 4 :
                Toast.makeText(parent.getContext(), "vous choisissez G", Toast.LENGTH_LONG).show();
                break;

            case 5 :
                Toast.makeText(parent.getContext(), "vous choisissez A", Toast.LENGTH_LONG).show();
                break;

            case 6 :
                Toast.makeText(parent.getContext(), "vous choisissez B", Toast.LENGTH_LONG).show();
                break;


        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> arg0) {
        // TODO Auto-generated method stub

    }

}