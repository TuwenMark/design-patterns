package build_patterns.factory.factory_method;

import build_patterns.factory.factory_method.pizza.Pizza;

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
	private String location;

	private String type;

	public OrderPizza1() {
		do {
			getMessage();
			PizzaFactory pizzaFactory = PizzaFactory.getPizzaFactory(location);
			if (pizzaFactory == null) {
				break;
			}
			Pizza pizza = pizzaFactory.createPizza(type);
			if (pizza == null) {
				break;
			}
		} while (true);
	}

	private void getMessage() {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.print("请输入您所在的城市：");
			location = reader.readLine();
			System.out.print("请输入您想要订购的披萨类型：");
			type = reader.readLine();
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}
}
