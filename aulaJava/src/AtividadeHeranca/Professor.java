package AtividadeHeranca;

public class Professor extends Pessoa {
    private String especialidade;
    private double salario;

    public Professor(int idade, String sexo, String nome, String especialidade, double salario) { // considerando um professor já com um trabalho
        super(idade, sexo, nome);
        this.especialidade = especialidade;
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "AtividadeHeranca.Professor{" +
                "especialidade='" + especialidade + '\'' +
                ", salario=" + salario +
                '}';
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void receberAumento(double aumento) {
        setSalario(getSalario() + aumento);
    }
}
