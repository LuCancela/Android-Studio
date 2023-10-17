package com.example.basedados;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {

     private DatabaseReference minhaReferencia = FirebaseDatabase.getInstance().getReference("produtos");
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        minhaReferencia.child("001").child("nome").setValue("Coca-cola");
        minhaReferencia.child("001").child("valor").setValue("10.00");

        minhaReferencia.child("002").child("nome").setValue("Guaraná");
        minhaReferencia.child("002").child("valor").setValue("9.00");


    }
}