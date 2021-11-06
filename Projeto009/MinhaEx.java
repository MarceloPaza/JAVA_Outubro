
/**
 * Escreva uma descrição da classe MinhaEx aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class MinhaEx extends Exception
{
    //construtor
    public MinhaEx() {
      super("Bug da Minha Ex");

    }
    //metodo que retorna algum texto de bug
    public String getBug() { 
        return this.getMessage();
    }
}