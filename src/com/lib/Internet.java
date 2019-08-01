package com.lib;

import java.io.IOException;
import java.net.URL;

public final class Internet {
    public static boolean isConnected() {
        try {
            var url = new URL("https://www.google.com");

            url.openConnection();

            return true;
        } catch (IOException e) {
            e.printStackTrace();

            return false;
        }
    }
}
