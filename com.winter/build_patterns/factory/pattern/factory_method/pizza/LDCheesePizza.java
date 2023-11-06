package build_patterns.factory.pattern.factory_method.pizza;

/**
 * @program: design-patterns
 * @description: 中国披萨
 * @author: Mr.Ye
 * @create: 2023-11-05 20:07
 **/
public class LDCheesePizza extends Pizza {
	@Override
	public void prepare() {
		System.out.println("准备伦敦奶酪披萨原材料。。。");
	}

	@Override
	public void bake() {
		System.out.println("烘焙伦敦奶酪披萨。。。");
	}
}
