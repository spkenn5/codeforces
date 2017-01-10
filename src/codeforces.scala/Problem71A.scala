object Problem71A extends App{
  val t = readInt()
  for (t <- 0 to t-1) {
    var s = readLine()
    val l = s.length()
    if (l > 10) {
      s = s(0)+(l-2).toString+s(l-1)
      println(s)
    }
    else {
      println(s)
    }
  }
}
