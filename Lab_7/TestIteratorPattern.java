
public class TestIteratorPattern {

	
	// adds five shape objects to the array.
	public static void main(String[] args) {
		ShapeStorage storage = new ShapeStorage();
 		storage.addShape("Polygon");
		storage.addShape("Hexagon");
		storage.addShape("Circle");
		storage.addShape("Rectangle");
		storage.addShape("Square");
		
		
		ShapeIterator iterator = new ShapeIterator(storage.getShapes());
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
		//check if array contains a shape (IE check if your contains method works)
		 boolean contains = iterator.contains("Square");
		 System.out.println("The array contains a Square " + contains);
		
		 //print the array backwards:
		 System.out.println("The array backwards is:");
		 while(iterator.endPrev()){
			 System.out.println(iterator.prev());
		 }
		 
		 
		System.out.println("Apply removing while iterating...");
		iterator = new ShapeIterator(storage.getShapes());
		while(iterator.hasNext()){
			System.out.println(iterator.next());
			iterator.remove();
		}
	}

}
