package com.iamseb.auroras_activity;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

// (2) SE INDICA DE DONDE HEREDA LA CLASE ADAPTADOR, DENTRO DE <> SE PONE EL NOMBRE DE ESTE ARCHIVO Y
//EL MÉTODO QUE SE ESCRIBIÓ EN (1), Y PIDE IMPLANTAR LOS TRES MÉTODOS
public class adaptador_aurora extends RecyclerView.Adapter<adaptador_aurora.AuroraViewHolder>{

    ArrayList<constructor_aurora> auroras; // (3) SE DEFINE EL ARRAY COMO EN EL MAIN ACTIVITY

// (9) SE DECLARA EL MÉTODO CONSTRUCTOR DE adaptador_aurora, CREARÁ EL ARRAYLIST

    public adaptador_aurora(ArrayList<constructor_aurora>auroras){
        this.auroras=auroras;
    }


    @NonNull
    @Override
// (5) ESTE MÉTODO INFLARÁ EL LAYOUT CARD VIEW, LE DARÁ VIDA. SE MANDA A TRAER EL CARDVIEW CON .layout
    public AuroraViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_aurora,parent,false);
// (6) SE CAMBIA EL RETURN DE NULL, El AuroraViewHolder ES EL MÉTODO QUE SE ESCRIBIÓ PRIMERO
        return new AuroraViewHolder(view);
    }
// (7) SE PASA LA LISTA A CADA ELEMENTO, ESTE ELEMENTO SE INVOCA CADA QUE SE RECORRE LA LISTA, OBTIENE SU POSICIÓN PARA
    //EXTRAERLOS, SE CREA UN OBJETO, ÉSTE FUE AL QUE SE LE CREARON LOS GETTERS Y SETTERS
    @Override
    public void onBindViewHolder(@NonNull AuroraViewHolder holder, int position) {
        constructor_aurora aurora=auroras.get(position);
// (8) CON LA PALABRA holder SE ACCEDE A LOS ID DE LOS ELEMENTOS QUE ESTÁN EN EL CARDVIEW
        holder.imgprincipalcard.setImageResource(aurora.getFoto());
        holder.cardname.setText(aurora.getNombre());
        holder.cardnum.setText(aurora.getNumero());
        holder.imgestre.setImageResource(aurora.getEstre());
        holder.imgestrella.setImageResource(aurora.getEstrella());
    }

    @Override
    public int getItemCount() {//Q de elementos que contiene la lista, generar el ArrayList
        return auroras.size();  // (4) SE CAMBIA EL RETURN DE NULL A objetos.size()
    }
// (1) SE ESCRIBE ESTO
    public static class AuroraViewHolder extends RecyclerView.ViewHolder{
//SE HACE EL CASTEO DE LOS VIEWS QUE CONTIENE EL CARDVIEW
        ImageView imgprincipalcard;
        ImageView imgestre;
        ImageView imgestrella;
        TextView cardname;
        TextView cardnum;

        public AuroraViewHolder(@NonNull View itemView) {
            super(itemView);
           imgprincipalcard=(ImageView)itemView.findViewById(R.id.imgprincipalcard);
           imgestre=(ImageView)itemView.findViewById(R.id.imgestre);
           imgestrella=(ImageView)itemView.findViewById(R.id.imgestrella);
           cardname=(TextView)itemView.findViewById(R.id.cardname);
           cardnum=(TextView)itemView.findViewById(R.id.cardnum);
        }
    }
}