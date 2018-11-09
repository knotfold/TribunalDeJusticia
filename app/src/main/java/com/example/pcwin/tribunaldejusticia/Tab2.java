package com.example.pcwin.tribunaldejusticia;

import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class Tab2 extends Fragment {

    private Button btnSentencias;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    public View onCreateView (@NonNull LayoutInflater inflater, @Nullable ViewGroup container, Bundle
            savedInstanceState){
        View rootView = inflater.inflate(R.layout.tab2_layout, container, false);

        btnSentencias = (Button) rootView.findViewById(R.id.btn_sentencias);
        btnSentencias.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(),ListadoTiposSentencias.class);
                startActivity(intent);

            }
        });



        return rootView;

    }

}
