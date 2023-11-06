package build_patterns.factory.tradition;

import build_patterns.factory.tradition.pizza.CheesePizza;
import build_patterns.factory.tradition.pizza.DurianPizza;
import build_patterns.factory.tradition.pizza.PepperPizza;
import build_patterns.factory.tradition.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @program: design-patterns
 * @description: 披萨订购服务
 * @author: Mr.Ye
 * @create: 2023-11-05 20:11
 **/
public class OrderPizza1 {
	public OrderPizza1() {
		do {
			String type = getType();
			Pizza pizza = orderPizza(type);
			if (pizza == null) {
				break;
			}
		} while (true);
	}

	public Pizza orderPizza(String type) {
		Pizza pizza;
		switch (type.toLowerCase()) {
			case "greek": {
				pizza = new PepperPizza();
				pizza.setName("胡椒披萨");
			}
			break;
			case "chinese": {
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

	private String getType() {
		String type;
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("请输入您想要订购的披萨类型：");
		try {
			type = reader.readLine();
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
		return type;
	}
}
