package jp.MinecraftModderJapan.ModCooperationAPI.api.entity;

import net.minecraft.item.ItemStack;

/**
 * 繁殖可能なEntityのインターフェース
 * <p/>
 * Breedable mobs interface.
 *
 * @author CrafterKina
 * @version 1.0
 * @since 1.0
 */
public interface IBreedable{
    /**
     * @param stack
     *         CheckForNull
     *         <p/>
     *         the Item
     * @see net.minecraft.entity.passive.EntityAnimal#isBreedingItem(ItemStack) it is same.
     * @since 1.0
     */
    boolean canBreedBy(ItemStack stack);
}
