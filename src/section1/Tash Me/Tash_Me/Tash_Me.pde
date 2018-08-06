PImage mustache;
PImage friend;
void setup(){
  size(500,500);
  friend = loadImage("Darth Vader.jpg");
friend.resize(width,height);
mustache = loadImage("Mustache.png");
mustache.resize(50,30);
}
void draw(){
  background(friend);
  if(mousePressed){
    image(mustache, mouseX, mouseY);
  }
}