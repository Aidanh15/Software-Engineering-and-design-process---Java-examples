import java.util.Iterator;

public class ShapeIterator implements Iterator<Shape>{ //implements the iterator interface on class shape

	private Shape [] shapes; // shape array
	int pos;   // position 
	
	public ShapeIterator(Shape []shapes){
		this.shapes = shapes;
	}
	@Override
	public boolean hasNext() {  //determines if we have reached the end of the array
		if(pos >= shapes.length || shapes[pos] == null)
			return false;
		return true;
	}

	@Override
	public Shape next() {   //returns the prev object in the array and increments pos correspondingly
		return shapes[pos++];
	}

	@Override
	public void remove() {  // remove an object from the array if pos is negative or there is an error
		if(pos <=0 )
			throw new IllegalStateException("Illegal position");
		if(shapes[pos-1] !=null){
			for (int i= pos-1; i<(shapes.length-1);i++){
				shapes[i] = shapes[i+1];
			}
			shapes[shapes.length-1] = null;
		}
	}
	//checks if a shape exists (name)
	public boolean contains(String shape){
		for(int i = 0; i < shapes.length; i++){
			if(shape == shapes[i].getName()){
				return true;
			}
		}
		return false;
	}
	//iterates through the array in reverse
	public Shape prev(){
		return shapes[--pos];
	}
	
	//escape loop if pos iterates backwards to -1
	public boolean endPrev(){
		System.out.println("Pos = " + pos);
		if(pos==1)
			return false;
					return true;
	}
	
}
