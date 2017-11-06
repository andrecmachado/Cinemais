package com.example.cinemais.view;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import com.example.cinemais.R;
import com.example.cinemais.model.Cinema;
import com.example.cinemais.view2.CMF1Activity;
import com.example.cinemais.view2.CMF2Activity;
import com.example.cinemais.view2.CMF3Activity;

public class CineMarkActivity extends AppCompatActivity {

    String [] titulo={"Ozzy", "Neve Negra", "Baywatch"};
    String [] descricao={"Ozzy é um jovem beagle que sempre viveu feliz com a sua família humana. Quando recebem a notícia de que ganharam uma viagem ao Japão",
            "Acusado de matar seu irmão durante a adolescência, Salvador (Ricardo Darín) vive isolado do mundo no meio da Patagônia.",
            "Baywatch é um futuro filme americano de comédia de ação dirigido por Seth Gordon. É baseado na serie de televisão de mesmo nome."};
    int [] imagem={R.mipmap.ozzy,R.mipmap.neve,R.mipmap.baywatch};
    ListView lv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cine_mark);
        lv = (ListView) findViewById(R.id.ListaFilmesCineMark);
        MyAdapter adapter = new MyAdapter(this,titulo,descricao,imagem);
        lv.setAdapter(adapter);
        click();
    }

    public void abrirTelaCMF1(View v) {
        Intent intent = new Intent(this, CMF1Activity.class);
        startActivity(intent);
    }

    public void abrirTelaCMF2(View v) {
        Intent intent = new Intent(this, CMF2Activity.class);
        startActivity(intent);
    }

    public void abrirTelaCMF3(View v) {
        Intent intent = new Intent(this, CMF3Activity.class);
        startActivity(intent);
    }

    public void click() {
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if (i == 0) {
                    abrirTelaCMF1(view);
                } else if (i == 1) {
                    abrirTelaCMF2(view);
                } else {
                    abrirTelaCMF3(view);
                }
            }
        });
    }

}
