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
    private double chequeEspecial;

    public Conta(int agencia, int conta, String nomePessoa, double saldo, double chequeEspecial) {
        this.agencia = agencia;
        this.conta = conta;
        this.nomePessoa = nomePessoa;
        this.saldo = saldo;
        this.chequeEspecial = chequeEspecial;
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

    public double getChequeEspecial() {
        return chequeEspecial;
    }

    public void setChequeEspecial(double chequeEspecial) {
        this.chequeEspecial = chequeEspecial;
    }
  
    @Override
    public String toString(){
        return "Conta: " + this.conta + " - Saldo: " + Tools.formataValor(this.saldo, true);
    }
    
    public void sacar(double valor){
        try{
            double resultado = this.saldo - valor;
            //não pode ultrapassar o cheque especial
            if(resultado >= this.chequeEspecial){
                this.saldo -= valor;
            }
            
        }catch(Exception ex){
            System.err.println(ex.getMessage());
        }
    }
    
    //criar o método para depósito em conta
    public void deposito(double valor){
        this.saldo += valor;
    }
    
    //método para transferencia entre duas contas
    public void transferir(Conta contaTransferencia, double valor){
        sacar(valor);
        contaTransferencia.deposito(valor);
    }
    
}
