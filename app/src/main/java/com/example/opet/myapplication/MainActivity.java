package com.example.opet.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    private EditText  editPedido, editLimite;
    private TextView textLimiteAtual, textPedidoAtual;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editPedido = findViewById(R.id.editPedido);
        editLimite = findViewById(R.id.editLimite);
        textLimiteAtual = findViewById(R.id.textLimiteAtual);
        textPedidoAtual = findViewById(R.id.textPedidoAtual);

    }

    public void calculaSoma(View view){

        double total = Double.parseDouble(textPedidoAtual.getText().toString());
        double pedido = Double.parseDouble(editPedido.getText().toString());
        double ultrap = 0;

        total = total + pedido;

        DecimalFormat mFormat = new DecimalFormat(".00");

        textPedidoAtual.setText(mFormat.format(total));

        if (total>Double.parseDouble(textLimiteAtual.getText().toString()))
            ultrap = total - Double.parseDouble(textLimiteAtual.getText().toString());
            String textToast = "Você ultrapassou o limite por " + ultrap;
            Toast.makeText(getApplicationContext(), textToast, Toast.LENGTH_SHORT).show();


    }
    public void atualizarLimite (View view){
        textLimiteAtual.setText(editLimite.getText().toString());


    }
}
