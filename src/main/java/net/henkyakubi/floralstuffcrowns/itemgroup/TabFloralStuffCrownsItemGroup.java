
package net.henkyakubi.floralstuffcrowns.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.henkyakubi.floralstuffcrowns.item.CrownOfDandelionItem;
import net.henkyakubi.floralstuffcrowns.FloralstuffcrownsModElements;

@FloralstuffcrownsModElements.ModElement.Tag
public class TabFloralStuffCrownsItemGroup extends FloralstuffcrownsModElements.ModElement {
	public TabFloralStuffCrownsItemGroup(FloralstuffcrownsModElements instance) {
		super(instance, 3);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabtab_floral_stuff_crowns") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(CrownOfDandelionItem.helmet, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static ItemGroup tab;
}
