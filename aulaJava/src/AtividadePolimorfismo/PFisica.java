package AtividadePolimorfismo;

public class PFisica extends Pessoa {
    private String cpf;

    public PFisica(String nome, String endereco, String telefone, String CPF) {
        super(nome, endereco, telefone);
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String CPF) {
        this.cpf = cpf;
    }

    public void gravar() {
        System.out.println("Gravando pessoa física");
    }

    public void gravar(String destino) {      //sobrecarga
        System.out.println("Gravando pessoa jurídica em: " + destino);
    }
}
