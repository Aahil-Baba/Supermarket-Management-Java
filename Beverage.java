package supermarket.products;

public class Beverage extends GroceryProduct {
private Sugarlevel sugarLevel;
public Beverage(String name,double price,double discount,Sugarlevel sugarLevel) {
	super(name,price,discount);
	this.sugarLevel=sugarLevel;
}
public String display() {
	return(super.display()+"\nSugar Level| "+sugarLevel);
}
public Sugarlevel getSugarLevel() {
	return sugarLevel;
}
public void setSugarLevel(Sugarlevel sugarLevel) {
	this.sugarLevel = sugarLevel;
}
}
