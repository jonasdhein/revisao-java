package programacao;

public class TerminalBanco {

    public static void main(String[] args){
     
        Conta conta1 = new Conta(1, 123, "Jonas", 500);
        
        Conta conta2 = new Conta(1, 333, "Juca", 1000);
        
        //sacar(conta1, 100);    
        //sacar(conta2, 100);        
        //deposito(conta1, 300);
        transferir(conta1, conta2, 100);

        System.out.println(conta1.toString());
        System.out.println(conta2.toString());
    }
    
    private static void sacar(Conta conta, double valorSaque){
        double saldoNovo = conta.getSaldo() - valorSaque;
        conta.setSaldo(saldoNovo);
    }
    
    //criar o método para depósito em conta
    private static void deposito(Conta conta, double valorDeposito){
        double saldoNovo = conta.getSaldo() + valorDeposito;
        conta.setSaldo(saldoNovo);
    }
    
    //método para transferencia entre duas contas
    private static void transferir(Conta conta1, Conta conta2, double valor){
        double saldoConta1 = conta1.getSaldo() - valor;
        conta1.setSaldo(saldoConta1);
        
        double saldoConta2 = conta2.getSaldo() + valor;
        conta2.setSaldo(saldoConta2);
    }
    
}
