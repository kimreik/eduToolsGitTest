import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

class CustomThreadPoolExecutor extends ThreadPoolExecutor {
    public CustomThreadPoolExecutor(final int corePoolSize) {
        super(corePoolSize,
              Integer.MAX_VALUE,
              0,
              TimeUnit.MILLISECONDS,
              new LinkedBlockingQueue<>());
    }

    @Override
    public void execute(final Runnable command) {
        /* TODO */
    }
}
