//Netbeans IDE23
//Isadora Costa Baía - RA2614685
import java.util.ArrayList;

public class BdReceitas {
    static BdReceitas receitaUnic;
    ArrayList<Receita> receitas = new ArrayList<>();

    //método singleton
    public static BdReceitas getBdReceitas() {
        if (receitaUnic == null) {
            receitaUnic = new BdReceitas();
        }
        return receitaUnic;
    }
    
    public ArrayList<String> listarNomesReceitas() {
        if (receitas == null) {
            receitas = new ArrayList<>();
        }

        ArrayList<String> nomes = new ArrayList<>();
        for (Receita r : receitas) {
            nomes.add(r.getNome());
        }
        return nomes;
    }

    public Receita encontrarReceita(String nomeReceita) {
        for (Receita r : receitas) {
            if (r.getNome().equalsIgnoreCase(nomeReceita)) {
                return r;
            }
        }
        return null;
    }
    
    public boolean removerReceita(String nomeReceita) {
        Receita receitaParaExcluir = encontrarReceita(nomeReceita);
        if (receitaParaExcluir != null) {
            receitas.remove(receitaParaExcluir);
            return true;
        }
        return false;
    }
    
    public void adicionarReceita(Receita receita) {
        if (receita != null) {
            receitas.add(receita);
            System.out.println("Receita adicionada com sucesso: " + receita.getNome());
        } else {
            System.out.println("Erro: Receita é nula e não foi adicionada.");
        }
    }
} 
