package com.lib;

import bo.core.system.FilesUtil;
import bo.core.system.PathUtil;
import org.junit.jupiter.api.Test;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertTrue;

class InitializeTest {

    @Test
    void true_for_file_exists_for_path() {
        var testRoot = PathUtil.stringToPath("C:", "Users",
                System.getProperty("user.name"), "lark");
        var testPath = PathUtil.addStringToPath(testRoot, "test.txt");

        assertTrue(Files.exists(Initialize.getEmptyPath(testPath)));

        FilesUtil.delete(testRoot);
    }

    @Test
    void true_for_empty_files_created_from_hash_map_for_matching_string_keys_at_string_install_directory() {
        var testMap = new HashMap<>(
                Map.of(
                        "testOne.txt", Paths.get(""),
                        "testTwo.txt", Paths.get("")
                )
        );
        var targetDirectory = "tot";
        var testOne = "testOne.txt";
        var testTwo = "testTwo.txt";
        var testRoot = PathUtil.stringToPath("C:", "Users",
                System.getProperty("user.name"), "Desktop", targetDirectory);

        assertTrue(Initialize.createEmptyFileStructure(testMap, targetDirectory, testOne, testTwo));

        FilesUtil.delete(testRoot);
    }
}