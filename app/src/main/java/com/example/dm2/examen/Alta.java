package com.example.dm2.examen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Alta extends AppCompatActivity {


    private Button botC,botA;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alta);


        botC=findViewById(R.id.botCancelar);
        botA=findViewById(R.id.botAlta);

        botC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intento=new Intent(Alta.this,Comprobacion.class);

                startActivity(intento);
            }
        });

        botA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intento=new Intent(Alta.this,Comprobacion.class);



                startActivity(intento);
            }
        });
    }
}
