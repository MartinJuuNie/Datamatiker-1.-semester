/*Task 3:

    3.a Draw a traffic light using colors stored in variables - one for each of the 4 colors (background is the 4th).
    3.b add a gray color for the turned off effect
    3.c have the light turn on/off (green or red) automatically.
*/


  int red = color (255,0,0);
  int green = color (0,255,0);
  int yellow = color (255,255,0);
  int gray = color (75,75,75);
  int black = color (0);
  int colorCheck = 1;
  
  
  void setup() {
  frameRate(1);
  size(1000,1000);
  background(255);

}

void draw() {
  fill(black);
  rect(300,100,400,800);
  fill(gray);  
  circle(500,250,200);
  circle(500,500,200);
  circle(500,750,200);
  
  if(colorCheck == 1) {
  fill(red);
  circle(500,250,200);
  colorCheck = 2;
  }
  else if(colorCheck == 2) {
  fill(yellow);
  circle(500,500,200);
  colorCheck = 3;
  }
  else if(colorCheck == 3) {
    fill(green);
    circle(500,750,200);
    colorCheck = 1;
  }
}
