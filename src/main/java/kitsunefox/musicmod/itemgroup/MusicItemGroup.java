
package kitsunefox.musicmod.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import kitsunefox.musicmod.item.MusicalKeysItem;
import kitsunefox.musicmod.MusicmodModElements;

@MusicmodModElements.ModElement.Tag
public class MusicItemGroup extends MusicmodModElements.ModElement {
	public MusicItemGroup(MusicmodModElements instance) {
		super(instance, 58);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabmusic") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(MusicalKeysItem.block);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}

	public static ItemGroup tab;
}
