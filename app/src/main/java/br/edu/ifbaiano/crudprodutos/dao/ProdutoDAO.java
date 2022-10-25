package br.edu.ifbaiano.crudprodutos.dao;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import br.edu.ifbaiano.crudprodutos.helper.DBHelper;

public class ProdutoDAO {

    private  Integer id;
    private  String nome;
    private  String descricao;
    private  String foto;
    private  String valor;
    private DBHelper dbHelper;
    private SQLiteDatabase database;

    //Constructores
    public ProdutoDAO(Context ctx){
        dbHelper = new DBHelper(ctx);
        database = dbHelper.getWritableDatabase();
    }

    public ProdutoDAO(Integer id, String nome, String descricao, String foto, String valor) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.foto = foto;
        this.valor = valor;

    }

    //Getters e Setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public boolean insert(){
        return false;
    }

    public boolean update(){
        return false;
    }

    public boolean delete(){
        return false;
    }

    public Cursor listarProdutos(){
        String sql = "SELECT id AS _id, nome FROM produto;";/*"SELECT * FROM produto;";*/
        Cursor c = database.rawQuery(sql, null);
        if(c != null){
            c.moveToFirst();
        }
        return c;
    }
}
