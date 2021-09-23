/*
For all exercises in Task 4, you are allowed to complete them with arrays of a fixed size. But do consider how the functions you write in 4.b, 4.c, 4.d,  4.e would work, if the array received as a parameter would not have a fixed length.
4.a create arrays of the following type and assign it at least 3 different values:
    - Integer array
    - String array
    - boolean array
4.b Write a function that takes in an array of strings as parameter and prints each string.
4.c Write a function that receives an integer array as a parameter and returns the sum of all elements in the array.
4.d Write a function that receives an integer array as a parameter and returns the average value.
4.e Consider how you could write a function that takes in an integer array as a parameter and returns the array sorted from lowest to highest value.
*/
import java.util.ArrayList;
public class Main{
public static void main(String [] args){
  ArrayList<Integer> ints= new ArrayList<Integer>();
  ints.add(1);
  ints.add(2);
  ints.add(3);
  ArrayList<String> strings= new ArrayList<String>();
  strings.add("Hej 1") ;
  strings.add("Hej 2") ;
  strings.add("Hej 3") ;
  ArrayList<Boolean> booleans= new ArrayList<Boolean>();
  booleans.add(true);
  booleans.add(false);
  booleans.add(true);
  printArrays(strings);

  System.out.println(printSumInts(ints));
  System.out.println(intAverage(ints));

}

public static void printArrays(ArrayList<String> strings){
  for(int i=0 ;i<strings.size() ; i++) {
    System.out.println(strings.get(i)) ;
  }
}
public static int printSumInts(ArrayList<Integer> ints1) {
  int sum=0;
  for(int i=0 ;i<ints1.size(); i++) {
    sum+=ints1.get(i);
  }
  return sum;
    }
  public static float intAverage(ArrayList<Integer> ints2) {
    float averagesum=0;
    for(int i=0;i<ints2.size(); i++){
    averagesum+=ints2.get(i);
}
    averagesum=averagesum/ints2.size();
    return averagesum;

  }
}
