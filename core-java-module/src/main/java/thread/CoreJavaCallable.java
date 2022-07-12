package thread;

import java.util.concurrent.Callable;

/**
 * Demo for Callable Interface
 *
 * @author kshitijbaluni
 * @since 12 July 2022
 */
public class CoreJavaCallable implements Callable<String> {
    private String callable;

    /***
     * Parameterize constructor.
     *
     * @param callable
     */
    public CoreJavaCallable(String callable) {
        this.callable = callable;
    }

    @Override
    public String call() throws Exception {
        return String.format("%s@%s", callable, callable.hashCode());
    }
}
