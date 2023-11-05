package build_patterns.factory.factory_method;


import build_patterns.factory.factory_method.pizza.Pizza;

/**
 * @program: design-patterns
 * @description: 订购工厂
 * @author: Mr.Ye
 * @create: 2023-11-05 21:53
 **/
public abstract class PizzaFactory {
	private String location;

	private String type;

	public static PizzaFactory getPizzaFactory(String location) {
		PizzaFactory pizzaFactory;
		switch (location.toLowerCase()) {
			case "beijing": {
				pizzaFactory = new BJPizzaFactory();
			}
			break;
			case "london": {
				pizzaFactory = new LDPizzaFactory();
			}
			break;
			default: {
				System.out.println("此地无披萨售卖，订购失败！");
				return null;
			}
		}
		return pizzaFactory;
	}

	public abstract Pizza createPizza(String type);
}
