package com.pruebalogica.pruebal.Model;

import com.pruebalogica.pruebal.Interface.InterfaceTexto;

import java.util.ArrayList;

public class modelTexto implements InterfaceTexto.Model {

    InterfaceTexto.Presenter presenter;

    public modelTexto(InterfaceTexto.Presenter presenter) {
        this.presenter = presenter;
    }

    @Override
    public int leer(ArrayList<String> entradas) {
        int valores = 0;
        for(int i=1; i<=entradas.size(); i++) {
            for(int j=1; j<=i; j++) {
                valores = j;
            }
        }
        return valores;
    }
}
