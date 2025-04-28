package org.indawgnito.messageapi.util;

import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.serializer.legacy.LegacyComponentSerializer;
import org.bukkit.Bukkit;
import org.bukkit.command.CommandSender;

public class Messaging {
    private static final LegacyComponentSerializer SERIALIZER = LegacyComponentSerializer.builder()
            .character('&')  // Use & as the color code character
            .hexColors()     // Support hex colors like &#FFFFFF
            .build();

    // Send method for String-based messages
    public static void send(CommandSender recipient, Component prefix, String message) {
        // Apply default color if no color codes are at the start of the message
        if (!message.startsWith("&")) {
            message = "&#" + Colors.DEFAULT.asHexString().substring(1) + message;
        }
        Component messageComponent = SERIALIZER.deserialize(message);
        Component fullMessage = bracket(prefix).append(messageComponent);
        recipient.sendMessage(fullMessage);
    }

    // Overloaded send method for full Component messages
    public static void send(CommandSender recipient, Component prefix, Component message) {
        Component fullMessage = bracket(prefix).append(message.color(Colors.DEFAULT));
        recipient.sendMessage(fullMessage);
    }

    // NEW method for sending PRE-STYLED Components (preserves existing color)
    public static void sendStyled(CommandSender recipient, Component prefix, Component alreadyStyledMessage) {
        Component fullMessage = bracket(prefix).append(alreadyStyledMessage); // No .color() call
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
        // Apply default color if no color codes are at the start of the message
        if (!message.startsWith("&")) {
            message = "&#" + Colors.DEFAULT.asHexString().substring(1) + message;
        }
        Component messageComponent = SERIALIZER.deserialize(message);
        Component fullMessage = bracket(prefix).append(messageComponent);

        Bukkit.broadcast(fullMessage);
    }

    private static Component bracket(Component toSurround) {
        return Component.text("[", Colors.BRACKET)
                .append(toSurround)
                .append(Component.text("] ", Colors.BRACKET));
    }
}