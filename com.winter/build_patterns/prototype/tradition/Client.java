package build_patterns.prototype.tradition;

/**
 * @program: design-patterns
 * @description: 客户端调用服务
 * @author: Mr.Ye
 * @create: 2023-11-06 22:46
 **/
public class Client {
	public static void main(String[] args) {
		Sheep sheep = new Sheep("Tom", 18);

		Sheep sheep1 = new Sheep(sheep.getName(), sheep.getAge());
		Sheep sheep2 = new Sheep(sheep.getName(), sheep.getAge());
		Sheep sheep3 = new Sheep(sheep.getName(), sheep.getAge());
		Sheep sheep4 = new Sheep(sheep.getName(), sheep.getAge());
		Sheep sheep5 = new Sheep(sheep.getName(), sheep.getAge());

		System.out.println(sheep);
		System.out.println(sheep1);
		System.out.println(sheep2);
		System.out.println(sheep3);
		System.out.println(sheep4);
		System.out.println(sheep5);
	}
}
