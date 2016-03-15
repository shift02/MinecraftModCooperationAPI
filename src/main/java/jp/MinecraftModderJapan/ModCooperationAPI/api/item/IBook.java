package jp.MinecraftModderJapan.ModCooperationAPI.api.item;

import net.minecraft.item.ItemStack;

/**
 * 本のためのインターフェイス
 *
 * @author Shift02
 * @version 1.0.0
 */
public interface IBook {

	/**
	 * GUIを持っているか
	 * @return 持っている場合はtrue
	 */
	boolean hasGUI(ItemStack book);

	/**
	 * GUIを開く
	 */
	void openGUI(ItemStack book);

}
