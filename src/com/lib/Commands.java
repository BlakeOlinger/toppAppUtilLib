package com.lib;

public final class Commands {
    private static final String TRUE = "0";
    private static final String FALSE = "1";

    private static final String RUN_STATE_INIT = TRUE;
    private static final String ACTION_STATE_INIT = FALSE;
    private static final String SW_CLOSE_PART_INIT = FALSE;

    private static final String STATEMENT_DELIMITER = "!";
    private static final String SEGMENT_DELIMITER = "$";
    private static final String SIGNIFICANT_VALUE_DELIMITER = "#";

    public static final String PROGRAM_INIT = RUN_STATE_INIT + ACTION_STATE_INIT;
    public static final String SW_DAEMON_INIT = RUN_STATE_INIT + ACTION_STATE_INIT + SW_CLOSE_PART_INIT +
            STATEMENT_DELIMITER;
}
