
/**
 * Exercicio para treinar os recursos vistos até agora
 * - classificação, organização dos atributos e métodos
 * - E também recursos da linguagem (String, Arrays, etc)
 * 
 * @author (Marcelo Paza) 
 * @version (1.0)
 */


public class Principal
{
    /**
     * 
     */
    public static void main(String args[]) { 
        //obter os dados que o usuário informa
        int ini = Tela.retornaInt("Informe um nro inteiro");
        int fim =  Tela.retornaInt("Informe outro nro inteiro");
        
        //cria o objeto para processamento
        Pares p = new Pares();
        
        String res = p.retornaNros(ini, fim);
                
        //saida para o resultado
        Tela.mostraTxt(res);
    }
}
