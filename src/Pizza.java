import java.util.HashMap;
import java.util.Map;

public class Pizza {
    private String sabor;
    private double preco;
    static private int numero_pizzas = 0;
    private int indice=0;
    
    Map<Integer, String> tabela_de_ingredientes = new HashMap<Integer, String>();
    
    //MÉTODO CONSTRUTOR serve para inicializar os objetos da classe; É o método que leva o nome da classe
    public Pizza(String sabor){
        this.setSabor(sabor);
        numero_pizzas++;
    }
    
    public void adicionaIngredientes(String ingrediente){
        tabela_de_ingredientes.put(indice++, ingrediente);
    }
    
    public int getTotalPizzas(){
        return numero_pizzas;
    }
    
    public int getTotalIngredientes(){
        return tabela_de_ingredientes.size();
    }
    
    public double getPreco(){
        if(tabela_de_ingredientes.size()<=2)
            preco = 30;
        else if(tabela_de_ingredientes.size()<=5)
            preco = 45;
        else 
            preco = 60;
        return preco;
    }

	public String getSabor() {
		return sabor;
	}

	public void setSabor(String sabor) {
		this.sabor = sabor;
	}
}
