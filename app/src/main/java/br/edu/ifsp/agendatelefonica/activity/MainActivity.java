package br.edu.ifsp.agendatelefonica.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;

import br.edu.ifsp.agendatelefonica.R;
import br.edu.ifsp.agendatelefonica.model.Agenda;

public class MainActivity extends AppCompatActivity {

    private EditText etNome;
    private EditText etTelefone;
    private Button btnAdicionar;
    private Button btnSair;
    private RecyclerView rvListaagenda;

    ArrayList<Agenda> listaAgenda = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNome = findViewById(R.id.ETnome);
        etTelefone = findViewById(R.id.ETtelefone);
        rvListaagenda = findViewById(R.id.RVlistaagenda);

        btnAdicionar.setOnClickListener( new ListenerBtAdcionar());
        btnSair.setOnClickListener(new ListaBtSair());

    }

    private class ListenerBtAdcionar implements View.OnClickListener {
        @Override
        public void onClick(View v) {

        }
    }

    private class ListaBtSair implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            System.exit(0);
        }
    }
}
