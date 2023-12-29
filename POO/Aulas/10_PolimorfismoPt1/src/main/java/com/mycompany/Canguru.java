package com.mycompany;

public class Canguru extends Mamifero{

     public Canguru(float peso, int idade, int membros, String corDoPelo) {
          super(peso, idade, membros, corDoPelo);
     }

   @Override
   public void locomover() {
     System.out.println("Saltando...!");
   }
     
}
