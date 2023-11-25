
public class FactoryMethodDamo {

	public static void main(String[] args) {
		ShapeFactory shapeFactory = new ConcreteShapeFactory();
		
		Shape shape1 = shapeFactory.getShape("triangle");
		shape1.draw();
	}

}
