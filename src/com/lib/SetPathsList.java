package com.lib;

import java.nio.file.Path;
import java.nio.file.Paths;

final class SetPathsList {
    static Path byFileName(String currentDirectory,
                           String userName,
                           String fileName) {
        return Paths.get(InstallRoot.getInstallRootPath(
                currentDirectory,
                userName).toString()
                + "\\" + fileName);
    }
}
