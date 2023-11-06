package build_patterns.prototype.pattern;

import java.io.Serializable;

/**
 * @program: design-patterns
 * @description: Sheep朋友类
 * @author: Mr.Ye
 * @create: 2023-11-06 23:28
 **/
public class Friend implements Serializable, Cloneable {
	private static final long serialVersionUID = 1382605754149395273L;

	private String name;

	private int age;

	public Friend(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
