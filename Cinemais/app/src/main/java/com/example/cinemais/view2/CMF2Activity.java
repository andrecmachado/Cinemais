package com.example.cinemais.view2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.example.cinemais.R;
import com.example.cinemais.View3.CMF2TrailerActivity;

public class CMF2Activity extends AppCompatActivity {

    ListView tv;
    String[] descricao = {"TITULO: Neve Negra",
            "DESCRICAO: Acusado de matar seu irmão durante a adolescência, Salvador (Ricardo Darín) vive isolado do mundo no meio " +
                    "da Patagônia. Depois de várias décadas sem ter contato com seu irmão Marcos (Leonardo Sbaraglia) e sua cunhada " +
                    "Laura (Laia Costa), o casal vai ao encontro de Salvador para convencê-lo a vender as terras que compartilham " +
                    "devido a uma herança. Neste local isolado e inacessível, o duelo entre os papéis de vítima e assassino voltam " +
                    "à tona.",
            "DIRETOR: Martín Hodara",
            "ELENCO: \n-Ricardo Darín" + "\n-Laia Costa" + "\n-Leonardo Sbaraglia" + "\n-Federico Luppi" + "\n-Dolores Fonzi",
            "SALAS: 01 - 04", "HORARIOS: 20:00 - 22:00"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cmf2);
        tv = (ListView) findViewById(R.id.ListViewCM2);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, descricao);
        tv.setAdapter(adapter);
    }

    public void abreTrailer (View view) {
        Intent intent = new Intent(this, CMF2TrailerActivity.class);
        startActivity(intent);
    }

    public void favoritar (View v) {
        Toast.makeText(CMF2Activity.this, "Adicionado aos favoritos", Toast.LENGTH_LONG).show();
    }

}
