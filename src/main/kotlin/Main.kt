fun main(args: Array<String>) {
      //Зд.1
      val age1: Int = 42
      val age2: Int = 21
      //Зд.2

      var avg1: Int = (age1 + age2) / 2
      //Зд.3

      avg1 = (age1 + age2) / 2
      println(avg1)
      //Зд.4
      val firstName :String =  "Николай"
      val lastName :String =  "Данилов"
      //Зд.5
      val fullName :String =  lastName + " " + firstName
      println(fullName)
      //Зд.6
      val myDetails :String =  "Привет, меня зовут"
      println(myDetails + " " + fullName)
      //Зд.7
      val dates = Triple(18,8,2021)
      //Зд.8
      val day = dates.first
      val month = dates.second
      val year = dates.third
      print(day)
      print(".$month")
      print(".$year")
      //Зд.9
      val monthANDyear = """
              |$month
              |$year
      """.trimMargin()
      println(monthANDyear)
    //Зд.10

}
