package org.luckystars.scala.tests.book05

object RawString {
	def main(args: Array[String]) {
		val rawStr = """asd/\"'da1sx!#$%!*(~_""";
		val rawStr2 = """asd/\"'da1sx!#$%!*(~_\u00ff""";
		println(rawStr.getClass())
		
		println(rawStr);
		println(rawStr2);
	}
}