package Network;

import java.net.URL;

public class UrlInfo {
    public static void main(String[] args) {
        try {
            URL url = new URL("http://google.com");
            System.out.println("프로토콜: " + url.getProtocol());
            System.out.println("port: " + url.getPort());
            System.out.println("host: + " + url.getHost());
            System.out.println("file: " + url.getFile());
            System.out.println("rest..: " + url.toExternalForm());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
