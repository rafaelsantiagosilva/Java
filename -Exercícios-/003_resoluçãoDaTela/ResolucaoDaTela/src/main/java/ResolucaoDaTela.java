package com.mycompany.resolucaodatela;

import java.awt.Dimension;
import java.awt.Toolkit;

public class ResolucaoDaTela {

    public static void main(String[] args) {
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension dimensao = tk.getScreenSize();
        System.out.print("A resolução de sua tela é de: " + dimensao.width + "x" + dimensao.height);
    }
}