package br.edu.ifbaiano.crudprodutos;

import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;

import br.edu.ifbaiano.crudprodutos.dao.ProdutoDAO;

public class MainActivity extends AppCompatActivity {

    ListView lvProdutos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvProdutos = findViewById(R.id.listviewProdutos);

        lvProdutos.setEmptyView(findViewById(R.id.tvEmpty));

        ProdutoDAO pDAO = new ProdutoDAO(MainActivity.this);
        Cursor c = pDAO.listarProdutos();

        //Cursor cc = new ProdutoDAO(this).listarProdutos();

        SimpleCursorAdapter Adapter = new SimpleCursorAdapter(
                this,
                R.layout.lista_produtos,
                c,
                /*identificação dos textview do layout*/new String[]{"_id", "nome"},
                new int[]{R.id.id, R.id.nome}, 0);

        lvProdutos.setAdapter(Adapter);
    }
}