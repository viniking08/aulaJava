public class Penal {

    // atributos
    private boolean ziperCorAberto;  //buraco pra colocar lapis de cor
    private boolean ziperCanetaAberto; //buraco pra colocar caneta
    private int qntdLapiscor;
    private int qntdCanetas;
    private String corPenal;
    private String materialPenal;

    //construct
    public Penal(String materialPenal, String corPenal) {
        this.materialPenal = materialPenal;
        this.corPenal = corPenal;
        this.fecharZiperCaneta();
        this.fecharZiperCor();
    }

    //getters e setters
    public boolean isZiperCorAberto() {
        return ziperCorAberto;
    }

    public void setZiperCorAberto(boolean ziperCoraberto) {
        this.ziperCorAberto = ziperCoraberto;
    }

    public boolean isZiperCanetaAberto() {
        return ziperCanetaAberto;
    }

    public void setZiperCanetaAberto(boolean ziperCanetaaberto) {
        this.ziperCanetaAberto = ziperCanetaaberto;
    }

    public int getQntdLapiscor() {
        return qntdLapiscor;
    }

    public void setQntdLapiscor(int qntdLapiscor) {
        this.qntdLapiscor = qntdLapiscor;
    }

    public int getQntdCanetas() {
        return qntdCanetas;
    }

    public void setQntdCanetas(int qntdCanetas) {
        this.qntdCanetas = qntdCanetas;
    }

    public String getCorPenal() {
        return corPenal;
    }

    public void setCorPenal(String corPenal) {
        this.corPenal = corPenal;
    }

    public String getMaterialPenal() {
        return materialPenal;
    }

    public void setMaterialPenal(String materialPenal) {
        this.materialPenal = materialPenal;
    }

    // methods
    public void abrirZiperCor() {
        if (!ziperCorAberto) {
            ziperCorAberto = true;
            System.out.println("O zíper do compartimento de lápis de cor foi aberto.");
        } else {
            System.out.println("O zíper do compartimento de lápis de cor já está aberto.");
        }
    }

    public void fecharZiperCor() {
        if (ziperCorAberto) {
            ziperCorAberto = false;
            System.out.println("O zíper do compartimento de lápis de cor foi fechado.");
        } else {
            System.out.println("O zíper do compartimento de lápis de cor já está fechado.");
        }
    }

    public void abrirZiperCaneta() {
        if (!ziperCanetaAberto) {
            ziperCanetaAberto = true;
            System.out.println("O zíper do compartimento de canetas foi aberto.");
        } else {
            System.out.println("O zíper do compartimento de canetas já está aberto.");
        }
    }

    public void fecharZiperCaneta() {
        if (ziperCanetaAberto) {
            ziperCanetaAberto = false;
            System.out.println("O zíper do compartimento de canetas foi fechado.");
        } else {
            System.out.println("O zíper do compartimento de canetas já está fechado.");
        }
    }
}




