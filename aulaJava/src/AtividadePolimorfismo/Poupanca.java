package AtividadePolimorfismo;

public class Poupanca extends ContaComum {

    private int dataAniversario;

    public Poupanca(String nome, String endereco, String telefone, int numero, int saldo, int tipo, int dataAniversario) {
        super(nome, endereco, telefone, numero, saldo, tipo);
        this.dataAniversario = dataAniversario;
    }

    public int getDataAniversario() {
        return dataAniversario;
    }

    public void setDataAniversario(int dataAniversario) {
        this.dataAniversario = dataAniversario;
    }
}