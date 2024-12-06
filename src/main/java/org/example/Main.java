package org.example;

import net.glxn.qrgen.QRCode;
import net.glxn.qrgen.image.ImageType;

import java.awt.*;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.Scanner;
import java.util.UUID;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try{
            System.out.print("Enter the file name (without extension): ");
            String fileName = scanner.nextLine();
            System.out.print("Enter the content for the QR code: ");
            String content = scanner.nextLine();
            String uniqueFileName = fileName + "_" + UUID.randomUUID().toString();

            // Define the file path
            File file = new File("./QRCodes/" + uniqueFileName + ".png");

           ByteArrayOutputStream out = QRCode.from(content).to(ImageType.PNG).stream();
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            fileOutputStream.write(out.toByteArray());
            fileOutputStream.close();

            if (Desktop.isDesktopSupported()) {
                Desktop desktop = Desktop.getDesktop();
                if (file.exists()) {
                    desktop.open(file);
                }
            } else {
                System.out.println("Opening the file is not supported on your system.");
            }

        }catch (Exception e) {
            System.err.println("An error occurred while generating the QR code.");
            e.printStackTrace();
        } finally {
            scanner.close();
        }
    }
}