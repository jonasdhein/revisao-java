package programacao;

/**
 *
 * @author jdhein
 */
public class CalcularMedia {
    
    public static void main(String[] args){
        int[] valores = new int[3];
        valores[0] = 5;
        valores[1] = 7;
        valores[2] = 2;
        
        double retorno_media = media(valores);
        double media_arredondada = Arredondamento.arredondarValor(retorno_media);
        System.out.println("MÉDIA = " + media_arredondada);
    }
    
    private static double media(int[] nums){
        double res_media = 0;
        System.out.println("TAMANHO DO ARRAY = " + nums.length);
        for(int i = 0; i < nums.length; i++){
            res_media += nums[i];
        }
        res_media = res_media / nums.length;
        
        return res_media;
    }
    
}
