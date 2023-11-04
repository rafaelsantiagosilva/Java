package com.mycompany._classeobjeto;

/*
 * @author rafas
 */

// Criando a classe
public class Caneta {
    
    // Definindo os possíveis atributos deste objeto
    String marca;
    String cor;
    float ponta;
    int carga;
    boolean tampada;
    
    // A partir daqui são os métodos
    
    // Um método sem retorno
    void status(){
        
        // Mostrando o estado do objeto
        System.out.println("-Uma Caneta " + this.cor + "-");
        System.out.println("|Tampada:  "+ this.tampada + "|");
        System.out.println("|Ponta:" + this.ponta + "|");
        System.out.format("|Carga: %d%%|\n", this.carga);
        System.out.println("|Marca: " + this.marca + "|");
    }
    
    // Um método sem retorno
    void rabiscar(){
        
        // "Rabiscando" com a caneta
        if(!this.tampada && this.carga > 0){
            System.out.print("Rabiscando....");
            System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
            this.carga-=10;
        }
        
        else{
            if(this.tampada){
                System.out.println("DESTAMPE A CANETA PRIMEIRO!");
            }
            if(this.carga <= 0){
                System.out.println("ACABOU A TINTA!");
            }
        }
    }
    
    // Um método sem retorno   
    void tampar(){
        
        // Tampando a caneta
        if(this.tampada){
            System.out.println("Já está tampada!");
        }
        else{
           this.tampada = true;
           System.out.println("Tampada com sucesso!");
        }
        
    }
 
    // Um método sem retorno    
    void destampar(){
        
        // Destampando a caneta
        if(!this.tampada){
            System.out.println("Já está destampada!");
        }
        else{
           this.tampada = false;
           System.out.println("Destampada com sucesso!");
        }
        
    }
}