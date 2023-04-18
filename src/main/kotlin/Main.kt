fun main() {
    var result=getHighestGrade(student)
    println(result)

    val highestGradeStudent = getHighestGrade(listOf())
    highestGradeStudent?.let {
        println("The student with the highest grade is.")
    }



}


//Create a data class Student with the following properties: name (String), age (Int),
// and grade (Double). Then, create a list of Student objects called students and populate
// it with 5 instances of Student with different values for each property.

data class Student(var name:String,var age:Int,var grade:Double)
val student= mutableListOf<Student>(
    Student("rita",70,56.0),
    Student("leila",22,41.4),
    Student("Racheal",24,25.9)

)
//Next, write a function called getHighestGrade that takes in a list of
// Student objects as a parameter and returns the Student object with the highest grade.
fun getHighestGrade(list: List<Student>):List<Student>{
   return student.filter { stu -> stu.grade >=50 }

}
//Finally, write a main function that calls getHighestGrade on the students list and
// prints out the name of the student with the highest grade, as well as their grade.

data class Person(val name: String, val age: Int)

val people = listOf(
    Person("Alice", 25),
    Person("Bob", 35),
    Person("Charlie", 45),
    Person("Dave", 55),
    Person("Eve", 65)
)

// Print out the name of the second person in the list



// Create a new list called youngPeople that only contains people who are under the age of 30
val youngPeople = people.filter { it.age < 30 }

// Create a new list called oldPeople that only contains people who are over the age of 50
val oldPeople = people.filter { it.age > 50 }

// Use the map function to create a list of the names of all people in the original people list
val names = people.map { it.name }

// Use the filter function to create a new list called namesOfOldPeople that contains only the names of people over the age of 50
val namesOfOldPeople = people.filter { it.age > 50 }.map { it.name }










