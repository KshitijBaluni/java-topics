package thread;

import java.util.concurrent.Callable;

/***
 * Demo for Executor
 *
 * @author kshitijbaluni
 * @since 12 July 2022
 */
public class CoreJavaExecutor implements Callable<String> {
    private String coreJavaExecutorTask;

    /**
     * Constructor CoreJavaExecutor
     *
     * @param coreJavaExecutorTask
     */
    public CoreJavaExecutor(String coreJavaExecutorTask) {
        this.coreJavaExecutorTask = coreJavaExecutorTask;
    }

    @Override
    public String call() throws Exception {
        return String.format("%s@%s", coreJavaExecutorTask, coreJavaExecutorTask.hashCode());
    }
}
