package com.odailyquests;

public class Quest {
    private String id;
    private String name;
    private String type; // COMBAT, SURVIVAL, RESOURCE, BUILDING, EXPLORATION
    private boolean autoTracked;

    public Quest(String id, String name, String type, boolean autoTracked) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.autoTracked = autoTracked;
    }

    public String getId() { return id; }
    public String getName() { return name; }
    public String getType() { return type; }
    public boolean isAutoTracked() { return autoTracked; }
}
