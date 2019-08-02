package com.lib;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public final class ToppFiles {

    public static boolean validateFile(String fileName, Path path) {
        if (!Files.exists(path)) {
            try {
                System.out.println(" - " + fileName + " - Not Found");

                Files.createFile(path);

                System.out.println(" - " + fileName + " - Created");

                return false;
            } catch (IOException e) {
                e.printStackTrace();

                System.out.println("TOPP App GUI - Exit");

                return true;
            }
        } else {
            System.out.println(" - " + fileName + " - Found");

            return false;
        }
    }

    public static void validateDirectory(String directoryName, Path directoryPath) throws InvalidInstallException {

        if (Files.exists(directoryPath))
            System.out.println(" - " + directoryName + " Directory - Found");
        else {
            try {
                System.out.println(" - " + directoryName + " - Not Found");

                Files.createDirectory(directoryPath);

                System.out.println(" - " + directoryName + " - Directory Created");
            } catch (IOException e) {
                e.printStackTrace();

                System.out.println("TOPP App GUI - Exit");

                throw new InvalidInstallException(directoryName);
            }
        }
    }

    public static boolean writeFile(String fileName, Path path, String writeMessage) {
        try {
            Files.writeString(path, writeMessage);

            System.out.println(" - " + fileName + " - Successful Write");

            return false;
        } catch (IOException e) {
            e.printStackTrace();

            System.out.println("TOPP App GUI - Exit");
            return true;
        }
    }
}
