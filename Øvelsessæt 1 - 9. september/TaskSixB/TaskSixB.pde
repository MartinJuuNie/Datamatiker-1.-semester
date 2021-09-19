/*Task 6:
    6.a make 2 integer variables named a and b. Print "Success!" if either of them is equal to 10 or if the sum is. If not, print "Failure!".
    6.b make 3 integer variables named x, y and z. Print "Success!" if their sum is 30, but none of them may have the value of 10, 20 or 30. Otherwise print "Failure!".
*/

int x = int(random(0,31));
int y = int(random(0,31));
int z = int(random(0,31));
int result = x+y+z;

println("x = " + x);
println("y = " + y);
println("z = " + z);
println(result);

if(x + y + z == 30 && x!=10 && x!=20 && x!=30&& y!=10 && y!=20 && y!=30&& z!=10 && z!=20 && z!=30)
print("Success!");
else
println("Failure!");
