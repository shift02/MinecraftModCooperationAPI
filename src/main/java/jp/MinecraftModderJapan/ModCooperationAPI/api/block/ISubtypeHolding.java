package jp.MinecraftModderJapan.ModCooperationAPI.api.block;

import net.minecraft.item.ItemStack;

/**
 * Block Subtype Holding Interface
 *
 * @version 1.0
 * @since 1.0
 */
public interface ISubtypeHolding{
    /**
     * Returns an item stack containing a single instance of the current block type. 'i' is the block's subtype/damage
     * and is ignored for blocks which do not support subtypes. Blocks which cannot be harvested should return null.
     *
     * @since 1.0
     */
    ItemStack createStackedBlock(int type);
}
