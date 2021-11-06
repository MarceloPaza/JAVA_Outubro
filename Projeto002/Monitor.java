
/**
 * classe que representa os atributos e métodos de um Monitor de computador
 * 
 * @author (Marcelo Paza) 
 * @version (1.0)
 */

public class Monitor
{
    //atributos do monitor
    private int reso;
    private String tipo;
    private String sep;
    
    //metodo construtor - para inicializar os dados do objeto
    public Monitor() {  
        this.reso = 1024;
        this.tipo = "LED";
    }
    
    //metodo que exibe na tela qdo o monitor eh ligado
    public void ligar() { 
        System.out.println("Ligando monitor...ok");
        System.out.println("");
    }
    
    //metodo que exibe na tela qdo o monitor eh desligado
    public void desligar() { 
        System.out.println("");
        System.out.println("Desligando monitor...tchau");
           
    }
    
    //metodo que mostra algo n tela
    public void exibirMsg(String txt) {  
        System.out.println("");
        System.out.println(this.sep);
        System.out.println("Resolução atual: " + this.reso);
        System.out.println(txt);
        System.out.println(this.sep);        
        System.out.println("");
    }
    
    //metodos auxiliares para ajustar os atributos
    public void ajustarReso(int reso) {
        if (reso != 1024 && reso != 1280 && reso != 1600) { 
            this.reso = 1024;
        }
        else { 
            this.reso = reso;
        }
        this.ajustarSep();
    }
    
    //metodo para ajustar o simbolo que representa a resolução
    private void ajustarSep() { 
        String sep = "";
        int qtd = (int) (this.reso/100);
        for (int i=0; i<qtd; i++) { 
            sep += "-";
        }
        this.sep = sep;
    }
}
