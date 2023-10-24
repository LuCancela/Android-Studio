package com.example.cadastrocliente;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {

    private DatabaseReference cadastroCliente = FirebaseDatabase.getInstance().getReference("Cliente");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference("message");

        myRef.setValue("Cadastro!");

        cadastroCliente.child("001").child("Nome").setValue("Jorge");
        cadastroCliente.child("001").child("Email").setValue("jojo@gmail.com");
        cadastroCliente.child("001").child("Celular").setValue("11945155332");
        cadastroCliente.child("001").child("Telefone").setValue("1298773");
        cadastroCliente.child("001").child("Endereço").setValue("Rua da mooca");
        cadastroCliente.child("001").child("Complemento").setValue("Apartamento");
        cadastroCliente.child("001").child("Estado").setValue("São Paulo");
        cadastroCliente.child("001").child("Cidade").setValue("São Paulo");
        cadastroCliente.child("001").child("CEP").setValue("01259111");
        cadastroCliente.child("001").child("Status").setValue("Ativo");

        cadastroCliente.child("002").child("Nome").setValue("Lucas");
        cadastroCliente.child("002").child("Email").setValue("lulu@gmail.com");
        cadastroCliente.child("002").child("Celular").setValue("11924155332");
        cadastroCliente.child("002").child("Telefone").setValue("1255773");
        cadastroCliente.child("002").child("Endereço").setValue("Tatuape");
        cadastroCliente.child("002").child("Complemento").setValue("Casa");
        cadastroCliente.child("002").child("Estado").setValue("São Paulo");
        cadastroCliente.child("002").child("Cidade").setValue("São Paulo");
        cadastroCliente.child("002").child("CEP").setValue("01259222");
        cadastroCliente.child("002").child("Status").setValue("Ativo");

        cadastroCliente.child("003").child("Nome").setValue("Bruno");
        cadastroCliente.child("003").child("Email").setValue("Brubru@gmail.com");
        cadastroCliente.child("003").child("Celular").setValue("11944444332");
        cadastroCliente.child("003").child("Telefone").setValue("1298737");
        cadastroCliente.child("003").child("Endereço").setValue("Augusta");
        cadastroCliente.child("003").child("Complemento").setValue("Apartamento");
        cadastroCliente.child("003").child("Estado").setValue("São Paulo");
        cadastroCliente.child("003").child("Cidade").setValue("São Paulo");
        cadastroCliente.child("003").child("CEP").setValue("01259444");
        cadastroCliente.child("003").child("Status").setValue("Ativo");

        cadastroCliente.child("004").child("Nome").setValue("Marcus");
        cadastroCliente.child("004").child("Email").setValue("Macu@gmail.com");
        cadastroCliente.child("004").child("Celular").setValue("11922155332");
        cadastroCliente.child("004").child("Telefone").setValue("1211773");
        cadastroCliente.child("004").child("Endereço").setValue("Rua de marilia");
        cadastroCliente.child("004").child("Complemento").setValue("Casa");
        cadastroCliente.child("004").child("Estado").setValue("São Paulo");
        cadastroCliente.child("004").child("Cidade").setValue("Marilia");
        cadastroCliente.child("004").child("CEP").setValue("01259661");
        cadastroCliente.child("004").child("Status").setValue("Inativo");

        cadastroCliente.child("006").child("Nome").setValue("Larissa");
        cadastroCliente.child("006").child("Email").setValue("lari@gmail.com");
        cadastroCliente.child("006").child("Celular").setValue("11941155332");
        cadastroCliente.child("006").child("Telefone").setValue("1298873");
        cadastroCliente.child("006").child("Endereço").setValue("Copacabana");
        cadastroCliente.child("006").child("Complemento").setValue("Apartamento");
        cadastroCliente.child("006").child("Estado").setValue("Rio de Janeiro");
        cadastroCliente.child("006").child("Cidade").setValue("Rio de Janeiro");
        cadastroCliente.child("006").child("CEP").setValue("01259990");
        cadastroCliente.child("006").child("Status").setValue("Inativa");

    }

}