public class SingletonPattern {
	private static SingletonPattern instance = null;

	private SingletonPattern() {}

	public static SingletonPattern getInstance() {
		return instance == null ?
				new SingletonPattern() : instance;
	}
}
