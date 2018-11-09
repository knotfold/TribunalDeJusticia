package com.example.pcwin.tribunaldejusticia;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.Placeholder;

import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class ActivityTest extends AppCompatActivity {

    private ImageView imageView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);

        imageView = (ImageView) findViewById(R.id.imageMagistrado2);
        Picasso.get().load("http://www.tribunalelectoralchiapas.gob.mx/assets/images/guillermo_asseburg2.jpg").into(imageView);
    }
}
