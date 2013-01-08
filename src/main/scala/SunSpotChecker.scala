object SunSpotChecker {

  def analyse(input : String) : String = {
    analyse(input.split(' ').toIndexedSeq[String].map(a =>a.trim).map(Integer.parseInt(_)))
  }

  def analyse(data : IndexedSeq[Int]) : String = {
    val resultCount = data.head
    val grid = Grid(data.tail)
    grid.topScores(resultCount).mkString
  }

  def main(args: Array[String]) {
    val ir = IntegerReader(args.head).toIndexedSeq
    time { println(analyse(ir)) }
  }

  def time[A](f: => A) = {
    val start = System.nanoTime
    val ret = f
    println("Time taken: " + ((System.nanoTime-start)/1e6) + "ms")
    ret
  }
}