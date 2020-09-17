package com.library.training

class CartesianProduct {

  def cartesianProduct[T](in: Seq[Seq[T]]): Seq[Seq[T]] = {
    @scala.annotation.tailrec
    def loop(acc: Seq[Seq[T]], rest: Seq[Seq[T]]): Seq[Seq[T]] = {
      rest match {
        case Nil => acc
        case seq :: remainingSeqs =>
          // Equivalent of:
          // val next = seq.flatMap(i => acc.map(a => i+: a))
          val next = for {
            i <- seq
            a <- acc
          } yield i +: a
          loop(next, remainingSeqs)
      }
    }
    loop(Seq(Nil), in.reverse)
  }
}
