
/**
 * Classe Funcionario
 * cria e define o tipo de funcionario
 * 
 * @author (Marcelo Paza) 
 * @version (um número da versão ou uma data)
 */

public abstract class Funcionario
{
    //constante (final) que pode ser acessada
    //dentro da estrutura hierarquica protected
    protected final double TAX = 0.10;
    
    //outros atributos com acesso local
    private String nom;
    private String ema;
    
    /**
     * Construtor para objetos da classe Funcionario
     */
    public Funcionario() { 
        this.nom = "Vazio";
        this.ema = "vazio@vazio.com";
    }
    
    public Funcionario(String nom, String ema)
    {
        this.nom = nom;
        this.ema = ema;
    }
    //metodo que ajusta o nome do funcionario
    public void setNome(String nom) { 
        this.nom = nom;
    }
    //metodo que retorna o nome do funcionario
    public String getNome() { 
        return this.nom;
    }

    //metodo modelo para ser OBRIGATORIAMENTE implementado
    //nas subclasses (class es que herdam Funcionario)
    public abstract double calcularSalario();
}
