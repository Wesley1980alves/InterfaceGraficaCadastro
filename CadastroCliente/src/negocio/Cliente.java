
package negocio;


public class Cliente {
    private String nome;
    private String data;
    private String conta;
    private int codigo;
    private double saldo;
    private double deposito;
    private double tranferir;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getConta() {
        return conta;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getDeposito() {
        return deposito;
    }

    public void setDeposito(double deposito) {
        this.deposito = deposito;
    }

    public double getTranferir() {
        return tranferir;
    }

    public void setTranferir(double tranferir) {
        this.tranferir = tranferir;
    }
    
    
    
}

