package chapter1.problem1;

import java.io.*;

public class StreamImplementation {
    public static void main(String[] args) {

        InputStreamOpener dataInputStream = new InputStreamOpener() {
            @Override
            public InputStream open(String arg) throws FileNotFoundException {
                return new DataInputStream(new FileInputStream(arg));
            }
        };

        InputStreamOpener objectInputStream = new InputStreamOpener() {
            @Override
            public InputStream open(String arg) throws IOException {
                return new ObjectInputStream(new FileInputStream(arg));
            }
        };

        InputStreamOpener bufferedInputStream = new InputStreamOpener() {
            @Override
            public InputStream open(String arg) throws IOException {
                return new BufferedInputStream(new FileInputStream(arg));
            }
        };
    }
}
