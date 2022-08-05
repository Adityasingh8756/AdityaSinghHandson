/* Write a program in java for LambdaExpressionFilter demo. The filter will filter the list of electronic products

whose cost is less than 20000 and print the details of products in the list whose cost is greater than 20000

Step1: Create an Electronic Product bean class with attributes id , name and price

Step2: create a main method and add list of products created to product list

Step3: create a stream object and filter the list using stream filter and lambda expression

Step4: Using lambda expression iterate through list to print product name and product price*/


import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class ElectronicProduct 
{


	  int id;

	  String name;

	  float price;

	  public ElectronicProduct(int id, String name, float price) 
	  {

	    this.id = id;

	    this.name = name;

	    this.price = price;

	  }

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public float getPrice() {
		return price;
	}


	public String toString() {
		return "  "+name+" : "+price+"  " ;
	}
	
	

}
public class TestElectronicProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 List<ElectronicProduct> productsList = new ArrayList<ElectronicProduct>();

		    //Adding Products

		    productsList.add(new ElectronicProduct(1,"Samsung",12000f));

		    productsList.add(new ElectronicProduct(2,"Sony Xperia",25000f));

		    productsList.add(new ElectronicProduct(3,"Nokia",18000f));

		    productsList.add(new ElectronicProduct(4,"Redmi4 ",26000f));

		    productsList.add(new ElectronicProduct(5,"Iphone 6S",65000f));
		    
		    
		    
		    System.out.println("Output with the list\n\n");
		    
	   List<ElectronicProduct> filteredProductList = productsList.stream()
		    						.filter(p -> p.getPrice()>20000f)
	    						     .collect(Collectors.toList());
		    
		    
	   filteredProductList.forEach(res->System.out.println(res.toString()));	    
		    

		    System.out.println("\n\n");
		    System.out.println("Output with the Map\n\n");
		    
		    Map<String,Float> productPriceMap = productsList.stream()
		    		                                        .filter(p -> p.getPrice()>20000)
		    	                                            .collect(Collectors.toMap(p->p.name,p->p.price));

		    	                                          System.out.println(productPriceMap);

	}

}
