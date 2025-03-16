public class Timer extends Thread {
    private long time = 0;
    private boolean running = true;



    public void run() {
        while (running) {
            try {
                // System.out.println(time/1000.0 + " \n");
                time += 10;
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public void stopTimer()
    {
        running=false;
    }

}
