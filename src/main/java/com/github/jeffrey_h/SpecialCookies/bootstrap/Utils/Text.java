package com.github.jeffrey_h.SpecialCookies.bootstrap.Utils;

import org.bukkit.ChatColor;

public class Text {
    public static String colorize(String string) {
        return ChatColor.translateAlternateColorCodes('&', string);
    }
}
