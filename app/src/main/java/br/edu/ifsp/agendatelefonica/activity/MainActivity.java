package br.edu.ifsp.agendatelefonica.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;

import java.util.ArrayList;

import br.edu.ifsp.agendatelefonica.R;
import br.edu.ifsp.agendatelefonica.adapter.AdapterListaAgenda;
import br.edu.ifsp.agendatelefonica.model.Agenda;

public class MainActivity extends AppCompatActivity {

    private EditText etNome;
    private EditText etTelefone;
    private Button btnAdicionar;
    private Button btnSair;
    private RecyclerView rvListaagenda;

    private ArrayList<Agenda> listaAgenda = new ArrayList<>();

    AdapterListaAgenda adapter = new AdapterListaAgenda(listaAgenda);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNome = findViewById(R.id.ETnome);
        etTelefone = findViewById(R.id.ETtelefone);
        rvListaagenda = findViewById(R.id.RVlistaagenda);
        btnAdicionar = findViewById(R.id.BTNadicionar);
        btnSair = findViewById(R.id.BTNsair);

        btnAdicionar.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Agenda agenda = new Agenda(etNome.getText().toString(), etTelefone.getText().toString());
                listaAgenda.add(agenda);
                etNome.setText("");
                etTelefone.setText("");

                adapter.notifyDataSetChanged();
            }
        });

        btnSair.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        RecyclerView.LayoutManager lm = new LinearLayoutManager( getApplicationContext() );

        rvListaagenda.setLayoutManager( lm );

        adapter = new AdapterListaAgenda( listaAgenda );

        rvListaagenda.setAdapter( adapter );

        rvListaagenda.setHasFixedSize( true );

        DividerItemDecoration linha =
                new DividerItemDecoration( this, LinearLayout.VERTICAL );
        rvListaagenda.addItemDecoration( linha );

    }


}
