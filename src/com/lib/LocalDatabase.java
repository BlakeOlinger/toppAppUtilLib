package com.lib;

import bo.core.system.LocalGitDatabase;
import bo.core.system.PathUtil;

public final class LocalDatabase {
    static boolean initialize(String gitURL, String... rootDirectoryComponents) {
        var rootDirectory = PathUtil.stringToPath(rootDirectoryComponents);

        if (!LocalGitDatabase.exists(rootDirectory)) {
            return LocalGitDatabase.install(gitURL, rootDirectoryComponents);
        } else {
            var gitURLComponents = gitURL.split("/");

            var gitDirectory = PathUtil.addStringToPath(rootDirectory,
                    gitURLComponents[gitURLComponents.length - 1]
                    );

            return LocalGitDatabase.updateAndSync(gitDirectory);
        }
    }
}
