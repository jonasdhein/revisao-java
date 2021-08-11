package programacao;

public class Tools {
        
    public static void verificaParImpar(int numero){
        if(numero % 2 == 0){
            System.out.println(numero + " é par");
        }else{
            System.out.println(numero + " é ímpar");
        }
    }
    
    public static String formataValor(double valor){
        return "R$ " + valor;
    }
    
}
