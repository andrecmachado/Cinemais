package com.example.cinemais.view2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;
import com.example.cinemais.BancoDados;
import com.example.cinemais.View3.CSF1TrailerActivity;
import com.example.cinemais.R;

public class CSF1Activity extends AppCompatActivity {

    BancoDados db = new BancoDados(this);
    ListView tv;
    String nome = "A Múmia";
    String[] descricao = {"TITULO: A Múmia", "DESCRICAO: Nas profundezas do deserto, uma antiga rainha cujo destino foi injustamente" +
                                             "tirado está mumificada. Apesar de estar sepultada em sua cripta, ela desperta nos dias " +
                                             "atuais. Com uma maldade acumulada ao longo dos anos, ela espelha terror desde as areais" +
                                             " do Oriente Médio até os becos de Londres.", "DIRETOR: \tAlex Kurtzman",
                          "ELENCO: \n-Tom Cruise como Nick Morton.\n" +
                                  "-Sofia Boutella como Princesa Ahmanet\n" +
                                  "-Annabelle Wallis como Jenny Halsey.\n" +
                                  "-Jake Johnson como Sgto. Vail.\n" +
                                  "-Courtney B. Vance como Col. Gideon Forster.\n" +
                                  "-Russell Crowe como Dr. Henry Jekyll.\n" +
                                  "-Javier Botet como Set\n" +
                                  "-Selva Rasalingam como Rei Menehptre.\n" +
                                  "-Dylan Smith como Lorenzo Montanari\n" +
                                  "-Rez Kempton como Foreman\n" +
                                  "-Marwan Kenzari como TBA", "SALAS: 03 - 04", "HORARIOS: 18:00 - 22:00"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_csf1);
        tv = (ListView) findViewById(R.id.ListViewCS1);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, descricao);
        tv.setAdapter(adapter);
    }

    public void abreTrailer (View view) {
        Intent intent = new Intent(this, CSF1TrailerActivity.class);
        startActivity(intent);
    }

    public void favoritar (View v) {
        db.addFilme(this.nome);
        Toast.makeText(CSF1Activity.this, "Adicionado aos favoritos", Toast.LENGTH_LONG).show();
    }

}
