package com.senderman.examplebot;

import com.annimon.tgbotsmodule.BotHandler;
import com.annimon.tgbotsmodule.BotModule;
import com.annimon.tgbotsmodule.Runner;
import com.annimon.tgbotsmodule.beans.Config;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ExampleBot implements BotModule {

    public static void main(String[] args) {
        final String profile = (args.length >= 1 && !args[0].isEmpty()) ? args[0] : "";
        Runner.run(profile, Collections.singletonList(new ExampleBot()));
    }

    @Override
    public BotHandler botHandler(Config config) {
        return new com.senderman.examplebot.ExampleBotHandler();
    }
}