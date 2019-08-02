package com.lib;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Map;

final class InstallRoot {

    static Path getInstallRootPath(String currentDirectory, String userName) {
         var splitPathMap = splitAtPathSlash(currentDirectory);

         // if detects a non-windows backward slash return null
         // - add linux etc later if needed
         if (splitPathMap.containsKey(SlashDelimiterType.BACKWARD))
             return Paths.get(splitPathMap.get(SlashDelimiterType.BACKWARD)
                     + "\\Users\\" + userName + "\\Desktop\\" + FileNames.INSTALL_DIRECTORY);

         return Paths.get("");
     }

    static Map<SlashDelimiterType, String> splitAtPathSlash(String currentDirectory) {
        switch (getSlashDelimiterType(currentDirectory)) {
            case FORWARD:
                return Map.of(SlashDelimiterType.FORWARD, currentDirectory.split("/")[0]);
            case BACKWARD:
                return Map.of(SlashDelimiterType.BACKWARD, currentDirectory.split("\\\\")[0]);
            default:
                return Map.of(SlashDelimiterType.NULL, "");
        }
    }

    static SlashDelimiterType getSlashDelimiterType (String currentDirectory) {
        if (currentDirectory.contains("/"))
            return SlashDelimiterType.FORWARD;
        else if (currentDirectory.contains("\\"))
            return SlashDelimiterType.BACKWARD;
        else
            return SlashDelimiterType.NULL;
    }

    enum SlashDelimiterType {
        FORWARD, BACKWARD, NULL
    }
}
