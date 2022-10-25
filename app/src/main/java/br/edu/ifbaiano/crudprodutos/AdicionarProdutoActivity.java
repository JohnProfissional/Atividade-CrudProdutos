package br.edu.ifbaiano.crudprodutos;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class AdicionarProdutoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adicionar_produtos);

        Button btnCad = findViewById(R.id.idButao);
        EditText nome = findViewById(R.id.idNome);
        EditText desc = findViewById(R.id.idDescricao);
        EditText val = findViewById(R.id.idValor);

    }

}
