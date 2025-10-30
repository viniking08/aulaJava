public interface IContaBanco {
    void depositar(double valor);
    void sacar(double valor);
    void transferir(ContaBanco destinatario, double valor);
    void mostrarSaldo();
}
