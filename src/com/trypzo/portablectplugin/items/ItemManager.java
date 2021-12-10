package com.trypzo.portablectplugin.items;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class ItemManager {

    public static ItemStack pct;

    public static void init() {

        createPct();

    }

    private static void createPct() {
        ItemStack item = new ItemStack(Material.BOOK, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§3Portable Crafting Table");
        List<String> lore = new ArrayList<>();
        lore.add("§7A Portable Crafting Table!");
        lore.add("§7Hold in main hand and [RMB] to use!");
        meta.setLore(lore);
        meta.addEnchant(Enchantment.LUCK, 1, false);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        item.setItemMeta(meta);
        pct = item;

        //Shaped Recipe
        ShapedRecipe sr = new ShapedRecipe(NamespacedKey.minecraft("pct"), item);
        sr.shape

                ("XXX",
                        "XTX",
                        "XXX");

        sr.setIngredient('X', Material.DIAMOND);
        sr.setIngredient('T', Material.CRAFTING_TABLE);

        Bukkit.getServer().addRecipe(sr);
    }
}
