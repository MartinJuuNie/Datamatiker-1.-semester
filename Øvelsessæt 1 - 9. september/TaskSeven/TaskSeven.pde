/*
Task 7:
    7.a create an integer called input and assign it a value of 20. Use a loop to print all integers between the input value and 0, with the following exceptions:
        if the number is 6, instead print the string "six".
        Once the number is half of the input value, print "HALF!"
    7.b Run exercise 7.a again with a different input value and make sure it still works. You should also consider if it will work with a negative input, e.g. -20.
*/

int input = int(random(-20,20));
println("Input = " + input);

if(input < 0) {
   println("Input er negativ");
   for(int i = input; i<=0 ;i++){

  if(i!=input/2 && i!=6) {
  println(i) ;
  }
  else if(i==input/2) {
    println("HALF") ;
  }
    else {
      println("six") ;
    }
    delay(200);
};
}
  else
  for(int i = input ; i>=0 ;i--){

  if(i!=input/2 && i!=6) {
  println(i) ;
  }
  else if(i==input/2) {
    println("HALF") ;
  }
    else {
      println("six") ;
    }
    delay(200);

  }

  
