package com.lib;

import bo.core.system.PathUtil;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class InitializeTest {

    @Test
    void true_for_microservice_TOPP_APP_initialized() {
        var testRoot = PathUtil.stringToPath("C:", "Users",
                System.getProperty("user.name"), "Desktop", FileNames.INSTALL_DIRECTORY);
        try {
            assertTrue(Initialize.microservice(Microservice.TOPP_APP));
        } finally {
            // throws an access denied exception on the local database instance's hidden files
//            FilesUtil.delete(testRoot);
        }
    }
}