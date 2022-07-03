package ru.chernov.strategy.util;

import java.util.logging.Level;
import java.util.logging.Logger;

public final class MyLogger {

    private MyLogger() {
        throw new IllegalStateException("Utility class");
    }

    public static void log(String message) {
        var logger = Logger.getLogger("My logger");

        logger.log(Level.INFO, message);
    }
}
