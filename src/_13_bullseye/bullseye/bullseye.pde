void setup() {
 
  size(550,550);
  // set the size of your sketch
  
}
///
void draw() {
  for (int i=8;i>0;i--) {
   if(i%2==0) {
    fill(255,0,0);
   } else {
     fill(0,0,0);
   }
 ellipse(250,243,i*50,i*50);
  //Starting with the largest ellipse, use a for loop to draw a bullseye with ellipses.
  
  //Use an if statement and modulo to alternate the color of your rings.
  
  }
}
