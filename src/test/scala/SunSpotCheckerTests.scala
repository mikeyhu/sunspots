import org.scalatest.Spec
import org.scalatest.matchers.ShouldMatchers

class SunSpotCheckerTests extends Spec with ShouldMatchers {

  describe("The Sunspot Analyser") {
    it("should generate output for the 5 highest rated locations when sent a list of numbers") {
      val numbers = "1 3 1 1 1 1 2 1 1 1 1" 
      SunSpotChecker.analyse(numbers) should be ("(1,1 score:10)")  
    }
    
    it("should generate output for the 4 highest rated locations when sent a list of numbers") {
      val numbers = """1 5 5 4 3 2 1 4 3 2 1 0 3 2 1 0 0 2 1 0 0 0 1 0 0 0 0""" 
      SunSpotChecker.analyse(numbers) should be ("(1,1 score:27)")  
    }
    
    it("should generate output for the 5 left hand values") {
      val numbers = """1 5 1 0 0 0 0 2 0 0 0 0 3 0 0 0 0 4 0 0 0 0 5 0 0 0 0""" 
      SunSpotChecker.analyse(numbers) should be ("(1,3 score:12)")  
    }
   
   it("should generate output for the smaller grid") {
      val numbers = "3 4 2 3 2 1 4 4 2 0 3 4 1 1 2 3 4 4"
      SunSpotChecker.analyse(numbers) should be ("(1,2 score:27)(1,1 score:25)(2,2 score:23)")
    }

 
    it("should generate output for the grid pictured") {
      val numbers = """1 5 5 3 1 2 0 4 1 1 3 2 2 3 2 4 3 0 2 3 3 2 1 0 2 4 3""" 
      SunSpotChecker.analyse(numbers) should be ("(3,3 score:26)")  
    }

    it("should generate output for the 3x3 grid pictured") {
      val numbers = """1 3 4 2 3 2 2 1 3 2 1"""
      SunSpotChecker.analyse(numbers) should be ("(1,1 score:20)")
    }

  }
  
}
