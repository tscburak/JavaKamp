package week2;

public class Category {

	public Category()
	{
		System.out.println("Category class has been executed");
	}
	
	public Category(int id , String categoryName, int quantity){
		
		this.id = id;
		this.categoryName = categoryName;
		this.quantity = quantity;
		
	}
	
	int id;
	String categoryName;
	int quantity;

}
