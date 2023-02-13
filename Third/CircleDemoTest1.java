package Third;

import java.util.Arrays;

class Circle implements Comparable<Circle>{ // 객체를 비교할수 있게 만드는 인터페이스(자기자신과 매개변수 객체를 비교)
    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }
    public double getArea(){
        return Math.PI * radius * radius;
    }
    public String toString(){
        return String.format("원의 반지름은" + radius + "입니다");
    }

    @Override
    public int compareTo(Circle c) {
//        Circle c =(Circle)o;
        return (int)(getArea() - c.getArea()); // 크면 양수 같으면 0 작으면 음수
    }
}
public class CircleDemoTest1 {
    public static void main(String[] args) {
        Circle[] circles = {new Circle(5.0), new Circle(2.5), new Circle(10.0)};

        Arrays.sort(circles);

        for(Circle c : circles)
            System.out.println(c);
    }
}
