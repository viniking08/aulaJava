package AtividadeHeranca;

public class Main {
    public static void main(String[] args) {
        // referente a atividade 1.6 e 1.7


        Visitante visitante1 = new Visitante(18, "Macho", "Brochacho");
        Professor professor1 = new Professor(29,"Fêmea", "Brochacha", "História", 3000);
        Aluno aluno1 = new Aluno(16, "Macho", "Jubiléio", "A498209", "Desenvolvimento de Juremas");
        Bolsista alunoBolsista1 = new Bolsista(20, "Fêmea", "Jubiléia", "B304903", "Moda", 20.5);
        Tecnico tecnico1 = new Tecnico(24, "Macho", "Jagunço", "090289", "Mecânica", "OAB/SP 123456");

        professor1.receberAumento(150);
        aluno1.pagarMensalidade();
        alunoBolsista1.pagarMensalidade();
        System.out.println(tecnico1); // nao precisa escrever o toString pois o sout ja o chama automaticamente só de mencionar o objeto
        System.out.println(professor1);
    }
}
