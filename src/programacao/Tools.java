package programacao;

import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Tools {
        
    public static void verificaParImpar(int numero){
        if(numero % 2 == 0){
            System.out.println(numero + " é par");
        }else{
            System.out.println(numero + " é ímpar");
        }
    }
    
    public static String formataValor(double valor, boolean sifrao){
        try{
            
            DecimalFormat format = new DecimalFormat("###,###,##0.00");
            format.setRoundingMode(RoundingMode.DOWN);
            if(sifrao){
                return "R$ " + format.format(valor);
            }else{
                return format.format(valor);
            }
            
        }catch(Exception ex){
            System.err.println(ex.getMessage());
            return "";
        }
        
    }
    
}
