package com.example.cinemais.view2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.example.cinemais.R;
import com.example.cinemais.View3.CEF2TrailerActivity;

public class CEF2Activity extends AppCompatActivity {

    ListView tv;
    String[] descricao = {"TITULO: Velozes e Furiosos 8",
            "DESCRICAO: Depois que Brian e Mia se aposentaram, e o resto da equipe foi exonerado, Dom e Letty estão em lua de mel e " +
                        "levam uma vida pacata e completamente normal. Mas a adrenalina do passado acaba voltando com tudo quando uma" +
                        "mulher misteriosa faz com que Dom retorne ao mundo do crime e da velocidade.", "DIRETOR: F. Gary Gray",
            "ELENCO: \n-Toretto como Vin Diesel" + "\n-Deckard Shaw como Jason Statham" + "\n-Hobbs como Dwayne Johnson" +
                    "\n-Letty como Michelle Rodriguez" + "\n-Roman como Tyrese Gibson" + "\n-Tej Parker como Ludacris" +
                    "\n-Cipher como Charlize Theron" + "\n-Sr. Ninguém como Kurt Russell" + "\n-Ninguénzinho como Scott Eastwood" +
                    "\n-Ramsey como Nathalie Emmanuel",
            "SALAS: 03 - 04", "HORARIOS:18:00 - 22:00 "};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cef2);
        tv = (ListView) findViewById(R.id.ListViewCE2);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, descricao);
        tv.setAdapter(adapter);
    }

    public void abreTrailer (View view) {
        Intent intent = new Intent(this, CEF2TrailerActivity.class);
        startActivity(intent);
    }

    public void favoritar (View v) {
        Toast.makeText(CEF2Activity.this, "Adicionado aos favoritos", Toast.LENGTH_LONG).show();
    }

}
