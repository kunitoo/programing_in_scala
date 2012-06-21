import scala.io.Source
val args = Array("chapter2.scala")
if (args.length > 0) {
  for(line <- Source.fromFile(args(0)).getLines()) {
    println(line.length + " " + line)
  }
} else {
  Console.err.println("Please enter filename")
}