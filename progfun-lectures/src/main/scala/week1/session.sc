def sqrt(x: Double): Double = {
  def sqrtIter(guess: Double): Double =
    if (isGoodEnough(guess)) guess
    else sqrtIter(improve(guess))

  def isGoodEnough(guess: Double): Boolean =
    Math.abs(guess * guess - x) / x < 0.001

  def improve(guess: Double): Double =
    (guess + x / guess) / 2

  sqrtIter(1.0)
}

sqrt(2)
sqrt(4)
sqrt(1e60)
sqrt(1e-6)
sqrt(1e-4)
