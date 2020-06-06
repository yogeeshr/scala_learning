package com.yogeesh.scalalearning;

import com.yogeesh.scalalearning.util._;

object ScalaStart {
	def main(args: Array[String]) {
		// Random
		println(" - - - - - - - - - - - - - - - -");
		println("Random Print :");
		for(i <- 0 until 11) {
			print(i+"\t");
		}
		println("");
		println(" - - - - - - - - - - - - - - - -");
		Util.printlines(2);

		// String
		val name = "Kungfu Panda"; // val is constant
		println(" - - - - - - - - - - - - - - - -");
		println("Print String :");
		for(i <- 0 until name.length) {
			print(name(i)+"\t");
		}
		println("");
		println(" - - - - - - - - - - - - - - - -");
		Util.printlines(2);

		// List
		var someList = List("ele1", "ele2", "ele3", "ele4");
		println(" - - - - - - - - - - - - - - - -");
		println("Print List Items :");
		for(listElement <- someList) {
			print(listElement+"\t");
		}
		println("");
		println(" - - - - - - - - - - - - - - - -");
		Util.printlines(2);

	}
}
