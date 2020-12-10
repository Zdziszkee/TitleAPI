package me.zdziszkee.titleapi;

import net.minecraft.server.v1_8_R3.IChatBaseComponent;
import net.minecraft.server.v1_8_R3.PacketPlayOutTitle;
import org.bukkit.ChatColor;
import org.bukkit.craftbukkit.v1_8_R3.entity.CraftPlayer;
import org.bukkit.entity.Player;

public class TitleAPI {
    public static void sendTitle(Player p, String msg, int fadeIn, int stayTime, int fadeOut) {

        PacketPlayOutTitle title = new PacketPlayOutTitle(PacketPlayOutTitle.EnumTitleAction.TITLE,
                IChatBaseComponent.ChatSerializer.a(ChatColor.translateAlternateColorCodes('&', "{\"text\": \"" + msg + "\"}")), fadeIn, stayTime, fadeOut);

        ((CraftPlayer) p).getHandle().playerConnection.sendPacket(title);

    }

    public static  void sendSubtitle(Player p, String msg, int fadeIn, int stayTime, int fadeOut) {

        PacketPlayOutTitle title = new PacketPlayOutTitle(PacketPlayOutTitle.EnumTitleAction.SUBTITLE, IChatBaseComponent.ChatSerializer.a(ChatColor.translateAlternateColorCodes('&', "{\"text\": \"" + msg + "\"}")), fadeIn, stayTime, fadeOut);

        ((CraftPlayer) p).getHandle().playerConnection.sendPacket(title);

    }
}
