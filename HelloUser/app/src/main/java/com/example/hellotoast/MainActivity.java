package com.example.hellotoast;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private String meuNome = "Bruna";
    private TextView helloText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        helloText = findViewById(R.id.helloUser);
        String aux = helloText.getText().toString();
        aux = aux.replace("user", meuNome);
        helloText.setText(aux);
        Log.i("Debug", "Username alterado");
    }
}