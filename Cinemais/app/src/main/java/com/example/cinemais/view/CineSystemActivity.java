package com.example.cinemais.view;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import com.example.cinemais.R;
import com.example.cinemais.view2.CSF1Activity;
import com.example.cinemais.view2.CSF2Activity;
import com.example.cinemais.view2.CSF3Activity;

public class CineSystemActivity extends AppCompatActivity {

    String[] titulo = {"A Múmia","Mulher Maravilha","Piratas do Caribe: A Vingaça de Salazar"};
    String[] descricao = {"Nas profundezas do deserto, uma antiga rainha cujo destino foi injustamente tirado está mumificada. Apesar de estar sepultada em sua cripta, ela desperta nos dias atuais.",
            "Treinada desde cedo para ser uma guerreira imbatível, Diana Prince nunca saiu da paradisíaca ilha em que é reconhecida como princesa das Amazonas.",
            "O capitão Salazar é a nova pedra no sapato do capitão Jack Sparrow. Ele lidera um exército de piratas fantasmas assassinos e está disposto a matar todos os piratas existentes na face da Terra."};
    int[] imagem ={R.mipmap.mummy,R.mipmap.hot,R.mipmap.pirates};
    ListView lv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cine_system);
        lv = (ListView) findViewById(R.id.ListaFilmesCineSystem);
        MyAdapter adapter = new MyAdapter(this,titulo,descricao,imagem);
        lv.setAdapter(adapter);
        click();
    }

    public void abrirTelaCSF1(View v) {
        Intent intent = new Intent(this, CSF1Activity.class);
        startActivity(intent);
    }

    public void abrirTelaCSF2(View v) {
        Intent intent = new Intent(this, CSF2Activity.class);
        startActivity(intent);
    }

    public void abrirTelaCSF3(View v) {
        Intent intent = new Intent(this, CSF3Activity.class);
        startActivity(intent);
    }

    public void click() {
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if (i == 0) {
                    abrirTelaCSF1(view);
                } else if (i == 1) {
                    abrirTelaCSF2(view);
                } else {
                    abrirTelaCSF3(view);
                }
            }
        });
    }

}
