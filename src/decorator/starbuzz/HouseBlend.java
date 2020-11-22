package decorator.starbuzz;

public class HouseBlend extends Beverage {
	
	public HouseBlend(){
		description = "House Blend";
	}
	
	@Override
	public double cost() {
		return .89;
	}
}
