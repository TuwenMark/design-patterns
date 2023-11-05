package build_patterns.factory.factory_method;

import build_patterns.factory.factory_method.pizza.*;

/**
 * @program: design-patterns
 * @description: 伦敦披萨工厂类
 * @author: Mr.Ye
 * @create: 2023-11-05 22:02
 **/
public class LDPizzaFactory extends PizzaFactory{
	@Override
	public Pizza createPizza(String type) {
		Pizza pizza;
		switch (type.toLowerCase()) {
			case "pepper": {
				pizza = new LDPepperPizza();
				pizza.setName("伦敦胡椒披萨");
			}
			break;
			case "cheese": {
				pizza = new LDCheesePizza();
				pizza.setName("伦敦奶酪披萨");
			}
			break;
			case "durian": {
				pizza = new LDDurianPizza();
				pizza.setName("伦敦榴莲披萨");
			}
			break;
			default:
				System.out.println("无此类披萨，订购失败！");
				return null;
		}
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		return pizza;
	}
}
