package com.example.cinemais.view;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;
import com.example.cinemais.R;
import com.example.cinemais.view2.CMF2Activity;
import com.example.cinemais.view2.CSF1Activity;
import com.example.cinemais.view2.CSF3Activity;

public class FavoritosActivity extends AppCompatActivity {

    ListView lv;
    int posicao;
    // vetor de filmes favoritos.
    String[] favoritos = {"Piratas do Caribe: A Vingaça de Salazar", "A Múmia", "Neve Negra"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favoritos);
        lv = (ListView) findViewById(R.id.ListViewFavoritos);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, favoritos);
        lv.setAdapter(adapter);
        click();
    }

    public void click() {
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if (i == 0) {
                    posicao = i;
                } else if (i == 1) {
                    posicao = i;
                } else if (i == 2) {
                        posicao = i;
                }else {
                    posicao = -1;
                }
            }
        });
    }

    public void buscar (View view) {
        if (posicao == 0) {
            Intent intent = new Intent(this, CSF3Activity.class);
            startActivity(intent);
        } else if (posicao == 1) {
            Intent intent = new Intent(this, CSF1Activity.class);
            startActivity(intent);
        } else if (posicao == 2) {
            Intent intent = new Intent(this, CMF2Activity.class);
            startActivity(intent);
        } else {
            return;
        }
    }

    public void remover (View view) {
        //Toast.makeText(FavoritosActivity.this, , Toast.LENGTH_LONG).show();
        Toast.makeText(FavoritosActivity.this, favoritos[posicao] + "\nRemovido dos favoritos", Toast.LENGTH_LONG).show();
    }

}
