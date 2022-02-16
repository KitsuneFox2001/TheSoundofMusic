
package kitsunefox.musicmod.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

import kitsunefox.musicmod.itemgroup.MusicItemGroup;
import kitsunefox.musicmod.MusicmodModElements;

@MusicmodModElements.ModElement.Tag
public class EMinorChordSheetItem extends MusicmodModElements.ModElement {
	@ObjectHolder("musicmod:e_minor_chord_sheet")
	public static final Item block = null;

	public EMinorChordSheetItem(MusicmodModElements instance) {
		super(instance, 36);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(MusicItemGroup.tab).maxStackSize(1).rarity(Rarity.COMMON));
			setRegistryName("e_minor_chord_sheet");
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
	}
}
