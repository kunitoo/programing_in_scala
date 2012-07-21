class Rational(n: Int, d: Int) {
  require(d != 0)
  private val g = gcd(n.abs, d.abs)
  val numer: Int = n / g
  val denom: Int = d / g
  def this(n: Int) = this(n, 1) // auxiliary constructor
  override def toString = numer + "/" + denom
  def add(that: Rational): Rational =
    new Rational(
      numer * that.denom + that.numer * denom,
      denom * that.denom
    )
  private def gcd(a: Int, b: Int): Int =
    if (b == 0) a else gcd(b, a % b)
  def lessThen(that: Rational) =
    this.numer * that.denom < that.numer * this.denom
  def max(that: Rational) =
    if (this.lessThen(that)) that else this
}
