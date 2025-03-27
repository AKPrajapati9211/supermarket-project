package supermarket.products;

public class BeverageProduct extends GroceryProduct implements Drinkable{
	private SugarLevel SugarLevel;
	public BeverageProduct(String name, double price, double discount, SugarLevel SugarLevel) {
		super(name, price, discount);
		this.SugarLevel = SugarLevel;
		// TODO Auto-generated constructor stub
	}
	public SugarLevel getSugarLevel() {
		return SugarLevel;
	}
	public void setSugarLevel(SugarLevel sugarLevel) {
		SugarLevel = sugarLevel;
	}
	//overriding
	public String toString() {
		return super.toString()+ "SugarLevel: "+SugarLevel;
	}
	@Override
	public boolean isHealthy() {
		return SugarLevel != SugarLevel.ADDEDSUGAR;
	}
	
}
