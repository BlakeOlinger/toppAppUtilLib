package com.lib;

import bo.core.system.PathUtil;

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
    public static final Path ROOT_INSTALL_DIRECTORY = PathUtil.stringToPath(
            "C:", "Users", System.getProperty("user.name"),
            "Desktop", FileNames.INSTALL_DIRECTORY
    );
    public static final Path SW_MS_EXE_DIRECTORY = PathUtil.addStringToPath(
            ROOT_INSTALL_DIRECTORY,
            FileNames.PROGRAM_BIN_DATABASE_INSTALL_DIRECTORY
            );
    public static final Path SW_MS_EXE = PathUtil.addStringToPath(
            ROOT_INSTALL_DIRECTORY,
            FileNames.PROGRAM_BIN_DATABASE_INSTALL_DIRECTORY,
            FileNames.SW_MS_EXE
            );
    public static ArrayList<Path> baseBlempPaths = new ArrayList<>();
    public static Path userSelectedBlemp = null;
    public static String blobString = null;
    public static Path previewConfig = null;
}
