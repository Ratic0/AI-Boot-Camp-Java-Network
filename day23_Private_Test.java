// private 생성자에서 public 메소드를 통해 생성하는 방법 예제
class One{
    private One(){

    }
    public static One produceOneInstance(){ //void대신 One 을 리턴
        return new One();
    }
}
public class day23_Private_Test {
    public static void main(String[] args) {
        // One o = new One();
        One o1 = One.produceOneInstance(); // One 클래스의 메소드를 사용
        One o2 = One.produceOneInstance();
    }
}
