package build_patterns.singleton;

/**
 * @program: design-patterns
 * @description: 静态内部类单例模式：可以应对并发，外层类加载的时候，静态内部类不会被加载，且类加载机制是线程安全的。（推荐）
 * @author: Mr.Ye
 * @create: 2023-11-04 23:28
 **/
public class StaticInnerClass {
	public static void main(String[] args) {
		Runnable task = new Runnable() {
			@Override
			public void run() {
				StaticInnerClass instance = getInstance();
				System.out.println(instance.hashCode());
			}
		};
		Thread thread1 = new Thread(task);
		Thread thread2 = new Thread(task);
		thread1.start();
		thread2.start();
	}

	/**
	 * 私有构造器
	 */
	private StaticInnerClass() {
	}

	/**
	 * 静态内部类
	 */
	static class SingletonInstance {
		private static StaticInnerClass instance = new StaticInnerClass();
	}

	public static StaticInnerClass getInstance() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			throw new RuntimeException(e);
		}
		return SingletonInstance.instance;
	}
}
