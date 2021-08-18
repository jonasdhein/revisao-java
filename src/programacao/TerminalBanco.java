package programacao;

public class TerminalBanco {

    public static void main(String[] args){
     
        Conta conta1 = new Conta(1, 123, "Jonas", 500, 1000);
        
        Conta conta2 = new Conta(1, 333, "Juca", 1000, 1000);
        
        conta1.sacar(100);         
        conta1.deposito(300);
        conta1.transferir(conta2, 100);

        System.out.println(conta1.toString());
        System.out.println(conta2.toString());
    }
    
}
