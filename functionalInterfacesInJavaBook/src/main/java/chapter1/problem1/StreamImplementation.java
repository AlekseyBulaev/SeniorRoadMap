package chapter1.problem1;

import java.io.DataInputStream;
import java.io.InputStream;

public class StreamImplementation {
    public static void main(String[] args) {
        InputStreamOpener dataInputStream = new InputStreamOpener() {
            @Override
            public InputStream open(String arg) {

                return new DataInputStream();
            }
        };
    }
}
