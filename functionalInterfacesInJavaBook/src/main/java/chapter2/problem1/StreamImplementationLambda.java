package chapter2.problem1;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class StreamImplementationLambda {
    public static void main(String[] args) {
        InputStreamOpenerLambda dataInputStream = x -> new DataInputStream(new FileInputStream(x));
        InputStreamOpenerLambda objectInputStream = x -> new ObjectInputStream(new FileInputStream(x));
        InputStreamOpenerLambda bufferedInputStream = x -> new BufferedInputStream(new FileInputStream(x));
    }
}
