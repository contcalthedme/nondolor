import java.io.FileInputStream;
import java.io.IOException;

public class ReadFileInChunks {
    public static void main(String[] args) {
        int chunksize = 200000;
        byte[] buffer = new byte[chunksize];
        
        try (FileInputStream fis = new FileInputStream("large_file.txt")) {
            int bytesRead;
            while ((bytesRead = fis.read(buffer)) != -1) {
                // Process the chunk
                System.out.write(buffer, 0, bytesRead);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
