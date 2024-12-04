package org.indawgnito.messageapi.util;

import net.kyori.adventure.text.Component;
import org.bukkit.Bukkit;
import org.bukkit.command.CommandSender;

public class Messaging {

    public static void send(CommandSender recipient, Component prefix, String message) {
        Component fullMessage = bracket(prefix).append(Component.text(message).color(Colors.DEFAULT));
        recipient.sendMessage(fullMessage);
    }

    public static void success(CommandSender recipient, String message) {
        send(recipient, Prefixes.SUCCESS, message);
    }

    public static void failure(CommandSender recipient, String message) {
        send(recipient, Prefixes.FAILURE, message);
    }

    public static void broadcast(String message, boolean discreet) {
        Component prefix = discreet ? Prefixes.INFO : Prefixes.BROADCAST;
        Component formattedMessage = Component.text(message);
        Component fullMessage = bracket(prefix).append(formattedMessage);

        Bukkit.broadcast(fullMessage);
    }

    private static Component bracket(Component toSurround) {
        return Component.text("[", Colors.BRACKET)
                .append(toSurround)
                .append(Component.text("] ", Colors.BRACKET))
                .color(Colors.DEFAULT);
    }
}
