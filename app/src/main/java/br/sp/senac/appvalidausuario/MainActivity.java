package br.sp.senac.appvalidausuario;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText txtUsuario, txtSenha;
    Button   btnEntrar, btnSair;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtUsuario = (EditText) findViewById(R.id.txtUsuario);
        txtSenha = (EditText) findViewById(R.id.txtSenha);

        btnEntrar = (Button) findViewById(R.id.btnEntrar);
        btnSair = (Button) findViewById(R.id.btnSair);

        txtUsuario.requestFocus();

        btnEntrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View Entrar) {
                String usuario, senha;
                usuario = txtUsuario.getText().toString();
                senha = txtSenha.getText().toString();

                if (usuario.equals("miguel") && senha.equals("123456")) {
                    startActivity(new Intent(getApplicationContext(), RespondeUsuario_Activity.class));
                    finish();

                } else {
                    Toast.makeText(getApplicationContext(), "Usuario ou senha errado.", Toast.LENGTH_SHORT).show();

                    txtUsuario.setText("");
                    txtSenha.setText("");
                    txtUsuario.requestFocus();
                }
            }
        });



        btnSair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View Sair) {
                finish();

            }
        });

        }
}
