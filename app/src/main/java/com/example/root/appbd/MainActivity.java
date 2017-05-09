package com.example.root.appbd;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button btCadastra, btSalva, btRemove, btEdita;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.inicializarComponentes();

        btCadastra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(MainActivity.this, Cadastro.class);
                startActivity(it);
            }
        });
    }

    private void inicializarComponentes() {
        this.btCadastra = (Button) findViewById(R.id.btCadastra);
        this.btEdita = (Button) findViewById(R.id.btEditar);
        this.btRemove = (Button) findViewById(R.id.btRemover);
        this.btSalva = (Button) findViewById(R.id.btSalva);
    }
}
