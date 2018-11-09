package com.example.dm2.examen;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class Act_Museo extends AppCompatActivity {

    private ListView listaM;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act__museo);

        final Museo[] museos={
                new Museo(getDrawable(R.mipmap.ic_gugen),"Museo Guggenheim de Bilbao","Bilbo (Bizkaia)","https://www.guggenheim-bilbao.eus/ "),
                new Museo(getDrawable(R.mipmap.ic_bellas),"Museo de Bellas Artes de Bilbao","Bilbo (Bizkaia)","http://www.museobilbao.com/"),
                new Museo(getDrawable(R.mipmap.ic_san_telmo),"Museo San Telmo","Donostia (Gipuzkoa)","https://www.santelmomuseoa.eus"),
                new Museo(getDrawable(R.mipmap.ic_azkuna),"Azkuna Zentroa","Bilbo (Bizkaia)","https://www.azkunazentroa.eus"),
                new Museo(getDrawable(R.mipmap.ic_bellas_g),"Museo de Bellas Artes","Gasteiz (Araba)",""),
                new Museo(getDrawable(R.mipmap.ic_tabakalera),"Tabakalera","Donostia (Gipuzkoa)","https://www.tabakalera.eu/eu"),
                new Museo(getDrawable(R.mipmap.ic_arte),"Museo Diocesano de Arte Sacro","Gasteiz (Araba)",""),
                new Museo(getDrawable(R.mipmap.ic_arte_sacro_b),"Museo de Arte Sacro","Bilbo (Bizkaia)","http://www.eleizmuseoa.com/"),
                new Museo(getDrawable(R.mipmap.ic_artium),"Museo de Arte Sacro","Gasteiz (Araba)","http://www.artium.org/es/"),
                new Museo(getDrawable(R.mipmap.ic_faroles),"Museo de los Faroles","Gasteiz (Araba)",""),
                new Museo(getDrawable(R.mipmap.ic_hermoso),"Deposito de Agua – Montehermoso","Gasteiz (Araba)","https://www.montehermoso.net")
        };

        AdaptadorMuseo am=new AdaptadorMuseo(this,museos);
        listaM=findViewById(R.id.listaMuseos);
        listaM.setAdapter(am);



        listaM.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Museo w= (Museo)parent.getItemAtPosition(position);
                Uri uri=null;

                uri=Uri.parse(museos[position].getUrl());


                Intent intento=new Intent(Intent.ACTION_VIEW,uri);
                startActivity(intento);
            }

        });
    }
}
