# [Basic OOP](https://github.com/HidayatRivai2020/kotlin/blob/main/src/main/kotlin/oop_normal_class)
- Basic Concept of Object-Oriented Programming
- `Class` : template for the objects
- `Object` : instance of the class
- `method` : the function inside of class
- `property` : the variable inside class and outside the method

## [Function](https://github.com/HidayatRivai2020/kotlin/blob/main/src/main/kotlin/operation/function.kt)
- block of code which only runs when it is called
- `fun functionName() { /** block of codes **/ }` : function without parameter and return (void)
- `fun functionName(param1: Data-Type, param2: Data-Type) { /** block of codes **/ }` : function with params
- `fun functionName(param: Data-Type): Data-Type { return param }` : function with param and return
- `fun functionName() = value` : inline function
- `functionName()` : calling the function without param (void)
- `functionName(param1, param2)` : calling the function with params
- `var varName = functionName(param1)` : calling the function with `return` and store it in variable

## [Variable Scopes](https://github.com/HidayatRivai2020/kotlin/blob/main/src/main/kotlin/operation/VariableScopes.kt)
- Global Variable : declared outside the method, can be accessed from the whole file
- Local Variable : declared inside the method, only can be  accessed from that method

## [Class](https://github.com/HidayatRivai2020/kotlin/blob/main/src/main/kotlin/operation/Classes.kt)
- The blueprint of the `object`
- Using keyword `class`
- Classes can have `properties`
- Classes can have `method`
- 1 Class can make multiple `objects`
- `var variableName = ClassName()` : create a new object
- `var variableName = ClassName(param1, param2)` : create a new object with constructor

### [Property](https://github.com/HidayatRivai2020/kotlin/blob/main/src/main/kotlin/operation/ClassProperties.kt)
- The variable that declared inside a class but outside the method
- The member variables of a class
- Can be accessed by `objectName.property`
- The default access modifier of property is `public`
- Use keyword `this` to access the member from the class itself

### [Method](https://github.com/HidayatRivai2020/kotlin/blob/main/src/main/kotlin/operation/ClassMethod.kt)
- The function that declared inside a class
- the default access modifier of property is `public`
- can be called by `objectName.methodName()`

### [Access Modifier](https://github.com/HidayatRivai2020/kotlin/blob/main/src/main/kotlin/operation/AcessModifier.kt)
- the default value of access modifier is `public`
- `public`
    - keyword for public modifier,
    - Not necessary to add this modifier, because it will show redundant modifier message.
    - can be accessed outside the class itself
- `protected`
    - keyword for protected modifier
    - can be accessed from the class itself or the inherited class
- `private`
    - keyword for private modifier
    - can be accessed only from the class itself
- Use keyword `this.` to access member from the class itself
- Use keyword `super.` to access member from the parent class

### [Constructor](https://github.com/HidayatRivai2020/kotlin/blob/main/src/main/kotlin/operation/ClassConstructor.kt)
- The method or function to construct or initialize the class
- Primary constructor : 
  - Declared in the class header
  - Goes after the class name
  - Using parenthesis after class name
  - Can have optional parameter inside parenthesis
  - Can Use keyword `init` to execute the command when object creation
- Secondary constructor :
  - Declared inside the class
  - Use keyword `constructor(param1: data-type, param2: data-type) { }`
  - Parameter is optional
  - The command inside curly brackets will be executed when object creation
  - If there is primary constructor, secondary need to use `: this(param1)`
  - The number of parameter inside this is equals with parameter in the primary constructor
  - with `this()` keyword, it will execute the `init` first then execute the block of code inside secondary constructor

## [Class Inheritance](https://github.com/HidayatRivai2020/kotlin/blob/main/src/main/kotlin/operation/ClassInheritance.kt)
- Class can inherit method and property from another class
- Class can not inherit the `private` method or property
- `subclass (child)` : the class that inherit from another class
- `superclass (parent)` : the class being inherited from
- `class MyChildClass: MyParentClass() { }` : inherit the child class from parent class
- Parent class need to use keyword `open`
- Use keyword `this(param1)` if secondary need to run the primary from itself first
- Use keyword `super(param1)` if secondary need to run the primary from parent class first (kotlin will recommend it to become primary)
- The order : primary -> `init` from itself, `constructor` from itself

## [Overloading Constructor](https://github.com/HidayatRivai2020/kotlin/blob/main/src/main/kotlin/operation/OverloadingConstructor.kt)
- Creating another secondary constructor in a class
- Need to use different numbers of parameter inside the constructor
- Create object with the same number of parameter to call the correct constructor

## [Class Extension](https://github.com/HidayatRivai2020/kotlin/blob/main/src/main/kotlin/operation/ClassExtension.kt)
- Extend a class with new functionality without having to inherit from the class
  - Extension Function : extend a new method
  - Extension Properties : extend a new property
- Extension Function --> `fun receiverType.newFunction(param1: Data-Type): Return-Type { /** new logic **/ }` :
  - `fun` : function keyword
  - `receiverType` : the type being extended
  - `newFunction` : new function that will be added into receiver
  - `param1`: optional parameter
  - `Data-Type` : data type of parameter
  - `Return-Type` : optional return variable data type
  - `{ /** new logic **/ }` = the implementation of new function
- Extension Properties --> `val receiverType.newProperty: Data-type get() = "new values"`
  - `val` : immutable variable keyword
  - `receiverType` : the type being extended
  - `newProperty` : new property that will be added into receiver
  - `get()` : the keyword to get the value
  - `new values` : the new values
- Extend a class can be set by inline method.

## [Nested Class](https://github.com/HidayatRivai2020/kotlin/blob/main/src/main/kotlin/operation/NestedClass.kt)
- Create a class inside a class
- Can be accessed by `OuterClass().NestedClass()`
- Nested class can't access the member of the Outer Class

## [Inner Class](https://github.com/HidayatRivai2020/kotlin/blob/main/src/main/kotlin/operation/InnerClass.kt)
- Create a class inside a class
- The Inner Class need to use keyword `inner`
- Can be accessed by `OuterClass().InnerClass()`
- Inner class can access the member of the Outer Class