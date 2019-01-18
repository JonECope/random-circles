import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class RandomCircles extends PApplet {

public void setup()
{
  println("This code was written by JonECope using Processing.");
  background(255);
  
}
public void draw()  
{
  for(int i = 0; i < 1; i++)
  {
    //stroke(random(255), random(255), random(255), random(255));
    fill(random(255), random(255), random(255), random(255));
    ellipse(random(width), random(height), 10, 10);
  }
}
  public void settings() {  fullScreen(); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "--present", "--window-color=#666666", "--stop-color=#cccccc", "RandomCircles" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
