/*
import java.io.IOException;

public class Throws {
        public static void findFile() throws IOException {
            //throw new IOException("File not found");
            try {
                //throw new IOException("File not found");
                System.out.println("Rest of code in try block");
                throw new IOException("File not found");
            } catch (IOException e) {
                System.out.println(e.getMessage());
                throw e;
            }
        }

        public static void main(String[] args) throws IOException {

                Throws.findFile();


        }
}
*/
