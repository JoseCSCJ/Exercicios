package com.example.exercicio2;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class exercicio2 extends Activity {

    private EditText editIdade;
    private TextView textCampeonato;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercicio2);

        editIdade=findViewById(R.id.editIdade);
        textCampeonato=findViewById(R.id.textCampeonato);


    }

    public void categorizar (View view){

        int idade = Integer.parseInt(editIdade.getText().toString());

        if (idade < 8){
            textCampeonato.setText("Nao se aplica");
        }
        if (idade >= 8 && idade <=12){
            textCampeonato.setText("INFANTIL");
        }
        if (idade >= 13 && idade <=17){
            textCampeonato.setText("JUVENIL");
        }
        if (idade >= 18){
            textCampeonato.setText("ADULTO");
        }



    }
}
