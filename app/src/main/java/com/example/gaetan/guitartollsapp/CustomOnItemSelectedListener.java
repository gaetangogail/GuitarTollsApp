package com.example.gaetan.guitartollsapp;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.Toast;

public class CustomOnItemSelectedListener implements OnItemSelectedListener {

    public void onItemSelected(AdapterView<?> parent, View view, int pos,
                               long id) {

        switch (pos) {
            default:
                /**Toast.makeText(parent.getContext(),
                 "On Item Select : \n" + parent.getItemAtPosition(pos),
                 Toast.LENGTH_LONG).show();**/

                Toast.makeText(getApplicationContext(), "vous choisissez C", Toast.LENGTH_LONG).show();
                imageView.setImageResource(R.drawable.c);
                break; // optional

            case 1:
                /**Toast.makeText(parent.getContext(),
                 "On Item Select : \n" + parent.getItemAtPosition(pos),
                 Toast.LENGTH_LONG).show();**/

                Toast.makeText(getApplicationContext(), "vous choisissez Db", Toast.LENGTH_LONG).show();
                imageView.setImageResource(R.drawable.db);
                break; // optional

           /* case 2 :
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
                break;*/

        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> arg0) {
        // TODO Auto-generated method stub

    }

}