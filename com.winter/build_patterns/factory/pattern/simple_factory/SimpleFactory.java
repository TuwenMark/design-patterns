package build_patterns.factory.pattern.simple_factory;

import build_patterns.factory.pattern.simple_factory.pizza.CheesePizza;
import build_patterns.factory.pattern.simple_factory.pizza.DurianPizza;
import build_patterns.factory.pattern.simple_factory.pizza.PepperPizza;
import build_patterns.factory.pattern.simple_factory.pizza.Pizza;

/**
 * @program: design-patterns
 * @description: 简单工厂：提供创建实例的封装
 * @author: Mr.Ye
 * @create: 2023-11-05 21:07
 **/
public class SimpleFactory {
	private String type;

	public static Pizza createPizza(String type) {
		Pizza pizza;
		switch (type.toLowerCase()) {
			case "pepper": {
				pizza = new PepperPizza();
				pizza.setName("胡椒披萨");
			}
			break;
			case "cheese": {
				pizza = new CheesePizza();
				pizza.setName("奶酪披萨");
			}
			break;
			case "durian": {
				pizza = new DurianPizza();
				pizza.setName("榴莲披萨");
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
