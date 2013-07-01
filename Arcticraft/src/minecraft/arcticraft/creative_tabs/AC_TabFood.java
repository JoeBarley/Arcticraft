package arcticraft.creative_tabs;

import net.minecraft.creativetab.CreativeTabs;
import arcticraft.main.MainRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class AC_TabFood extends CreativeTabs {
	public AC_TabFood(int position, String tabID) {
		super(position, tabID);
	}

	@SideOnly(Side.CLIENT)
	public int getTabIconItemIndex() {
		return MainRegistry.penguinMeatCooked.itemID; // this is the item that is
												// displayed on your tab's icon
	}

	public String getTranslatedTabLabel() {
		return "Arcticraft Food"; // the name that shows up in-game
	}
}