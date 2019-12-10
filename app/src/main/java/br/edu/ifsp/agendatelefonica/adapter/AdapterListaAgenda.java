package br.edu.ifsp.agendatelefonica.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import br.edu.ifsp.agendatelefonica.model.Agenda;

public class AdapterListaAgenda extends RecyclerView.Adapter<AdapterListaAgenda.GuardadorItemLista> {

    private ArrayList<Agenda> dadosAgenda;

    public AdapterListaAgenda(ArrayList<Agenda> dadosAgenda){
        this.dadosAgenda = dadosAgenda;
    }

    @NonNull
    @Override
    public GuardadorItemLista onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater li = LayoutInflater.from(parent.getContext());
        View itemlista = li.inflate(android.R.layout.simple_list_item_2,parent,false);

        return new GuardadorItemLista(itemlista);
    }

    @Override
    public void onBindViewHolder(@NonNull GuardadorItemLista holder, int position) {
        holder.text1.setText( dadosAgenda.get(position).getNome());
        holder.text2.setText( dadosAgenda.get(position).getTelefone());
    }

    @Override
    public int getItemCount() {
        return dadosAgenda.size();
    }

    public class GuardadorItemLista extends RecyclerView.ViewHolder {
         private TextView text1;
         private TextView text2;
         public GuardadorItemLista(@NonNull View itemView) {
             super(itemView);

             text1 = itemView.findViewById(android.R.id.text1);
             text2 = itemView.findViewById(android.R.id.text2);

         }
     }
}
