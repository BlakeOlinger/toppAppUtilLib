package com.lib;

import bo.core.system.ExecuteNative;
import bo.core.system.FilesUtil;
import bo.core.system.PathUtil;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

public final class Commands {
    public static final HashMap<String, String> INIT_COMMAND_MAP = new HashMap<>(
            Map.of(
                    FileNames.GUI_CONFIG, "00",
                    FileNames.SW_MS_CONFIG, "011!",
                    FileNames.DDTO, ""
            )
    );
    public static final String GUI_INI = "0000";
    public static final String PROGRAM_INIT = "01";
    public static final String PREVIEW_ACTION_SET = "00";

    public static final class SWDaemon {
        public static final String USER_ACTION_SET = "001!";
        public static final String CLOSE_SW_PART = "010!";
        public static final String EXIT = "111!";

        // FIXME - create meaningful test - none at the moment
        //  -  check for live process
        public static void start() {
            ExecuteNative.processAsync(
                    new File(PathUtil.pathToString(PathsList.SW_MS_EXE_DIRECTORY)),
                    FileNames.SW_MS_EXE
            );
        }

        public static boolean stop() {
            return FilesUtil.write(EXIT, "C:", "Users",
                    System.getProperty("user.name"), "Desktop",
                    FileNames.INSTALL_DIRECTORY, FileNames.SW_MS_CONFIG);
        }
    }

}
