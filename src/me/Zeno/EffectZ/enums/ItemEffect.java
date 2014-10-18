package me.Zeno.EffectZ.enums;

import me.Zeno.EffectZ.interfaces.Interactor;
import org.bukkit.inventory.ItemStack;

/**
 * @author Zeno
 */
public enum  ItemEffect {

    GRENADE(),
    PARTYBOTTLE(),
    SNOWCANOON();

    ItemEffect(ItemStack item, Interactor interactor) {
        this.item = item;
        this.interactor = interactor;
    }

    ItemStack item;
    Interactor interactor;

}
