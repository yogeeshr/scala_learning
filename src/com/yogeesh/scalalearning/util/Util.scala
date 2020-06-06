package com.yogeesh.scalalearning.util

package object Util {
  def printlines(times: Int) {
    if (times <= 0) {
      return;
    }

    for (i <- 0 until times) {
      println("");
    }
  }
}