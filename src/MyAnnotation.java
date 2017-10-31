import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Inherited
@Documented
@Retention(RetentionPolicy.RUNTIME) // 컴파일 이후에도 JVM에 의해 참조가 가능함.
//@Retention(RetentionPolicy.CLASS) --> 컴파일러가 클래스를 참조할 때 까지 유효합니다.
//@Retention(RetentionPolicy.SOURCE) --> 어노테이션 정보는 컴파일 이후 없어집니다.

// @Target : 어떤 용도로 사용하는 어노테이션인가?
@Target({
	ElementType.PACKAGE,		// 패키지 선언 시 
	ElementType.TYPE,			// 타입 선언 시
	ElementType.CONSTRUCTOR,	// 생성자 선언 시
	ElementType.FIELD,			// 멤버 변수 선언 시
	ElementType.METHOD,			// 메소드 선언 시
	ElementType.ANNOTATION_TYPE,// 어노테이션 타입 선언 시
	ElementType.LOCAL_VARIABLE, // 지역 변수 선언 시
	ElementType.PARAMETER,		// 매개 변수 선언 시
	ElementType.TYPE_PARAMETER, // 매개 변수 타입 선언 시
	ElementType.TYPE_USE		// 타입 사용 사
})

public @interface MyAnnotation {
	/* enum 타입을 선언할 수 있다.*/
	public enum Quality {BAD, GOOD, VERYGOOD}
	/* String이 기본 자료형은 아니지만 사용가능.*/
	String value();
	/* 배열 형태로도 사용 가능 */
	int[] values();
	/* enum 사용 방법 */
	Quality quality() default Quality.GOOD;
	
}
