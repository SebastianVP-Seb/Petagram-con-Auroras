package com.iamseb.auroras_activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recycler_aurora;
    ArrayList <constructor_aurora> auroras;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recycler_aurora=(RecyclerView)findViewById(R.id.recycler_aurora);
// SE DEFINE LA FORMA EN LA QUE SE PRESENTARÁ EL LAYOUT
        LinearLayoutManager llm=new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        recycler_aurora.setLayoutManager(llm);

        inicializarListaAuroras();
        inicializarAdaptador();
    }
// (2) SE CREA EL MÉTODO PARA INICIALIZAR EL ADAPTADOR
    public void inicializarAdaptador(){
        adaptador_aurora adaptador=new adaptador_aurora(auroras); //auroras SE REFIERE A LOS ELEMENTOS QUE SE ENCUENTRAN
        //EN EL MÉTODO INICIALIZARlISTAAURORAS
        //SE LE ASIGNA EL ADAPTADOR AL RECYCLERVIEW
        recycler_aurora.setAdapter(adaptador);
    }
// (1) SE DEFINE LOS ELEMENTOS QUE CONTENDRÁ EL RECYCLER
    public void inicializarListaAuroras(){
        auroras=new ArrayList<constructor_aurora>();
        auroras.add(new constructor_aurora("Maricela","75",R.drawable.finland,android.R.drawable.btn_star_big_off, android.R.drawable.btn_star_big_on));
        auroras.add(new constructor_aurora("Sebastián","30",R.drawable.iceland,android.R.drawable.btn_star_big_off, android.R.drawable.btn_star_big_on));
        auroras.add(new constructor_aurora("Sarahi","26",R.drawable.icelanda,android.R.drawable.btn_star_big_off, android.R.drawable.btn_star_big_on));
        auroras.add(new constructor_aurora("Felipe","25",R.drawable.icelandb,android.R.drawable.btn_star_big_off, android.R.drawable.btn_star_big_on));
        auroras.add(new constructor_aurora("Alejandro","29",R.drawable.icelandm,android.R.drawable.btn_star_big_off, android.R.drawable.btn_star_big_on));
//        auroras.add(new constructor_aurora("Elvis","10",R.drawable.norway,android.R.drawable.btn_star_big_off, android.R.drawable.btn_star_big_on));
//        auroras.add(new constructor_aurora("Silvana","24",R.drawable.nothern,android.R.drawable.btn_star_big_off, android.R.drawable.btn_star_big_on));
//        auroras.add(new constructor_aurora("Nayeli","23",R.drawable.pino,android.R.drawable.btn_star_big_off, android.R.drawable.btn_star_big_on));
//        auroras.add(new constructor_aurora("Fernanda","29",R.drawable.wreck,android.R.drawable.btn_star_big_off, android.R.drawable.btn_star_big_on));
//        auroras.add(new constructor_aurora("Rocío","17",R.drawable.yellow,android.R.drawable.btn_star_big_off, android.R.drawable.btn_star_big_on));
    }
}