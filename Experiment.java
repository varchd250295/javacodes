public class Experiment extends Thread {
    public void run() {
        System.out.println("Hacker");
    }
    public void run(String s) {
        System.out.println("Earth");
    }
    public static void main(String[] args) {
        new Experiment().start();
    }
}
