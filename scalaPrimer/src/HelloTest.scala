/**
  * Created by upisa01 on 14/01/2017.
  *
  * import org.scalatest.junit.AssertionsForJUnit
import scala.collection.mutable.ListBuffer
import org.junit.Assert._
import org.junit.Test
import org.junit.Before
  *
  *
  *
  */


object HelloTest {
  def main(args: Array[String]) {
    println("Hello, World!")
    var x = isPalindrome("aaa")
    println(x)
    //assert(isPalindrome("aaad") == true, "NumberOfElements should be F")
    val left = 2
    val right = 2
    assert((left == right),"NumberOfElements should be F")

      // List in Scala or homogenous, they are declared as List[T]
      val names: List[String] = List("aaa", "bbb", "ccc")
      assert(names.length  == 3 )
      assert (!(names.length  == 33 ))
      println("OK  assert ((names.length  == 3 )) " + assert ((names.length  == 3 )))
      println("OK  assert (!(names.length  == 33 )) " + assert (!(names.length  == 44 )))
  }
  def isPalindrome(s: String) = s == s.reverse
}