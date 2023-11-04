package com.mycompany.idiomadosistema;

import java.util.Locale;

public class IdiomaDoSistema {

    public static void main(String[] args) {
        // Sem usar biblioteca
        System.out.println("O idioma do sistema é: "+ System.getProperty("user.country"));
        
        // Usando biblioteca
        Locale idioma = Locale.getDefault();
        System.out.println("Seu sistema está em "+ idioma.getDisplayLanguage());
    }
}
