package com.aryan.configuration;

import io.github.cdimascio.dotenv.Dotenv;
import io.github.cdimascio.dotenv.DotenvBuilder;

// configure env variable
public class config {
    private static final Dotenv dotenv = new DotenvBuilder().ignoreIfMissing().load();

    public static String botToken = dotenv.get("bottoken");
}
