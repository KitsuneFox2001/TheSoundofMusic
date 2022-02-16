package kitsunefox.musicmod.procedures;

import net.minecraft.entity.Entity;

import kitsunefox.musicmod.MusicmodModVariables;
import kitsunefox.musicmod.MusicmodMod;

import java.util.Map;

public class SetRootASharpProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				MusicmodMod.LOGGER.warn("Failed to load dependency entity for procedure SetRootASharp!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		double ass = 0;
		{
			double _setval = 10;
			entity.getCapability(MusicmodModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.rootNote = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
	}
}
