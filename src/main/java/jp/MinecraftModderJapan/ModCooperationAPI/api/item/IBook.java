package jp.MinecraftModderJapan.ModCooperationAPI.api.item;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;

/**
 * 本のためのインターフェイス。
 * <p/>
 * Interface for the book.
 *
 * @author Shift02
 * @version 1.0
 * @since 1.0
 */
public interface IBook{

    /**
     * GUIを持っているか。
     * <p/>
     * the book has gui.
     *
     * @param book
     *         Nonnull
     *         <p/>
     *         Instance of the book stack.
     * @return 持っている場合はtrue If the book has, "true"
     * @since 1.0
     */
    boolean hasGUI(ItemStack book);

    /**
     * GUIを開けることができるか。
     * <p/>
     * player can open gui.
     *
     * @param player
     *         Nonnull
     *         <p/>
     *         the Player
     * @param book
     *         Nonnull
     *         <p/>
     *         Instance of the book stack.
     * @return 開くことができるならtrue。 If player can open gui, true.
     * @since 1.0
     */
    boolean canOpenGUI(EntityPlayer player, ItemStack book);

    /**
     * GUIを開く。
     * <p/>
     * Open the GUI.
     *
     * @param player
     *         Nonnull
     *         <p/>
     *         the Player
     * @param book
     *         Nonnull
     *         <p/>
     *         Instance of the book stack.
     * @since 1.0
     */
    ItemStack openGUI(EntityPlayer player, ItemStack book);

}
