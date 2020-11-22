package decorator.starbuzzwithsizes;

public class Milk extends CondimentDecorator {
	Beverage beverage;

	public Milk(Beverage beverage){
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + ", Steamed Milk";
	}

	@Override
	public double cost() {
		return beverage.cost() + .10;
	}
}
