package com.lib;

public final class Commands {
    public static final String GUI_INIT = "00";
    public static final String PROGRAM_INIT = "01";
    public static final String SW_DAEMON_INIT = "011!";
    public static final String PREVIEW_ACTION_SET = "00";

    public static class SWDaemon {
        public static final String USER_ACTION_SET = "001!";
        public static final String CLOSE_SW_PART = "010!";
        public static final String EXIT = "111!";
    }
}
