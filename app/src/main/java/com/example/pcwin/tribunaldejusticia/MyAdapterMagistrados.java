package com.example.pcwin.tribunaldejusticia;


import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

import androidx.recyclerview.widget.RecyclerView;

public class MyAdapterMagistrados extends RecyclerView.Adapter<MyAdapterMagistrados.ViewHolder> {
    private List<ListItemMagistrados> listItem;
    private Context context;






    public static String URL_DATA = "https://rentame.000webhostapp.com/get_departamentov2.php";

    public MyAdapterMagistrados(List<ListItemMagistrados> listItems, Context context) {
        this.listItem = listItems;
        this.context = context;

    }


    @Override
    public MyAdapterMagistrados.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item_rv_magistrados, parent, false);
        return new ViewHolder(v);


    }



    @SuppressLint("SetTextI18n")
    @Override
    public void onBindViewHolder(final MyAdapterMagistrados.ViewHolder holder, int position) {
        final ListItemMagistrados listItemMagistrados = listItem.get(position);
        Picasso.get().load("http://www.tribunalelectoralchiapas.gob.mx//assets//images//guillermo_asseburg2.jpg").into(holder.imageMagistrado);
        Picasso.get().load("http://www.tribunalelectoralchiapas.gob.mx//assets//images//guillermo_asseburg2.jpg").into(holder.imageMagistrado2);
        holder.textGrado.setText(listItemMagistrados.getGrado_estudios());
        holder.textNombreMagistrado.setText(listItemMagistrados.getNombre());
        holder.textCargo.setText(listItemMagistrados.getCargo());
        holder.textMail.setText(listItemMagistrados.getMail());




        holder.linearLayoutSentencias.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {





            }
        });



    }




    @Override
    public int getItemCount() {
        return listItem.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder {

        public ImageView imageMagistrado;
        public ImageView imageMagistrado2;
        public TextView textGrado;
        public  TextView textNombreMagistrado;
        public TextView textCargo;
        public TextView textMail;
        public LinearLayout linearLayoutSentencias;

        public ViewHolder(View itemView) {
            super(itemView);

            imageMagistrado = (ImageView) itemView.findViewById(R.id.imageMagistrado);
            imageMagistrado2 = (ImageView) itemView.findViewById(R.id.imageMagistrado2);
            textGrado = (TextView) itemView.findViewById(R.id.txtGrado);
            textNombreMagistrado = (TextView) itemView.findViewById(R.id.txtNombreMagistrado);
            textCargo = (TextView) itemView.findViewById(R.id.txtCargo);
            textMail = (TextView) itemView.findViewById(R.id.txtEmail);
            linearLayoutSentencias= (LinearLayout) itemView.findViewById(R.id.linearLayoutMagistrados);


        }
    }
}