PImage mustache;
PImage tf;
void setup() {
  tf=loadImage("tf.png");
size(800,600);
tf.resize(width,height);
mustache=loadImage("hi.png");
}
void draw() {
  background(tf);
  image(mustache, 125, 250);
}
