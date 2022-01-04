## Can use java libs too for user input  

```java

import java.util.scanner

fun main(args: Array<String>){
	var input = Scanner(System.`in`)

	var temp = input.nextDouble() // or nextInt etc

  var str = input.next().single() // to get one char

}

```

### Arrays are pretty cool  

```java

...main func

var temp = Array(10) {i -> i} 	//{means increment of 1}

					 {i -> i*2}

or 

var temp = arrayOf(3,5,"Ben","Multiple types are supported")

```

arrayOf supports multiple types but it cant be an empty array to get empty array use 

```java

var temp = emptyArray<Int>()

```

To access indices use 

temp.get(position here) or temp.set(position, value) to change

```java array inbuilt funcs
To know size of array => temp.size()

To get distinct elements from an array => temp.distinct()

Min and Max vals => temp.min() || temp.max()

Average val => temp.average()

Reverse => temp.reverse()

Sort => temp.sort()

```

When conditions are like switch case

```java

val age = 24

when (age)

1..20 -> println("Uwuw")
20..40 -> println("")
else ->

```
else is important, another way is to store answer in var

```java

val num = 2

  val res = when(num) {
    1 -> "Value is 1"
    2 -> "Value is 2"
    3 -> "Value is 3"
    else -> "Unknown"
  }

  println("$res")

```