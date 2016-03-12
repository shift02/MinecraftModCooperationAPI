package jp.MinecraftModderJapan.ModCooperationAPI.api.item;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;

/**
 * 食べ物のインターフェースです。
 * <p/>
 * Food interface.
 *
 * @author CrafterKina
 * @version 1.0
 * @since 1.0
 */
public interface IFood{
    /**
     * この食べ物を食べることによって、どのくらい満腹度が回復するか取得します。
     * <p/>
     * Get the Hunger Heal Amount of This Food.
     *
     * @param stack
     *         Nonnull
     * @param entity
     *         Nullable
     * @since 1.0
     */
    int getHungerHealAmount(ItemStack stack, EntityLivingBase entity);

    /**
     * この食べ物を食べることによって、どのくらい隠し満腹度が回復するか取得します。
     * <p/>
     * Get the Hunger Saturation Heal Amount of This Food.
     *
     * @param stack
     *         Nonnull
     * @param entity
     *         Nullable
     * @since 1.0
     */
    float getHungerSaturationModifier(ItemStack stack, EntityLivingBase entity);

    /**
     * 指定されたEntityがこの食べ物を食べられるのか判定します。
     * <p/>
     * Can entity eat this.
     *
     * @param entity
     *         Nonnull
     * @param stack
     *         Nonnull
     * @since 1.0
     */
    boolean canBeAteBy(EntityLivingBase entity, ItemStack stack);
}
