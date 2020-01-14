package chapter1.problem1;

import java.io.InputStream;

@FunctionalInterface
public interface InputStreamOpener {
    InputStream open(String arg);
}
