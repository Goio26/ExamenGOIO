package com.example.dm2.examen;

import android.content.Context;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;




//CLASE PARA JUNTAR LA LISTA DE CHATS EN LA VENTANA CORRESPONDIENTE.
public class AdaptadorMuseo extends ArrayAdapter<Museo> {

    private Museo[] museos;

    public AdaptadorMuseo( Context contexto, Museo[] museos) {
        super(contexto, R.layout.list_item, museos);
        this.museos = museos;
    }


    public View getView(int position,View convertView, ViewGroup parent) {


        LayoutInflater inflater = LayoutInflater.from(getContext());
        View vista=inflater.inflate(R.layout.list_item,null);


        ImageView img=vista.findViewById(R.id.imgM);
        img.setImageDrawable(museos[position].getImg());

        TextView nombre=vista.findViewById(R.id.NomM);
        nombre.setText(museos[position].getNombre());

        TextView url=vista.findViewById(R.id.LugM);
        url.setText(museos[position].getLugar());


        return vista;
    }
}