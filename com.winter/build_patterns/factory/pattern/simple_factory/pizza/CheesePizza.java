package build_patterns.factory.pattern.simple_factory.pizza;

/**
 * @program: design-patterns
 * @description: 中国披萨
 * @author: Mr.Ye
 * @create: 2023-11-05 20:07
 **/
public class CheesePizza extends Pizza {
	@Override
	public void prepare() {
		System.out.println("准备奶酪披萨原材料。。。");
	}

	@Override
	public void bake() {
		System.out.println("烘焙奶酪披萨。。。");
	}
}
