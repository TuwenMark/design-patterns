package build_patterns.singleton;

/**
 * @program: design-patterns
 * @description: 饿汉式单例模式示例代码（推荐）
 * @author: Mr.Ye
 * @create: 2023-11-04 22:49
 **/
public class HungrySingleton {
	public static void main(String[] args) {
		Runnable task = new Runnable() {
			@Override
			public void run() {
				HungrySingleton instance = getInstance();
				System.out.println(instance.hashCode());
			}
		};
		Thread thread1 = new Thread(task);
		Thread thread2 = new Thread(task);
		thread1.start();
		thread2.start();
	}

	/**
	 * 类加载的时候实例化：可以应对并发，但可能会浪费内存，如果确定一开始就会用到，可以采用此方法
	 */
	// 方法一：静态常量
	// private static final HungrySingleton instance = new HungrySingleton();

	// 方法二：静态代码块
	private static final HungrySingleton instance;
	static {
		instance = new HungrySingleton();
	}

	/**
	 * 私有构造器
	 */
	private HungrySingleton(){}

	/**
	 * 暴露获取实例的方法
	 *
	 * @return	实例对象
	 */
	public static HungrySingleton getInstance() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			throw new RuntimeException(e);
		}
		return instance;
	}

}
