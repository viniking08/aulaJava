package AtividadeHeranca;

public class Aluno extends Pessoa {
    private String matricula; // nem toda matricula é só numero
    private String curso;

    public Aluno(int idade, String sexo, String nome, String matricula, String curso) {
        super(idade, sexo, nome);
        this.matricula = matricula;
        this.curso = curso;
    }

    @Override
    public String toString() {
        return "AtividadeHeranca.Aluno{" +
                "matricula=" + matricula +
                ", curso='" + curso + '\'' +
                '}';
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public void pagarMensalidade() {
        System.out.println("Mensalidade paga");
    }
}
