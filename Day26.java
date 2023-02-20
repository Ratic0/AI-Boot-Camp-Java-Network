public class Day26 {
    private String secret = "비공개";
    String s = "Day26의 MemberClass 인스턴스 변수"; //Defalut 패키지 안에서만 사용 가능

    class MemberClass { // 얘도 결국 Day26의 멤버이다.
        String s = "내부";

        public void show1() {
            System.out.println("Inner Class");
            System.out.println(secret); // MemberClass 안에 secret변수가 존재하지 않아 바깥 스코프의 secret 변수 값을 출력한다.
            System.out.println(s); // MemberClass 안에 s 변수가 있음
            System.out.println(Day26.this.s); // s가 static이 아니라서 객체를 만든후 사용가능 "외부" Day26 인스턴스 변수
        }

         static String s3 = "static member field";
         static void info() {
             System.out.println("static member method");
         }
    }

    public static void main(String[] args) {
        //MemberClass m2 = new MemberClass();
        Day26 m = new Day26();
        Day26.MemberClass m1 = m.new MemberClass();

        System.out.println(m1.s);
        m1.show1();
        m1.s3="test";
        Day26.MemberClass.info(); // 반드시 외부 클래스의 접근이 먼저 된후에 사용이 가능하다.
    }
}
