
public class ShapeStorage {
	
	private Shape []shapes = new Shape[5];
	private int index;
	
	
	//increments local var i. i is the index of the array elem.
	public void addShape(String name){
		int i = index++;
		shapes[i] = new Shape(i,name);
	}
	
	public Shape[] getShapes(){ //returns entire array of objects
		return shapes;
	}
}
