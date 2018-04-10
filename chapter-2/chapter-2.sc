//Enable WorkSheet Mode In Scastie

//Expressions
1 + 2

// Immutable Variable Val Declarations
val numAdd = 1 + 2
numAdd * 9
//numAdd = 3 throws reassignment to val

//Mutable Variable Var Declarations
var numMutable = numAdd
numMutable = numMutable + 1

//String In Scala
val msg = "Hello, world!"
msg

// Defining New Functions:
def max(x: Int, y: Int): Int = {
  if (x > y) x
  else y
}

// Calling New Functions
max(5, 6)


// For Println Output Please Watch The Console.

// First Approach To Iterate Through Array (Imperative Way)
val firstArray = Array(1, 2, 3)
var i = 0
while (i < firstArray.length) {
  println(firstArray(i))
  i += 1
}

// Second Approach To Iterate Through Array (Functional Way)
val secondArray = Array(1, 2, 3)
secondArray.foreach(element => println(element))

// Range Based Kind Of A Loop
val thirdArray = Array(1, 2, 3)
for (ele <- thirdArray)
  println(ele)
