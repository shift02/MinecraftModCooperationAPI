package jp.MinecraftModderJapan.ModCooperationAPI.api.item;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;

/**
 * Animal Feed Interface
 *
 * @version 1.0
 * @since 1.0
 */
public interface IAnimalFood extends IFood{
    /**
     * Can player eat this.
     * @since 1.0
     */
    boolean isPlayerEdible(ItemStack stack, EntityPlayer player);
}
