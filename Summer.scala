import ChecksumAccumulator.calculate
object Summer extends App {
  for(arg <- args) {
    println(arg + ": " + calculate(arg))
  }
}

