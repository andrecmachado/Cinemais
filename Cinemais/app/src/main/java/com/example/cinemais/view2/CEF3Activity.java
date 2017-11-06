package com.example.cinemais.view2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.example.cinemais.R;
import com.example.cinemais.View3.CEF3TrailerActivity;

public class CEF3Activity extends AppCompatActivity {

    ListView tv;
    String[] descricao = {"TITULO: O Poderoso Chefinho",
            "DESCRICAO: Um bebê falante que usa terno e carrega uma maleta misteriosa une forças com seu irmão mais velho invejoso " +
                        "para impedir que um inescrupuloso CEO acabe com o amor no mundo. A missão é salvar os pais, impedir a " +
                        "catástrofe e provar que o mais intenso dos sentimentos é uma poderosa força.", "DIRETOR: Tom McGrath",
            "ELENCO: \n-Tim Templeton: Miles Christopher Bakshi\n" +
                    "-Tim adulto/Narrador: Tobey Maguire\n" +
                    "-Chefinho: Alec Baldwin\n" +
                    "-Trigêmeos: Eric Bell Jr.\n" +
                    "-Ted Templeton: Jimmy Kimmel\n" +
                    "-Janice Templeton: Lisa Kudrow\n" +
                    "-Staci: ViViAnn Yee\n" +
                    "-Francis E. Francis: Steve Buscemi\n" +
                    "-Jimbo: David Soren\n" +
                    "-Mago/Elvis: James McGrath",
            "SALAS: 01 - 04", "HORARIOS: 13:00 - 15:00"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cef3);
        tv = (ListView) findViewById(R.id.ListViewCE3);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, descricao);
        tv.setAdapter(adapter);
    }

    public void abreTrailer (View view) {
        Intent intent = new Intent(this, CEF3TrailerActivity.class);
        startActivity(intent);
    }

    public void favoritar (View v) {
        Toast.makeText(CEF3Activity.this, "Adicionado aos favoritos", Toast.LENGTH_LONG).show();
    }

}
