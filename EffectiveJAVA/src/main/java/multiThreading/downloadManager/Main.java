package multiThreading.downloadManager;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        Thread t1 = null;
        FileDownloader downloader = new FileDownloader("https://www.youtube.com/watch?v=4aYvLz4E1Ts&t=3503s", "/Users/satyam/Downloads/bagdad.mp4");
        t1 = new Thread(downloader);
        t1.start();
    }
}
