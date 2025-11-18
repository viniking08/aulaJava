package AtividadePolimorfismo;

public class Historico {

    private int numeroConta;
    private int tipoConta;

    public Historico(int numeroConta, int tipoConta) {
        this.numeroConta = numeroConta;
        this.tipoConta = tipoConta;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public int getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(int tipoConta) {
        this.tipoConta = tipoConta;
    }

    public void Gravar() {
        System.out.println("Gravando histórico");
    }
}

