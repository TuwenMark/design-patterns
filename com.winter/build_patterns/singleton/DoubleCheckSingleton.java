package build_patterns.singleton;

/**
 * @program: design-patterns
 * @description: 双检锁单例模式：可以应对并发，且只有第一次创建实例会进锁，后面直接返回对象，效率较高（推荐）
 * @author: Mr.Ye
 * @create: 2023-11-04 23:28
 **/
public class DoubleCheckSingleton {
	public static void main(String[] args) {
		Runnable task = new Runnable() {
			@Override
			public void run() {
				DoubleCheckSingleton instance = getInstance();
				System.out.println(instance.hashCode());
			}
		};
		Thread thread1 = new Thread(task);
		Thread thread2 = new Thread(task);
		thread1.start();
		thread2.start();
	}

	private static DoubleCheckSingleton instance;

	/**
	 * 私有构造器
	 */
	private DoubleCheckSingleton(){}

	public static DoubleCheckSingleton getInstance() {
		if (instance == null) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				throw new RuntimeException(e);
			}
			synchronized (LazySingleton.class) {
				if (instance == null) {
					instance = new DoubleCheckSingleton();
				}
			}
		}
		return instance;
	}

}
