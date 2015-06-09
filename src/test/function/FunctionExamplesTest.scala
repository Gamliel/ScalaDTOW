package test.function
import org.scalatest._
import org.scalatest.prop.GeneratorDrivenPropertyChecks
import function.FunctionExamples

/**
 * @author devtopic
 */
class FunctionExamplesTest extends FlatSpec with Matchers with GeneratorDrivenPropertyChecks{
  
  "A function" should "provide the successor" in {
    val example = new FunctionExamples
    example.firstFunction(1) should be (2)
  }
}