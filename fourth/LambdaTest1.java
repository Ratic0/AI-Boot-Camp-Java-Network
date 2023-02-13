package fourth;

// Lambda Expression
//- 익명 메소드 (일반 메소드와 달리 이름이 없음)
//- 메서드와 달리 특정 클래스에 종속되지 않지만, 매개변수, 리턴타입, 본체를 가진다.
//- 예외 처리가 가능하다
//- 메서드의 인수로 전달될 수도 있고 변수에 대입될 수 있다.
//- 익명 구현 객체와 달리 메서드의 핵심 부분만 포함한다.
//- 실행문이 하나면 중괄호와 세미콜론을 생략할 수 있다.
//- 실행문이 하나의 리턴 구문이면 return키워드도 생략가능하다.
interface Positive {
    int pos(int x);
}
interface Prints{
    void print();
}
public class LambdaTest1 {
    public static void main(String[] args) {
        Positive po; // 변수에 인터페이스를 선언을 해서 변수에 매소드들을 할당하여 사용
        Prints pr;

        po = (int n) -> {return n+1;};
        po = (n) -> {return n+1;};
        po = n -> {return n+1;};
        po = (int n) -> n+1;

        pr = () -> System.out.println("Hi");
        pr.print();

    }
}