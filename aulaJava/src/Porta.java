public class Porta {
    // atributos
    public boolean aberto;
    private boolean trancado;
    private double alturaCm;
    private double larguraCm;
    public String material;
    public String cor;

    //métodos
    public void abrirPorta() {
        if (this.aberto) {
            System.out.println("A porta já está aberta");
        } else if (this.trancado) {
            System.out.println("A porta está trancada e não pode ser aberta");
        } else {
            this.aberto = true;
            System.out.println("A porta foi aberta");
        }
    }

    public void fecharPorta() {
        if (!this.aberto) {
            System.out.println("A porta já está fechada");
        } else {
            this.aberto = false;
            System.out.println("A porta foi fechada");
        }
    }

    private void trancarPorta() {
        if (this.trancado) {
            System.out.println("A porta já está trancada");
        } else if (this.aberto) {
            System.out.println("Feche a porta primeiro para trancar");
        } else {
            trancado = true;
        }
    }

    private void destrancarPorta() {
        if (!this.trancado) {
            System.out.println("A porta já está destrancada");
        } else {
            this.trancado = false;
            System.out.println("A porta foi destrancada");
        }
    }

    private void portaEstado() {
        if (this.aberto) {
            System.out.println("A porta está aperta");
        } else {
            System.out.println("A porta está fechada");
        }
        if (this.trancado) {
            System.out.println("A porta está trancada");
        } else {
            System.out.println("A porta está destrancada");
        }
        System.out.println("A porta tem " + this.alturaCm + " centímetros de altura");
        System.out.println("A porta tem " + this.larguraCm + " centímetros de largura");
        System.out.println("A porta é feita de " + material);
        System.out.println("A porta tem a cor " + cor);
    }
}
