
package compact.oakbricks.simpleoreschairscompat.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.world.World;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.block.BlockState;

import java.util.List;

import compact.oakbricks.simpleoreschairscompat.itemgroup.SpoiledPurpiItemGroup;
import compact.oakbricks.simpleoreschairscompat.SimpleoreschairscompatModElements;

@SimpleoreschairscompatModElements.ModElement.Tag
public class Purpi2Item extends SimpleoreschairscompatModElements.ModElement {
	@ObjectHolder("simpleoreschairscompat:purpi_2")
	public static final Item block = null;
	public Purpi2Item(SimpleoreschairscompatModElements instance) {
		super(instance, 1);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(SpoiledPurpiItemGroup.tab).maxStackSize(64).isImmuneToFire().rarity(Rarity.COMMON));
			setRegistryName("purpi_2");
		}

		@Override
		public boolean hasContainerItem() {
			return true;
		}

		@Override
		public ItemStack getContainerItem(ItemStack itemstack) {
			return new ItemStack(this);
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}

		@Override
		public boolean canHarvestBlock(BlockState state) {
			return true;
		}

		@Override
		public void addInformation(ItemStack itemstack, World world, List<ITextComponent> list, ITooltipFlag flag) {
			super.addInformation(itemstack, world, list, flag);
			list.add(new StringTextComponent("Is used to make normal purpi"));
		}
	}
}
