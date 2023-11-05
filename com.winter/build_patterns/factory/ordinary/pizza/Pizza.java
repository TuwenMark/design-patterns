package build_patterns.factory.ordinary.pizza;

/**
 * @program: design-patterns
 * @description: Pizza抽象类
 * @author: Mr.Ye
 * @create: 2023-11-05 16:16
 **/
public abstract class Pizza {
	private String name;

	public void setName(String name) {
		this.name = name;
	}

	public abstract void prepare();

	public abstract void bake();

	public void cut() {
		System.out.println("切块" + name + "。。。");
	};

	public void box() {
		System.out.println("打包" + name + "。。。");
	};
}
