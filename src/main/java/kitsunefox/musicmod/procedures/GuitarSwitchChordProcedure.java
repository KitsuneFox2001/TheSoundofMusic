package kitsunefox.musicmod.procedures;

import net.minecraftforge.items.CapabilityItemHandler;

import net.minecraft.util.Hand;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import kitsunefox.musicmod.item.GuitarItem;
import kitsunefox.musicmod.item.GSharpMinorChordSheetItem;
import kitsunefox.musicmod.item.GSharpMajorChordSheetItem;
import kitsunefox.musicmod.item.GSharpMajor7ChordItem;
import kitsunefox.musicmod.item.GMinorChordSheetItem;
import kitsunefox.musicmod.item.GMajorChordSheetItem;
import kitsunefox.musicmod.item.GMajor7ChordSheetItem;
import kitsunefox.musicmod.item.FSharpMinorChordSheetItem;
import kitsunefox.musicmod.item.FSharpMajorChordSheetItem;
import kitsunefox.musicmod.item.FSharpMajor7ChordSheetItem;
import kitsunefox.musicmod.item.FMinorChordSheetItem;
import kitsunefox.musicmod.item.FMajorChordSheetItem;
import kitsunefox.musicmod.item.FMajor7ChordSheetItem;
import kitsunefox.musicmod.item.EMinorChordSheetItem;
import kitsunefox.musicmod.item.EMajorChordSheetItem;
import kitsunefox.musicmod.item.EMajor7ChordSheetItem;
import kitsunefox.musicmod.item.DSharpMinorChordSheetItem;
import kitsunefox.musicmod.item.DSharpMajorChordSheetItem;
import kitsunefox.musicmod.item.DMinorChordSheetItem;
import kitsunefox.musicmod.item.DMajorSharp7ChordSheetItem;
import kitsunefox.musicmod.item.DMajorChordSheetItem;
import kitsunefox.musicmod.item.DMajor7ChordSheetItem;
import kitsunefox.musicmod.item.CSharpMinorChordSheetItem;
import kitsunefox.musicmod.item.CSharpMajorChordSheetItem;
import kitsunefox.musicmod.item.CSharpMajor7ChordSheetItem;
import kitsunefox.musicmod.item.CMinorChordSheetItem;
import kitsunefox.musicmod.item.CMajorChordSheetItem;
import kitsunefox.musicmod.item.CMajor7ChordSheetItem;
import kitsunefox.musicmod.item.BMinorChordSheetItem;
import kitsunefox.musicmod.item.BMajorChordSheetItem;
import kitsunefox.musicmod.item.BMajor7ChordSheetItem;
import kitsunefox.musicmod.item.ASharpMinorChordSheetItem;
import kitsunefox.musicmod.item.ASharpMajorChordSheetItem;
import kitsunefox.musicmod.item.ASharpMajor7ChordItem;
import kitsunefox.musicmod.item.AMinorChordSheetItem;
import kitsunefox.musicmod.item.AMajorChordSheetItem;
import kitsunefox.musicmod.item.AMajor7ChordSheetItem;
import kitsunefox.musicmod.MusicmodModVariables;
import kitsunefox.musicmod.MusicmodMod;

import java.util.concurrent.atomic.AtomicReference;
import java.util.Map;

public class GuitarSwitchChordProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				MusicmodMod.LOGGER.warn("Failed to load dependency entity for procedure GuitarSwitchChord!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		double slotCheck = 0;
		ItemStack helditem = ItemStack.EMPTY;
		slotCheck = ((entity.getCapability(MusicmodModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new MusicmodModVariables.PlayerVariables())).slotcheck);
		helditem = (new Object() {
			public ItemStack getItemStack(int sltid, Entity entity) {
				AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
				entity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
					_retval.set(capability.getStackInSlot(sltid).copy());
				});
				return _retval.get();
			}
		}.getItemStack((int) (slotCheck), entity));
		if (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY).getItem() == GuitarItem.block) {
			if (entity instanceof LivingEntity) {
				((LivingEntity) entity).swing(Hand.OFF_HAND, true);
			}
			if ((helditem).getItem() == CMajorChordSheetItem.block) {
				{
					double _setval = 0;
					entity.getCapability(MusicmodModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.guitarchord_num = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					String _setval = "C Major";
					entity.getCapability(MusicmodModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.guitarchord_name = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
			if ((helditem).getItem() == CSharpMajorChordSheetItem.block) {
				{
					double _setval = 1;
					entity.getCapability(MusicmodModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.guitarchord_num = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					String _setval = "C# Major";
					entity.getCapability(MusicmodModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.guitarchord_name = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
			if ((helditem).getItem() == DMajorChordSheetItem.block) {
				{
					double _setval = 2;
					entity.getCapability(MusicmodModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.guitarchord_num = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					String _setval = "D Major";
					entity.getCapability(MusicmodModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.guitarchord_name = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
			if ((helditem).getItem() == DSharpMajorChordSheetItem.block) {
				{
					double _setval = 3;
					entity.getCapability(MusicmodModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.guitarchord_num = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					String _setval = "D# Major";
					entity.getCapability(MusicmodModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.guitarchord_name = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
			if ((helditem).getItem() == EMajorChordSheetItem.block) {
				{
					double _setval = 4;
					entity.getCapability(MusicmodModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.guitarchord_num = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					String _setval = "E Major";
					entity.getCapability(MusicmodModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.guitarchord_name = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
			if ((helditem).getItem() == FMajorChordSheetItem.block) {
				{
					double _setval = 5;
					entity.getCapability(MusicmodModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.guitarchord_num = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					String _setval = "F Major";
					entity.getCapability(MusicmodModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.guitarchord_name = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
			if ((helditem).getItem() == FSharpMajorChordSheetItem.block) {
				{
					double _setval = 6;
					entity.getCapability(MusicmodModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.guitarchord_num = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					String _setval = "F# Major";
					entity.getCapability(MusicmodModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.guitarchord_name = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
			if ((helditem).getItem() == GMajorChordSheetItem.block) {
				{
					double _setval = 7;
					entity.getCapability(MusicmodModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.guitarchord_num = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					String _setval = "G Major";
					entity.getCapability(MusicmodModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.guitarchord_name = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
			if ((helditem).getItem() == GSharpMajorChordSheetItem.block) {
				{
					double _setval = 8;
					entity.getCapability(MusicmodModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.guitarchord_num = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					String _setval = "G# Major";
					entity.getCapability(MusicmodModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.guitarchord_name = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
			if ((helditem).getItem() == AMajorChordSheetItem.block) {
				{
					double _setval = 9;
					entity.getCapability(MusicmodModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.guitarchord_num = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					String _setval = "A Major";
					entity.getCapability(MusicmodModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.guitarchord_name = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
			if ((helditem).getItem() == ASharpMajorChordSheetItem.block) {
				{
					double _setval = 10;
					entity.getCapability(MusicmodModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.guitarchord_num = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					String _setval = "A# Major";
					entity.getCapability(MusicmodModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.guitarchord_name = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
			if ((helditem).getItem() == BMajorChordSheetItem.block) {
				{
					double _setval = 11;
					entity.getCapability(MusicmodModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.guitarchord_num = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					String _setval = "B Major";
					entity.getCapability(MusicmodModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.guitarchord_name = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
			if ((helditem).getItem() == CMinorChordSheetItem.block) {
				{
					double _setval = 12;
					entity.getCapability(MusicmodModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.guitarchord_num = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					String _setval = "C Minor";
					entity.getCapability(MusicmodModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.guitarchord_name = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
			if ((helditem).getItem() == CSharpMinorChordSheetItem.block) {
				{
					double _setval = 13;
					entity.getCapability(MusicmodModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.guitarchord_num = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					String _setval = "C# Minor";
					entity.getCapability(MusicmodModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.guitarchord_name = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
			if ((helditem).getItem() == DMinorChordSheetItem.block) {
				{
					double _setval = 14;
					entity.getCapability(MusicmodModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.guitarchord_num = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					String _setval = "D Minor";
					entity.getCapability(MusicmodModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.guitarchord_name = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
			if ((helditem).getItem() == DSharpMinorChordSheetItem.block) {
				{
					double _setval = 15;
					entity.getCapability(MusicmodModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.guitarchord_num = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					String _setval = "D# Minor";
					entity.getCapability(MusicmodModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.guitarchord_name = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
			if ((helditem).getItem() == EMinorChordSheetItem.block) {
				{
					double _setval = 16;
					entity.getCapability(MusicmodModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.guitarchord_num = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					String _setval = "E Minor";
					entity.getCapability(MusicmodModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.guitarchord_name = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
			if ((helditem).getItem() == FMinorChordSheetItem.block) {
				{
					double _setval = 17;
					entity.getCapability(MusicmodModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.guitarchord_num = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					String _setval = "F Minor";
					entity.getCapability(MusicmodModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.guitarchord_name = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
			if ((helditem).getItem() == FSharpMinorChordSheetItem.block) {
				{
					double _setval = 18;
					entity.getCapability(MusicmodModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.guitarchord_num = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					String _setval = "F# Minor";
					entity.getCapability(MusicmodModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.guitarchord_name = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
			if ((helditem).getItem() == GMinorChordSheetItem.block) {
				{
					double _setval = 19;
					entity.getCapability(MusicmodModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.guitarchord_num = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					String _setval = "G Minor";
					entity.getCapability(MusicmodModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.guitarchord_name = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
			if ((helditem).getItem() == GSharpMinorChordSheetItem.block) {
				{
					double _setval = 20;
					entity.getCapability(MusicmodModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.guitarchord_num = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					String _setval = "G# Minor";
					entity.getCapability(MusicmodModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.guitarchord_name = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
			if ((helditem).getItem() == AMinorChordSheetItem.block) {
				{
					double _setval = 21;
					entity.getCapability(MusicmodModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.guitarchord_num = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					String _setval = "A Minor";
					entity.getCapability(MusicmodModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.guitarchord_name = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
			if ((helditem).getItem() == ASharpMinorChordSheetItem.block) {
				{
					double _setval = 22;
					entity.getCapability(MusicmodModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.guitarchord_num = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					String _setval = "A# Minor";
					entity.getCapability(MusicmodModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.guitarchord_name = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
			if ((helditem).getItem() == BMinorChordSheetItem.block) {
				{
					double _setval = 23;
					entity.getCapability(MusicmodModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.guitarchord_num = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					String _setval = "B Minor";
					entity.getCapability(MusicmodModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.guitarchord_name = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
			if ((helditem).getItem() == CMajor7ChordSheetItem.block) {
				{
					double _setval = 24;
					entity.getCapability(MusicmodModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.guitarchord_num = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					String _setval = "C Major 7";
					entity.getCapability(MusicmodModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.guitarchord_name = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
			if ((helditem).getItem() == CSharpMajor7ChordSheetItem.block) {
				{
					double _setval = 25;
					entity.getCapability(MusicmodModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.guitarchord_num = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					String _setval = "C# Major 7";
					entity.getCapability(MusicmodModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.guitarchord_name = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
			if ((helditem).getItem() == DMajor7ChordSheetItem.block) {
				{
					double _setval = 26;
					entity.getCapability(MusicmodModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.guitarchord_num = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					String _setval = "D Major 7";
					entity.getCapability(MusicmodModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.guitarchord_name = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
			if ((helditem).getItem() == DMajorSharp7ChordSheetItem.block) {
				{
					double _setval = 27;
					entity.getCapability(MusicmodModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.guitarchord_num = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					String _setval = "D# Major 7";
					entity.getCapability(MusicmodModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.guitarchord_name = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
			if ((helditem).getItem() == EMajor7ChordSheetItem.block) {
				{
					double _setval = 28;
					entity.getCapability(MusicmodModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.guitarchord_num = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					String _setval = "E Major 7";
					entity.getCapability(MusicmodModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.guitarchord_name = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
			if ((helditem).getItem() == FMajor7ChordSheetItem.block) {
				{
					double _setval = 29;
					entity.getCapability(MusicmodModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.guitarchord_num = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					String _setval = "F Major 7";
					entity.getCapability(MusicmodModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.guitarchord_name = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
			if ((helditem).getItem() == FSharpMajor7ChordSheetItem.block) {
				{
					double _setval = 30;
					entity.getCapability(MusicmodModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.guitarchord_num = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					String _setval = "F# Major 7";
					entity.getCapability(MusicmodModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.guitarchord_name = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
			if ((helditem).getItem() == GMajor7ChordSheetItem.block) {
				{
					double _setval = 31;
					entity.getCapability(MusicmodModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.guitarchord_num = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					String _setval = "G Major 7";
					entity.getCapability(MusicmodModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.guitarchord_name = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
			if ((helditem).getItem() == GSharpMajor7ChordItem.block) {
				{
					double _setval = 32;
					entity.getCapability(MusicmodModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.guitarchord_num = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					String _setval = "G# Major 7";
					entity.getCapability(MusicmodModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.guitarchord_name = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
			if ((helditem).getItem() == AMajor7ChordSheetItem.block) {
				{
					double _setval = 33;
					entity.getCapability(MusicmodModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.guitarchord_num = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					String _setval = "A Major 7";
					entity.getCapability(MusicmodModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.guitarchord_name = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
			if ((helditem).getItem() == ASharpMajor7ChordItem.block) {
				{
					double _setval = 34;
					entity.getCapability(MusicmodModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.guitarchord_num = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					String _setval = "A# Major 7";
					entity.getCapability(MusicmodModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.guitarchord_name = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
			if ((helditem).getItem() == BMajor7ChordSheetItem.block) {
				{
					double _setval = 35;
					entity.getCapability(MusicmodModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.guitarchord_num = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					String _setval = "B Major 7";
					entity.getCapability(MusicmodModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.guitarchord_name = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
		}
	}
}
