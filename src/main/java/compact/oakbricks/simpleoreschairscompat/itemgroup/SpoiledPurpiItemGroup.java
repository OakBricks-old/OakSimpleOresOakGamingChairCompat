
package compact.oakbricks.simpleoreschairscompat.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import compact.oakbricks.simpleoreschairscompat.item.Purpi2Item;
import compact.oakbricks.simpleoreschairscompat.SimpleoreschairscompatModElements;

@SimpleoreschairscompatModElements.ModElement.Tag
public class SpoiledPurpiItemGroup extends SimpleoreschairscompatModElements.ModElement {
	public SpoiledPurpiItemGroup(SimpleoreschairscompatModElements instance) {
		super(instance, 8);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabspoiled_purpi") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(Purpi2Item.block, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static ItemGroup tab;
}
