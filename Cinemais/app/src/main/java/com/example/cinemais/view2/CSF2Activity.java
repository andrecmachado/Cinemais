package com.example.cinemais.view2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.example.cinemais.R;
import com.example.cinemais.View3.CSF2TrailerActivity;

public class CSF2Activity extends AppCompatActivity {

    ListView lv;
    String[] descricao = {"TITULO: Mulher Maravilha", "DESCRICAO: Treinada desde cedo para ser uma guerreira" +
                          "imbatível, Diana Prince nunca saiu da paradisíaca ilha em que é reconhecida como princesa das Amazonas." +
                          "Quando o piloto Steve Trevor se acidenta e cai numa praia do local, ela descobre que uma guerra sem " +
                          "precedentes está se espalhando pelo mundo e decide deixar seu lar certa de que pode parar o conflito. " +
                          "Lutando para acabar com todas as lutas, Diana percebe o alcance de seus poderes e sua verdadeira missão " +
                          "na Terra.", "DIRETOR: Patty Jenkins",
                          "ELENCO: \n-Gal Gadot como Diana Prince\n"+
                                   "-Chris Pine como Steve Trevor\n" + "-Robin Wright como General Antíope\n" +
                                   "-Danny Huston como Erich Ludendorff\n" + "-David Thewlis como Ares\n" + "-Connie Nielsen como Rainha Hipólita\n"+
                                   "-Elena Anaya como Maru / Doutora Veneno\n" + "-Ewen Bremner como Charlie\n" +
                                   "-Saïd Taghmaoui como Sameer\n" + "-Eugene Brave Rock como Chief\n" + "-Lucy Davis como Etta Candy\n" +
                                   "-Lisa Loven Kongsli como Menalippe", "SALAS: 05 - 05", "HORARIOS: 18:00 - 22:00"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_csf2);
        lv = (ListView) findViewById(R.id.ListViewCS2);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, descricao);
        lv.setAdapter(adapter);
    }

    public void abreTrailer (View view) {
        Intent intent = new Intent(this, CSF2TrailerActivity.class);
        startActivity(intent);
    }

    public void favoritar (View v) {
        Toast.makeText(CSF2Activity.this, "Adicionado aos favoritos", Toast.LENGTH_LONG).show();
    }

}
