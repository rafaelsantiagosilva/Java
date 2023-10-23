/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.horadosistema;

import java.util.Date;

/**
 *
 * @author Rafael
 */
public class HoraDoSistema {

    public static void main(String[] args) {
        Date relogio = new Date(); // Criando um objeto por conta desse new
        System.out.println("A hora do sistema é");
        System.out.println(relogio.toString());
    }
}
