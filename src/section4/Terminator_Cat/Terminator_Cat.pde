int EllipseX=325;
int EllipseY=180;
int acceleration=5;
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
noStroke();
ellipse(EllipseX,EllipseY,40,40);
ellipse(EllipseX-120,EllipseY+27,40,40);             
if(EllipseX>width){
  background(catPic);
  EllipseX=325;
  EllipseY=180;
  acceleration=5;
}

}
void keyPressed() {
  EllipseX+=2*acceleration;
  EllipseY+=2*acceleration;
  
}
  