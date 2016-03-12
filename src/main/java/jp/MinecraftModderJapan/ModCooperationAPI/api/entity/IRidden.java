package jp.MinecraftModderJapan.ModCooperationAPI.api.entity;

import net.minecraft.entity.Entity;

/**
 * 乗れるEntityのインターフェース。
 * <p/>
 * Rideable entity interface.
 *
 * @author CrafterKina
 * @version 1.0
 * @since 1.0
 */
public interface IRidden{
    /**
     * 乗る。
     * <p/>
     * ride.
     *
     * @param entity
     *         Nonnull
     *         <p/>
     *         to ride
     * @return success
     * @since 1.0
     */
    boolean ride(Entity entity);


    /**
     * 降ろす。
     * <p/>
     * unload.
     *
     * @param entity
     *         Nonnull
     *         <p/>
     *         to unload
     * @return success
     * @since 1.0
     */
    boolean unload(Entity entity);

    /**
     * 乗っているすべてのEntityを返す。
     * <p/>
     * All the riding on this.
     *
     * @since 1.0
     */
    Entity[] getRiddenBy();
}