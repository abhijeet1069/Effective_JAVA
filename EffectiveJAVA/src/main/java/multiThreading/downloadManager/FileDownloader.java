package multiThreading.downloadManager;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;

public class FileDownloader implements Runnable{
    private String fileURL;
    private String saveFilePath;

    public FileDownloader(String fileURL, String saveFilePath) {
        this.fileURL = fileURL;
        this.saveFilePath = saveFilePath;
    }

    @Override
    public void run() {
        try {
            downloadFile(fileURL, saveFilePath);
            System.out.println("Download completed successfully!");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void downloadFile(String fileURL, String saveFilePath) throws IOException {
        URL url = new URL(fileURL);
        HttpURLConnection httpConn = (HttpURLConnection) url.openConnection();
        int responseCode = httpConn.getResponseCode();

        // Check HTTP response code to ensure successful request
        if (responseCode == HttpURLConnection.HTTP_OK) {
            String fileName = "";
            String disposition = httpConn.getHeaderField("Content-Disposition");
            String contentType = httpConn.getContentType();
            int contentLength = httpConn.getContentLength();

            // Extract file name from the HTTP header field
            if (disposition != null) {
                int index = disposition.indexOf("filename=");
                if (index > 0) {
                    fileName = disposition.substring(index + 10, disposition.length() - 1);
                }
            } else {
                // Extracts file name from URL if HTTP header is not present
                fileName = fileURL.substring(fileURL.lastIndexOf("/") + 1);
            }

            System.out.println("Content-Type = " + contentType);
            System.out.println("Content-Disposition = " + disposition);
            System.out.println("Content-Length = " + contentLength);
            System.out.println("File Name = " + fileName);

            // Open input stream from the HTTP connection
            InputStream inputStream = httpConn.getInputStream();
            BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
            FileOutputStream fileOutputStream = new FileOutputStream(saveFilePath);
            byte[] buffer = new byte[4096];
            int bytesRead = -1;
            int totalBytesRead = 0;
            int percentCompleted = 0;
            long fileSize = contentLength;

            // Reading and writing the file with buffer
            while ((bytesRead = bufferedInputStream.read(buffer)) != -1) {
                fileOutputStream.write(buffer, 0, bytesRead);
                totalBytesRead += bytesRead;
                if (fileSize > 0) {
                    percentCompleted = (int) (totalBytesRead * 100 / fileSize);
                    System.out.print("Downloaded " + percentCompleted + "%\r");
                }
            }

            // Close all streams
            fileOutputStream.close();
            bufferedInputStream.close();
            System.out.println("\nFile downloaded!");

        } else {
            System.out.println("No file to download. Server replied HTTP code: " + responseCode);
        }
        httpConn.disconnect();
    }
}

