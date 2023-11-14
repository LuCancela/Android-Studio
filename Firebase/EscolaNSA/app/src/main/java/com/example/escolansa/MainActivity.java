package com.example.escolansa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
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
        myRef.setValue(curso);

        buttonCadastro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String codigo = cCodigo.getText().toString();
                String nome = cNome.getText().toString();
                String telefone = cTelefone.getText().toString();
                String email = cEmail.getText().toString();
                String endereco = cEndereco.getText().toString();

                if (nome.isEmpty()) {
                    cNome.setError("Este campo é obrigatorio");
                } else if (codigo.isEmpty()) {

                    db.addPessoa(new Pessoa(nome, telefone, email, endereco));
                    Toast.makeText(Cadastro.this, "Cadastro salvo com sucesso", Toast.LENGTH_SHORT).show();
                    listarPessoas();
                    limpaCampos();
                    escondeTeclado();

                } else {
                    db.atualizarPessoa(new Pessoa(Integer.parseInt(codigo), nome, telefone, email, endereco));
                    Toast.makeText(Cadastro.this, "Cadastro atualizado com sucesso", Toast.LENGTH_SHORT).show();
                    listarPessoas();
                    limpaCampos();
                    escondeTeclado();

                }
            }
        });

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
        cidade = findViewById(R.id.cidade);
        cep = findViewById(R.id.cep);
        curso = findViewById(R.id.curso);
        estado = findViewById(R.id.estado);
        buttonCadastro = findViewById(R.id.buttonCadastro);
    }

  //  private cadastrarUsuario(){}
}