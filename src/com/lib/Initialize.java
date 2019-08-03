package com.lib;

import bo.core.system.FilesUtil;
import bo.core.system.PathUtil;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashMap;

public class Initialize {
    static Path getEmptyPath(Path path) {
        FilesUtil.createFile(path);

        return path;
    }

    public static boolean createEmptyFileStructure(HashMap<String, Path> fileMap, String targetDirectory, String... files) {
        var boolList = new ArrayList<Boolean>();
        var rootPath = PathUtil.stringToPath("C:", "Users",
                System.getProperty("user.name"), "Desktop", targetDirectory);

        for (String key : files) {
            var path = PathUtil.addStringToPath(rootPath, key);

            fileMap.put(key, getEmptyPath(path));

            boolList.add(Files.exists(path));
            }

        return !boolList.contains(Boolean.FALSE);
    }
}
