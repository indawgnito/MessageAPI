package com.indawgnito.messageapi;

import net.md_5.bungee.api.ChatColor;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

public class MessageAPI extends JavaPlugin {

    public static class Colors {
        public static final ChatColor BRACKET = ChatColor.of("#7d7d7d");
        public static final ChatColor ERROR = ChatColor.of("#ff3333");
        public static final ChatColor SUCCESS = ChatColor.of("#55ff55");
        public static final ChatColor HIGHLIGHT = ChatColor.of("#ffff55");
        public static final ChatColor TEXT = ChatColor.WHITE;
    }

    public static void send(CommandSender recipient, String prefix, String message) {
        recipient.sendMessage(
                Colors.BRACKET + "[" +
                        prefix +
                        Colors.BRACKET + "] " +
                        Colors.TEXT + message
        );
    }

    public static void error(CommandSender recipient, String prefix, String message) {
        send(recipient, prefix, Colors.ERROR + message);
    }

    public static void success(CommandSender recipient, String prefix, String message) {
        send(recipient, prefix, Colors.SUCCESS + message);
    }
}