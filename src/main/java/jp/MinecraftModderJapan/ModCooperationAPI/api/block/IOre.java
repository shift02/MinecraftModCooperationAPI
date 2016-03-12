package jp.MinecraftModderJapan.ModCooperationAPI.api.block;

/**
 * Ore Block Interface
 *
 * @version 1.0
 * @since 1.0
 */
public interface IOre{
    /**
     * Queries the class of tool required to harvest this block, if null is returned we assume that anything can harvest
     * this block.
     * @since 1.0
     */
    String getHarvestTool(int metadata);

    /**
     * Queries the harvest level of this item stack for the specified tool class, Returns -1 if this tool is not of the
     * specified type.
     * @since 1.0
     */
    int getHarvestLevel(int metadata);

    /**
     * Checks if the specified tool type is efficient on this block, meaning that it digs at full speed.
     * @since 1.0
     */
    boolean isToolEffective(String type, int metadata);
}
