import java.util.ArrayList;

public class CarrinhoDeCompras{
    private double total_pagar = 0;
    
    ArrayList<Pizza> carrinho = new ArrayList<Pizza>();
    
    public void adicionarItem(Pizza obj){
        if(obj.getTotalIngredientes()>0){
            carrinho.add(obj);
            total_pagar += obj.getPreco(); 
        }
        else System.out.println("Item não incluído!!!!");
    }
    
    public int totalPizzasAdicionadas(){
        return carrinho.size();
    }
    
    public double getTotalPagar(){
        return total_pagar;
    }
}
