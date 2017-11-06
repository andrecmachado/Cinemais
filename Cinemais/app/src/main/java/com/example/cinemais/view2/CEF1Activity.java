package com.example.cinemais.view2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.example.cinemais.R;
import com.example.cinemais.View3.CSF3TrailerActivity;

public class CEF1Activity extends AppCompatActivity {

    ListView tv;
    String[] descricao = {"TITULO: Piratas do Caribe: A Vingaça de Salazar",
            "DESCRICAO: O capitão Salazar é a nova pedra no sapato do capitão Jack Sparrow. Ele lidera um exército" +
                    "de piratas fantasmas assassinos e está disposto a matar todos os piratas existentes na face " +
                    "da Terra. Para escapar, Sparrow precisa encontrar o Tridente de Poseidon, que dá ao seu dono " +
                    "o poder de controlar o mar.", "DIRETOR: \n-Joachim Rønning, \n-Espen Sandberg",
            "ELENCO: \n-Johnny Depp como Capitão Jack Sparrow" + "\n-Javier Bardem como Capitão Salazar" +
                    "\n-Brenton Thwaites como Henry Turner" + "\n-Kaya Scodelario como Carina Smyth" +
                    "\n-Geoffrey Rush como Capitão Barbossa" + "\n-Kevin McNally como Joshamee Gibbs" +
                    "\n-Stephen Graham como Scrum" + "\n-Orlando Bloom como Capitão William Turner" +
                    "\n-Martin Klebba como Marty" + "\n-Golshifteh Farahani como Shansa",
            "SALAS: 01 - 02", "HORARIOS:18:00 - 22:00 "};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cef1);
        tv = (ListView) findViewById(R.id.ListViewCE1);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, descricao);
        tv.setAdapter(adapter);
    }

    public void abreTrailer (View view) {
        Intent intent = new Intent(this, CSF3TrailerActivity.class);
        startActivity(intent);
    }

    public void favoritar (View v) {
        Toast.makeText(CEF1Activity.this, "Adicionado aos favoritos", Toast.LENGTH_LONG).show();
    }

}
