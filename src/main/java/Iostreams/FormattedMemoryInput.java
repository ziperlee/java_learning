package Iostreams;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;

/**
 * description
 *
 * @author liwei
 * @createTime 2020/03/26
 */

public class FormattedMemoryInput {
    public static void main(String[] args) {
        try (
                DataInputStream in = new DataInputStream(
                        new ByteArrayInputStream(
                                BufferedInputFile.read(
                                        "src/main/java/Iostreams/FormattedMemoryInput.java")
                                        .getBytes()))
        ) {
            while (true)
                System.out.write((char) in.readByte());
        } catch (EOFException e) {
            System.out.println("\nEnd of stream");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
