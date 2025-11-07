package AtividadeHeranca;

public abstract class Pessoa {
    private String nome;
    private int idade;
    private String sexo;

    public Pessoa(int idade, String sexo, String nome) {
        this.idade = idade;
        this.sexo = sexo;
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "AtividadeHeranca.Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", sexo='" + sexo + '\'' +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void fazerAniversario() {
        setIdade(getIdade() + 1);
    }
}
