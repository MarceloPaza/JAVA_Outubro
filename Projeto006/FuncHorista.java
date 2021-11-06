
/**
 * Escreva uma descrição da classe FuncHorista aqui.
 * 
 * @author (Marcelo Paza) 
 * @version (1.)
 */
public class FuncHorista extends Funcionario
{
    private int qtd;
    private double val;
    
    /**
     * Construtor para objetos da classe FuncHorista
     */
    public FuncHorista(String nom, String ema, int qtd, double val)
    {
        //chamando o construtor da classe pai
        super (nom, ema);
        
        //inicializacao de outras variaveis especificas da classe
        this.qtd = qtd;
        this.val = val;
    }
    //metodo para realizar o calculo do salario
    public double calcularSalario() { 
        double bas = this.qtd * this.val;
        double sal = bas - (bas * this.TAX);
        return sal;        
    }
    
}
