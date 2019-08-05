package com.lib;

import bo.core.system.IniFile;

public final class Initialize {
    public static boolean microservice(Microservice name) {
        switch (name) {
            case TOPP_APP:
               var initSuccess = bo.core.system.Initialize.createAndInitialize(
                        PathsList.PATH_MAP,
                        Commands.INIT_COMMAND_MAP,
                        FileNames.INSTALL_DIRECTORY,
                        new IniFile(FileNames.GUI_INI, Commands.GUI_INI),
                        FileNames.GUI_CONFIG, FileNames.SW_MS_CONFIG, FileNames.DDTO
                );

               var blobDatabaseInitSuccess = LocalDatabase.initialize(
                       FileNames.BLOB_DATABASE_URL,
                       "C:", "Users",
                       System.getProperty("user.name"), "Desktop",
                       FileNames.INSTALL_DIRECTORY
               );

               var programBinDatabaseInitSuccess = LocalDatabase.initialize(
                       FileNames.PROGRAM_BIN_DATABASE_URL,
                       "C:", "Users",
                       System.getProperty("user.name"), "Desktop",
                       FileNames.INSTALL_DIRECTORY
               );

                return initSuccess && blobDatabaseInitSuccess && programBinDatabaseInitSuccess;
            default:
                return false;
        }
    }
}
