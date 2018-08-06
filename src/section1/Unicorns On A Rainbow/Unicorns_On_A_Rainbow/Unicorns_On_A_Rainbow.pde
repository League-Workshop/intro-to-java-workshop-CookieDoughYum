PImage rainbow;
PImage unicorn;
void setup(){
  size(500,500);
  rainbow = loadImage("Rainbow.png");
rainbow.resize(width,height);
unicorn = loadImage("Unicorn.jpeg");
unicorn.resize(200,200);
}
void draw(){
  background(rainbow);
  image(unicorn, mouseX, mouseY);
}