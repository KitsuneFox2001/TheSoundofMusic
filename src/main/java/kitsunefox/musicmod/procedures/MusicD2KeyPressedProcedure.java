package kitsunefox.musicmod.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.Hand;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import kitsunefox.musicmod.item.PianoItem;
import kitsunefox.musicmod.item.GuitarPickItem;
import kitsunefox.musicmod.item.GuitarItem;
import kitsunefox.musicmod.item.BassGuitarItem;
import kitsunefox.musicmod.MusicmodModVariables;
import kitsunefox.musicmod.MusicmodMod;

import java.util.Map;

public class MusicD2KeyPressedProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				MusicmodMod.LOGGER.warn("Failed to load dependency world for procedure MusicD2KeyPressed!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				MusicmodMod.LOGGER.warn("Failed to load dependency x for procedure MusicD2KeyPressed!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				MusicmodMod.LOGGER.warn("Failed to load dependency y for procedure MusicD2KeyPressed!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				MusicmodMod.LOGGER.warn("Failed to load dependency z for procedure MusicD2KeyPressed!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				MusicmodMod.LOGGER.warn("Failed to load dependency entity for procedure MusicD2KeyPressed!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		Entity entity = (Entity) dependencies.get("entity");
		double energy = 0;
		if (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY).getItem() == PianoItem.block) {
			if ((entity.getCapability(MusicmodModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new MusicmodModVariables.PlayerVariables())).octave == 1) {
				if (world instanceof World && !world.isRemote()) {
					((World) world).playSound(null, new BlockPos((int) x, (int) y, (int) z),
							(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("musicmod:piano_lower")),
							SoundCategory.BLOCKS, (float) 8, (float) 1.587401);
				} else {
					((World) world).playSound(x, y, z,
							(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("musicmod:piano_lower")),
							SoundCategory.BLOCKS, (float) 8, (float) 1.587401, false);
				}
				world.addParticle(ParticleTypes.NOTE, x, (y + 2), z, 0.833, 3, 0);
			}
			if ((entity.getCapability(MusicmodModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new MusicmodModVariables.PlayerVariables())).octave == 2) {
				if (world instanceof World && !world.isRemote()) {
					((World) world).playSound(null, new BlockPos((int) x, (int) y, (int) z),
							(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("musicmod:piano_mid")),
							SoundCategory.BLOCKS, (float) 8, (float) 1.587401);
				} else {
					((World) world).playSound(x, y, z,
							(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("musicmod:piano_mid")),
							SoundCategory.BLOCKS, (float) 8, (float) 1.587401, false);
				}
				world.addParticle(ParticleTypes.NOTE, x, (y + 2), z, 0.833, 3, 0);
			}
			if ((entity.getCapability(MusicmodModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new MusicmodModVariables.PlayerVariables())).octave == 3) {
				if (world instanceof World && !world.isRemote()) {
					((World) world).playSound(null, new BlockPos((int) x, (int) y, (int) z),
							(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("musicmod:piano_higher")),
							SoundCategory.BLOCKS, (float) 8, (float) 1.587401);
				} else {
					((World) world).playSound(x, y, z,
							(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("musicmod:piano_higher")),
							SoundCategory.BLOCKS, (float) 8, (float) 1.587401, false);
				}
				world.addParticle(ParticleTypes.NOTE, x, (y + 2), z, 0.833, 3, 0);
			}
			if ((entity.getCapability(MusicmodModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new MusicmodModVariables.PlayerVariables())).octave == 4) {
				if (world instanceof World && !world.isRemote()) {
					((World) world).playSound(null, new BlockPos((int) x, (int) y, (int) z),
							(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("musicmod:piano_highest")),
							SoundCategory.BLOCKS, (float) 8, (float) 1.587401);
				} else {
					((World) world).playSound(x, y, z,
							(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("musicmod:piano_highest")),
							SoundCategory.BLOCKS, (float) 8, (float) 1.587401, false);
				}
				world.addParticle(ParticleTypes.NOTE, x, (y + 2), z, 0.833, 3, 0);
			}
			if (entity instanceof LivingEntity) {
				((LivingEntity) entity).swing(Hand.MAIN_HAND, true);
			}
		}
		if (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY).getItem() == GuitarPickItem.block) {
			if (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemOffhand() : ItemStack.EMPTY).getItem() == GuitarItem.block) {
				if ((entity.getCapability(MusicmodModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new MusicmodModVariables.PlayerVariables())).octave == 1) {
					if (world instanceof World && !world.isRemote()) {
						((World) world).playSound(null, new BlockPos((int) x, (int) y, (int) z),
								(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("musicmod:guitar_lower")),
								SoundCategory.BLOCKS, (float) 8, (float) 1.587401);
					} else {
						((World) world).playSound(x, y, z,
								(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("musicmod:guitar_lower")),
								SoundCategory.BLOCKS, (float) 8, (float) 1.587401, false);
					}
					world.addParticle(ParticleTypes.NOTE, x, (y + 2), z, 0.833, 3, 0);
				}
				if ((entity.getCapability(MusicmodModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new MusicmodModVariables.PlayerVariables())).octave == 2) {
					if (world instanceof World && !world.isRemote()) {
						((World) world).playSound(null, new BlockPos((int) x, (int) y, (int) z),
								(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("musicmod:guitar_mid")),
								SoundCategory.BLOCKS, (float) 8, (float) 1.587401);
					} else {
						((World) world).playSound(x, y, z,
								(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("musicmod:guitar_mid")),
								SoundCategory.BLOCKS, (float) 8, (float) 1.587401, false);
					}
					world.addParticle(ParticleTypes.NOTE, x, (y + 2), z, 0.833, 3, 0);
				}
				if ((entity.getCapability(MusicmodModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new MusicmodModVariables.PlayerVariables())).octave == 3) {
					if (world instanceof World && !world.isRemote()) {
						((World) world).playSound(null, new BlockPos((int) x, (int) y, (int) z),
								(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("musicmod:guitar_higher")),
								SoundCategory.BLOCKS, (float) 8, (float) 1.587401);
					} else {
						((World) world).playSound(x, y, z,
								(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("musicmod:guitar_higher")),
								SoundCategory.BLOCKS, (float) 8, (float) 1.587401, false);
					}
					world.addParticle(ParticleTypes.NOTE, x, (y + 2), z, 0.833, 3, 0);
				}
				if ((entity.getCapability(MusicmodModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new MusicmodModVariables.PlayerVariables())).octave == 4) {
					if (world instanceof World && !world.isRemote()) {
						((World) world).playSound(null, new BlockPos((int) x, (int) y, (int) z),
								(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
										.getValue(new ResourceLocation("musicmod:guitar_highest")),
								SoundCategory.BLOCKS, (float) 8, (float) 1.587401);
					} else {
						((World) world).playSound(x, y, z,
								(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
										.getValue(new ResourceLocation("musicmod:guitar_highest")),
								SoundCategory.BLOCKS, (float) 8, (float) 1.587401, false);
					}
					world.addParticle(ParticleTypes.NOTE, x, (y + 2), z, 0.833, 3, 0);
				}
				if (entity instanceof LivingEntity) {
					((LivingEntity) entity).swing(Hand.MAIN_HAND, true);
				}
			}
		}
		if (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY).getItem() == GuitarPickItem.block) {
			if (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemOffhand() : ItemStack.EMPTY)
					.getItem() == BassGuitarItem.block) {
				if ((entity.getCapability(MusicmodModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new MusicmodModVariables.PlayerVariables())).octave == 1) {
					if (world instanceof World && !world.isRemote()) {
						((World) world).playSound(null, new BlockPos((int) x, (int) y, (int) z),
								(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("musicmod:bass_lower")),
								SoundCategory.BLOCKS, (float) 8, (float) 1.587401);
					} else {
						((World) world).playSound(x, y, z,
								(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("musicmod:bass_lower")),
								SoundCategory.BLOCKS, (float) 8, (float) 1.587401, false);
					}
					world.addParticle(ParticleTypes.NOTE, x, (y + 2), z, 0.833, 3, 0);
				}
				if ((entity.getCapability(MusicmodModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new MusicmodModVariables.PlayerVariables())).octave == 2) {
					if (world instanceof World && !world.isRemote()) {
						((World) world).playSound(null, new BlockPos((int) x, (int) y, (int) z),
								(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("musicmod:bass_mid")),
								SoundCategory.BLOCKS, (float) 8, (float) 1.587401);
					} else {
						((World) world).playSound(x, y, z,
								(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("musicmod:bass_mid")),
								SoundCategory.BLOCKS, (float) 8, (float) 1.587401, false);
					}
					world.addParticle(ParticleTypes.NOTE, x, (y + 2), z, 0.833, 3, 0);
				}
				if ((entity.getCapability(MusicmodModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new MusicmodModVariables.PlayerVariables())).octave == 3) {
					if (world instanceof World && !world.isRemote()) {
						((World) world).playSound(null, new BlockPos((int) x, (int) y, (int) z),
								(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("musicmod:bass_higher")),
								SoundCategory.BLOCKS, (float) 8, (float) 1.587401);
					} else {
						((World) world).playSound(x, y, z,
								(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("musicmod:bass_higher")),
								SoundCategory.BLOCKS, (float) 8, (float) 1.587401, false);
					}
					world.addParticle(ParticleTypes.NOTE, x, (y + 2), z, 0.833, 3, 0);
				}
				if ((entity.getCapability(MusicmodModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new MusicmodModVariables.PlayerVariables())).octave == 4) {
					if (world instanceof World && !world.isRemote()) {
						((World) world).playSound(null, new BlockPos((int) x, (int) y, (int) z),
								(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("musicmod:bass_highest")),
								SoundCategory.BLOCKS, (float) 8, (float) 1.587401);
					} else {
						((World) world).playSound(x, y, z,
								(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("musicmod:bass_highest")),
								SoundCategory.BLOCKS, (float) 8, (float) 1.587401, false);
					}
					world.addParticle(ParticleTypes.NOTE, x, (y + 2), z, 0.833, 3, 0);
				}
				if (entity instanceof LivingEntity) {
					((LivingEntity) entity).swing(Hand.MAIN_HAND, true);
				}
			}
		}
	}
}
