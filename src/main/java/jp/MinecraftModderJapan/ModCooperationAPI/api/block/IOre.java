package jp.MinecraftModderJapan.ModCooperationAPI.api.block;

public interface IOre{
    /**
     * Queries the class of tool required to harvest this block, if null is returned we assume that anything can harvest
     * this block.
     */
    String getHarvestTool(int metadata);

    /**
     * Queries the harvest level of this item stack for the specified tool class, Returns -1 if this tool is not of the
     * specified type
     */
    int getHarvestLevel(int metadata);

    /**
     * Checks if the specified tool type is efficient on this block, meaning that it digs at full speed.
     */
    boolean isToolEffective(String type, int metadata);
}
