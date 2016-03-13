package jp.MinecraftModderJapan.ModCooperationAPI.api.item;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;

/**
 * Food interface
 *
 * @version 1.0
 * @since 1.0
 */
public interface IFood{
    /**
     * Get the Hunger Heal Amount of This Food.
     * @since 1.0
     */
    int getHungerHealAmount(ItemStack stack, EntityPlayer player);

    /**
     * Get the Hunger Saturation Heal Amount of This Food.
     * @since 1.0
     */
    float getHungerSaturationModifier(ItemStack stack, EntityPlayer player);
}
