package AtividadePolimorfismo;

public class PJuri extends Pessoa {

    private String cnpj;

    public PJuri(String nome, String endereco, String telefone, String cnpj) {
        super(nome, endereco, telefone);
        this.cnpj = cnpj;
    }

    public String getCNPJ() {
        return cnpj;
    }

    public void setCNPJ(String CNPJ) {
        this.cnpj = CNPJ;
    }

    public void gravar() {
        System.out.println("Gravando pessoa jurídica");
    }
    public void gravar(String destino) {      //sobrecarga
        System.out.println("Gravando pessoa jurídica em: " + destino);
    }
}