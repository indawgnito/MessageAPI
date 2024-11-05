package org.indawgnito.messageapi.util;

import net.md_5.bungee.api.ChatColor;
import org.bukkit.Bukkit;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Messaging {
    public static void send(CommandSender recipient, String prefix, String message) {
        recipient.sendMessage(Colors.BRACKET + "[" + prefix + Colors.BRACKET + "] " + Colors.DEFAULT + message);
    }

    public static void success(CommandSender recipient, String message) {
        recipient.sendMessage(Colors.BRACKET + "[" + Prefixes.SUCCESS + Colors.BRACKET + "] " + Colors.DEFAULT + message);
    }

    public static void failure(CommandSender recipient, String message) {
        recipient.sendMessage(Colors.BRACKET + "[" + Prefixes.FAILURE + Colors.BRACKET + "] " + Colors.DEFAULT + message);
    }

    public static void broadcast(String message) {
        String toBroadcast = Prefixes.BROADCAST + message;
        String colorParsed = ChatColor.translateAlternateColorCodes('&', toBroadcast);
        colorParsed = ChatColor.translateAlternateColorCodes('§', colorParsed);
        Bukkit.broadcastMessage(colorParsed);
    }
}