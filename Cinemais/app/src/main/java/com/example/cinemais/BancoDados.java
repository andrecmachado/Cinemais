package com.example.cinemais;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.example.cinemais.model.Filme;
import java.util.ArrayList;
import java.util.List;

public class BancoDados extends SQLiteOpenHelper {

    private static final int VERSAO_BANCO = 1;
    private static final String BANCO_FAVORITOS = "bd_favoritos";

    private static final String TABELA_FAVORITOS = "tb_favoritos";
    private static final String COLUNA_CODIGO = "codigo";
    private static final String COLUNA_NOME = "nome";

    public BancoDados(Context context) {
        super(context, BANCO_FAVORITOS, null, VERSAO_BANCO);
    }

    // CRIA O BANCO SE NÃO EXISTIR, OU SEJA, ESTE MÉTODO É USADO SOMENTE UMA VEZ.
    @Override
    public void onCreate(SQLiteDatabase db) {
        String QUERY_COLUNA = " CREATE TABLE " + TABELA_FAVORITOS + " ( "
                + COLUNA_CODIGO + " INTEGER PRIMARY KEY, " + COLUNA_NOME + " TEXT " + ")";
        db.execSQL(QUERY_COLUNA);
    }


    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {

    }

    // ADICIONA REGISTRO NO BANCO.
    public void addFilme (String nome) {
        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues values = new ContentValues();
        values.put(COLUNA_NOME, nome);

        db.insert(TABELA_FAVORITOS, null, values);
        db.close();
    }

    // EXCLUI REGISTRO NO BANCO.
    public void apagarFilme (String nome) {
        SQLiteDatabase db = this.getWritableDatabase();

        db.delete(TABELA_FAVORITOS, COLUNA_NOME + " = ?", new String[] {nome});
        db.close();
    }

    // LISTA OS FILMES
    public List<String> listaTodosFilmes () {
        List<String> listaFilme = new ArrayList<String>();

        String query = "SELECT * FROM " + TABELA_FAVORITOS;

        //SQLiteDatabase db = this.getReadableDatabase();
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor c = db.rawQuery(query, null);

        if (c.moveToFirst()) {
            do {
                Filme filme = new Filme();
                filme.setNome(c.getString(1));

                listaFilme.add(filme.getNome());
            } while (c.moveToNext());
        }
        return listaFilme;
    }
}
