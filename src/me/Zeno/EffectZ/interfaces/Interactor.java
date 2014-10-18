package me.Zeno.EffectZ.interfaces;

import me.Zeno.EffectZ.enums.ItemEffect;
import org.bukkit.entity.Player;

/**
 * @author Zeno
 */
public interface Interactor {

    public void interact(Player player, ItemEffect itemEffect);

}
