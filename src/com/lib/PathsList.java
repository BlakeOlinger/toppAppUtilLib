package com.lib;

import bo.core.system.PathUtil;

import java.nio.file.Path;
import java.util.ArrayList;

public final class PathsList {
    public static final Path LOCAL_DB_INSTALL_CHECK_FILE = PathUtil.stringToPath(
            "C:", "Users", System.getProperty("user.name"), "Desktop", "blob",
            FileNames.LOCAL_DB_INSTALL_CHECK_FILE);
    public static Path userIni = null;
    public static Path toppAppConfig = null;
    public static Path SWexe = null;
    public static Path SWconfig = null;
    public static Path DDTO = null;
    public static ArrayList<Path> baseBlempPaths = new ArrayList<>();
    public static Path userSelectedBlemp = null;
    public static String blobString = null;
    public static Path previewConfig = null;
    public static final Path DB_DAEMON_JAR = PathUtil.stringToPath(
            "C:", "Users", System.getProperty("user.name"), "Desktop",
            FileNames.INSTALL_DIRECTORY, FileNames.DB_DAEMON_JAR);
    public static final Path INSTALL_DIRECTORY = PathUtil.stringToPath("C:", "Users",
        System.getProperty("user.name"), "Desktop", FileNames.INSTALL_DIRECTORY);
    public static Path baseBlobDirectory = null;
}
