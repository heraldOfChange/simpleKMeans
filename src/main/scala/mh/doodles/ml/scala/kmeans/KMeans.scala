package mh.doodles.ml.scala.kmeans

class KMeans {

  /**
   * method used to generate some training data
   *
   * @return a `DataSet` or a List[List[Double]]
   */
  def generatePoints: DataSet = ???

  /**
   * method used to calculate the square distance between two `DataPoints`
   *
   * @param centroid a `DataPoint` that is recalculated on iteration
   * @param reference the `DataPoint` in question
   *
   * @return a non-negative distance as a Double type
   */
  def squareDistance(centroid: DataPoint, reference: DataPoint): Double = ???

  /**
   * method that takes two initial centroids and calculates the best possible cluster over iterations
   *
   * @param initialCentroids the randomly selected initial cluster centroids
   * @param trainingData the remaining data points
   *
   * @return the most accurate cluster found using the KMeans approach
   */
  def refineClusters(initialCentroids: DataSet, trainingData: DataSet): Map[DataPoint, DataSet] = ???
}