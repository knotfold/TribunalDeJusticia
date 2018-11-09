package com.example.pcwin.tribunaldejusticia;

import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class Tab1 extends Fragment {

    private Button btnDirectorio;

    public View onCreateView (LayoutInflater inflater, @Nullable ViewGroup container, Bundle
            savedInstanceState){
        View rootView = inflater.inflate(R.layout.tab1_home, container, false);

        btnDirectorio = (Button) rootView.findViewById(R.id.btn_directorio);

        btnDirectorio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(),ActivityTest.class);
                startActivity(intent);
            }
        });



        return rootView;

    }

}
