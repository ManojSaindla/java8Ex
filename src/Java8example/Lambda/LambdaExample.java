package Java8example.Lambda;





interface Shape {
	
	void draw();
}

// class Rectangle implements shape{
//
//	@Override
//	public void draw() {
//		System.out.println("Rectangle class ");
//		
//	}
//	}
//	
//	 class Square implements shape{
//
//		@Override
//		public void draw() {
//			System.out.println("Square class ");
//		}
//		}	
//	
//	class Circle implements shape{
//
//			@Override
//			public void draw() {
//				System.out.println("Square class ");
//				
//			}	
//			}
//	
//	class Triangle implements shape{
//
//		@Override
//		public void draw() {
//			System.out.println("Normal Triangle class ");
//				
//}		}
		
		public class LambdaExample{
			
			public static void main(String[] args) {
				
				String str= "hello ";
				
//				Shape Triangle	= () -> System.out.println("Lambda Triangle class  " +str);
				
//				Triangle.draw();
				
//				Shape Rectangle = () -> System.out.println("Lambda Rectangle ");
//				Rectangle.draw();
				
//				Shape Circle = () -> System.out.println("Lambda Circle");
//				Circle.draw();
				
				print(() -> System.out.println("Lambda Rectangle "));
				print(() -> System.out.println("Lambda Circle"));
				print(() -> System.out.println("Lambda Triangle class " +str));
				
			}
			
		private static void print(Shape shape) {
			shape.draw();
		}
			
		}
		
	
	
