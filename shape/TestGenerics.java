import java.util.*;
class TestGenerics{
	
	
	
	public static void testFunc(List<? extends Shape> myList){
		for(int i=0;i<myList.size();i++){
			myList.get(i).draw();
		}
	}
	public static void main(String args[]){
		Circle circle1=new Circle();
		Rectangle rectangle1=new Rectangle();
		
		
		ArrayList<Shape> list= new ArrayList<Shape>();
		
		list.add(circle1);
		list.add(rectangle1);

		testFunc(list);
		
	}
}