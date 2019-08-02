package com.lib;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InstallRootTest {

    @Test
    void getSlashDelimiterType_true_forBackwardSlash() {
        var expectedDelimiter = InstallRoot.SlashDelimiterType.BACKWARD;
        var testPath = "C:\\foo.exe";

        var result = InstallRoot.getSlashDelimiterType(testPath);

        assertEquals(expectedDelimiter, result);
    }

    @Test
    void getSlashDelimiterType_true_forForwardSlash() {
        var expectedDelimiter = InstallRoot.SlashDelimiterType.FORWARD;
        var testPath = "C:/foo.exe";

        var result = InstallRoot.getSlashDelimiterType(testPath);

        assertEquals(expectedDelimiter, result);
    }

    @Test
    void getSlashDelimiterType_true_forNoSlash() {
        var expectedDelimiter = InstallRoot.SlashDelimiterType.NULL;
        var testPath = "C:foo.exe";

        var result = InstallRoot.getSlashDelimiterType(testPath);

        assertEquals(expectedDelimiter, result);
    }

    @Test
    void splitAtPathSlash_forwardSlashDelimiter() {
        var expected = "C:";
        var testPath = "C:/foo.exe";

        var result = InstallRoot.splitAtPathSlash(testPath).get(InstallRoot.SlashDelimiterType.FORWARD);

        assertEquals(expected, result);
    }

    @Test
    void splitAtPathSlash_backwardSlashDelimiter() {
        var expected = "C:";
        var testPath = "C:\\foo.exe";

        var result = InstallRoot.splitAtPathSlash(testPath).get(InstallRoot.SlashDelimiterType.BACKWARD);

        assertEquals(expected, result);
    }

    @Test
    void splitAtPathSlash_noSlashDelimiter() {
        var expected = "";
        var testPath = "C:foo.exe";

        var result = InstallRoot.splitAtPathSlash(testPath).get(InstallRoot.SlashDelimiterType.NULL);

        assertEquals(expected, result);
    }

    @Test
    void getInstallRootPath_windowsInstall() {
        var expected = "C:\\Users\\foo\\Desktop\\SolidWorks Daemon";
        var testPath = "C:\\foo\\bar";
        var testUserName = "foo";

        var result = InstallRoot.getInstallRootPath(testPath, testUserName).toString();

        assertEquals(expected, result);
    }

    @Test
    void getInstallRootPath_non_windowsInstall() {
        var expected = "";
        var testPath = "/bin/usr/home/";
        var testUserName = "foo";

        var result = InstallRoot.getInstallRootPath(testPath, testUserName).toString();

        assertEquals(expected, result);
    }
}