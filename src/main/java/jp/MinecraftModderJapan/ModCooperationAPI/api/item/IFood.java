package jp.MinecraftModderJapan.ModCooperationAPI.api.item;

import net.minecraft.item.ItemStack;

public interface IFood{
    /**
     * Get the Hunger Heal Amount of This Food.
     */
    int getHealAmount(ItemStack stack);

    /**
     * Get the Hunger Saturation Heal Amount of This Food.
     */
    float getSaturationModifier(ItemStack stack);
}
