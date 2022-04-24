package com.example.exam2;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class NouveauProduit extends AppCompatActivity {
    MyDBProduit db;
    EditText et1,et2,et3,et4;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.nouveau_produit);

        et1 = findViewById(R.id.elib);
        et2 = findViewById(R.id.efamille);
        et3 = findViewById(R.id.eprxachat);
        et4 = findViewById(R.id.eprxvente);
        btn = findViewById(R.id.btnsave);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (et1.getText().toString().isEmpty() || et2.getText().toString().isEmpty()
                        || et3.getText().toString().isEmpty() || et4.getText().toString().isEmpty())
                    Toast.makeText(NouveauProduit.this, "veillez Remplissez tous les champs !", Toast.LENGTH_LONG).show();
                else {
                    MyDBProduit.Insert_Produit(db.getWritableDatabase(), new Produit(1, et1.getText().toString(), et2.getText().toString(), Double.valueOf(et3.getText().toString()), Double.valueOf(et4.getText().toString())));
                    Toast.makeText(NouveauProduit.this, "Ajout avec succes !", Toast.LENGTH_SHORT).show();
                    et1.getText().clear();
                    et2.getText().clear();
                    et3.getText().clear();
                    et4.getText().clear();
                    et1.requestFocus();
                }
            }
        });
    }
}
