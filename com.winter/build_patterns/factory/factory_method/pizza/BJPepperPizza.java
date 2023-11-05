package build_patterns.factory.factory_method.pizza;

/**
 * @program: design-patterns
 * @description: 希腊披萨实体
 * @author: Mr.Ye
 * @create: 2023-11-05 20:05
 **/
public class BJPepperPizza extends Pizza {
	@Override
	public void prepare() {
		System.out.println("准备北京胡椒披萨原材料。。。");
	}

	@Override
	public void bake() {
		System.out.println("烘焙北京胡椒披萨。。。");
	}
}
