/*
 * @author: Rafael Santiago
 * @date: 12-15-2023
 */

package com.mycompany;

public class Main {
    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.marca = "Bic cristal";
        c1.cor = "Azul";
        // c1.ponta = 0.5; -> Dá erro, ponta é privada
        c1.carga = 100; /*  Não deu erro pois está dentro 
        de uma classe (Main) que usa a classe Caneta */
        // c1.tampada = false; -> Dá erro pq é private
        c1.tampar(); // Funciona. Pois o código está dentro da classe
        c1.status();
        c1.destampar();
        c1.status(); 
    }
}
