package com.example.exploradordelugarestursticos.ui.lugaresTuristicos;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.exploradordelugarestursticos.R;
import com.example.exploradordelugarestursticos.ui.lugaresTuristicos.Model.LugarTuristico;

import java.util.List;

public class LugarAdapter extends RecyclerView.Adapter<LugarAdapter.ViewHolder> {
    private List<LugarTuristico> lista;
    private Context context;
    private LayoutInflater inflater;
    public LugarAdapter(List<LugarTuristico> lista, Context context, LayoutInflater inflater) {
        this.lista = lista;
        this.context = context;
        this.inflater = inflater;
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.item_lugar_turistico,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.Nombre.setText(lista.get(position).getNombre());
        holder.Descripcion.setText(lista.get(position).getDescripcion());
    }

    @Override
    public int getItemCount() {
        return lista.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView Nombre;
        private TextView Descripcion;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            Nombre = itemView.findViewById(R.id.tvNombre);
            Descripcion = itemView.findViewById(R.id.tvDescripcion);
        }
    }

}
