package com.mycompany.idiomadosistema;

import java.util.Locale;

public class IdiomaDoSistema {

    public static void main(String[] args) {
        Locale lang = Locale.getDefault();
        System.out.print("O idioma do sistema é: ");
        System.out.println(lang.getDisplayLanguage());
        System.out.print("E sua sigla é: ");
        System.out.println(lang.getLanguage());
    }
}
