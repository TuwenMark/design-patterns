package build_patterns.prototype.tradition;

import java.util.Objects;

/**
 * @program: design-patterns
 * @description: 克隆羊
 * @author: Mr.Ye
 * @create: 2023-11-06 22:44
 **/
public class Sheep {
	private String name;
	private int age;

	public Sheep(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Sheep sheep = (Sheep) o;
		return age == sheep.age && Objects.equals(name, sheep.name);
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, age);
	}

	@Override
	public String toString() {
		return "Sheep{" +
				"name='" + name + '\'' +
				", age=" + age +
				'}';
	}
}
