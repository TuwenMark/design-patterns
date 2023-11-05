package build_patterns.singleton;

/**
 * @program: design-patterns
 * @description: 枚举单例模式：枚举天然每种类型只有一个实例，可以应对多线程，懒加载，效率较高（极力推荐）
 * @author: Mr.Ye
 * @create: 2023-11-04 23:39
 **/
public class EnumSingleton {
	public static void main(String[] args) {
		Runnable task = new Runnable() {
			@Override
			public void run() {
				SingleInstance instance = SingleInstance.INSTANCE;
				System.out.println(instance.hashCode());
			}
		};
		Thread thread1 = new Thread(task);
		Thread thread2 = new Thread(task);
		thread1.start();
		thread2.start();
	}

	enum SingleInstance {
		INSTANCE;
	}
}
