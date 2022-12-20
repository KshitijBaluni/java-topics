package thread;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class CoreJavaCallableTest {
    private Callable<String> callable;
    private final static String CALLABLE_TEST_STRING = "Callable";

    @Before
    public void init() {
        callable = new CoreJavaCallable(CALLABLE_TEST_STRING);
    }

    @Test
    public void callableTest() throws ExecutionException, InterruptedException {
        FutureTask<String> futureTask = new FutureTask<>(callable);
        Thread thread = new Thread(futureTask);
        thread.start();

        Assert.assertTrue(thread.isAlive());
        Assert.assertEquals(String.format("%s@%s", CALLABLE_TEST_STRING, CALLABLE_TEST_STRING.hashCode()),
                futureTask.get().toString());
    }
}
