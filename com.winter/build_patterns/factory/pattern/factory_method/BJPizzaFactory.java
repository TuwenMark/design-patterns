package build_patterns.factory.pattern.factory_method;

import build_patterns.factory.pattern.factory_method.pizza.BJCheesePizza;
import build_patterns.factory.pattern.factory_method.pizza.BJDurianPizza;
import build_patterns.factory.pattern.factory_method.pizza.BJPepperPizza;
import build_patterns.factory.pattern.factory_method.pizza.Pizza;

/**
 * @program: design-patterns
 * @description: 北京披萨工厂类
 * @author: Mr.Ye
 * @create: 2023-11-05 22:02
 **/
public class BJPizzaFactory extends PizzaFactory{
	@Override
	public Pizza createPizza(String type) {
		Pizza pizza;
		switch (type.toLowerCase()) {
			case "pepper": {
				pizza = new BJPepperPizza();
				pizza.setName("北京胡椒披萨");
			}
			break;
			case "cheese": {
				pizza = new BJCheesePizza();
				pizza.setName("北京奶酪披萨");
			}
			break;
			case "durian": {
				pizza = new BJDurianPizza();
				pizza.setName("北京榴莲披萨");
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
