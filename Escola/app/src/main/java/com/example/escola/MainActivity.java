package com.example.escola;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {

    private DatabaseReference minhaReferencia = FirebaseDatabase.getInstance().getReference("Alunos");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        minhaReferencia.child("12345").child("RM").setValue("12345");
        minhaReferencia.child("12345").child("Nome").setValue("Rogerio");
        minhaReferencia.child("12345").child("Turma").setValue("3");
        minhaReferencia.child("12345").child("Sala").setValue("4");

        minhaReferencia.child("15246").child("RM").setValue("15246");
        minhaReferencia.child("15246").child("Nome").setValue("Felipe");
        minhaReferencia.child("15246").child("Turma").setValue("4");
        minhaReferencia.child("15246").child("Sala").setValue("2");

        minhaReferencia.child("56432").child("RM").setValue("56432");
        minhaReferencia.child("56432").child("Nome").setValue("Vitor");
        minhaReferencia.child("56432").child("Turma").setValue("2");
        minhaReferencia.child("56432").child("Sala").setValue("1");

        minhaReferencia.child("16958").child("RM").setValue("16958");
        minhaReferencia.child("16958").child("Nome").setValue("Giovanna");
        minhaReferencia.child("16958").child("Turma").setValue("4");
        minhaReferencia.child("16958").child("Sala").setValue("2");

        minhaReferencia.child("14458").child("RM").setValue("14458");
        minhaReferencia.child("14458").child("Nome").setValue("Jorge");
        minhaReferencia.child("14458").child("Turma").setValue("3");
        minhaReferencia.child("14458").child("Sala").setValue("4");


    }
}