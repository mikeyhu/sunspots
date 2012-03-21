import scala.math._

class Grid(size : Int, array : Array[Array[Int]]) {
    
  val results = for {
    x <- 0 until size
    y <- 0 until size
  } yield PositionScore(x,y,scoreAt(x,y))
  
  def scoreAt(selectedX:Int, selectedY:Int) : Int= {
    val scores = for {
      x <- math.max(0,selectedX-1) until math.min(size,selectedX+2)
      y <- math.max(0,selectedY-1) until math.min(size,selectedY+2)
    } yield array(y)(x)
    scores.sum
  }

  def topScores(amount:Int) = {
    results.sortBy(_.score)(scala.math.Ordering[Int]).reverse.take(amount)
  }
}

object Grid {
  def apply(data : IndexedSeq[Int]) = {
    val size = data.head
    val rowData = data.tail
    val rows = for {
      rowNum <- 0 until size
    } yield rowData.slice(rowNum * size, (rowNum+1) * size).toArray
    
    new Grid(size,rows.toArray)
  }
}

case class PositionScore(x:Int, y:Int, score:Int)
{
  override def toString = "(%d,%d score:%d)".format(x,y,score)
}
