package br.edu.ifsp.agendatelefonica.adapter;

import android.graphics.drawable.Icon;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import br.edu.ifsp.agendatelefonica.R;
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

        View itemlista = li.inflate(android.R.layout.activity_list_item,parent,false);
        return new GuardadorItemLista(itemlista);
    }

    @Override
    public void onBindViewHolder(@NonNull GuardadorItemLista holder, int position) {
        holder.icon.setImageResource(R.drawable.fone);
        holder.text1.setText( dadosAgenda.get(position).getNome()+" - "+dadosAgenda.get(position).getTelefone());
    }

    @Override
    public int getItemCount() {
        return dadosAgenda.size();
    }

    public class GuardadorItemLista extends RecyclerView.ViewHolder {
         private ImageView icon;
         private TextView text1;

         public GuardadorItemLista(@NonNull View itemView) {
             super(itemView);

             icon = itemView.findViewById(android.R.id.icon);
             text1 = itemView.findViewById(android.R.id.text1);

         }
     }
}
