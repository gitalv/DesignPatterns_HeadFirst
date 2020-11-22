package factory.pizzafactorymethod;

public class NYPizzaStore extends PizzaStore {

	@Override
	Pizza createPizza(String type) {
		Pizza pizza = null;
		
		switch(type){
		case "cheese":    pizza = new NYStyleCheesePizza(); break;
		case "pepperoni": pizza = new NYStylePepperoniPizza(); break;
		case "clam":      pizza = new NYStyleClamPizza(); break;
		case "veggie":    pizza = new NYStyleVeggiePizza(); break;
		default:          pizza = null; break;
		}
		return pizza;
	}
}
