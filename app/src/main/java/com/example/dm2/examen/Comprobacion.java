package com.example.dm2.examen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class Comprobacion extends AppCompatActivity {

    private int num1,num2;
    private TextView textNum1,textNum2,textoP,textoM,textoO;
    private EditText res;
    private Button botComp;
    private Spinner combo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comprobacion);
        final long num1=Math.round(1+Math.random()*10);
        final long num2=Math.round(1+Math.random()*10);

        textNum1=findViewById(R.id.num1);
        textNum2=findViewById(R.id.num2);
        textNum1.setText(num1+"");
        textNum2.setText(num2+"");

        res=findViewById(R.id.resul);

        textoP=findViewById(R.id.et1);
        textoM=findViewById(R.id.et2);
        textoO=findViewById(R.id.lineaO);


        botComp=findViewById(R.id.botComp);

        final String[] desplegable=new String[]{"","Darse de Alta","Ver listado de Museos"};
        final ArrayAdapter<String> adaptador=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,desplegable);

        botComp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                double resul=Integer.parseInt(res.getText().toString());
                double suma=num1+num2;
                if(resul==suma){
                    textoP.setText(R.string.perf);
                    textoM.setText(R.string.noM);
                    textoO.setText(R.string.opc);

                    combo=findViewById(R.id.combo);


                    adaptador.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

                    combo.setAdapter(adaptador);

                    combo.setOnItemSelectedListener(

                            new AdapterView.OnItemSelectedListener() {

                                @Override
                                public void onItemSelected(AdapterView<?> adapterView,
                                                           View view, int i, long l) {
                                    String str= String.valueOf(adapterView.getItemIdAtPosition(i));


                                    if(str.equals(new String(1+""))){
                                        Intent intento=new Intent(Comprobacion.this,Alta.class);

                                        startActivity(intento);
                                    }

                                    if(str.equals(new String(2+""))){
                                        Intent intento=new Intent(Comprobacion.this,Act_Museo.class);

                                        startActivity(intento);
                                    }


                                }

                                @Override
                                public void onNothingSelected(AdapterView<?> adapterView) {


                                }
                            });

                }else{

                }

            }

        });








    }


}


