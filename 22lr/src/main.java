import java.io.*;
import java.io.File;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;

public class main {

    public static void main(String[] args) {
        main a = new main();
        File in = new File("Users/irinagritsiv/Desktop/кпз/21lr/src/main.java");
        try {
            a.backOrderTheFile();
        } catch (FileNotFoundException e) {
            System.err.println("File not found");
        } catch (IOException e) {
            System.out.println("Что-то не так!!!");
        } catch(IndexOutOfBoundsException bound){
            System.err.println(bound.getMessage());
        } catch(SecurityException se){
            System.err.println("Access to file denied!");
        } catch (Exception e) {
            System.out.println("File empty!");
        }
    }

    static String readFile(String path, Charset encoding)
            throws IOException{
        byte[] encoded = Files.readAllBytes(Paths.get(path));
        return new String(encoded, encoding);
    }

    private void backOrderTheFile() throws IOException {
        Charset charset = Charset.forName("US-ASCII");
        String str = readFile("Users/irinagritsiv/Desktop/кпз/21lr/src/main.java", charset);
        var tmpCharArray = str.toCharArray();
        StringBuilder tmp = new StringBuilder();
        for(var i = str.length()-1; i > 0; i--)
            tmp.append(tmpCharArray[i]);

        PrintWriter outputStream = new PrintWriter(new FileOutputStream("Users/irinagritsiv/Desktop/кпз/21lr/src/main.java", false));
        outputStream.println(tmp);
        outputStream.close();
    }
}