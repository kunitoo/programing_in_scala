class Rational(n: Int, d: Int) {
  require(d != 0)
  val numer: Int = n
  val denom: Int = d
  override def toString = n + "/" + d
  def add(that: Rational): Rational =
    new Rational(
      numer * that.denom + that.numer * denom,
      denom * that.denom
    )
  def lessThen(that: Rational) =
    this.numer * that.denom < that.numer * this.denom
  def max(that: Rational) =
    if (this.lessThen(that)) that else this
}
