package com.lib;

import java.nio.file.Path;
import java.util.ArrayList;

// TODO - convert initialized files to hash map <String, Path>
//  -  where the key is the actual string name of the file
//  -  using the FileNames class
//  -  use initialize class
//  -  wrap the empty paths method in a method that writes
//  -  the initialized state to the files
//  -  this will be in the form of a hash map <String, String>
//  -  where the key is the same name as the key of the path map
//  -  to sync the initialize message to the file
public final class PathsList {
//    public static final Path LOCAL_DB_INSTALL_CHECK_FILE = PathUtil.stringToPath(
//            "C:", "Users", System.getProperty("user.name"), "Desktop", "blob",
//            FileNames.LOCAL_DB_INSTALL_CHECK_FILE);
    public static Path userIni = null;
    public static Path toppAppConfig = null;
    public static Path SWexe = null;
    public static Path SWconfig = null;
    public static Path DDTO = null;
    public static ArrayList<Path> baseBlempPaths = new ArrayList<>();
    public static Path userSelectedBlemp = null;
    public static String blobString = null;
    public static Path previewConfig = null;
//    public static final Path DB_DAEMON_JAR;
    public static Path baseBlobDirectory = null;
}
