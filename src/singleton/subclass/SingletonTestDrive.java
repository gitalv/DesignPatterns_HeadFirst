package singleton.subclass;

//SUBCLASS DOES NOT WORK BECAUSE WE GET THE SAME INSTANCE

public class SingletonTestDrive {
	public static void main(String[] args) {
		Singleton foo = CoolerSingleton.getInstance();
		Singleton bar = HotterSingleton.getInstance();
		System.out.println(foo);
		System.out.println(bar); //bar is the same as foo
 	}
}
