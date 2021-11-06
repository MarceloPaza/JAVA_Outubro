
/**
 * classe Pares
 * 
 * @author (Marcelo Paza) 
 * @version (1.0)
 */
public class Pares
{
    /**
     * Processamento dos dados mesmo com inversão de ordem numérica inserida
     */ 
    public String retornaNros(int ini, int fim) { 
        
        if (ini > fim) {
            int aux = ini;
            ini = fim;
        fim = aux;
        }
        String res = "";
        for (int n=ini; n<=fim; n++) { 
            if (n % 2 == 0) { 
                res = res + n + " - ";
            }
        }
        return res;
    }
}
