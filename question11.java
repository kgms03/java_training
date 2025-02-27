import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class question11 {
    public static void main(String[] args){
        String filePath="C:/Users/kgowdam/Desktop/sample.txt";
        String Content="This is the content to write in the file";

        writeFile(filePath,Content);
    }
    public static void writeFile(String filePath, String Content){
        File file=new File(filePath);
        try(PrintWriter Writer= new PrintWriter(file)){
            Writer.println(Content);
        }
        catch(FileNotFoundException e){
            System.out.println("File not found" +filePath);
        }
    }
}
