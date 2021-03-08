// Student Name : Xiang Mao
// Student Id: 20251952

public class TestIteratorPattern {

	public static void main(String[] args) {
		ShapeStorage storage = new ShapeStorage();
 		storage.addShape("Polygon");
		storage.addShape("Hexagon");
		storage.addShape("Circle");
		storage.addShape("Rectangle");
		storage.addShape("Square");
		

		ShapeIterator iterator = new ShapeIterator(storage.getShapes());
		while(iterator.hasPrev()){
			System.out.println(iterator.prev());
		}
	
	}

}
