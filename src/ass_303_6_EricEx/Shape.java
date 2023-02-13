package ass_303_6_EricEx;

public abstract class Shape implements AreaCalculation{
	
	private String shapeName;

	public String getShapeName() {
		return shapeName;
	}

	public void setShapeName(String name) {
		this.shapeName = name;
	}
	
	
	@Override //Override the toString method in the Object Class
	public String toString() {
		return "The area of " + getShapeName() + " is " + calculateArea();
	}

}
