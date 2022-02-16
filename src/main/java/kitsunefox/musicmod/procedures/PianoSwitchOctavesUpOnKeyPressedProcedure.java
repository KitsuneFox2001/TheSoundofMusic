package kitsunefox.musicmod.procedures;

import net.minecraft.item.ItemStack;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import kitsunefox.musicmod.item.PianoItem;
import kitsunefox.musicmod.item.GuitarPickItem;
import kitsunefox.musicmod.MusicmodModVariables;
import kitsunefox.musicmod.MusicmodMod;

import java.util.Map;

public class PianoSwitchOctavesUpOnKeyPressedProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				MusicmodMod.LOGGER.warn("Failed to load dependency entity for procedure PianoSwitchOctavesUpOnKeyPressed!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		double energy = 0;
		if (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY).getItem() == PianoItem.block) {
			if ((entity.getCapability(MusicmodModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new MusicmodModVariables.PlayerVariables())).octave < 4) {
				{
					double _setval = ((entity.getCapability(MusicmodModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new MusicmodModVariables.PlayerVariables())).octave + 1);
					entity.getCapability(MusicmodModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.octave = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
		}
		if (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY).getItem() == GuitarPickItem.block) {
			if ((entity.getCapability(MusicmodModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new MusicmodModVariables.PlayerVariables())).octave < 4) {
				{
					double _setval = ((entity.getCapability(MusicmodModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new MusicmodModVariables.PlayerVariables())).octave + 1);
					entity.getCapability(MusicmodModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.octave = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
		}
	}
}
