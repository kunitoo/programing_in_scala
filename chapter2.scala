def printArgs(args: Array[String]): Unit = {
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
