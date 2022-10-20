package com.pruebalogica.pruebal.Interface;

import java.util.ArrayList;

public interface InterfaceTexto {
    interface View {
        void variables();
    }

    interface Presenter {
        int leerEntrada(ArrayList<String> entradas);
    }

    interface Model {
        int leer(ArrayList<String> entradas);
    }
}
