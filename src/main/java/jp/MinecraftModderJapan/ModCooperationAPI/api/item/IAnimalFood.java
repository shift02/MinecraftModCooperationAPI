package jp.MinecraftModderJapan.ModCooperationAPI.api.item;

import net.minecraft.item.ItemStack;

public interface IAnimalFood extends IFood{
    /**
     * Can player eat this.
     */
    boolean isPlayerEdible(ItemStack stack);
}
