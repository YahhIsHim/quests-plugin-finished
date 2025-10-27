package com.odailyquests;

import org.bukkit.Bukkit;
import org.bukkit.scheduler.BukkitRunnable;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.List;

public class QuestManager {
    public static void loadQuests() {
        // Load quests from config/quests.yml
    }

    public static void scheduleDailyReset() {
        // Schedule reset at 00:00 UK time
    }

    public static void savePlayerData() {
        // Save player progress to data/quests.yaml
    }

    public static List<Quest> getRandomQuestsForPlayer(String playerName) {
        // Return 2 random quests (different)
        return null;
    }
}
