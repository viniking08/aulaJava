package AtividadeHeranca;

public class Tecnico extends Aluno {
    private String registroProfissional;

    public Tecnico(int idade, String sexo, String nome, String matricula, String curso, String registroProfissional) {
        super(idade, sexo, nome, matricula, curso);
        this.registroProfissional = registroProfissional;
    }

    @Override
    public String toString() {
        return "Tecnico{" +
                "registroProfissional='" + registroProfissional + '\'' +
                '}';
    }

    public String getRegistroProfissional() {
        return registroProfissional;
    }

    public void setRegistroProfissional(String registroProfissional) {
        this.registroProfissional = registroProfissional;
    }

    public void praticar() {
        System.out.println("Praticando");
    }
}
