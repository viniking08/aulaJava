import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner addValor = new Scanner(System.in);
        Penal penalRosa = new Penal("Algodão", "Rosa");
        Penal penalVerde = new Penal("Lã", "Verde");



        // setar idade (usado pra nada)
//        int idade;
//        System.out.println("Digite um valor para 'idade': ");
//        idade = addValor.nextInt();
//        System.out.println("O valor de 'idade' é: " + idade);

        // inutilizado
//        String nome = "Bill";
//        boolean vivo = true;
//        double altura = 3.45;

        // --
//        ArrayList<String> names = new ArrayList<>();
//        names.add("Joseph");
//        names.add("Visyphon");
//        names.add("Gamerlibson");
//
//        for (int index = 0; index < names.size(); index++) {
//            System.out.println(names.get(index));
//        }






        // referente ao molde porta (atividade 1.1 e 1.2)

        Porta portaMetal = new Porta();
        

        portaMetal.material = "metal";
        portaMetal.medirPorta(100, 320);
        portaMetal.cor = "preto";

        portaMetal.portaEstado();

        System.out.println("-");

        // atividade 1.3 (penal), objeto criado lá em cima


        penalRosa.setQntdCanetas(5);   //set
        penalRosa.setQntdLapiscor(18); //set
        penalRosa.exibirInformacoes();

        System.out.println("//");

        penalVerde.setQntdLapiscor(25);  //set
        penalVerde.setQntdCanetas(3);    //set
        penalVerde.exibirInformacoes();

        System.out.println("-");

        // atividade 1.4

        BancoFinanceiro banco = new BancoFinanceiro("123.456.789-00", "João Silva", 1000.0);

        banco.abrirConta(banco.getCpf(), banco.getNomeTitular());

        banco.estadoBanco();

        double novoSaldo = banco.aplicarJuros(banco.getSaldo());
        banco.setSaldo(novoSaldo);

        banco.sacar(200);

        banco.transferir("ContaDestino123");

        banco.estadoBanco();
    }
}

        // atividade 1.5

        Atirador atirador1 = new Atirador("Vini", "SKS", "Paquistão", 75);
        Atirador atirador2 = new Atirador("Guilherme", "Guardian", "Argentina", 75);

        Batalha batalhaLendaria = new Batalha(atirador1, atirador2);

        for (int i = 0; i < 10; i++) {
            batalhaLendaria.batalhar();
        }


        System.out.println("-");
        atirador1.jogadorStatus();
        System.out.println("-");
        atirador2.jogadorStatus();
        System.out.println("-");

    }

    // resto das atividades nas packages
}