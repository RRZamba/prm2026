package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity
{
    // 1) Atributos
    Button btnEsquerda, btnDireita;
    ImageView img;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //2)  'Linkando' os elementos do layout com a programação
        btnDireita = (Button) findViewById(R.id.btnDireita);
        btnEsquerda = (Button) findViewById(R.id.btnEsquerda);
        img = (ImageView) findViewById(R.id.img);

        // 3) Evento btnDireita
        btnDireita.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                //4) Trocando a imagem do ImageView
                img.setImageResource(R.drawable.malmsteen);
            }
        });






    }
}