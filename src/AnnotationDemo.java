
public class AnnotationDemo {
	
	public static void main(String[] args) throws IllegalAccessException, InstantiationException {
		// 컨텍스트 컨테이너를 초기화
		MyContextContainer demo = new MyContextContainer();
		
		// MyObject 객체를 하나 받아온다.
		MyObject obj = demo.get(MyObject.class);
		
		System.out.println(obj.getName());
		System.out.println(obj.getDefaultValue());
		System.out.println(obj.getInvalidType());
			
		
		
	}
}
