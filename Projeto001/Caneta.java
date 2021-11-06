
/**
 * Essa e a classe que representa uma Caneta
 * 
 * @author (Marcelo Paza) 
 * @version (1.0)
 */
public class Caneta
{
    // caracteristicas da caneta
    //representada por variáveis
    String cor;
    int tamanho;
    
    //metodo que ajusta a cor da tinta da caneta
    public void ajustarCor(String cor)
    { 
         this.cor = cor;
    }
    
    //metodo que ajusta o tamanho da ponta da caneta
    public void ajustarTamanho(int tamanho) 
    { 
        this.tamanho = tamanho;
    }
        
    //funcionalidades da caneta
    //representada por métodos
    public void escrever(String txt) 
    { 
        System.out.println("Tam: " + this.tamanho);
        System.out.println("Cor: " + this.cor);
        System.out.println("Texto informado:" + txt);
    }
    
    
}
