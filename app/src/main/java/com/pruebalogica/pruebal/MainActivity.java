package com.pruebalogica.pruebal;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.pruebalogica.pruebal.Interface.InterfaceTexto;
import com.pruebalogica.pruebal.Presenter.PresenterTexto;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, InterfaceTexto.View {

    Button agregar;
    EditText texto;
    TextView mostrar;
    ArrayList<String> entradas;
    PresenterTexto presenterTexto;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        this.variables();
        entradas = new ArrayList<>();
        presenterTexto = new PresenterTexto(this);
    }

    @Override
    public void variables() {
        agregar = findViewById(R.id.agregar);
        agregar.setOnClickListener(this);
        texto = findViewById(R.id.texto);
        mostrar = findViewById(R.id.mostrar);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()) {
            case R.id.agregar:
                entradas.add(texto.getText().toString());
                limpiar();
                Integer traer = presenterTexto.leerEntrada(entradas);
                for(int x=0; x<entradas.size();x++) {
                    mostrar.setText(traer + " " + entradas.get(x));
                }
                break;
        }
    }

    void limpiar() {
        texto.setText("");
    }

}