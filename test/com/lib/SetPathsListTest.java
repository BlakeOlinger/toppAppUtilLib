package com.lib;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SetPathsListTest {

    @Test
    void byFileName() {
        var expected = "C:\\Users\\foo\\Desktop\\SolidWorks Daemon\\foo.txt";
        var testPath = "C:\\foo.exe";
        var testUserName = "foo.exe";
        var testFileName = "foo.txt";

        var result = SetPathsList.byFileName(
                testPath,
                testUserName,
                testFileName
        ).toString();

        assertEquals(expected, result);
    }
}