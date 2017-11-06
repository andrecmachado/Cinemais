package com.example.cinemais.view2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.example.cinemais.R;
import com.example.cinemais.View3.CMF3TrailerActivity;

public class CMF3Activity extends AppCompatActivity {

    ListView tv;
    String[] descricao = {"TITULO: Baywatch",
            "DESCRICAO: Baywatch (no Brasil, Baywatch: SOS Malibu) é um futuro filme americano de comédia de ação dirigido por Seth " +
                    "Gordon. É baseado na serie de televisão de mesmo nome.",
            "DIRETOR: Seth Gordon",
            "ELENCO: \n-Dwayne Johnson como Mitch Buchannon\n" +
                    "-Zac Efron como Matt Brody\n" +
                    "-Alexandra Daddario como Summer Quinn\n" +
                    "-Kelly Rohrbach como C.J. Parker\n" +
                    "-Priyanka Chopra como\n" +
                    "-Jon Bass como Ronnie\n" +
                    "-Ilfenesh Hadera como Stephanie Holden\n" +
                    "-Yahya Abdul-Mateen II como Garner Ellerbee\n" +
                    "-Rob Huebel como Captain Thorpe\n" +
                    "-Hannibal Buress como Gary\n" +
                    "-Belinda Peregrín como Carmen",
            "SALAS: 02 - 03", "HORARIOS: 18:00 - 20:00"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cmf3);
        tv = (ListView) findViewById(R.id.ListViewCM3);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, descricao);
        tv.setAdapter(adapter);
    }

    public void abreTrailer (View view) {
        Intent intent = new Intent(this, CMF3TrailerActivity.class);
        startActivity(intent);
    }

    public void favoritar (View v) {
        Toast.makeText(CMF3Activity.this, "Adicionado aos favoritos", Toast.LENGTH_LONG).show();
    }

}
