package org.indawgnito.messageapi.util;

import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.TextColor;

public class Prefixes {
    public static final Component MSG = format("✉", "#ffffff");
    public static final Component TELEPORT = format("⚡", "#ffffff");
    public static final Component ECONOMY = format("\uD83D\uDCB2", "#ffffff");
    public static final Component BROADCAST = format("Broadcast", "#ffffff");
    public static final Component DEATH = format("☠", "#ffffff");
    public static final Component KILL = format("\uD83D\uDDE1", "#ffffff");
    public static final Component INFO = format("ℹ", "#ffffff");
    public static final Component FAILURE = format("❌", "#ffffff");
    public static final Component SUCCESS = format("✔", "#ffffff");
    public static final Component BULLSEYE = format("◎", "#ffffff");
    public static final Component BUDDY = format("\uD83D\uDC65", "#ffffff");
    public static final Component JOIN = format("+", "#ffffff");
    public static final Component LEAVE = format("-", "#ffffff");
    public static final Component STAR = format("✦", "#ffffff");
    public static final Component BOOK = format("\uD83D\uDCD5", "#ffffff");
    public static final Component AURA = format("🌀", "#00e0ff");

    public static final Component SPECIAL_STAR = format("\uD83C\uDF1F", "#ffffff");

    private static Component format(String symbol, String hexColor) {
        return Component.text(symbol).color(TextColor.fromHexString(hexColor));
    }
}