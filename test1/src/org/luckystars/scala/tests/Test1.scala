package org.luckystars.scala.tests

import scala.collection.immutable.List

object Test1 {
  
	def main(args: Array[String]) {
		val list = List(1,2,3,3,4,5,6)
		list.foreach(x=> println(x))

		val tup = (1,2,3,4,5,6,7)
		val it = tup.productIterator
		it.foreach(x=>println(x))
		
	}
	
}