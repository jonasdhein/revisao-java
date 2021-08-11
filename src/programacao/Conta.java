package programacao;

/**
 *
 * @author jdhein
 */
public class Conta {
    
    private int agencia;
    private int conta;
    private String nomePessoa;
    private double saldo;

    public Conta(int agencia, int conta, String nomePessoa, double saldo) {
        this.agencia = agencia;
        this.conta = conta;
        this.nomePessoa = nomePessoa;
        this.saldo = saldo;
    }
    
    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getConta() {
        return conta;
    }

    public void setConta(int conta) {
        this.conta = conta;
    }

    public String getNomePessoa() {
        return nomePessoa;
    }

    public void setNomePessoa(String nomePessoa) {
        this.nomePessoa = nomePessoa;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
  
    @Override
    public String toString(){
        return "Conta: " + this.conta + " - Saldo: " + Tools.formataValor(this.saldo);
    }
    
}
