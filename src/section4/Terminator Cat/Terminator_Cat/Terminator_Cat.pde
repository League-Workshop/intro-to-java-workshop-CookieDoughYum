int EllipseX=338;
int EllipseY=241;
PImage catPic;
void setup(){
  size(500, 500);
  catPic = loadImage("Cat.jpg");
catPic.resize(width, height);
background(catPic);
}
void draw(){
if(mousePressed){
println("Mouse’s x-position: " + mouseX + "\n" + "Mouse’s y-position: " + mouseY + "\n");}
fill(#CB1B1B);
ellipse(338,241,100,100);
}
void keyPressed() {
  EllipseX++;
  EllipseY++;
  //I am on Step 11
}