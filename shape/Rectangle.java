class Rectangle extends Shape{
	int width,height;
	
	Rectangle(){
		width=height=0;
	}
	
	Rectangle(int w,int h){
		width=w;height=h;
	}

	@Override
	public void draw(){
		System.out.println("i'm Rectangle");
	}
}