
/**
 * Esta eh a classe Aluno.
 * Alfamidia - Programação Java (orient de obj)
 * Tipos primitivos - Usado bastante nos projetos
 * @author (Marcelo Paza) 
 * @version (1.0)
 */
public class Aluno
{
    private String nome;
    private Integer idade;
    private String email;
        
    public Aluno()
    {
        this.nome = "Aluno";
        this.idade = 0;
        this.email = "aluno@aluno.com";
    }
    
      public Aluno(String nome, Integer idade, String email)
    {
        this.nome = nome;
        this.idade = idade;
        this.email = email;
    }
    
    public void setNome(String nome) { 
        this.nome = nome;
    }
    public String getNome() { 
        return this.nome;
    }
    public void setIdade(Integer idade) { 
        this.idade = idade;
    }
    public Integer getIdade() { 
        return this.idade;
    }
    public void setEmail(String email) { 
        this.email = email;
    }
    public String getEmail() { 
        return this.email;
    }
}
