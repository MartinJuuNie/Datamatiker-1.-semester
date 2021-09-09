/*Task 4:

    4.a print out numbers from 0 to 20 using a for loop.
    4.b alter the for loop from 4.a to only print even numbers (hint: google 'java modulus even number')
    4.c print out the same result as in task 4.b using a while loop instead of a for loop.
*/

/*
//4.a
for(int counter = 0;(counter<=20);counter++){
 
  println("Tallet er nu " + counter);
 
 
delay(500);
}
*/
/*
//4.b
for(int counter = 0;(counter<=20);counter++){
  if(counter % 2 == 0){
 
  println("Tallet er nu " + counter);
 
 
delay(500);
}
}
*/

//4.c
int counter = 0;
while(counter <=20){
  counter++;
  if(counter % 2 == 0){
  
  println("Tallet er nu " + counter);
 
 
delay(500);
}
}
