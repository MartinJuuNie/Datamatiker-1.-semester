/*
3.a Create a new file and save it by the name "Datamatik".
3.b Create a new file called "Teacher" and another one called "Student". Save both files with the extension .java, and in the same folder as Datamatik.java
3.c in the Student class, declare the class "Student" and add 4 fields: "name", "age", "isFemale", "datamatikerTeam" using appropriate data types for each.
3.d in the Student class, add a constructor that takes in 4 parameters with the names "tmpName", "tmpAge", "tmpIsFemale", "tmpDatamatikerTeam" with the same data types used in 3.c
3.e populate the fields created in 3.c with the parameters of the constructor added in 3.d (you may use shaddowing with the keyword this)
3.f in the Teacher class, declare the class "Teacher" and add 3 fields: "name", "age", "isFemale", using appropriate data types for each.
3.g in the Teacher class, add a constructor that takes in 3 parameters with the names "tmpName", "tmpAge", "tmpIsFemale" with the same datatypes used in 3.f
3.h populate the fields created in 3.f with the parameters of the constructor added in 3.g

3.i Returning to the Datamatik class add a main() function and in this function, create a new object/instance of the type Teacher and give it the name, age and gender of your teacher.
3.j Also in the main() function of Datamatik, create two new objects/instances of the type Student. The first one, with your own name, age and gender. The second one with the name, age and gender of a student in your study group.
3.k in the main() function print the name of the teacher
3.l in the main() function print the names of both students and which teams they are from. Do this without writing any toString() methods
*/
class Datamatik{

public static void main(String [] args) {

Student[] Students = new Student[10];
Students[0] = new Student("Martin1", 38, false, 'A');
Students[1] = new Student("Martin2", 38, false, 'B');
Students[2] = new Student("Martin3", 38, false, 'A');
Students[3] = new Student("Martin4", 38, false, 'A');
Students[4] = new Student("Martin5", 38, false, 'A');
Students[5] = new Student("Martin6", 38, false, 'B');
Students[6] = new Student("Martin7", 38, false, 'B');
Students[7] = new Student("Martin8", 38, false, 'A');
Students[8] = new Student("Martin9", 38, false, 'B');
Students[9] = new Student("Martin0", 38, false, 'A');
System.out.println(namePrint(Students,0));
System.out.println(namePrint(Students,4));
System.out.println(namePrint(Students,6));
System.out.println(namePrint(Students,9));

String defineName = "Martin7";
System.out.println(indexName(Students,defineName));

}

public static String namePrint(Student[] Students1, int index){
    return Students1[index].name;
  }

public static int indexName(Student[] Students2, String name1){
  int index = 0;
  for(int i = 0; i<Students2.length; i++){
    if(Students2[i].name==name1)
    index = i;
  }
      return index;

  }

}
