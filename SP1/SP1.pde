color board=#088600 ;
diceCup Cup1 = new diceCup();
void setup() {
  size(930, 570) ;
  rectMode(CENTER) ;
  Cup1.iniCup();
  background(board) ;
  println("Press 'a' to add a die to the dicecup and 'enter' to roll");
}
void draw() {
}

void keyPressed() {
  if (key=='a') {
    Die die=new Die(0, 255) ;
    Cup1.addDie(die) ;
  }
  if (key==ENTER) {
    background(board) ;
    Cup1.shake() ;
    Cup1.draw(100, 100, 50, 10) ;
  }
}
