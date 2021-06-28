import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.HttpURLConnection;

public class HTTPConnection {
    public void downloadFile() throws IOException {
//        URL url = new URL("https://www.tutorialspoint.com/javafx/images/javafx.jpg");
        URL url = new URL("https://docs.oracle.com/javase/tutorial/networking/urls/creatingUrls.html");
        HttpURLConnection http = (HttpURLConnection) url.openConnection();

        int code = http.getResponseCode();
        // here http ok = 200
        // if(code ==  HttpURLConnection.HTTP_OK) {
        if(code == 200) {
            String type = http.getContentType();
//            String fileName = "downloaded_file.jpg";
//            String fileName = "downloaded_file.txt";
            String fileName = "downloaded_file.html";

            int length = http.getContentLength();

            System.out.println("File type: " + type);
            System.out.println("Length : " + (length/1000) + " KB");

            // opening input stream from the HTTP connection
            InputStream inputStream = http.getInputStream();

           // opening output stream to save into a file
            FileOutputStream outputStream = new FileOutputStream(fileName);
            outputStream.write(inputStream.readAllBytes());

            inputStream.close();
            outputStream.close();

            System.out.println("File downloaded successfully!");

            http.disconnect();
        }
    }
}
