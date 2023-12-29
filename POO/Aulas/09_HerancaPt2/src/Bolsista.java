public final class Bolsista extends Aluno { // Não pode ter filhos
     private float bolsa;

     public void renovarBolsa() {
          System.out.println("Bolsa renovada!");
     }

     @Override // Sobrepor
     public void pagarMensalidade() {
          System.out.println("Pagamento facilitado: Bolsista!");
     }

     public float getBolsa() {
          return bolsa;
     }

     public void setBolsa(float bolsa) {
          this.bolsa = bolsa;
     }
}
