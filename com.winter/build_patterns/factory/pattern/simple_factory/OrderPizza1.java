package build_patterns.factory.pattern.simple_factory;

import build_patterns.factory.pattern.simple_factory.pizza.Pizza;

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
			Pizza pizza = SimpleFactory.createPizza(type);
			if (pizza == null) {
				break;
			}
		} while (true);
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
