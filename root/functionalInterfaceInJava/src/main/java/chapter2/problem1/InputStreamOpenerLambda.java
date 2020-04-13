package chapter2.problem1;

import java.io.IOException;
import java.io.InputStream;

@FunctionalInterface
public interface InputStreamOpenerLambda {
    InputStream open(String arg) throws IOException;
}
