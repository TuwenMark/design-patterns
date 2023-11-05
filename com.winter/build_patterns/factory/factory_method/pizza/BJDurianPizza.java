package build_patterns.factory.factory_method.pizza;

/**
 * @program: design-patterns
 * @description: 榴莲披萨
 * @author: Mr.Ye
 * @create: 2023-11-05 20:07
 **/
public class BJDurianPizza extends Pizza {
	@Override
	public void prepare() {
		System.out.println("准备北京榴莲披萨原材料。。。");
	}

	@Override
	public void bake() {
		System.out.println("烘焙北京榴莲披萨。。。");
	}
}
