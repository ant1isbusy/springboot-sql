package com.antoine.footy;

import java.util.logging.Logger;

public class AppLogger
{
    private static final Logger logger = Logger.getLogger(AppLogger.class.getName());

    public static void AppStartup(String port)
    {
        logger.info("App starting on port: " + port + "!");
    }
}
