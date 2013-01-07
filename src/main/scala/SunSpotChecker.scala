object SunSpotChecker {

  def analyse(input : String) : String = {
    val data = input.split(' ').toIndexedSeq[String].map(a =>a.trim).map(Integer.parseInt(_))
    val resultCount = data.head
    val grid = Grid(data.tail)
    grid.topScores(resultCount).mkString
  }

  def main(args: Array[String]) {
    val input = io.Source.fromFile(args.head).mkString
    time { println(analyse(input)) }
  }

  def time[A](f: => A) = {
    val start = System.nanoTime
    val ret = f
    println("Time taken: " + ((System.nanoTime-start)/1e6) + "ms")
    ret
  }
}