package com.example.cinemais.control;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import com.example.cinemais.BancoDados;
import com.example.cinemais.view.CineEspacoActivity;
import com.example.cinemais.view.CineMarkActivity;
import com.example.cinemais.view.CineSystemActivity;
import com.example.cinemais.R;
import com.example.cinemais.model.Cinema;
import com.example.cinemais.view.FavoritosActivity;

public class MainActivity extends AppCompatActivity {

    BancoDados db = new BancoDados(this);
    ListView lista;
    Cinema[] cinema = {new Cinema("Cinesystem Florianópolis", -27.5903699, -48.5170435), new Cinema("Cineespaço Florianópolis", -27.584509, -48.5475637), new Cinema("Cinemark Florianópolis", -27.5543531, -48.4978133)};
    String[] listaNomeCinemas = {cinema[0].getNome(), cinema[1].getNome(), cinema[2].getNome()};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lista = (ListView) findViewById(R.id.ListaCinemas);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, listaNomeCinemas);
        lista.setAdapter(adapter);
        // onClickListener na lista.
        click();
        db.listaTodosFilmes();
    }

    public void abrirTelaMaps(View v) {
        Intent intent = new Intent(this, MapsActivity.class);
        startActivity(intent);
    }

    public void abrirTelaCineSystem(View v) {
        Intent intent = new Intent(this, CineSystemActivity.class);
        //intent.putExtra("key", "cinemark");
        startActivity(intent);
    }

    public void abrirTelaCineEspaco(View v) {
        Intent intent = new Intent(this, CineEspacoActivity.class);
        startActivity(intent);
    }

    public void abrirTelaCineMark(View v) {
        Intent intent = new Intent(this, CineMarkActivity.class);
        startActivity(intent);
    }

    public void abreTelaFavoritos (View v) {
        Intent intent = new Intent(this, FavoritosActivity.class);
        startActivity(intent);
    }

    public void click() {
        lista.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if (i == 0) {
                    abrirTelaCineSystem(view);
                } else if (i == 1) {
                    abrirTelaCineEspaco(view);
                } else {
                    abrirTelaCineMark(view);
                }
            }
        });
    }

}
