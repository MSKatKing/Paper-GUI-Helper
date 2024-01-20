package me.mskatking.guihelper.inventoryTypes;

import net.kyori.adventure.text.Component;
import org.bukkit.Bukkit;
import org.bukkit.inventory.Inventory;

public class BaseInventory {

    private final Inventory bukkitInventory;
    private final int size;
    private final Component title;

    public BaseInventory(int size, Component title) {
        this.bukkitInventory = Bukkit.createInventory(null, size, title);
        this.title = title;
        this.size = size;
    }
}
