package com.lib;

import java.nio.file.Files;

public final class BlobDirectory {
    public static void validateLocalBlobDatabaseInstance() throws InvalidInstallException {
//        var fileCheckStringPath = installDirectory.toString() + "\\blob\\.git";
//
//        var process = new ProcessBuilder("cmd.exe", "/c", "cd",
//                PathsList.INSTALL_DIRECTORY.toString() + "\\blob", "&&", "git", "pull")
//                .start();
//
//        var fileCheck = Paths.get(fileCheckStringPath);
//        var process = new ProcessBuilder("cmd.exe", "/c", "cd",
//                installDirectory.toString(), "&&", "git", "clone",
//                "https://github.com/BlakeOlinger/blob").start();

        if (Files.exists(PathsList.LOCAL_DB_INSTALL_CHECK_FILE)) {
            System.out.println(" - Local Blob Database Instance - Found");

            if (!Files.exists(PathsList.DB_DAEMON_JAR))
                if (Internet.isConnected()) {
                    System.out.println(" - Syncing local database instance with remote");

                    new ExecuteProcess("cmd.exe", "/c", "cd",
                            PathsList.INSTALL_DIRECTORY.toString() + "\\blob",
                            "&&", "git", "pull").execute();
                } else
                    System.out.println(" - Could not update local database instance - no internet connection");
        } else
            if (Internet.isConnected()) {
                    System.out.println(" - Local Blob Database Instance - Not Found");

                    new ExecuteProcess("cmd.exe", "/c", "cd", PathsList.INSTALL_DIRECTORY.toString(),
                            "&&", "git", "clone", "https://github.com/BlakeOlinger/blob").execute();

                    if (Files.exists(PathsList.LOCAL_DB_INSTALL_CHECK_FILE))
                        System.out.println(" - Local Blob Database Instance - Created");

                    throw new InvalidInstallException(FileNames.LOCAL_DB_INSTALL_CHECK_FILE);
                }
    }
}
