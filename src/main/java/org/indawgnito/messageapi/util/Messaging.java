package org.indawgnito.messageapi.util;

import net.kyori.adventure.text.Component;
import org.bukkit.Bukkit;
import org.bukkit.command.CommandSender;

public class Messaging {

    // Send method for String-based messages
    public static void send(CommandSender recipient, Component prefix, String message) {
        Component fullMessage = bracket(prefix).append(Component.text(message).color(Colors.DEFAULT));
        recipient.sendMessage(fullMessage);
    }

    // Overloaded send method for full Component messages
    public static void send(CommandSender recipient, Component prefix, Component message) {
        Component fullMessage = bracket(prefix).append(message.color(Colors.DEFAULT));
        recipient.sendMessage(fullMessage);
    }

    // Success method for String-based messages
    public static void success(CommandSender recipient, String message) {
        send(recipient, Prefixes.SUCCESS, message);
    }

    // Overloaded success method for full Component messages
    public static void success(CommandSender recipient, Component message) {
        send(recipient, Prefixes.SUCCESS, message);
    }

    // Failure method for String-based messages
    public static void failure(CommandSender recipient, String message) {
        send(recipient, Prefixes.FAILURE, message);
    }

    // Overloaded failure method for full Component messages
    public static void failure(CommandSender recipient, Component message) {
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
                .append(Component.text("] ", Colors.BRACKET));
    }
}
