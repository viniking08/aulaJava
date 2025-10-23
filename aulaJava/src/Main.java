import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner addValor = new Scanner(System.in);

        // setar idade (usado pra nada)
        /*int idade;
        System.out.println("Digite um valor para 'idade': ");
        idade = addValor.nextInt();
        System.out.println("O valor de 'idade' é: " + idade);*/

        // inutilizado
        String nome = "Bill";
        boolean vivo = true;
        double altura = 3.45;

        // --
        ArrayList<String> names = new ArrayList<>();
        names.add("Joseph");
        names.add("Visyphon");
        names.add("Gamerlibson");

        for (int index = 0; index < names.size(); index++) {
            System.out.println(names.get(index));
        }


        // referente ao molde porta

        /*Porta portaMetal = new Porta();
        

        portaMetal.material = "metal";
        portaMetal.larguraCm = 100;
        portaMetal.alturaCm = 320;

        portaMetal.portaEstado();*/
    }
}