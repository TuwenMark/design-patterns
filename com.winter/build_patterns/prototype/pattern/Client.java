package build_patterns.prototype.pattern;

/**
 * @program: design-patterns
 * @description: 调用服务客户端
 * @author: Mr.Ye
 * @create: 2023-11-06 22:59
 **/
public class Client {
	public static void main(String[] args) {
		// Sheep sheep = new Sheep("Tom", 10);
		Friend friend = new Friend("Rose", 20);
		Sheep sheep = new Sheep("Tom", 10, friend);
		// Sheep sheep1 = (Sheep) sheep.clone();
		// Sheep sheep2 = (Sheep) sheep.clone();
		// Sheep sheep3 = (Sheep) sheep.clone();
		// Sheep sheep4 = (Sheep) sheep.clone();
		// Sheep sheep5 = (Sheep) sheep.clone();

		Sheep sheep1 = (Sheep) sheep.deepClone();
		Sheep sheep2 = (Sheep) sheep.deepClone();
		Sheep sheep3 = (Sheep) sheep.deepClone();
		Sheep sheep4 = (Sheep) sheep.deepClone();
		Sheep sheep5 = (Sheep) sheep.deepClone();

		System.out.println(sheep + ", sheep属性的hashcode = " + sheep.getFriend().hashCode());
		System.out.println(sheep1 + ", sheep1属性的hashcode = " + sheep1.getFriend().hashCode());
		System.out.println(sheep2 + ", sheep2属性的hashcode = " + sheep2.getFriend().hashCode());
		System.out.println(sheep3 + ", sheep3属性的hashcode = " + sheep3.getFriend().hashCode());
		System.out.println(sheep4 + ", sheep4属性的hashcode = " + sheep4.getFriend().hashCode());
		System.out.println(sheep5 + ", sheep5属性的hashcode = " + sheep5.getFriend().hashCode());
	}
}
