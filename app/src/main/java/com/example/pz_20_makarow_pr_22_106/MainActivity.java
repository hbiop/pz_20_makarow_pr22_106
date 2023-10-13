package com.example.pz_20_makarow_pr_22_106;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText edName,edFamilia,edOtchestvo,edPochta,edTelefon,edNomer_Grupy;
    Button save, load;
    private DatabaseReference myDataBase;
    final String USER_KEY = "User";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edName = (EditText) findViewById(R.id.editTextTextPersonName);
        edFamilia = (EditText) findViewById(R.id.editTextTextPersonName2);
        edOtchestvo = (EditText) findViewById(R.id.editTextTextPersonName3);
        edPochta = (EditText) findViewById(R.id.editTextTextPersonName4);
        edTelefon = (EditText) findViewById(R.id.editTextTextPersonName5);
        edNomer_Grupy = (EditText) findViewById(R.id.editTextTextPersonName6);
        save = (Button) findViewById(R.id.button);
        save.setOnClickListener(this);
        load = (Button) findViewById(R.id.button2);
        load.setOnClickListener(this);
        myDataBase = FirebaseDatabase.getInstance().getReference(USER_KEY);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId())
        {
            case R.id.button:
                break;
            case R.id.button2:
                onSave();
        }
    }
    public void onSave()
    {
        String id = myDataBase.getKey();
        String name = edName.getText().toString();
        String familia = edFamilia.getText().toString();
        String otchestvo = edOtchestvo.getText().toString();
        String pochta = edPochta.getText().toString();
        String telefon = edTelefon.getText().toString();
        String nomer_grupy = edNomer_Grupy.getText().toString();
        User user = new User(id, name, familia, otchestvo, pochta, telefon,nomer_grupy);
        myDataBase.push().setValue(user);
    }
}