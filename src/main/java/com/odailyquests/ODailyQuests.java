package com.odailyquests;

import org.bukkit.plugin.java.JavaPlugin;

public class ODailyQuests extends JavaPlugin {
    private static ODailyQuests instance;

    @Override
    public void onEnable() {
        instance = this;
        getLogger().info("ODailyQuests Hardcore Enabled!");
        QuestManager.loadQuests();
        getCommand("daily").setExecutor(new Commands.DailyQuestCommand());
        getCommand("questcomplete").setExecutor(new Commands.QuestCompleteCommand());
        QuestManager.scheduleDailyReset();
    }

    @Override
    public void onDisable() {
        QuestManager.savePlayerData();
        getLogger().info("ODailyQuests Hardcore Disabled!");
    }

    public static ODailyQuests getInstance() {
        return instance;
    }
}
