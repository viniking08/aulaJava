import java.util.concurrent.ThreadLocalRandom;

public class Batalha {
    private Atirador atiradorA;
    private Atirador atiradorB;
    private double poderFogoA;
    private double poderFogoB;

    public Batalha(Atirador atiradorA, Atirador atiradorB) {
        this.atiradorA = atiradorA;
        this.atiradorB = atiradorB;
        this.poderFogoB = 0;
        this.poderFogoA = 0;
    }

    public Atirador getAtiradorA() {
        return atiradorA;
    }

    public void setAtiradorA(Atirador atiradorA) {
        this.atiradorA = atiradorA;
    }

    public Atirador getAtiradorB() {
        return atiradorB;
    }

    public double getPoderFogoA() {
        return poderFogoA;
    }

    public void setPoderFogoA(int poderFogoA) {
        this.poderFogoA = poderFogoA;
    }

    public double getPoderFogoB() {
        return poderFogoB;
    }

    public void setPoderFogoB(int podeFogoB) {
        this.poderFogoB = podeFogoB;
    }

    public void setAtiradorB(Atirador atiradorB) {
        this.atiradorB = atiradorB;
    }

    public void batalhar() {
        System.out.println("-");
        atiradorA.jogadorStatus();
        System.out.println("-");
        atiradorB.jogadorStatus();
        System.out.println("-");

        //atiradorA.atirar("A");
        //atiradorB.atirar("B");

        poderFogoA = atiradorA.getPrecisao() * ThreadLocalRandom.current().nextInt(5, 10);
        poderFogoB = atiradorB.getPrecisao() * ThreadLocalRandom.current().nextInt(5, 10);

        System.out.println("Poder de fogo A: " + getPoderFogoA());
        System.out.println("Poder de fogo B: " + getPoderFogoB());

        double diferenca = Math.abs(poderFogoA - poderFogoB);

        if (diferenca < 10) {
            System.out.println("INACREDITÁVEL!!! OS DOIS ATIRADORES SE ACERTAM. EMPATE!");
            atiradorA.registrarEmpate();
            atiradorB.registrarEmpate();

        }
        else if (poderFogoA > poderFogoB) {
            System.out.println("Atirador A solou o atirador B");
            atiradorA.registrarVitoria();
            atiradorB.registrarDerrota();
        } else {
            System.out.println("Atirador B solou o atirador A");
            atiradorA.registrarDerrota();
            atiradorB.registrarVitoria();

        }
    }

}


