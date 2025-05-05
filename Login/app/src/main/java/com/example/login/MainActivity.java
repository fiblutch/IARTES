package com.example.login;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;


public class MainActivity extends AppCompatActivity {

    private EditText email;
    private EditText senha;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        email = (EditText) findViewById(R.id.inputEmail);
                email.getText().toString();

        senha = (EditText) findViewById(R.id.inputSenha);
        senha.getText().toString();
    }

    public void imprimeMensagaem(View view){
        Toast meuToast;
        meuToast = Toast.makeText(this, "Olá, " + email, Toast.LENGTH_SHORT);
        meuToast.show();
    }

}
