import java.util.Scanner;

public class Ppt {
    public static void main(String[] args) {
        Scanner addValor = new Scanner(System.in);
        int escolhaJ = 0;
        int escolhaBot = 0;

        System.out.println("Escolha uma das opções para enfrentar o computador no pedra papel ou tesoura:\n 1 - Pedra\n 2 - Papel\n 3 - Tesoura");
        escolhaJ = addValor.nextInt();
        escolhaBot = (int) (Math.random() * 3 + 1);

        System.out.println("O computador escolheu: " + escolhaBot);

        if (escolhaJ == escolhaBot) {
            System.out.println("Os dois escolheram o mesmo, empate");
        } else if (escolhaJ == 1 && escolhaBot == 3) {
            System.out.println("Você venceu!");
        } else if (escolhaJ == 2 && escolhaBot == 1) {
            System.out.println("Você venceu!");
        } else if (escolhaJ == 3 && escolhaBot == 2) {
            System.out.println("Você venceu!");
        } else if (escolhaJ != 1 && escolhaJ != 2 && escolhaJ != 3) {
            System.out.println("Opção inválida.");
        } else {
            System.out.println("Você perdeu.");
        }
    }
}