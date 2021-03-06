package com.picnicml.doddlemodel.metrics

import breeze.numerics.sqrt
import com.picnicml.doddlemodel.data.Target

object RegressionMetrics {

  /** Root mean squared error. */
  object Rmse extends Metric {

    lazy val higherValueIsBetter: Boolean = false

    override def apply(y: Target, yPred: Target): Double = {
      val d = y - yPred
      sqrt((d.t * d) / y.length.toDouble)
    }
  }
}
