package com.example.pcwin.tribunaldejusticia;


import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

public class MyAdapterSentencias extends RecyclerView.Adapter<MyAdapterSentencias.ViewHolder> {
    private List<ListItemSentencias> listItem;
    private Context context;






    public static String URL_DATA = "https://rentame.000webhostapp.com/get_departamentov2.php";

    public MyAdapterSentencias(List<ListItemSentencias> listItems, Context context) {
        this.listItem = listItems;
        this.context = context;

    }


    @Override
    public MyAdapterSentencias.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item_rv_sentencias, parent, false);
        return new ViewHolder(v);


    }



    @SuppressLint("SetTextI18n")
    @Override
    public void onBindViewHolder(final MyAdapterSentencias.ViewHolder holder, int position) {
        final ListItemSentencias listItemSentencias = listItem.get(position);
        holder.textExpediente.setText(listItemSentencias.getExpediente());
        holder.textMagistradoExp.setText(listItemSentencias.getMagistrado());
        holder.textFechaExp.setText(listItemSentencias.getFecha());




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

        public  TextView textExpediente;
        public TextView textMagistradoExp;
        public TextView textFechaExp;
        public LinearLayout linearLayoutSentencias;

        public ViewHolder(View itemView) {
            super(itemView);

            textExpediente = (TextView) itemView.findViewById(R.id.txt_nombre_exp);
            textMagistradoExp = (TextView) itemView.findViewById(R.id.txt_magistrado);
            textFechaExp = (TextView) itemView.findViewById(R.id.txt_fecha_sentencia);
            linearLayoutSentencias= (LinearLayout) itemView.findViewById(R.id.linearLayoutSentencias);


        }
    }
}