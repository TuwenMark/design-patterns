package build_patterns.singleton;

/**
 * @program: design-patterns
 * @description: 懒汉式单例模式示例代码（不推荐）
 * @author: Mr.Ye
 * @create: 2023-11-04 22:49
 **/
public class LazySingleton {
	public static void main(String[] args) {
		Runnable task = new Runnable() {
			@Override
			public void run() {
				LazySingleton instance = getInstance();
				System.out.println(instance.hashCode());
			}
		};
		Thread thread1 = new Thread(task);
		Thread thread2 = new Thread(task);
		thread1.start();
		thread2.start();
	}

	private static LazySingleton instance;

	/**
	 * 私有构造器
	 */
	private LazySingleton(){}

	/**
	 * 方法一：直接判断instance，无法应对并发。
	 *
	 * @return	实例对象
	 */
	// public static LazySingleton getInstance() {
	// 	if (instance == null) {
	// 		try {
	// 			Thread.sleep(1000);
	// 		} catch (InterruptedException e) {
	// 			throw new RuntimeException(e);
	// 		}
	// 		instance = new LazySingleton();
	// 	}
	// 	return instance;
	// }

	/**
	 * 方法二：同步方法，可以应对并发，但每次获取对象都要上锁，效率低
	 *
	 * @return
	 */
	// public synchronized static LazySingleton getInstance() {
	// 	if (instance == null) {
	// 		try {
	// 			Thread.sleep(1000);
	// 		} catch (InterruptedException e) {
	// 			throw new RuntimeException(e);
	// 		}
	// 		instance = new LazySingleton();
	// 	}
	// 	return instance;
	// }

	/**
	 * 方法三：同步代码块。无法应对并发，因为线程已经走进if语句，无非是等上一个线程创建完实例后，新的线程再创建
	 *
	 * @return
	 */
	public static LazySingleton getInstance() {
		if (instance == null) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				throw new RuntimeException(e);
			}
			synchronized (LazySingleton.class) {
				instance = new LazySingleton();
			}
		}
		return instance;
	}
}
