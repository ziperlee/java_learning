package Iostreams;

import java.io.IOException;
import java.io.StringReader;

/**
 * 从内存输入
 *
 * @author liwei
 * @createTime 2020/03/26
 */

public class MemoryInput {
    public static void
    main(String[] args) throws IOException {
        StringReader in = new StringReader(
                BufferedInputFile.read("src/main/java/Iostreams/MemoryInput.java"));
        int c;
        while ((c = in.read()) != -1)
            System.out.print((char) c);
    }
}
