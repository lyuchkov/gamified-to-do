package ru.lyuchkov.heroesofroutine.utils;

import ru.lyuchkov.heroesofroutine.controllers.Guilds;

public final class GuildUtil {
    private static final Guilds[] values = Guilds.values();

    public static boolean isBelong(String guild) {
        guild = guild.toUpperCase();
        for (Guilds val :
                values) {
            if (val.name().equals(guild)) return true;
        }
        return false;
    }
}
