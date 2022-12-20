package thread;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.concurrent.*;

public class CoreJavaExecutorTest {
    private Callable<String> coreJavaExecutor;
    public static final String CORE_JAVA_EXECUTOR_TEST_STRING = "executor string";

    @Before
    public void init() {
        coreJavaExecutor = new CoreJavaExecutor(CORE_JAVA_EXECUTOR_TEST_STRING);
    }

    @Test
    public void testCoreJavaExecutor() throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(4);
        FutureTask<String> futureTask = (FutureTask<String>) executorService.submit(coreJavaExecutor);

        Assert.assertEquals(String.format("%s@%s",CORE_JAVA_EXECUTOR_TEST_STRING, CORE_JAVA_EXECUTOR_TEST_STRING.hashCode()),
                futureTask.get());
        executorService.shutdown();
    }
}
