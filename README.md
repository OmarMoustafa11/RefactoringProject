# RefactoringProject
SINGLETON
Singleton is a creational design pattern that lets you ensure that a class has only one instance, while providing a global access point to this instance.
The Singleton pattern solves two problems at the same time, violating the Single Responsibility Principle:

PROTOTYPE
Prototype is a creational design pattern that lets you copy existing objects without making your code dependent on their classes.
Say you have an object, and you want to create an exact copy of it. How would you do it? First, you have to create a new object of the same class. Then you have to go through all the fields of the original object and copy their values over to the new object.

FACTORY
Factory Method is a creational design pattern that provides an interface for creating objects in a superclass, but allows subclasses to alter the type of objects that will be created.
Imagine that you’re creating a logistics management application. The first version of your app can only handle transportation by trucks, so the bulk of your code lives inside the Truck class.

ABSTRACT FACTORY
Abstract Factory is a creational design pattern that lets you produce families of related objects without specifying their concrete classes.
Imagine that you’re creating a furniture shop simulator. Your code consists of classes that represent:

A family of related products, say: Chair + Sofa + CoffeeTable.

Several variants of this family. For example, products Chair + Sofa + CoffeeTable are available in these variants: Modern, Victorian, ArtDeco.

ADAPTER
Adapter is a structural design pattern that allows objects with incompatible interfaces to collaborate.
Imagine that you’re creating a stock market monitoring app. The app downloads the stock data from multiple sources in XML format and then displays nice-looking charts and diagrams for the user.

At some point, you decide to improve the app by integrating a smart 3rd-party analytics library. But there’s a catch: the analytics library only works with data in JSON format.

COMPOSITE
Composite is a structural design pattern that lets you compose objects into tree structures and then work with these structures as if they were individual objects.
Using the Composite pattern makes sense only when the core model of your app can be represented as a tree.

For example, imagine that you have two types of objects: Products and Boxes. A Box can contain several Products as well as a number of smaller Boxes. These little Boxes can also hold some Products or even smaller Boxes, and so on.

DECORATOR
Decorator is a structural design pattern that lets you attach new behaviors to objects by placing these objects inside special wrapper objects that contain the behaviors.

Wearing clothes is an example of using decorators. When you’re cold, you wrap yourself in a sweater. If you’re still cold with a sweater, you can wear a jacket on top. If it’s raining, you can put on a raincoat. All of these garments “extend” your basic behavior but aren’t part of you, and you can easily take off any piece of clothing whenever you don’t need it.


FACADE
Facade is a structural design pattern that provides a simplified interface to a library, a framework, or any other complex set of classes.
Imagine that you must make your code work with a broad set of objects that belong to a sophisticated library or framework. Ordinarily, you’d need to initialize all of those objects, keep track of dependencies, execute methods in the correct order, and so on.



PROXY
Proxy is a structural design pattern that lets you provide a substitute or placeholder for another object. A proxy controls access to the original object, allowing you to perform something either before or after the request gets through to the original object.
Why would you want to control access to an object? Here is an example: you have a massive object that consumes a vast amount of system resources. You need it from time to time, but not always.

