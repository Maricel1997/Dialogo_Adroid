package com.maricel.dialogo;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void salir(View view) {
        AlertDialog.Builder alertDialogoBuilder = new AlertDialog.Builder(this);
        alertDialogoBuilder.setTitle("Advertencia");
        alertDialogoBuilder.setIcon(R.drawable.icono);
        alertDialogoBuilder.setMessage("Desea Salir de la Aplicacion");
        alertDialogoBuilder.setCancelable(false);
        alertDialogoBuilder.setPositiveButton("Si", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface arg0, int arg1) {
                finish();

            }

        });
        alertDialogoBuilder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface arg0, int arg1) {
                Toast.makeText(MainActivity.this, "Has Seleccionado No", Toast.LENGTH_LONG).show();

            }

        });
        alertDialogoBuilder.setNeutralButton("Cancelar", new DialogInterface.OnClickListener() {
         @Override
            public void onClick(DialogInterface arg0, int arg1) {
                Toast.makeText(MainActivity.this, "Has Seleccionado Cancelar", Toast.LENGTH_LONG).show();
            }

        });

        AlertDialog alertDialog = alertDialogoBuilder.create();
        alertDialog.show();


    }
}
