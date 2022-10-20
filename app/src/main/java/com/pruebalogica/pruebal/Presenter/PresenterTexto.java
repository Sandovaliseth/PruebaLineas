package com.pruebalogica.pruebal.Presenter;

import com.pruebalogica.pruebal.Interface.InterfaceTexto;
import com.pruebalogica.pruebal.Model.modelTexto;

import java.util.ArrayList;

public class PresenterTexto implements InterfaceTexto.Presenter {

    InterfaceTexto.View view;
    InterfaceTexto.Model model;

    public PresenterTexto (InterfaceTexto.View view) {
        this.view = view;
        this.model = new modelTexto(this);
    }

    @Override
    public int leerEntrada(ArrayList<String> entradas) {
        return this.model.leer(entradas);
    }
}
