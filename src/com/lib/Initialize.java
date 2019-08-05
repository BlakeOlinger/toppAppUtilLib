package com.lib;

import bo.core.system.IniFile;

public final class Initialize {
    public static boolean microservice(Microservice name) {
        switch (name) {
            case TOPP_APP:
               return bo.core.system.Initialize.createAndInitialize(
                        PathsList.PATH_MAP,
                        Commands.INIT_COMMAND_MAP,
                        FileNames.INSTALL_DIRECTORY,
                        new IniFile(FileNames.GUI_INI, Commands.GUI_INI),
                        FileNames.GUI_CONFIG, FileNames.SW_MS_CONFIG, FileNames.DDTO
                );
            default:
                return false;
        }
    }
}
