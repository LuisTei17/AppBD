package com.example.root.appbd;

import android.app.Activity;
import android.os.Bundle;
import android.widget.EditText;

public class Cadastro extends Activity {
    private EditText etNome, etTelefone, etEmail;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);
        this.inicializaComponente();
    }

    private void inicializaComponente(){
        this.etNome = (EditText) findViewById(R.id.etNome);
        this.etTelefone = (EditText) findViewById(R.id.etTelefone);
        this.etEmail = (EditText) findViewById(R.id.etEmail);
    }
}
