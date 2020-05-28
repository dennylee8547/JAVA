import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    public static void main(String[] args) {

        
    	//實作1.加入二台Notebook("Asus",30000),Notebook("Acer",20000),Food("Cookie",200)
        List<Product> shoppingList = new ArrayList<Product>();
        	Notebook nb1 = new Notebook("Asus", 30000);
        	Notebook nb2 = new Notebook("Acer", 20000);
        	Food fd1 = new Food("Cookie", 200);
        	
        	shoppingList.add(nb1);
        	shoppingList.add(nb2);
        	shoppingList.add(fd1);
        	
        	
        	
        	//實作2.利用for迴圈,計算shoppingList中的總金額,並印在Console中
        	int total =0;
        	for (Product product : shoppingList) {
        		total+=product.getPrice();
        		
        }
        	System.out.println("shoppingList總金額為:" + total);
        	

      //實作3.利用for迴圈,加總shoppingList中是Notebook型態的總金額,並印在Console中
        	
        	//System.out.println(shoppingList.get(0));
        	Product a = shoppingList.get(0);
        	int b =a.getPrice();
        	System.out.println(b);
        	//for (Product product:shoppingList.get(0)) {
        		
        	//}

    }
}
