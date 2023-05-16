1
"hello"
true

1 + 2
"Hello," ++ " World"

42.+(1)
"Hello".size

1.to(10)

assert(42 == 42)

val x: Int = 42
x

val b: Int = 4
b * x / 2

val xs: List[Int] = List(1, 2, 3)

import scala.collection.mutable.ListBuffer
val ys: ListBuffer[Int] = ListBuffer(1, 2, 3)
ys.length
ys.append(4)
ys.length

def identity(x: Int): Int = x
val w: Int = 2
assert(identity(w) == w)

def sum(a: Int, b: Int): Int = a + b
sum(1, 2)
assert(sum(1, 2) == 3)

def sumWithDefault(a: Int = 0, b: Int = 0): Int = a + b

def sumOf(x: Int, y: Int, f: Int => Int): Int = f(x) + f(y)

sumOf(1,2, identity)