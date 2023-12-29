public final class Tecnico extends Aluno { // Classe final, não pode ter filhos
     public int registroProfissional;

     public void praticar() {
          System.out.println("Praticando...\nFeito!");
     }

     public int getRegistroProfissional() {
          return registroProfissional;
     }

     public void setRegistroProfissional(int registroProfissional) {
          this.registroProfissional = registroProfissional;
     }
}
