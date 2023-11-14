package com.example.escolansa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {

    private DatabaseReference CadastroAluno = FirebaseDatabase.getInstance().getReference();
    EditText nome, email, cel, tel, endereco, comp, estado, cidade, cep, curso;
    Button buttonCadastro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference("message");

        myRef.setValue(nome);
        myRef.setValue(email);
        myRef.setValue(cel);
        myRef.setValue(tel);
        myRef.setValue(endereco);
        myRef.setValue(comp);
        myRef.setValue(estado);
        myRef.setValue(cep);


        //DatabaseReference cadastro = CadastroAluno.child("cadastro");

        inicializar();
        //cadastrarUsuario();
    }

    private void inicializar(){
        nome = findViewById(R.id.nome);
        email = findViewById(R.id.email);
        cel = findViewById(R.id.cel);
        tel = findViewById(R.id.tel);
        endereco = findViewById(R.id.endereco);
        comp= findViewById(R.id.comp);
        estado = findViewById(R.id.estado);
        cidade = findViewById(R.id.cidade);
        cep = findViewById(R.id.cep);
        buttonCadastro = findViewById(R.id.buttonCadastro);
    }

  //  private cadastrarUsuario(){}
}