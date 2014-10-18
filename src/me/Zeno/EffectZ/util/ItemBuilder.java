package me.Zeno.EffectZ.util;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;

import java.util.HashMap;

/**
 * @author Zeno
 */
public class ItemBuilder {

    private Material material;
    private String title;
    private String[] lores;
    private HashMap<Enchantment, Integer> enchantments;
    private Integer amount;
    private Short durability;

    public ItemBuilder(Material material, String title, String[] lores, Integer amount, Short durability) {
        this.material = material;
        this.title = title;
        this.lores = lores;
        this.enchantments = new HashMap<>();
        this.amount = amount;
        this.durability = durability;
    }



}
