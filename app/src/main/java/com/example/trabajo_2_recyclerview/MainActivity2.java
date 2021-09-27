package com.example.trabajo_2_recyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    ImageView imageView3;
    TextView titulo_comida,descripcion_comida;

    String data1,data2;
    int myImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        imageView3 = findViewById(R.id.imageView3);
        titulo_comida = findViewById(R.id.titulo_comida);
        descripcion_comida = findViewById(R.id.descripcion_txt);


        getData();
        setData();

    }

    private void getData(){
        if(getIntent().hasExtra("myImageView") && getIntent().hasExtra("data1") && getIntent().hasExtra("data2")){

            data1 = getIntent().getStringExtra("data1");
            data2 = getIntent().getStringExtra("data2");
            myImageView = getIntent().getIntExtra("myImageView",1);

        }else{
            Toast.makeText(this,"No data", Toast.LENGTH_SHORT).show();
        }
    }

    private void setData(){

        titulo_comida.setText(data1);
        descripcion_comida.setText(data2);
        imageView3.setImageResource(myImageView);
    }
}