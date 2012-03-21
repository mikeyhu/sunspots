object SunSpotChecker {

  def analyse(input : String) : String = {
    val data = input.split(' ').toIndexedSeq[String].map(Integer.parseInt(_))
    val resultCount = data.head
    val grid = Grid(data.tail)
    grid.topScores(resultCount).mkString
  }
}