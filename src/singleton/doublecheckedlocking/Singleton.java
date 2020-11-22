package singleton.doublecheckedlocking;

//
//Danger!  This implementation of Singleton not
//guaranteed to work prior to Java 5
//

public class Singleton {
	private volatile static Singleton uniqueInstance;

	private Singleton() {}

	public static Singleton getInstance() {
		if (uniqueInstance == null) {
			synchronized (Singleton.class) {
				if (uniqueInstance == null) {
					uniqueInstance = new Singleton();
				}
			}
		}
		return uniqueInstance;
	}
	
	// other useful methods here
	public String getDescription() {
		return "I'm a double checked locking initialized Singleton!";
	}
}
