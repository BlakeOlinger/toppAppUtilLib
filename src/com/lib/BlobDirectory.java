package com.lib;

public final class BlobDirectory {
    // TODO - fully test this method - modify so each possibility returns unique ENUM
    //  -  or exception like the current InvalidInstallException -
//    public static void validateLocalBlobDatabaseInstance() throws InvalidInstallException {
//        if (Files.exists(PathsList.LOCAL_DB_INSTALL_CHECK_FILE)) {
//            System.out.println(" - Local Blob Database Instance - Found");
//
//            if (!Files.exists(PathsList.DB_DAEMON_JAR))
//                if (Internet.isConnected()) {
//                    System.out.println(" - Syncing local database instance with remote");
//
//                    // TODO - move ExecuteProcess to lower level lib - fully test
////                    new ExecuteProcess(PathsList.INSTALL_DIRECTORY, "cmd.exe", "/c", "git", "pull").execute();
//                } else
//                    System.out.println(" - Could not update local database instance - no internet connection");
//        } else
//            if (Internet.isConnected()) {
//                    System.out.println(" - Local Blob Database Instance - Not Found");
//
////                    new ExecuteProcess(PathsList.INSTALL_DIRECTORY, "cmd.exe", "/c","git",
////                            "clone", "https://github.com/BlakeOlinger/blob").execute();
//
//                    if (Files.exists(PathsList.LOCAL_DB_INSTALL_CHECK_FILE))
//                        System.out.println(" - Local Blob Database Instance - Created");
//
//                    throw new InvalidInstallException(FileNames.LOCAL_DB_INSTALL_CHECK_FILE);
//                }
//    }
}
