class Solution {

  // Function to find the product of all elements in the array
  def productOfElements(array: Array[Int]): Unit = {

    var result = 1

    for (array_element <- array) {

      result = result * array_element
    }
    println(result)

  }

}

object Product extends App {

  private val array = Array(1, 2, 3, 4, 5)

  private var solution_object = new Solution()

  try {
    solution_object.productOfElements(array)
  }
  catch {
    case exception: Exception =>
      println("Something went wrong" + exception.getMessage)
  }


}
