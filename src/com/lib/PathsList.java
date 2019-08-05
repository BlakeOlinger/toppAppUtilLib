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
    public static Path SWexe = null;
    public static ArrayList<Path> baseBlempPaths = new ArrayList<>();
    public static Path userSelectedBlemp = null;
    public static String blobString = null;
    public static Path previewConfig = null;
}
