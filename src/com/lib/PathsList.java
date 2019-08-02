package com.lib;

import java.nio.file.Path;
import java.util.ArrayList;

public final class PathsList {
    public static Path userIni = null;
    public static Path toppAppConfig = null;
    public static Path SWexe = null;
    public static Path SWconfig = null;
    public static Path DDTO = null;
    public static ArrayList<Path> baseBlempPaths = new ArrayList<>();
    public static Path userSelectedBlemp = null;
    public static String blobString = null;
    public static Path previewConfig = null;
    public static final Path DB_DAEMON_JAR = SetPathsList.byFileName(
            System.getProperty("user.dir"),
            System.getProperty("user.name"),
            FileNames.DB_DAEMON_JAR
    );
    public static final Path INSTALL_DIRECTORY = InstallRoot.getInstallRootPath(
            System.getProperty("user.dir"), System.getProperty("user.name"));
    public static Path baseBlobDirectory = null;
    public static final Path LOCAL_DB_INSTALL_CHECK_FILE =
            SetPathsList.byFileName(
                    System.getProperty("user.dir"),
                    System.getProperty("user.name"),
                    FileNames.LOCAL_DB_INSTALL_CHECK_FILE
            );
}
