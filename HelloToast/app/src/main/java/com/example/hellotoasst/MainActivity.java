package com.example.hellotoasst;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private TextView meuNumero;
    private TextView meuToast;

    private Integer contador = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        meuNumero = findViewById(R.id.contador);
        Log.i("debug", "Meu número eh" + meuNumero.getText().toString());

        meuToast = findViewById(R.id.toast);
        Log.i("debug", meuToast.getText().toString());
    }
    public void somaTexto(View view){

        contador++;

        Log.i("debug", "Novo valor do contador: "
                + contador);

        meuNumero.setText(Integer.toString(contador));
    }

    public void imprimeMinhaMsg(View view){
        Toast meuToast = null;
        meuToast = Toast.makeText(this, "valor do contador é "
                        + contador,
                Toast.LENGTH_LONG);
        meuToast.show();
    }
}