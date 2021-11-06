import java.util.*;

/**
 * Esta eh a classe TesteHashMap.
 * Tipos primitivos - Usado bastante nos projetos
 * @author (Marcelo Paza) 
 * @version (1.0)
 */
public class TesteHashMap
{
    public static void main(String[] s) { 
        //alguns objetos
        Aluno a1 = new Aluno("Joao", 12, "joao@teste.com");
        Aluno a2 = new Aluno("Maria", 23, "maria@teste.com");
        Aluno a3 = new Aluno("Aline", 34, "aline@teste.com");
        
        //outra forma, agora usando um conjunto (Map e HashMap)
        //precisa ser importada de java.util
        //faz o mapeamento de uma chave para um valor
        //no caso, uma String para um Aluno
        Map<String,Aluno> mapalu = new HashMap<String,Aluno>();
        mapalu.put("k1",a1);
        mapalu.put("k2",a2);
        mapalu.put("k3",a3);
        
        imprimirAlunos(mapalu);
        
        Aluno result = mapalu.get("k2");
        System.out.println("Aluno da chave 2: "+ result.getNome());
    }
    
    public static void imprimirAlunos(Map<String,Aluno> mapalu) { 
        //precisamos pegar a lista de valores para interar
        for (Aluno alu : mapalu.values()) { 
            System.out.println(alu.getNome());
        }
    }
}
