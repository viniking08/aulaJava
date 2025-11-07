package AtividadeHeranca;

public class Bolsista extends Aluno {
    private double bolsa;   // porcentagem que a bolsa desconta

    public Bolsista(int idade, String sexo, String nome, String matricula, String curso, double bolsa) {
        super(idade, sexo, nome, matricula, curso);
        this.bolsa = bolsa;
    }

    @Override
    public String toString() {
        return "Bolsista{" +
                "bolsa='" + bolsa + '\'' +
                '}';
    }

    public double getBolsa() {
        return bolsa;
    }

    public void setBolsa(double bolsa) {
        this.bolsa = bolsa;
    }

    public void renovarBolsa() {
        System.out.println("Bolsa renovada");
    }

    public void pagarMensalidade() {
        System.out.println("Mensalidade paga com desconto");
    }
}
