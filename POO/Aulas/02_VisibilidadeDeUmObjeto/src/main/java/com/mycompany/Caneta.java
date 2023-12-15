package com.mycompany;

/*
 * @author rafas
 */

// Criando a classe
public class Caneta {
    // Caso não defina a visibilidade é publica para pacote
    
    // Definindo os possíveis atributos deste objeto
    public String marca; // Podem ser usados por todas as classes
    public String cor;
    private float ponta; // Pode ser usada somente por esta classe
    protected int carga; // Pode ser usado somente por esta classe e suas filhas
    private boolean tampada;
    
    // A partir daqui são os métodos
    
    // Um método sem retorno
    public void status(){
        
        // Mostrando o estado do objeto
        System.out.println("-Uma Caneta " + this.cor + "-");
        System.out.println("|Tampada:  "+ this.tampada + "|");
        System.out.println("|Ponta:" + this.ponta + "|");
        System.out.format("|Carga: %d%%|\n", this.carga);
        System.out.println("|Marca: " + this.marca + "|");
    }
    
    // Um método sem retorno
    public void rabiscar(){
        
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
    public void tampar(){
        
        // Tampando a caneta
        // Funciona, mesmo tampada sendo private. Pois este código esta na classe
        if(this.tampada){
            System.out.println("Já está tampada!");
        }
        else{
           this.tampada = true;
           System.out.println("Tampada com sucesso!");
        }
        
    }
 
    // Um método sem retorno    
    public void destampar(){
        
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