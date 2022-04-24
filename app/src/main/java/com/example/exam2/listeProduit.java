package com.example.exam2;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class listeProduit extends AppCompatActivity {

    ListView lst;
    MyDBProduit db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.liste_produit);

        db = new MyDBProduit(this);
        lst = findViewById(R.id.lst);

        ArrayList<Produit> all = MyDBProduit.getListeProduits(db.getReadableDatabase());

        ArrayList<String> infos = new ArrayList<>();

        for(Produit p : all){
            infos.add(p.getIdP () + " - " + p.getLibelle());
        }

        ArrayAdapter<String> ad = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,infos);
        lst.setAdapter(ad);

    }
}
