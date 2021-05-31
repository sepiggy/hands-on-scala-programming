//region 3.1.1 Primitives
/*
println(1 + 2 * 3)
println((1 + 2) * 3)
*/
// endregion

//region 3.1.2 Strings
/*
println("hello world")
println("hello world".substring(0, 5))
println("hello world".substring(5, 10))
println("hello" + 1 + " " + "world" + 2)
*/
//endregion

//region 3.1.3 Local Values and Variables
/*
val (x, y) = (1, 2)
println(s"Hello $x World $y")
println(s"Hello ${x + y} World ${x - y}")
*/
//endregion

//region 3.1.4 Tuples
/*
val t = (1, true, "hello")
println(t._1, t._2, t._3)

val t1 = (1, true, "hello", 'c', 0.2, 0.5f, 12345678912345L)
println(t1._5)
*/
//endregion

//region 3.1.5 Arrays
/*
val a = Array[Int](1, 2, 3, 4)
println(a(0))
println(a(3))
val a2 = Array[String]("one", "two", "three", "four")
println(a2(1))

val multi = Array(Array(1, 2), Array(3, 4))
println(multi(0)(1))
*/
//endregion

//region 3.1.6 Options
/*
def hello(title: String, firstName: String, lastNameOpt: Option[String]) = {
  lastNameOpt match {
    case Some(lastName) => println(s"Hello $title. $lastName")
    case None => println(s"Hello $firstName")
  }
}

hello("Mr", "Haoyi", None)
hello("Mr","Haoyi", Some("Li"))

println(Some("Li").getOrElse("<unknown>"))
println(Some(null).getOrElse("<unknown>"))
println(None.getOrElse("<unknown>"))
*/
//endregion

//region 3.1.6 Options are very similar to a collection whose size is 0 or 1.
/*
def hello2(name: Option[String]) = {
  for (s <- name) println(s"Hello $s")
}

hello2(None)
hello2(Some("sepiggy"))

def nameLength(name: Option[String]) = {
  name.map(_.length).getOrElse(-1)
}
println(nameLength(Some("sepiggy")))
println(nameLength(None))
*/
//endregion

//region 3.2.1 For-Loops
/*
var total = 0
val items = Array(1, 10, 100, 1000)
for (item <- items) total += item
println(total)

total = 0
for (i <- Range(0,5)) {
  println("Looping " + i)
  total = total + i
}
println(total)
*/
//endregion

//region 3.2.1 You can loop over nested Arrays by placing multiple <-s in the header of the loop
/*
val multi = Array(Array(1, 2, 3), Array(4, 5, 6))
for (arr <- multi; i <- arr) println(i)
*/
//endregion

//region 3.2.1 Loops can have guards using an if syntax
/*
val multi = Array(Array(1, 2, 3), Array(4, 5, 6))
for (arr <- multi; i <- arr; if i % 2 == 0) println(i)
*/
//endregion

//region 3.2.2 If-else
// One thing to note is that in Scala if-else can also be used as an expression, similar to the a ? b : c ternary expressions in other languages
/*
var total = 0
for (i <- Range(0, 10)) {
  total += (if (i % 2 == 0) i else 2)
}
println(total)
*/
//endregion




