class Circle extends Shape{
	int radius;
	
	Circle(){
		radius=1;
	}
	
	Circle(int r){
		radius=r;
	}

	@Override
	public void draw(){
		System.out.println("i'm Circle");
	}
}