package com.example.pcwin.tribunaldejusticia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class ListadoTiposSentencias extends AppCompatActivity {
    ListView listView;
    ArrayAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listado_sentencias);

        listView =(ListView)findViewById(R.id.listTiposSentencias);
        String[] opciones = {
                "(JI) Juicios de Inconformidad",
                        "(J-LAB) Juicios Laborales",
                        "(JE) Juicios Electorales",
                        "(JNE-M) Juicios de Nulidad Electoral Municipal",
                        "(JNE-D) Juicios de Nulidad Electoral Distrital",
                        "(AG) Asuntos Generales",
                        "(IR) Incidente de Recusación",
                        "(INA)Incidente de Nulidad de Actuaciones",
                        "(IIS) Incidente de Incumplimiento de Sentencia",
                        "(IFP) Incidente de Falta de Personalidad",
                        "(IES) Incidente de Ejecución de Sentencia",
                        "(IAS) Incidente de Aclaración de Sentencia",
                        "(IPEP) Incidente de previo y especial pronunciamiento de nuevo escrutinio y cómputo"

        };

        mAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,opciones){
            @Override
            public View getView(int position, View convertView, ViewGroup parent){
                // Cast the list view each item as text view
                TextView item = (TextView) super.getView(position,convertView,parent);

                // Set the typeface/font for the current item

                // Set the list view item's text color
                item.setTextColor(Color.parseColor("#000000"));

                // Set the item text style to bold


                // Change the item text size
                item.setTextSize(TypedValue.COMPLEX_UNIT_DIP,18);

                // return the view
                return item;
            }
        };



        listView.setAdapter(mAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:
                        Intent llamar = new Intent(ListadoTiposSentencias.this,SentenciasActivity.class);
                        startActivity(llamar);
                        break;
                    case 1:
                        Intent llamar1 = new Intent(ListadoTiposSentencias.this,SentenciasActivity.class);
                        startActivity(llamar1);
                        break;
                    case 2:
                        Intent llamar2 = new Intent(ListadoTiposSentencias.this,SentenciasActivity.class);
                        startActivity(llamar2);
                        break;
                    case 3:
                        Intent llamar3 = new Intent(ListadoTiposSentencias.this,SentenciasActivity.class);
                        startActivity(llamar3);
                        break;

                    case 4:
                        Intent llamar4 = new Intent(ListadoTiposSentencias.this,SentenciasActivity.class);
                        startActivity(llamar4);
                        break;

                    case 5:
                        Intent llamar5 = new Intent(ListadoTiposSentencias.this,SentenciasActivity.class);
                        startActivity(llamar5);
                        break;

                    case 6:
                        Intent llamar6 = new Intent(ListadoTiposSentencias.this,SentenciasActivity.class);
                        startActivity(llamar6);
                        break;

                    case 7:
                        Intent llamar7 = new Intent(ListadoTiposSentencias.this,SentenciasActivity.class);
                        startActivity(llamar7);
                        break;

                    case 8:
                        Intent llamar8 = new Intent(ListadoTiposSentencias.this,SentenciasActivity.class);
                        startActivity(llamar8);
                        break;

                    case 9:
                        Intent llamar9 = new Intent(ListadoTiposSentencias.this,SentenciasActivity.class);
                        startActivity(llamar9);
                        break;

                    case 10:
                        Intent llamar10 = new Intent(ListadoTiposSentencias.this,SentenciasActivity.class);
                        startActivity(llamar10);
                        break;

                    case 11:
                        Intent llamar11 = new Intent(ListadoTiposSentencias.this,SentenciasActivity.class);
                        startActivity(llamar11);
                        break;

                    case 12:
                        Intent llamar12 = new Intent(ListadoTiposSentencias.this,SentenciasActivity.class);
                        startActivity(llamar12);
                        break;
                }
            }
        });
    }
}
