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

import kitsunefox.musicmod.item.GuitarItem;
import kitsunefox.musicmod.MusicmodModVariables;
import kitsunefox.musicmod.MusicmodMod;

import java.util.Map;

public class GuitarStrumDownKeyPressProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				MusicmodMod.LOGGER.warn("Failed to load dependency world for procedure GuitarStrumDownKeyPress!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				MusicmodMod.LOGGER.warn("Failed to load dependency x for procedure GuitarStrumDownKeyPress!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				MusicmodMod.LOGGER.warn("Failed to load dependency y for procedure GuitarStrumDownKeyPress!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				MusicmodMod.LOGGER.warn("Failed to load dependency z for procedure GuitarStrumDownKeyPress!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				MusicmodMod.LOGGER.warn("Failed to load dependency entity for procedure GuitarStrumDownKeyPress!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		Entity entity = (Entity) dependencies.get("entity");
		double ass = 0;
		if (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY).getItem() == GuitarItem.block) {
			if (entity instanceof LivingEntity) {
				((LivingEntity) entity).swing(Hand.MAIN_HAND, true);
			}
			if ((entity.getCapability(MusicmodModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new MusicmodModVariables.PlayerVariables())).guitarchord_num == 0) {
				world.addParticle(ParticleTypes.NOTE, x, (y + 2), z, 0.25, 3, 0);
				if (world instanceof World && !world.isRemote()) {
					((World) world)
							.playSound(null, new BlockPos((int) x, (int) y, (int) z),
									(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
											.getValue(new ResourceLocation("musicmod:guitar_cmajor_down")),
									SoundCategory.BLOCKS, (float) 8, (float) 1);
				} else {
					((World) world).playSound(x, y, z,
							(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
									.getValue(new ResourceLocation("musicmod:guitar_cmajor_down")),
							SoundCategory.BLOCKS, (float) 8, (float) 1, false);
				}
			}
			if ((entity.getCapability(MusicmodModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new MusicmodModVariables.PlayerVariables())).guitarchord_num == 1) {
				world.addParticle(ParticleTypes.NOTE, x, (y + 2), z, 0.292, 3, 0);
				if (world instanceof World && !world.isRemote()) {
					((World) world)
							.playSound(null, new BlockPos((int) x, (int) y, (int) z),
									(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
											.getValue(new ResourceLocation("musicmod:guitar_csharpmajor_down")),
									SoundCategory.BLOCKS, (float) 8, (float) 1);
				} else {
					((World) world).playSound(x, y, z,
							(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
									.getValue(new ResourceLocation("musicmod:guitar_csharpmajor_down")),
							SoundCategory.BLOCKS, (float) 8, (float) 1, false);
				}
			}
			if ((entity.getCapability(MusicmodModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new MusicmodModVariables.PlayerVariables())).guitarchord_num == 2) {
				world.addParticle(ParticleTypes.NOTE, x, (y + 2), z, 0.333, 3, 0);
				if (world instanceof World && !world.isRemote()) {
					((World) world)
							.playSound(null, new BlockPos((int) x, (int) y, (int) z),
									(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
											.getValue(new ResourceLocation("musicmod:guitar_dmajor_down")),
									SoundCategory.BLOCKS, (float) 8, (float) 1);
				} else {
					((World) world).playSound(x, y, z,
							(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
									.getValue(new ResourceLocation("musicmod:guitar_dmajor_down")),
							SoundCategory.BLOCKS, (float) 8, (float) 1, false);
				}
			}
			if ((entity.getCapability(MusicmodModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new MusicmodModVariables.PlayerVariables())).guitarchord_num == 3) {
				world.addParticle(ParticleTypes.NOTE, x, (y + 2), z, 0.375, 3, 0);
				if (world instanceof World && !world.isRemote()) {
					((World) world)
							.playSound(null, new BlockPos((int) x, (int) y, (int) z),
									(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
											.getValue(new ResourceLocation("musicmod:guitar_dsharpmajor_down")),
									SoundCategory.BLOCKS, (float) 8, (float) 1);
				} else {
					((World) world).playSound(x, y, z,
							(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
									.getValue(new ResourceLocation("musicmod:guitar_dsharpmajor_down")),
							SoundCategory.BLOCKS, (float) 8, (float) 1, false);
				}
			}
			if ((entity.getCapability(MusicmodModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new MusicmodModVariables.PlayerVariables())).guitarchord_num == 4) {
				world.addParticle(ParticleTypes.NOTE, x, (y + 2), z, 0.417, 3, 0);	
				if (world instanceof World && !world.isRemote()) {
					((World) world)
							.playSound(null, new BlockPos((int) x, (int) y, (int) z),
									(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
											.getValue(new ResourceLocation("musicmod:guitar_emajor_down")),
									SoundCategory.BLOCKS, (float) 8, (float) 1);
				} else {
					((World) world).playSound(x, y, z,
							(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
									.getValue(new ResourceLocation("musicmod:guitar_emajor_down")),
							SoundCategory.BLOCKS, (float) 8, (float) 1, false);
				}
			}
			if ((entity.getCapability(MusicmodModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new MusicmodModVariables.PlayerVariables())).guitarchord_num == 5) {
				world.addParticle(ParticleTypes.NOTE, x, (y + 2), z, 0.458, 3, 0);	
				if (world instanceof World && !world.isRemote()) {
					((World) world)
							.playSound(null, new BlockPos((int) x, (int) y, (int) z),
									(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
											.getValue(new ResourceLocation("musicmod:guitar_fmajor_down")),
									SoundCategory.BLOCKS, (float) 8, (float) 1);
				} else {
					((World) world).playSound(x, y, z,
							(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
									.getValue(new ResourceLocation("musicmod:guitar_fmajor_down")),
							SoundCategory.BLOCKS, (float) 8, (float) 1, false);
				}
			}
			if ((entity.getCapability(MusicmodModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new MusicmodModVariables.PlayerVariables())).guitarchord_num == 6) {
				world.addParticle(ParticleTypes.NOTE, x, (y + 2), z, 0.5, 3, 0);	
				if (world instanceof World && !world.isRemote()) {
					((World) world)
							.playSound(null, new BlockPos((int) x, (int) y, (int) z),
									(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
											.getValue(new ResourceLocation("musicmod:guitar_fsharpmajor_down")),
									SoundCategory.BLOCKS, (float) 8, (float) 1);
				} else {
					((World) world).playSound(x, y, z,
							(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
									.getValue(new ResourceLocation("musicmod:guitar_fsharpmajor_down")),
							SoundCategory.BLOCKS, (float) 8, (float) 1, false);
				}
			}
			if ((entity.getCapability(MusicmodModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new MusicmodModVariables.PlayerVariables())).guitarchord_num == 7) {
				world.addParticle(ParticleTypes.NOTE, x, (y + 2), z, 0.542, 3, 0);	
				if (world instanceof World && !world.isRemote()) {
					((World) world)
							.playSound(null, new BlockPos((int) x, (int) y, (int) z),
									(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
											.getValue(new ResourceLocation("musicmod:guitar_gmajor_down")),
									SoundCategory.BLOCKS, (float) 8, (float) 1);
				} else {
					((World) world).playSound(x, y, z,
							(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
									.getValue(new ResourceLocation("musicmod:guitar_gmajor_down")),
							SoundCategory.BLOCKS, (float) 8, (float) 1, false);
				}
			}
			if ((entity.getCapability(MusicmodModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new MusicmodModVariables.PlayerVariables())).guitarchord_num == 8) {
				world.addParticle(ParticleTypes.NOTE, x, (y + 2), z, 0.583, 3, 0);	
				if (world instanceof World && !world.isRemote()) {
					((World) world)
							.playSound(null, new BlockPos((int) x, (int) y, (int) z),
									(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
											.getValue(new ResourceLocation("musicmod:guitar_gsharpmajor_down")),
									SoundCategory.BLOCKS, (float) 8, (float) 1);
				} else {
					((World) world).playSound(x, y, z,
							(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
									.getValue(new ResourceLocation("musicmod:guitar_gsharpmajor_down")),
							SoundCategory.BLOCKS, (float) 8, (float) 1, false);
				}
			}
			if ((entity.getCapability(MusicmodModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new MusicmodModVariables.PlayerVariables())).guitarchord_num == 9) {
				world.addParticle(ParticleTypes.NOTE, x, (y + 2), z, 0.625, 3, 0);	
				if (world instanceof World && !world.isRemote()) {
					((World) world)
							.playSound(null, new BlockPos((int) x, (int) y, (int) z),
									(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
											.getValue(new ResourceLocation("musicmod:guitar_amajor_down")),
									SoundCategory.BLOCKS, (float) 8, (float) 1);
				} else {
					((World) world).playSound(x, y, z,
							(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
									.getValue(new ResourceLocation("musicmod:guitar_amajor_down")),
							SoundCategory.BLOCKS, (float) 8, (float) 1, false);
				}
			}
			if ((entity.getCapability(MusicmodModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new MusicmodModVariables.PlayerVariables())).guitarchord_num == 10) {
				world.addParticle(ParticleTypes.NOTE, x, (y + 2), z, 0.667, 3, 0);	
				if (world instanceof World && !world.isRemote()) {
					((World) world)
							.playSound(null, new BlockPos((int) x, (int) y, (int) z),
									(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
											.getValue(new ResourceLocation("musicmod:guitar_asharpmajor_down")),
									SoundCategory.BLOCKS, (float) 8, (float) 1);
				} else {
					((World) world).playSound(x, y, z,
							(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
									.getValue(new ResourceLocation("musicmod:guitar_asharpmajor_down")),
							SoundCategory.BLOCKS, (float) 8, (float) 1, false);
				}
			}
			if ((entity.getCapability(MusicmodModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new MusicmodModVariables.PlayerVariables())).guitarchord_num == 11) {
				world.addParticle(ParticleTypes.NOTE, x, (y + 2), z, 0.708, 3, 0);	
				if (world instanceof World && !world.isRemote()) {
					((World) world)
							.playSound(null, new BlockPos((int) x, (int) y, (int) z),
									(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
											.getValue(new ResourceLocation("musicmod:guitar_bmajor_down")),
									SoundCategory.BLOCKS, (float) 8, (float) 1);
				} else {
					((World) world).playSound(x, y, z,
							(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
									.getValue(new ResourceLocation("musicmod:guitar_bmajor_down")),
							SoundCategory.BLOCKS, (float) 8, (float) 1, false);
				}
			}
			if ((entity.getCapability(MusicmodModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new MusicmodModVariables.PlayerVariables())).guitarchord_num == 12) {
				world.addParticle(ParticleTypes.NOTE, x, (y + 2), z, 0.25, 3, 0);
				if (world instanceof World && !world.isRemote()) {
					((World) world)
							.playSound(null, new BlockPos((int) x, (int) y, (int) z),
									(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
											.getValue(new ResourceLocation("musicmod:guitar_cminor_down")),
									SoundCategory.BLOCKS, (float) 8, (float) 1);
				} else {
					((World) world).playSound(x, y, z,
							(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
									.getValue(new ResourceLocation("musicmod:guitar_cminor_down")),
							SoundCategory.BLOCKS, (float) 8, (float) 1, false);
				}
			}
			if ((entity.getCapability(MusicmodModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new MusicmodModVariables.PlayerVariables())).guitarchord_num == 13) {
				world.addParticle(ParticleTypes.NOTE, x, (y + 2), z, 0.292, 3, 0);
				if (world instanceof World && !world.isRemote()) {
					((World) world)
							.playSound(null, new BlockPos((int) x, (int) y, (int) z),
									(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
											.getValue(new ResourceLocation("musicmod:guitar_csharpminor_down")),
									SoundCategory.BLOCKS, (float) 8, (float) 1);
				} else {
					((World) world).playSound(x, y, z,
							(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
									.getValue(new ResourceLocation("musicmod:guitar_csharpminor_down")),
							SoundCategory.BLOCKS, (float) 8, (float) 1, false);
				}
			}
			if ((entity.getCapability(MusicmodModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new MusicmodModVariables.PlayerVariables())).guitarchord_num == 14) {
				world.addParticle(ParticleTypes.NOTE, x, (y + 2), z, 0.333, 3, 0);	
				if (world instanceof World && !world.isRemote()) {
					((World) world)
							.playSound(null, new BlockPos((int) x, (int) y, (int) z),
									(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
											.getValue(new ResourceLocation("musicmod:guitar_dminor_down")),
									SoundCategory.BLOCKS, (float) 8, (float) 1);
				} else {
					((World) world).playSound(x, y, z,
							(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
									.getValue(new ResourceLocation("musicmod:guitar_dminor_down")),
							SoundCategory.BLOCKS, (float) 8, (float) 1, false);
				}
			}
			if ((entity.getCapability(MusicmodModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new MusicmodModVariables.PlayerVariables())).guitarchord_num == 15) {
				world.addParticle(ParticleTypes.NOTE, x, (y + 2), z, 0.375, 3, 0);	
				if (world instanceof World && !world.isRemote()) {
					((World) world)
							.playSound(null, new BlockPos((int) x, (int) y, (int) z),
									(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
											.getValue(new ResourceLocation("musicmod:guitar_dsharpminor_down")),
									SoundCategory.BLOCKS, (float) 8, (float) 1);
				} else {
					((World) world).playSound(x, y, z,
							(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
									.getValue(new ResourceLocation("musicmod:guitar_dsharpminor_down")),
							SoundCategory.BLOCKS, (float) 8, (float) 1, false);
				}
			}
			if ((entity.getCapability(MusicmodModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new MusicmodModVariables.PlayerVariables())).guitarchord_num == 16) {
				world.addParticle(ParticleTypes.NOTE, x, (y + 2), z, 0.417, 3, 0);		
				if (world instanceof World && !world.isRemote()) {
					((World) world)
							.playSound(null, new BlockPos((int) x, (int) y, (int) z),
									(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
											.getValue(new ResourceLocation("musicmod:guitar_eminor_down")),
									SoundCategory.BLOCKS, (float) 8, (float) 1);
				} else {
					((World) world).playSound(x, y, z,
							(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
									.getValue(new ResourceLocation("musicmod:guitar_eminor_down")),
							SoundCategory.BLOCKS, (float) 8, (float) 1, false);
				}
			}
			if ((entity.getCapability(MusicmodModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new MusicmodModVariables.PlayerVariables())).guitarchord_num == 17) {
				world.addParticle(ParticleTypes.NOTE, x, (y + 2), z, 0.458, 3, 0);	
				if (world instanceof World && !world.isRemote()) {
					((World) world)
							.playSound(null, new BlockPos((int) x, (int) y, (int) z),
									(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
											.getValue(new ResourceLocation("musicmod:guitar_fminor_down")),
									SoundCategory.BLOCKS, (float) 8, (float) 1);
				} else {
					((World) world).playSound(x, y, z,
							(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
									.getValue(new ResourceLocation("musicmod:guitar_fminor_down")),
							SoundCategory.BLOCKS, (float) 8, (float) 1, false);
				}
			}
			if ((entity.getCapability(MusicmodModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new MusicmodModVariables.PlayerVariables())).guitarchord_num == 18) {
				world.addParticle(ParticleTypes.NOTE, x, (y + 2), z, 0.5, 3, 0);	
				if (world instanceof World && !world.isRemote()) {
					((World) world)
							.playSound(null, new BlockPos((int) x, (int) y, (int) z),
									(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
											.getValue(new ResourceLocation("musicmod:guitar_fsharpminor_down")),
									SoundCategory.BLOCKS, (float) 8, (float) 1);
				} else {
					((World) world).playSound(x, y, z,
							(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
									.getValue(new ResourceLocation("musicmod:guitar_fsharpminor_down")),
							SoundCategory.BLOCKS, (float) 8, (float) 1, false);
				}
			}
			if ((entity.getCapability(MusicmodModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new MusicmodModVariables.PlayerVariables())).guitarchord_num == 19) {
				world.addParticle(ParticleTypes.NOTE, x, (y + 2), z, 0.542, 3, 0);	
				if (world instanceof World && !world.isRemote()) {
					((World) world)
							.playSound(null, new BlockPos((int) x, (int) y, (int) z),
									(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
											.getValue(new ResourceLocation("musicmod:guitar_gminor_down")),
									SoundCategory.BLOCKS, (float) 8, (float) 1);
				} else {
					((World) world).playSound(x, y, z,
							(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
									.getValue(new ResourceLocation("musicmod:guitar_gminor_down")),
							SoundCategory.BLOCKS, (float) 8, (float) 1, false);
				}
			}
			if ((entity.getCapability(MusicmodModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new MusicmodModVariables.PlayerVariables())).guitarchord_num == 20) {
				world.addParticle(ParticleTypes.NOTE, x, (y + 2), z, 0.583, 3, 0);	
				if (world instanceof World && !world.isRemote()) {
					((World) world)
							.playSound(null, new BlockPos((int) x, (int) y, (int) z),
									(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
											.getValue(new ResourceLocation("musicmod:guitar_gsharpminor_down")),
									SoundCategory.BLOCKS, (float) 8, (float) 1);
				} else {
					((World) world).playSound(x, y, z,
							(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
									.getValue(new ResourceLocation("musicmod:guitar_gsharpminor_down")),
							SoundCategory.BLOCKS, (float) 8, (float) 1, false);
				}
			}
			if ((entity.getCapability(MusicmodModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new MusicmodModVariables.PlayerVariables())).guitarchord_num == 21) {
				world.addParticle(ParticleTypes.NOTE, x, (y + 2), z, 0.625, 3, 0);	
				if (world instanceof World && !world.isRemote()) {
					((World) world)
							.playSound(null, new BlockPos((int) x, (int) y, (int) z),
									(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
											.getValue(new ResourceLocation("musicmod:guitar_aminor_down")),
									SoundCategory.BLOCKS, (float) 8, (float) 1);
				} else {
					((World) world).playSound(x, y, z,
							(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
									.getValue(new ResourceLocation("musicmod:guitar_aminor_down")),
							SoundCategory.BLOCKS, (float) 8, (float) 1, false);
				}
			}
			if ((entity.getCapability(MusicmodModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new MusicmodModVariables.PlayerVariables())).guitarchord_num == 22) {
				world.addParticle(ParticleTypes.NOTE, x, (y + 2), z, 0.667, 3, 0);	
				if (world instanceof World && !world.isRemote()) {
					((World) world)
							.playSound(null, new BlockPos((int) x, (int) y, (int) z),
									(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
											.getValue(new ResourceLocation("musicmod:guitar_asharpminor_down")),
									SoundCategory.BLOCKS, (float) 8, (float) 1);
				} else {
					((World) world).playSound(x, y, z,
							(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
									.getValue(new ResourceLocation("musicmod:guitar_asharpminor_down")),
							SoundCategory.BLOCKS, (float) 8, (float) 1, false);
				}
			}
			if ((entity.getCapability(MusicmodModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new MusicmodModVariables.PlayerVariables())).guitarchord_num == 23) {
				world.addParticle(ParticleTypes.NOTE, x, (y + 2), z, 0.708, 3, 0);	
				if (world instanceof World && !world.isRemote()) {
					((World) world)
							.playSound(null, new BlockPos((int) x, (int) y, (int) z),
									(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
											.getValue(new ResourceLocation("musicmod:guitar_bminor_down")),
									SoundCategory.BLOCKS, (float) 8, (float) 1);
				} else {
					((World) world).playSound(x, y, z,
							(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
									.getValue(new ResourceLocation("musicmod:guitar_bminor_down")),
							SoundCategory.BLOCKS, (float) 8, (float) 1, false);
				}
			}
			if ((entity.getCapability(MusicmodModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new MusicmodModVariables.PlayerVariables())).guitarchord_num == 24) {
				world.addParticle(ParticleTypes.NOTE, x, (y + 2), z, 0.25, 3, 0);	
				if (world instanceof World && !world.isRemote()) {
					((World) world)
							.playSound(null, new BlockPos((int) x, (int) y, (int) z),
									(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
											.getValue(new ResourceLocation("musicmod:guitar_cmajor7_down")),
									SoundCategory.BLOCKS, (float) 8, (float) 1);
				} else {
					((World) world).playSound(x, y, z,
							(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
									.getValue(new ResourceLocation("musicmod:guitar_cmajor7_down")),
							SoundCategory.BLOCKS, (float) 8, (float) 1, false);
				}
			}
			if ((entity.getCapability(MusicmodModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new MusicmodModVariables.PlayerVariables())).guitarchord_num == 25) {
				world.addParticle(ParticleTypes.NOTE, x, (y + 2), z, 0.292, 3, 0);	
				if (world instanceof World && !world.isRemote()) {
					((World) world)
							.playSound(null, new BlockPos((int) x, (int) y, (int) z),
									(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
											.getValue(new ResourceLocation("musicmod:guitar_csharpmajor7_down")),
									SoundCategory.BLOCKS, (float) 8, (float) 1);
				} else {
					((World) world).playSound(x, y, z,
							(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
									.getValue(new ResourceLocation("musicmod:guitar_csharpmajor7_down")),
							SoundCategory.BLOCKS, (float) 8, (float) 1, false);
				}
			}
			if ((entity.getCapability(MusicmodModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new MusicmodModVariables.PlayerVariables())).guitarchord_num == 26) {
				world.addParticle(ParticleTypes.NOTE, x, (y + 2), z, 0.333, 3, 0);	
				if (world instanceof World && !world.isRemote()) {
					((World) world)
							.playSound(null, new BlockPos((int) x, (int) y, (int) z),
									(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
											.getValue(new ResourceLocation("musicmod:guitar_dmajor7_down")),
									SoundCategory.BLOCKS, (float) 8, (float) 1);
				} else {
					((World) world).playSound(x, y, z,
							(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
									.getValue(new ResourceLocation("musicmod:guitar_dmajor7_down")),
							SoundCategory.BLOCKS, (float) 8, (float) 1, false);
				}
			}
			if ((entity.getCapability(MusicmodModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new MusicmodModVariables.PlayerVariables())).guitarchord_num == 27) {
				world.addParticle(ParticleTypes.NOTE, x, (y + 2), z, 0.375, 3, 0);	
				if (world instanceof World && !world.isRemote()) {
					((World) world)
							.playSound(null, new BlockPos((int) x, (int) y, (int) z),
									(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
											.getValue(new ResourceLocation("musicmod:guitar_dsharpmajor7_down")),
									SoundCategory.BLOCKS, (float) 8, (float) 1);
				} else {
					((World) world).playSound(x, y, z,
							(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
									.getValue(new ResourceLocation("musicmod:guitar_dsharpmajor7_down")),
							SoundCategory.BLOCKS, (float) 8, (float) 1, false);
				}
			}
			if ((entity.getCapability(MusicmodModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new MusicmodModVariables.PlayerVariables())).guitarchord_num == 28) {
				world.addParticle(ParticleTypes.NOTE, x, (y + 2), z, 0.417, 3, 0);	
				if (world instanceof World && !world.isRemote()) {
					((World) world)
							.playSound(null, new BlockPos((int) x, (int) y, (int) z),
									(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
											.getValue(new ResourceLocation("musicmod:guitar_emajor7_down")),
									SoundCategory.BLOCKS, (float) 8, (float) 1);
				} else {
					((World) world).playSound(x, y, z,
							(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
									.getValue(new ResourceLocation("musicmod:guitar_emajor7_down")),
							SoundCategory.BLOCKS, (float) 8, (float) 1, false);
				}
			}
			if ((entity.getCapability(MusicmodModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new MusicmodModVariables.PlayerVariables())).guitarchord_num == 29) {
				world.addParticle(ParticleTypes.NOTE, x, (y + 2), z, 0.458, 3, 0);	
				if (world instanceof World && !world.isRemote()) {
					((World) world)
							.playSound(null, new BlockPos((int) x, (int) y, (int) z),
									(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
											.getValue(new ResourceLocation("musicmod:guitar_fmajor7_down")),
									SoundCategory.BLOCKS, (float) 8, (float) 1);
				} else {
					((World) world).playSound(x, y, z,
							(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
									.getValue(new ResourceLocation("musicmod:guitar_fmajor7_down")),
							SoundCategory.BLOCKS, (float) 8, (float) 1, false);
				}
			}
			if ((entity.getCapability(MusicmodModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new MusicmodModVariables.PlayerVariables())).guitarchord_num == 30) {
				world.addParticle(ParticleTypes.NOTE, x, (y + 2), z, 0.5, 3, 0);	
				if (world instanceof World && !world.isRemote()) {
					((World) world)
							.playSound(null, new BlockPos((int) x, (int) y, (int) z),
									(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
											.getValue(new ResourceLocation("musicmod:guitar_fsharpmajor7_down")),
									SoundCategory.BLOCKS, (float) 8, (float) 1);
				} else {
					((World) world).playSound(x, y, z,
							(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
									.getValue(new ResourceLocation("musicmod:guitar_fsharpmajor7_down")),
							SoundCategory.BLOCKS, (float) 8, (float) 1, false);
				}
			}
			if ((entity.getCapability(MusicmodModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new MusicmodModVariables.PlayerVariables())).guitarchord_num == 31) {
				world.addParticle(ParticleTypes.NOTE, x, (y + 2), z, 0.542, 3, 0);	
				if (world instanceof World && !world.isRemote()) {
					((World) world)
							.playSound(null, new BlockPos((int) x, (int) y, (int) z),
									(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
											.getValue(new ResourceLocation("musicmod:guitar_gmajor7_down")),
									SoundCategory.BLOCKS, (float) 8, (float) 1);
				} else {
					((World) world).playSound(x, y, z,
							(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
									.getValue(new ResourceLocation("musicmod:guitar_gmajor7_down")),
							SoundCategory.BLOCKS, (float) 8, (float) 1, false);
				}
			}
			if ((entity.getCapability(MusicmodModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new MusicmodModVariables.PlayerVariables())).guitarchord_num == 32) {
				world.addParticle(ParticleTypes.NOTE, x, (y + 2), z, 0.583, 3, 0);	
				if (world instanceof World && !world.isRemote()) {
					((World) world)
							.playSound(null, new BlockPos((int) x, (int) y, (int) z),
									(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
											.getValue(new ResourceLocation("musicmod:guitar_gsharpmajor7_down")),
									SoundCategory.BLOCKS, (float) 8, (float) 1);
				} else {
					((World) world).playSound(x, y, z,
							(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
									.getValue(new ResourceLocation("musicmod:guitar_gsharpmajor7_down")),
							SoundCategory.BLOCKS, (float) 8, (float) 1, false);
				}
			}
			if ((entity.getCapability(MusicmodModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new MusicmodModVariables.PlayerVariables())).guitarchord_num == 33) {
				world.addParticle(ParticleTypes.NOTE, x, (y + 2), z, 0.625, 3, 0);	
				if (world instanceof World && !world.isRemote()) {
					((World) world)
							.playSound(null, new BlockPos((int) x, (int) y, (int) z),
									(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
											.getValue(new ResourceLocation("musicmod:guitar_amajor7_down")),
									SoundCategory.BLOCKS, (float) 8, (float) 1);
				} else {
					((World) world).playSound(x, y, z,
							(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
									.getValue(new ResourceLocation("musicmod:guitar_amajor7_down")),
							SoundCategory.BLOCKS, (float) 8, (float) 1, false);
				}
			}
			if ((entity.getCapability(MusicmodModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new MusicmodModVariables.PlayerVariables())).guitarchord_num == 34) {
				world.addParticle(ParticleTypes.NOTE, x, (y + 2), z, 0.667, 3, 0);	
				if (world instanceof World && !world.isRemote()) {
					((World) world)
							.playSound(null, new BlockPos((int) x, (int) y, (int) z),
									(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
											.getValue(new ResourceLocation("musicmod:guitar_asharpmajor7_down")),
									SoundCategory.BLOCKS, (float) 8, (float) 1);
				} else {
					((World) world).playSound(x, y, z,
							(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
									.getValue(new ResourceLocation("musicmod:guitar_asharpmajor7_down")),
							SoundCategory.BLOCKS, (float) 8, (float) 1, false);
				}
			}
			if ((entity.getCapability(MusicmodModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new MusicmodModVariables.PlayerVariables())).guitarchord_num == 35) {
				world.addParticle(ParticleTypes.NOTE, x, (y + 2), z, 0.708, 3, 0);	
				if (world instanceof World && !world.isRemote()) {
					((World) world)
							.playSound(null, new BlockPos((int) x, (int) y, (int) z),
									(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
											.getValue(new ResourceLocation("musicmod:guitar_bmajor7_down")),
									SoundCategory.BLOCKS, (float) 8, (float) 1);
				} else {
					((World) world).playSound(x, y, z,
							(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
									.getValue(new ResourceLocation("musicmod:guitar_bmajor7_down")),
							SoundCategory.BLOCKS, (float) 8, (float) 1, false);
				}
			}
		}
	}
}
