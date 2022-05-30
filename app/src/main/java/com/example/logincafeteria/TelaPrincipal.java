package com.example.logincafeteria;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TelaPrincipal extends AppCompatActivity {

    private Button bt_logout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_principal);

        getSupportActionBar().hide();
        IniciarComponents();

        bt_logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TelaPrincipal.this, FormLogin.class);
                startActivity(intent);
            }
        });
    }

    private void IniciarComponents(){
        bt_logout = findViewById(R.id.bt_logout);
    }
}