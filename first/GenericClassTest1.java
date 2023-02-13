package first;

public class GenericClassTest1 {
    public static void main(String[] args) {
        PostBox<String> postBox1 = new PostBox<String>();
        PostBox<Integer> postBox2 = new PostBox<>();
        postBox1.setItem("소포");
        postBox2.setItem(77);
        System.out.println(postBox1.getItem());
    }
}
