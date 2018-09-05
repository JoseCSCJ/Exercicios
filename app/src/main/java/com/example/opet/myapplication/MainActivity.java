package com.example.opet.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText  editPedido, editLimite;
    private Button atualizarLimite, calculaSoma;
    private TextView textLimiteAtual, textPedidoAtual;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editPedido = findViewById(R.id.editPedido);
        editLimite = findViewById(R.id.editLimite);
        textLimiteAtual = findViewById(R.id.textLimiteAtual);

    }

    public void calculaSoma(View view){

        double total = Double.parseDouble()
        double pedido =

    }
    public void atualizarLimite (View view){

    }
}
