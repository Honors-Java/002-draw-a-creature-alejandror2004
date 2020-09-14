void setup() {
	size(400, 400);
}

void draw() {
  background(255);
  ellipseMode(CENTER);
  ellipse(mouseX, mouseY, 1, 1);
  println(mouseX, mouseY);
  rectMode(CENTER);

//Body

  rect(200, 200, 120, 50);
  
  
  // Ears

  rect(250, 180, 20, 30);

  
  //Nose

  rect( 275, 190, 30, 20);
  ellipse(293, 185, 5, 5)


 //Tail

 rect(120, 200, 40, 10);
  

  //Paws

  rect(150, 235, 10, 20);
  rect(180, 235, 10, 20);
  rect(210, 235, 10, 20);
  rect(240, 235, 10, 20);


  //Spots

  ellipse(170, 190, 20, 20);
  ellipse(230, 210, 15, 15);
  ellipse(155, 215, 15, 15);



  


 
  
  
 

  
 
	

}