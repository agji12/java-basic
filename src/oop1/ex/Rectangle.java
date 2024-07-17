package oop1.ex;

public class Rectangle {

	int width;
	int height;
	
	int calculateArea() {
		return width * height;
	}
	
	int calculatePerimeter() {
		//int perimeter = (2 * width) + (2 * height);
		return 2 * (width + height);
	}
	
	boolean isSquare() {
//		boolean square = false;
//		if(width == height) {
//			square = true;
//		}
		return (width == height); // 같으면 true, 다르면 false 반환
	}
	
}
