import org.scalatest.Spec
import org.scalatest.matchers.ShouldMatchers

class GridTests extends Spec with ShouldMatchers  {

  describe("A Grid") {
    it("should be creatable from a list of ints") {
      val grid = Grid(Seq(2,1,1,1,1).toIndexedSeq)
      grid.scoreAt(0,0) should be(4)
    }
    
    it("should be creatable from a bigger list of ints") {
      val grid = Grid(Seq(3,1,1,1,2,2,2,3,3,3).toIndexedSeq)
      grid.topScores(1).mkString should be("(1,1 score:18)")
    }
  }
  
}
