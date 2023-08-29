# [Advanced OOP](https://github.com/HidayatRivai2020/kotlin/blob/main/src/main/kotlin/oop_special_class)

## [Companion Object](https://github.com/HidayatRivai2020/kotlin/blob/main/src/main/kotlin/oop_special_class/CompanionObject.kt)
- Object declaration inside a class
- Using keyword `companion object ObjectName`
- `ObjectName` is optional
- Can be accessed from the class name
- `ClassName.MethodInsideCompanion`

## [Abstract Class](https://github.com/HidayatRivai2020/kotlin/blob/main/src/main/kotlin/oop_special_class/AbstractClass.kt)
- Does not have implementation
- Using keyword `abstract`
- Can have abstract and non-abstract method
- `class NewClass : NewAbstractClass { }` : implement an abstract class
- All `abstract` class members need to be `override` when implemented
- `override fun interfaceMethod() { /** code here **/ }` : override an abstract method

## [Interface Class](https://github.com/HidayatRivai2020/kotlin/blob/main/src/main/kotlin/oop_special_class/InterfaceClass.kt)
- Can contain declarations of `abstract` methods, as well as method implementations
- Can have properties, but need to be declared in `abstract` or provide implementations for accessors
- `class NewClass : NewInterface { }` : implement an interface
- `override var variableName: dataType = newValue` : override abstract properties
- Can't store state

## [Generic Class](https://github.com/HidayatRivai2020/kotlin/blob/main/src/main/kotlin/oop_special_class/GenericeClass.kt)
- Class with dynamic data-type
- Using keyword `T`

## [Enum Class](https://github.com/HidayatRivai2020/kotlin/blob/main/src/main/kotlin/oop_special_class/GenericeClass.kt)
- Collection of information
- The value is static or fixed
- Using keyword `enum`
- `.name` : name of object
- `.ordinal` : number order of object
- `.declaringClass` : class name of object