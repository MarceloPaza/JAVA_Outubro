
/**
 * Escreva uma descrição da classe FuncIntegral aqui.
 * 
 * @author (Marcelo Paza 
 * @version (1.0)
 */
public class FuncIntegral extends Funcionario
{
    private double bas;
    
    /**
     * Construtor para objetos da classe FuncIntegral
     */
    public FuncIntegral(String nom, String ema, double bas)
    {
        super(nom, ema);
        this.bas = bas;
    }
    
     //metodo para realizar o calculo do salario
    public double calcularSalario() { 
        double sal = this.bas - (this.bas * 0.10);
        return sal;        
    }
}
