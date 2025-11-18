package AtividadePolimorfismo;

public class Main {
    public static void main(String[] args) {

        PFisica pf = new PFisica(
                "João Silva",
                "Rua A, 123",
                "99999-1111",
                "123.456.789-00"
        );

        PJuri pj = new PJuri(
                "Empresa XPTO",
                "Av. Central, 500",
                "33333-4444",
                "12.345.678/0001-55"
        );

        ContaComum conta = new ContaComum(
                "João Silva",
                "Rua A, 123",
                "99999-1111",
                1000,
                500,
                2
        );

        System.out.println("Teste Pessoa Fisica -");
        pf.gravar();
        pf.gravar("localPF");

        System.out.println("Teste Pessoa Juridica -");
        pj.gravar();
        pj.gravar("localPJ");
    }
}

