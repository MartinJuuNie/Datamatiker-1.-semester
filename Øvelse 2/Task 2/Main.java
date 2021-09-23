/*
2.a Look at the file TaskTwoA and fill out the missing line, using the happy boolean.
2.b Write a function that receives two integers as parameters and returns the sum of them.
2.c Write a function that receives a string and returns it as uppercase. (Hint: ".toUpperCase()". Further hint: https://www.w3schools.com/jsref/jsref_toUpperCase.asp )
2.d Write a function that receives a string and returns true if the first letter of the string is uppercase. (Hints: ".charAt(0)" and "Character.isUpperCase('a');" )
*/

class Main{
  public static boolean happy = true;

public static void main(String [] args) {
   if (iAmHappy())
   {
     System.out.println("I clap my hands");
   }
   else
   {
     System.out.println("I don't clap my hands");
   }

   int age1 = 38;
   int age2 = 34;
   System.out.println(age1 + " + " + age2 + " = " + sumOfInts(age1,age2));

   String Text = "this line should be capitalized";
   System.out.println(lowerToUpper(Text));

   String TextUpperCaseCheck = "Hello universe";
   System.out.println(TextUpperCaseCheck + " is "+ upperCaseTest(TextUpperCaseCheck));

}
//Fill out the missing line, using the happy boolean
public static boolean iAmHappy()
{
    return happy;
}
//2.b Function that receives two integers as parameters and returns the sum of them.
public static int sumOfInts(int age1, int age2){
  int sumOfAges = age1 + age2;
  return sumOfAges;
}
//2.c Function that receives a string and returns it as uppercase.
public static String lowerToUpper(String upMe){
  String returnValue;
  returnValue = upMe.toUpperCase();
  return returnValue;
}
//2.d Function that receives a string and returns true if the first letter of the string is isUpperCase.

public static boolean upperCaseTest(String isItUpper){
  return Character.isUpperCase(isItUpper.charAt(0));


  }

}
