 
/**
 * Escreva uma descrição da classe Sistema aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
import java.util.*;
public class Sistema
{
    // variável que "armazenara" os clientes
    //é um ArrayList SOMENTE de obj "Cliente"
    private static ArrayList<Cliente> dados = new ArrayList<Cliente>();
        
    //metodo para obter os dados do usuario,
    //criar o objeto e adicionar ao "list"
    public static void cadastrarCliente() { 
        String nom, ema, tip;
        int ida;
        nom = EntradaSaida.receberString("Nome");
        ema = EntradaSaida.receberString("E-mail");
        ida = EntradaSaida.receberInt("Idade");
        tip = EntradaSaida.receberString("C - comum ou V - vip");
        Cliente cli;
        if (tip.equalsIgnoreCase("V")) { 
            cli = new ClienteVip(nom, ema, ida);
        } else { 
            cli = new ClienteComum(nom, ema, ida);
        }
        dados.add(cli);
    }
    
    //metodo que obtem  o nome a pesquisar,
    //procura no "list" e retorna os dados
    public static void pesquisarCliente() { 
        String pesq = EntradaSaida.receberString("Nome a pesquisar:");
        Cliente cli = retornarCliente(pesq);
        String saida = "";
        if (cli != null) { 
            saida += cli.retornarNome() + "\n";
            saida += cli.retornarEmail() + "\n";
            saida += cli.retornarIdade();
        } else { 
            saida = "Nenhum resultado encontrado";
        }
        EntradaSaida.mostrarTexto(saida);
    }
    
    
    //metodo que recebe uma string de pesquisa (nome)
    //e retorna o objeto cliente vinculado com esse nome
    private static Cliente retornarCliente(String pesq) { 
        Cliente cli = null;
        for (int i=0; i<dados.size(); i++) { 
            cli = dados.get(1);
            String nome = cli.retornarNome();
            if (nome.equalsIgnoreCase(pesq)) { 
                return cli;
            }
        }
        return null;
    }
    
    //metodo que aumenta o limite da conta
    //se o cliente for "vip"
    public static void aumentarLimite() { 
        String pesq = EntradaSaida.receberString("Cliente?");
        Cliente cli = retornarCliente(pesq);
        if (cli != null && cli instanceof ClienteVip) { 
            ClienteVip cv = (ClienteVip)cli;//forçar o tipo (type casting)
            cv.ajustarLimite();
            double lim = cv.retornarLimite();
            EntradaSaida.mostrarTexto("Novo Limite: "+lim); 
        } else { 
            EntradaSaida.mostrarTexto("Cliente Comum...");
        }
    }
}




