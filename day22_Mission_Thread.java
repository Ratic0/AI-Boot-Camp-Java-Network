import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class day22_Mission_Thread {
    public static void main(String[] args) {
        int alphabet = 'a';
        ExecutorService exec = Executors.newCachedThreadPool(); // newCachedThreadPool() 1개이상의 쓰레드가 추가되었을 경우 60초 동안 스레드가 아무 작업하지 않으면 해당 스레드를 풀에서 쫓아냄
        Runnable task = () -> {
            try {
                for (int i = 0; i < 5; i++) {
                    System.out.println("작업 스레드 :" + i);
                    Thread.sleep(1000);
                }
            } catch (InterruptedException e) {}
            exec.shutdown();
        };
        exec.submit(task);
        try {
            while (exec.isShutdown()!=true) { // 셧다운 이전까지 작동하게
                System.out.println("메인 스레드 : " + (char) alphabet++);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {}
    }
}