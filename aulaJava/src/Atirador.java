public class Atirador {
    private int abates;
    private String nome;
    private String arma;
    private String nacionalidade;
    private int vitorias;
    private int derrotas;
    private int empate;
    private double precisao;

    public Atirador(String nome, String arma, String nacionalidade, double precisao) {
        this.nome = nome;
        this.arma = arma;
        this.nacionalidade = nacionalidade;
        this.abates = 0;
        this.empate = 0;
        this.vitorias = 0;
        this.derrotas = 0;
        this.precisao = precisao;
    }

    public double getPrecisao() {
        return precisao;
    }

    public void setPrecisao(double precisao) {
        this.precisao = precisao;
    }

    public int getAbates() {
        return abates;
    }

    public void setAbates(int abates) {
        this.abates = abates;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getArma() {
        return arma;
    }

    public void setArma(String arma) {
        this.arma = arma;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpate() {
        return empate;
    }

    public void setEmpate(int empate) {
        this.empate = empate;
    }

    public void atirar(String letra){      // sem função por agora

    }

    public void registrarVitoria() {
        setVitorias(getVitorias() + 1);
        System.out.println("O jogador venceu");
    }

    public void registrarDerrota() {
        setDerrotas(getDerrotas() + 1);
        System.out.println("O jogador perdeu");
    }

    public void registrarEmpate() {
        setEmpate(getEmpate() + 1);
        System.out.println("O jogador empatou");
    }

    public void jogadorStatus() {
        System.out.println("Nome: " + getNome());
        System.out.println("Nacionalidade: " + getNacionalidade());
        System.out.println("Arma: " + getArma());
        System.out.println("Vitórias: " + getVitorias());
        System.out.println("Derrotas: " + getDerrotas());
        System.out.println("Empates: " + getEmpate());
    }
}
