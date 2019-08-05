package com.lib;

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

    public static class SWDaemon {
        public static final String USER_ACTION_SET = "001!";
        public static final String CLOSE_SW_PART = "010!";
        public static final String EXIT = "111!";
        public static final String EXE_START = "\"" + PathsList.SWexe.toString() + "\"";
    }
}
