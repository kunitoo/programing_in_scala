def printArgs(args: Array[String]): Unit = {
  var i = 0
  while (i < args.length) {
    println(args(i))
    i += 1
  }
}

def printArgsfun(args: Array[String]): Unit = {
  for (arg <- args) {
    println(arg)
  }
}

def printArgsFunction(args: Array[String]): Unit = {
  args.foreach(println)
}

def formatArgs(args: Array[String]) = args.mkString("\n")

val args = Array("zero", "one", "two")
println(formatArgs(args))
