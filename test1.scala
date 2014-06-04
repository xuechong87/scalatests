object test1 {
	def main(args: Array[String]): Unit = {
		val list = List(1,2,3,4,5,6,7,8,9,0)

		println(list.count(x=> x>3))
		println(list.exists(x=> x>8))
		println(list.filter(x=> x>8))

	}
}

