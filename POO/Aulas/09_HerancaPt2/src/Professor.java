public class Professor extends Pessoa{
     private String especialidade;
     private float salario;

     public void receberAumento(float aumento) {
          setSalario(getSalario() + aumento);
     }

     public String getEspecialidade() {
          return especialidade;
     }

     public float getSalario() {
          return salario;
     }

     public void setEspecialidade(String especialidade) {
          this.especialidade = especialidade;
     }

     public void setSalario(float salario) {
          this.salario = salario;
     }
}
