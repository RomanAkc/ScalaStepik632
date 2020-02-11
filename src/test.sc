def service1: Either[String, Double] = {
  //Left("Bad ^(")
  Right(15.0)
}

def service2(res1: Double): Either[String, Int] = {
  Left("Bad ^(2")
  //Right(3)
}

def service3: String = {
  val r: String = "blabla"
  r
}

def service4(res1: Double, res2: Int, res3: String): Either[String, String] = {
  println(res1)
  println(res2)
  println(res3)
  Right("Ok")
}

def result = for {
  s1 <- service1
  s2 <- service2(s1)
  s3 <- Right(service3)
  s4 <- service4(s1, s2, s3)
} yield s4

result

