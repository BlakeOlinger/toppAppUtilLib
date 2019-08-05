package com.lib;

import bo.core.system.FilesUtil;
import bo.core.system.PathUtil;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

public class CommandsSWDaemonTest {
    @Test
    void true_for_write_to_existing_SW_MS_config_file() {
        if (FilesUtil.createFile(PathUtil.stringToPath("C:", "Users",
                System.getProperty("user.name"), "Desktop", FileNames.INSTALL_DIRECTORY,
                FileNames.SW_MS_CONFIG)))
            assertTrue(Commands.SWDaemon.stop());
        else
            fail();
    }
}
