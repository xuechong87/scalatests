package org.luckystars.scala.tests

import scala.io.Source

object ReadFile {
  
	def main(args: Array[String]) {
		val filePath = "C:/Users/Administrator/Desktop/temp.txt";
		for(line <- Source.fromFile(filePath).getLines){
			println(line);
		}
	  
	}
}