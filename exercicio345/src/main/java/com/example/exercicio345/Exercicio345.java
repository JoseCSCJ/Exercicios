package com.example.exercicio345;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class Exercicio345 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercicio345);

        List<Integer> pergunta1 = new ArrayList<>();
        pergunta1.add(0);
        pergunta1.add(1);
        pergunta1.add(2);
        pergunta1.add(3);
        pergunta1.add(4);

        List<Integer> pergunta2 = new ArrayList<>();
        pergunta2.add(0);
        pergunta2.add(1);
        pergunta2.add(2);
        pergunta2.add(3);
        pergunta2.add(4);

        List<Integer> pergunta3 = new ArrayList<>();
        pergunta3.add(10);
        pergunta3.add(11);
        pergunta3.add(5);
        pergunta3.add(3);
        pergunta3.add(9);

        List<Integer> pergunta4 = new ArrayList<>();
        pergunta3.add(15);
        pergunta3.add(17);
        pergunta3.add(25);
        pergunta3.add(13);
        pergunta3.add(19);

        List<Integer> pergunta5 = new ArrayList<>();
        pergunta2.add(10);
        pergunta2.add(1);
        pergunta2.add(2);
        pergunta2.add(13);
        pergunta2.add(14);

    }

    public void responder (View view){

    }
}
