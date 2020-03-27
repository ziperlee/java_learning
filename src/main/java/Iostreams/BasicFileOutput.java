package Iostreams;

import java.io.*;

/**
 * description
 *
 * @author liwei
 * @createTime 2020/03/26
 */

public class BasicFileOutput {
    static String file = "BasicFileOutput.dat";

    public static void main(String[] args) {
        try (
                BufferedReader in = new BufferedReader(
                        new StringReader(
                                BufferedInputFile.read(
                                        "src/main/java/Iostreams/BasicFileOutput.java")));
                PrintWriter out = new PrintWriter(
                        new BufferedWriter(new FileWriter(file)))
        ) {
            in.lines().forEach(out::println);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        // Show the stored file:
        System.out.println(BufferedInputFile.read(file));
    }
}
