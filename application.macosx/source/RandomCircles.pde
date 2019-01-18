void setup()
{
  println("This code was written by JonECope using Processing.");
  background(255);
  fullScreen();
}
void draw()  
{
  for(int i = 0; i < 1; i++)
  {
    //stroke(random(255), random(255), random(255), random(255));
    fill(random(255), random(255), random(255), random(255));
    ellipse(random(width), random(height), 10, 10);
  }
}
