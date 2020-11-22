PATTERNS
-------------
- Strategy
	To change a behavior.
	Defines a family of algorithms, encapsulates each one, and makes them interchangeable. Strategy lets the algorithm vary independently from clients that use it.
	Example: - Different types of ducks, everyone with a type of quack and a type of fly.
			 - Some game characters, everyone of them with a type of weapon.

- Decorator
	To add or remove a behavior.
	Attaches additional responsibilities to an object dynamically. Decorators provide a flexible alternative to subclassing for extending functionality.
	Example: Different types of coffes, in which you can add several condiments (milk, mocha, soil).

- Observer
	To notify observers about events.
	Defines a one-to-many dependency between objects so that when one object changes state, all of its dependents are notified and updated automatically.
	Example: Different displays that prints weather data. Every time the weather data changes, the displays are informed.
	Java has the Observable interface to define the observers.

- Simple Factory
	To create objects from a type.
- Factory Method
	Abstract method that concrete subclasses define to create an object, used in the parent class. Relies on inheritance.
	Defines an interface for creating an object, but lets subclasses decide which class to instantiate. Factory method lets a class defers instantiation to subclasses.
- Abstract Factory
	Interface for creating families of related objects. Relies on composition.
	Provides an interface for creating families of related or dependent objects without specifying their concrete classes.
	Example: Create a pizza. Then prepare, bake, cut and box the pizza.

- Singleton
	Ensures a class has only once instance, and provides a global point of access to it.
	Example: Thread pool, cache, objects for logging, ...

- Command
	Encapsulates a request as an object, thereby letting you parameterize other objects with different requests, queue or log requests, and support undoable operations.
	Example: Remote control with every button being configurable and assigned a command. 

-  Null object
	Useful when you don’t have a meaningful object to return, and yet you want to remove the responsibility for handling null from the client.

- Adapter
	Converts the interface of a class into another interface the clients expect.
	Adapter lets classes work together that couldn’t otherwise because of incompatible interfaces.


DESIGN PRINCIPLES
--------------------
- Identify the aspects of your application that vary and separate them from what stays the same.
- Program to an interface, not an implementation.
- Favor composition over inheritance.
- Strive for loosely coupled designs between objects that interact.
- Classes should be open for extension, but closed for modification.
- Dependency inversion principle: Depend upon abstractions. Do not depend upon concrete classes.
