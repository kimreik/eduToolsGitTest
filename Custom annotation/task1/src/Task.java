public class Task {

  public static void main(String[] args) {
    CustomThreadPoolExecutor customThreadPoolExecutor = new CustomThreadPoolExecutor(10);
    customThreadPoolExecutor.execute(new MyRunnable());
  }
}