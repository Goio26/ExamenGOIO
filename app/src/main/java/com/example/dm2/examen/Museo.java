package com.example.dm2.examen;



import android.graphics.drawable.Drawable;

public class Museo {

    private Drawable img;
    private String nombre,lugar,url;


    public Museo(Drawable i,String n,String l,String u){
        img=i;
        nombre=n;
        lugar=l;
        url=u;
    }


    //Getters

    public Drawable getImg() {
        return img;
    }



    public String getNombre() {
        return nombre;
    }



    public String getLugar() {
        return lugar;
    }

    public String getUrl() {
        return url;
    }


}
