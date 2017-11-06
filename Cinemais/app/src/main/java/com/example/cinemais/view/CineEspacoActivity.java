package com.example.cinemais.view;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import com.example.cinemais.R;
import com.example.cinemais.view2.CEF1Activity;
import com.example.cinemais.view2.CEF2Activity;
import com.example.cinemais.view2.CEF3Activity;

public class CineEspacoActivity extends AppCompatActivity {

    String [] titulo={"Piratas do Caribe: A Vingaça de Salazar", "Velozes e Furiosos 8", "O Poderoso Chefinho"};
    String [] descricao={"O capitão Salazar é a nova pedra no sapato do capitão Jack Sparrow. Ele lidera um exército de piratas fantasmas assassinos e está disposto a matar todos os piratas existentes na face da Terra.",
            "Depois que Brian e Mia se aposentaram, e o resto da equipe foi exonerado, Dom e Letty estão em lua de mel e levam uma vida pacata e completamente normal, mas a adrenalina do passado acaba voltando ",
            "Um bebê falante que usa terno e carrega uma maleta misteriosa une forças com seu irmão mais velho invejoso para impedir que um inescrupuloso CEO acabe com o amor no mundo."};
    int [] imagem={R.mipmap.pirates,R.mipmap.velozes,R.mipmap.chef};
    ListView lv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cine_espaco);
        lv = (ListView) findViewById(R.id.ListaFilmesCineEspaco);
        MyAdapter adapter = new MyAdapter(this,titulo,descricao,imagem);
        lv.setAdapter(adapter);
        click();
    }

    public void abrirTelaCEF1(View v) {
        Intent intent = new Intent(this, CEF1Activity.class);
        startActivity(intent);
    }

    public void abrirTelaCEF2(View v) {
        Intent intent = new Intent(this, CEF2Activity.class);
        startActivity(intent);
    }

    public void abrirTelaCEF3(View v) {
        Intent intent = new Intent(this, CEF3Activity.class);
        startActivity(intent);
    }

    public void click() {
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if (i == 0) {
                    abrirTelaCEF1(view);
                } else if (i == 1) {
                    abrirTelaCEF2(view);
                } else {
                    abrirTelaCEF3(view);
                }
            }
        });
    }

}
