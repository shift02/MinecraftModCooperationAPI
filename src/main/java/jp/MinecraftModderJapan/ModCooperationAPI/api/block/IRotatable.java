package jp.MinecraftModderJapan.ModCooperationAPI.api.block;

import net.minecraft.world.World;
import net.minecraftforge.common.util.ForgeDirection;

public interface IRotatable{
    /**
     * Rotate the block. For vanilla blocks this rotates around the axis passed in (generally, it should be the "face"
     * that was hit). Note: for mod blocks, this is up to the block and modder to decide. It is not mandated that it be
     * a rotation around the face, but could be a rotation to orient *to* that face, or a visiting of possible
     * rotations. The method should return true if the rotation was successful though.
     *
     * @param worldObj
     *         The world
     * @param x
     *         X position
     * @param y
     *         Y position
     * @param z
     *         Z position
     * @param axis
     *         The axis to rotate around
     * @return True if the rotation was successful, False if the rotation failed, or is not possible
     */
    boolean rotateBlock(World worldObj, int x, int y, int z, ForgeDirection axis);

    /**
     * Get the rotations that can apply to the block at the specified coordinates. Null means no rotations are possible.
     * Note, this is up to the block to decide. It may not be accurate or representative.
     *
     * @param worldObj
     *         The world
     * @param x
     *         X position
     * @param y
     *         Y position
     * @param z
     *         Z position
     * @return An array of valid axes to rotate around, or null for none or unknown
     */
    ForgeDirection[] getValidRotations(World worldObj, int x, int y, int z);
}
