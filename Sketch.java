import processing.core.PApplet;

public class Sketch extends PApplet {
  
	/**
   * Assignment: 5.10 Processing Task 8 -  User Input
   * Author: Lydia He
   * Date: Mon, May 2, 2022
   * Description: Create a drawing program for a specific 
   * scene and demonstrate various input capabilities.
   * This program is black and white. Press keys and 
   * do mouse input to make it come to life!
   */

  // State Variables
  float x = 0;
  float y = 0;
  float xSpeed = 10;
  float ySpeed = 8;
  float sunSize = 80;
  float circleX = -50;
  float circleY = 490;
  float floatR;
  float floatG;
  float floatB;

  // Settings
  public void settings() {
    int intWidth = 500;
    int intHeight = 500;
    size(intWidth, intHeight);
  }

  // Initial Setup Values
  public void setup() {
    background(0);
    
  }

  public void draw() {
    // Mouse Input - Mouse Pressed to Draw
    // Draws a border every time your mouse is pressed
    if (mousePressed) {
      fill(245, 196, 229);
      stroke(245, 196, 229);
      rect(0, 0, 500, 5);     
      rect(0, 0, 5, 500);  
      rect(495, 0, 5, 500);     
      rect(0, 495, 500, 5);      

    } 
      
    if (keyPressed) {
    // Keyboard Input - The Keycode Variable: UP, DOWN, LEFT, RIGHT
      if (keyCode == UP) {
        circleY--;
        
      } else if (keyCode == DOWN) {
        circleY++;
        
      } else if(keyCode == LEFT){
        circleX--;
        
      } else if(keyCode == RIGHT){
       circleX++; 
        
      }
      
      // Keyboard Input - The Key Variable: 1
      if (key == '1') {
        // Makes background dark/nighttime
        // background(15, 15, 140);
        floatR = 15;
        floatG = 15;
        floatB = 140;
        background(floatR, floatG, floatB);
  
      // Keyboard Input - The Key Variable: 2
      } else if (key == '2') {
        // Makes background regular/daytime
        // background(0, 157, 255);
        floatR = 0;
        floatG = 157;
        floatB = 255;
        background(floatR, floatG, floatB);
  
      // Keyboard Input - The Key Variable: 3
      } else if (key == '3') {
        // Makes background light/morning
        // background(0, 200, 255);
        floatR = 0;
        floatG = 200;
        floatB = 255;
        background(floatR, floatG, floatB);
  
      } 
      // Keyboard Input - The Key Pressed Variable
      // Always draws the start of the grass when the key is pressed
      fill(5, 168, 35);
      stroke(5, 168, 35);
      ellipse(circleX, circleY, 50, 50);
      }
    }
  
  public void mouseClicked() {
    // Mouse Input - Mouse Clicked
    // Draws a Pink Cloud where Mouse is clicked
    fill(245, 196, 229);
    stroke(245, 196, 229);
    ellipse(mouseX, mouseY, 20, 20);
    ellipse(mouseX + 20, mouseY, 30, 30);
    ellipse(mouseX + 45, mouseY, 35, 35);
    
  }

  public void mouseDragged() {
    // Mouse Input - Drag
    // Draws a Sun
    fill(245, 241, 0);
    stroke(245, 241, 0);
    ellipse(0, 0, sunSize, sunSize);

    // The more you drag, the larger the sun gets
    sunSize++;

  }

  public void mouseWheel() {
    // Mouse Input - Mouse Wheel
    // Animates sunlight with basic edge detection
    fill(233, 237, 159);
    stroke(233, 237, 159);
    ellipse(x, y, 10, 10);

    x += xSpeed;
    y += ySpeed;
  
    if (x < 0 || x > width) {
      xSpeed *= -1;
    }
  
    if (y < 0  || y > height) {
      ySpeed *= -1;
      
    }
  }

  public void mouseReleased() {
    // Makes frame darker
    fill(217, 130, 188);
    stroke(217, 130, 188);
    rect(0, 0, 500, 5);     
    rect(0, 0, 5, 500);  
    rect(495, 0, 5, 500);     
    rect(0, 495, 500, 5);      

  }
}