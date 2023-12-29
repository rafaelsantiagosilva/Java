public abstract class Pessoa { // Não pode ter objetos
     protected String nome;
     protected int idade;
     protected String sexo;

     public final void fazerAniversario() { // Não pode ser sobreposto (polimorfismo)
          this.idade++;
     }

     public String getNome() {
          return nome;
     }

     public int getIdade() {
          return idade;
     }

     public String getSexo() {
          return sexo;
     }

     public void setNome(String nome) {
          this.nome = nome;
     }

     public void setIdade(int idade) {
          this.idade = idade;
     }

     public void setSexo(String sexo) {
          this.sexo = sexo;
     }

     public String toString() {
          return "Nome: " + this.nome + "Idade: " + this.idade + "Sexo: " + this.sexo;
     }
}
