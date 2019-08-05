package com.lib;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public final class PathsList {
    public static final HashMap<String, Path> PATH_MAP = new HashMap<>(
            Map.of(
                    FileNames.GUI_CONFIG, Paths.get(""),
                    FileNames.SW_MS_CONFIG, Paths.get(""),
                    FileNames.DDTO, Paths.get("")
            )
    );
//    public static final Path LOCAL_DB_INSTALL_CHECK_FILE = PathUtil.stringToPath(
//            "C:", "Users", System.getProperty("user.name"), "Desktop", "blob",
//            FileNames.LOCAL_DB_INSTALL_CHECK_FILE);
    public static Path toppAppConfig = null;
    public static Path SWexe = null;
    public static ArrayList<Path> baseBlempPaths = new ArrayList<>();
    public static Path userSelectedBlemp = null;
    public static String blobString = null;
    public static Path previewConfig = null;
//    public static final Path DB_DAEMON_JAR;
    public static Path baseBlobDirectory = null;
}
