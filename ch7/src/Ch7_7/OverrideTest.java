package Ch7_7;

class MyPoint3 {
	int x;
	int y;

	public String getLocation() {
		return "x:" + x + ", y:" + y;
	}
}

public class OverrideTest {

	public static void main(String[] args) {
		MyPoint3 p = new MyPoint3(); // 포함
		p.x = 3;
		p.y = 5;
		System.out.println(p); // Object toString없이 간단히

		System.out.println(p.toString());

	}

}
