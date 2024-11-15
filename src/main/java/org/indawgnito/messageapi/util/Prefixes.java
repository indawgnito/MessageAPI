package org.indawgnito.messageapi.util;

import net.md_5.bungee.api.ChatColor;

public class Prefixes {
    public static final String MSG = format("✉", "#ffffff");
    public static final String TELEPORT = format("⚡", "#ffffff");
    public static final String ECONOMY = format("\uD83D\uDCB2", "#ffffff");
    public static final String BROADCAST = format("Broadcast", "#ffffff");
    public static final String DEATH = format("☠", "#ffffff");
    public static final String KILL = format("\uD83D\uDDE1", "#ffffff");
    public static final String INFO = format("ℹ", "#ffffff");
    public static final String FAILURE = format("❌", "#ffffff");
    public static final String SUCCESS = format("✔", "#ffffff");
    public static final String BULLSEYE = format("◎", "#ffffff");
    public static final String BUDDY = format("\uD83D\uDC65", "#ffffff");
    public static final String JOIN = format("+", "#ffffff");
    public static final String LEAVE = format("-", "#ffffff");
    public static final String STAR = format("✦", "#ffffff");
    public static final String BOOK = format("\uD83D\uDCD5", "#ffffff");

    public static final String SPECIAL_STAR = format("\uD83C\uDF1F", "#ffffff");

    private static String format(String symbol, String hexColor) {
        return ChatColor.of(hexColor) + symbol;
    }
}