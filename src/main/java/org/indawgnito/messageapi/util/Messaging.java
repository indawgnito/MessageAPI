package org.indawgnito.messageapi.util;

import net.md_5.bungee.api.ChatColor;
import org.bukkit.Bukkit;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Messaging {
    public static void send(CommandSender recipient, String prefix, String message) {
        recipient.sendMessage(bracket(prefix) + Colors.DEFAULT + message);
    }

    public static void success(CommandSender recipient, String message) {
        recipient.sendMessage(bracket(Prefixes.SUCCESS) + Colors.DEFAULT + message);
    }

    public static void failure(CommandSender recipient, String message) {
        recipient.sendMessage(bracket(Prefixes.FAILURE) + Colors.DEFAULT + message);
    }

    public static void broadcast(String message) {
        String formattedMessage = Colors.DEFAULT + message;
        // Parse color codes in the message
        formattedMessage = ChatColor.translateAlternateColorCodes('&', formattedMessage);
        formattedMessage = ChatColor.translateAlternateColorCodes('§', formattedMessage);

        // Send the broadcast with proper formatting
        Bukkit.broadcastMessage(bracket(Prefixes.BROADCAST) + formattedMessage);
    }

    private static String bracket(String toSurround) {
        return Colors.BRACKET + "[" + toSurround + Colors.BRACKET + "]" + Colors.DEFAULT;
    }
}