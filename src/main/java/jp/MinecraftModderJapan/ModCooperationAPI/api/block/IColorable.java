package jp.MinecraftModderJapan.ModCooperationAPI.api.block;

import net.minecraft.world.World;
import net.minecraftforge.common.util.ForgeDirection;

public interface IColorable{
    /**
     * Common way to recolour a block with an external tool
     *
     * @param world
     *         The world
     * @param x
     *         X
     * @param y
     *         Y
     * @param z
     *         Z
     * @param side
     *         The side hit with the colouring tool
     * @param color
     *         The color to change to
     * @return If the recolouring was successful
     */
    boolean recolourBlock(World world, int x, int y, int z, ForgeDirection side, int color);
}
