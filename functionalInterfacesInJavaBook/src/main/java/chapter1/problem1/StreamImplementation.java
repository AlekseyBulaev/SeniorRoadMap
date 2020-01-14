package chapter1.problem1;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;

public class StreamImplementation {
    public static void main(String[] args) {
        InputStreamOpener dataInputStream = new InputStreamOpener() {
            @Override
            public InputStream open(String arg) {

                return new DataInputStream(new InputStream() {
                    @Override
                    public int read() throws IOException {
                        return 0;
                    }
                });
            }
        };
    }
}
