package build_patterns.prototype.pattern;

import java.io.*;
import java.util.Objects;

/**
 * @program: design-patterns
 * @description: 克隆羊
 * @author: Mr.Ye
 * @create: 2023-11-06 22:44
 **/
public class Sheep implements Serializable, Cloneable{
	private static final long serialVersionUID = -4292363940838363615L;
	private String name;
	private int age;

	private Friend friend;

	public Sheep(String name, int age, Friend friend) {
		this.name = name;
		this.age = age;
		this.friend = friend;
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

	public Friend getFriend() {
		return friend;
	}

	public void setFriend(Friend friend) {
		this.friend = friend;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Sheep sheep = (Sheep) o;
		return age == sheep.age && Objects.equals(name, sheep.name) && Objects.equals(friend, sheep.friend);
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, age, friend);
	}

	@Override
	public String toString() {
		return "Sheep{" +
				"name='" + name + '\'' +
				", age=" + age +
				", friend=" + friend +
				'}';
	}

	/**
	 * 默认实现的浅拷贝
	 * 
	 * @return	当前的克隆对象
	 */
	// @Override
	// protected Object clone() {
	// 	Object sheep = null;
	// 	try {
	// 		sheep = super.clone();
	// 	} catch (CloneNotSupportedException e) {
	// 		throw new RuntimeException(e);
	// 	}
	// 	return sheep;
	// }

	/**
	 * 方法一：通过clone方法完成深拷贝
	 *
	 * @return 拷贝的对象
	 */
	@Override
	protected Object clone(){
		Sheep sheep = null;
			try {
				sheep = (Sheep) super.clone();
				if (friend != null) {
					friend = (Friend) friend.clone();
				}
			} catch (CloneNotSupportedException e) {
				throw new RuntimeException(e);
			}
			return sheep;
	}

	/**
	 * 方法二：通过序列化和反序列化完成深拷贝（我觉得使用Gson进行JSON序列化和反序列化也可以）
	 *
	 * @return	拷贝的对象
	 */
	protected Sheep deepClone() {
		ByteArrayOutputStream bos = null;
		ObjectOutputStream oos = null;
		ObjectInputStream ois = null;
		try {
			// 序列化
			bos = new ByteArrayOutputStream();
			oos = new ObjectOutputStream(bos);
			oos.writeObject(this);
			// 反序列化
			ois = new ObjectInputStream(new ByteArrayInputStream(bos.toByteArray()));
			Sheep  sheep = (Sheep) ois.readObject();
			return sheep;
		} catch (IOException e) {
			throw new RuntimeException(e);
		} catch (ClassNotFoundException e) {
			throw new RuntimeException(e);
		} finally {
			// 关闭流
			try {
				bos.close();
				oos.close();
				ois.close();
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
		}
	}
}
