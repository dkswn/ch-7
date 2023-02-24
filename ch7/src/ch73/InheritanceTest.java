package ch73;
class MyPoint  extends Object { //모든 클래스의 최고 조상
	int x;
	int y;
}


class Circle extends Object { // 포함
	MyPoint p = new MyPoint();
	int r;
}

public class InheritanceTest {
	public static void main(String[] args) {
		Circle c = new Circle();
		System.out.println(c.toString()); // Object 의해서 자동으로 toString호출가능
		Circle c2 = new Circle();
		System.out.println(c2); //toString과 같다 toString 생략

	}

}
