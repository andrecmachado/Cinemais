package com.example.cinemais.view2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.example.cinemais.R;
import com.example.cinemais.View3.CMF1TrailerActivity;

public class CMF1Activity extends AppCompatActivity {

    ListView tv;
    String[] descricao = {"TITULO: Ozzy",
            "DESCRICAO: Ozzy é um jovem beagle que sempre viveu feliz com a sua família humana. Quando recebem a notícia de que " +
                    "ganharam uma viagem ao Japão, os humanos não cabem em si de contentes. O problema surge no momento em que " +
                    "percebem que nessa viagem não são permitidos cães. Decididos a deixar o seu grande amigo em boas mãos, " +
                    "optam por inscrevê-lo no Blue Creek, um spa para cães que se assemelha ao paraíso (canino, claro). Mas o " +
                    "que ele descobre assim que os donos viram costas é aterrador: afinal, Blue Creek é uma prisão gerida pelo " +
                    "terrível Sr. Silva, onde impera a lei do mais forte, a mais injusta e arbitrária regra alguma vez criada.",
            "DIRETOR: Alberto Rodríguez",
            "ELENCO: \n-Elsa Pataky" + "\n-Dani Rovira" + "\n-Pablo Espinosa\n" + "\n-Michelle JennerPaula" + "\n-Rob Schneide",
            "SALAS: 01 - 03", "HORARIOS: 13:00 - 16:00 "};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cmf1);
        tv = (ListView) findViewById(R.id.ListViewCM1);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, descricao);
        tv.setAdapter(adapter);
    }

    public void abreTrailer (View view) {
        Intent intent = new Intent(this, CMF1TrailerActivity.class);
        startActivity(intent);
    }

    public void favoritar (View v) {
        Toast.makeText(CMF1Activity.this, "Adicionado aos favoritos", Toast.LENGTH_LONG).show();
    }

}
