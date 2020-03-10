package api_Improvement;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * @author yibozhang
 * @date 2020/3/10
 * IO增强
 */
public class IOTest {

    public static void main(String[] args) throws IOException {
        String path = "/Users/yibozhang/Desktop/a.txt";
        write(path, "123");
        System.out.println(read(path));

        String outPath = "/Users/yibozhang/Desktop/b.txt";
        transfer(path,outPath);
        System.out.println(read(outPath));
    }

    private static void write(String path, String content) throws IOException {
        Files.writeString(Paths.get(path), content, StandardCharsets.UTF_8);
    }

    private static String read(String path) throws IOException {
        return Files.readString(Paths.get(path), StandardCharsets.UTF_8);
    }

    public static void transfer(String path1,String path2) throws IOException {
        InputStream is = new FileInputStream(path1);
        OutputStream os = new FileOutputStream(path2);
        is.transferTo(os);
    }

}
