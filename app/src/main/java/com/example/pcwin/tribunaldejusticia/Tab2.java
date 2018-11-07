package com.example.pcwin.tribunaldejusticia;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Tab2 extends Fragment {

    private ListView listView;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    public View onCreateView (@NonNull LayoutInflater inflater, @Nullable ViewGroup container, Bundle
            savedInstanceState){
        View rootView = inflater.inflate(R.layout.tab2_layout, container, false);

        listView =(ListView)rootView.findViewById(R.id.listView);
        String[] opciones = {
                "Turnos de expediente",
                "Asuntos de instrucción",
                "Sentencias",
                "Listados de publicación",
                "Listados de acuerdos",
                "Estadisticas"
        };

        listView.setAdapter(new ArrayAdapter<String>(getContext(),android.R.layout.simple_list_item_1, opciones));
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:
                        Intent llamar = new Intent(getContext(),MainActivity.class);
                        startActivity(llamar);
                        break;
                    case 1:
                        Intent llamar2 = new Intent(getContext(),MainActivity.class);
                        startActivity(llamar2);
                        break;
                    case 2:
                        Intent llamar3 = new Intent(getContext(),SentenciasActivity.class);
                        startActivity(llamar3);
                        break;
                    case 3:
                        Intent llamar4 = new Intent(getContext(),MainActivity.class);
                        startActivity(llamar4);
                        break;
                }
            }
        });


        return rootView;

    }

}
