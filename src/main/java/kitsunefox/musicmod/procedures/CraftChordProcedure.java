package kitsunefox.musicmod.procedures;

import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.inventory.container.Slot;
import net.minecraft.inventory.container.Container;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;

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

import java.util.function.Supplier;
import java.util.Map;

public class CraftChordProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				MusicmodMod.LOGGER.warn("Failed to load dependency entity for procedure CraftChord!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if ((new Object() {
			public ItemStack getItemStack(int sltid) {
				Entity _ent = entity;
				if (_ent instanceof ServerPlayerEntity) {
					Container _current = ((ServerPlayerEntity) _ent).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							return ((Slot) ((Map) invobj).get(sltid)).getStack();
						}
					}
				}
				return ItemStack.EMPTY;
			}
		}.getItemStack((int) (0))).getItem() == Items.PAPER) {
			if ((new Object() {
				public ItemStack getItemStack(int sltid) {
					Entity _ent = entity;
					if (_ent instanceof ServerPlayerEntity) {
						Container _current = ((ServerPlayerEntity) _ent).openContainer;
						if (_current instanceof Supplier) {
							Object invobj = ((Supplier) _current).get();
							if (invobj instanceof Map) {
								return ((Slot) ((Map) invobj).get(sltid)).getStack();
							}
						}
					}
					return ItemStack.EMPTY;
				}
			}.getItemStack((int) (1))).getItem() == Items.INK_SAC) {
				if (new Object() {
					public int getAmount(int sltid) {
						if (entity instanceof ServerPlayerEntity) {
							Container _current = ((ServerPlayerEntity) entity).openContainer;
							if (_current instanceof Supplier) {
								Object invobj = ((Supplier) _current).get();
								if (invobj instanceof Map) {
									ItemStack stack = ((Slot) ((Map) invobj).get(sltid)).getStack();;
									if (stack != null)
										return stack.getCount();
								}
							}
						}
						return 0;
					}
				}.getAmount((int) (2)) == 0) {
					if ((entity.getCapability(MusicmodModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new MusicmodModVariables.PlayerVariables())).chordType == 0) {
						if ((entity.getCapability(MusicmodModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new MusicmodModVariables.PlayerVariables())).rootNote == 0) {
							if (entity instanceof PlayerEntity) {
								Container _current = ((PlayerEntity) entity).openContainer;
								if (_current instanceof Supplier) {
									Object invobj = ((Supplier) _current).get();
									if (invobj instanceof Map) {
										ItemStack _setstack = new ItemStack(CMajorChordSheetItem.block);
										_setstack.setCount((int) 1);
										((Slot) ((Map) invobj).get((int) (2))).putStack(_setstack);
										_current.detectAndSendChanges();
									}
								}
							}
						}
						if ((entity.getCapability(MusicmodModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new MusicmodModVariables.PlayerVariables())).rootNote == 1) {
							if (entity instanceof PlayerEntity) {
								Container _current = ((PlayerEntity) entity).openContainer;
								if (_current instanceof Supplier) {
									Object invobj = ((Supplier) _current).get();
									if (invobj instanceof Map) {
										ItemStack _setstack = new ItemStack(CSharpMajorChordSheetItem.block);
										_setstack.setCount((int) 1);
										((Slot) ((Map) invobj).get((int) (2))).putStack(_setstack);
										_current.detectAndSendChanges();
									}
								}
							}
						}
						if ((entity.getCapability(MusicmodModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new MusicmodModVariables.PlayerVariables())).rootNote == 2) {
							if (entity instanceof PlayerEntity) {
								Container _current = ((PlayerEntity) entity).openContainer;
								if (_current instanceof Supplier) {
									Object invobj = ((Supplier) _current).get();
									if (invobj instanceof Map) {
										ItemStack _setstack = new ItemStack(DMajorChordSheetItem.block);
										_setstack.setCount((int) 1);
										((Slot) ((Map) invobj).get((int) (2))).putStack(_setstack);
										_current.detectAndSendChanges();
									}
								}
							}
						}
						if ((entity.getCapability(MusicmodModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new MusicmodModVariables.PlayerVariables())).rootNote == 3) {
							if (entity instanceof PlayerEntity) {
								Container _current = ((PlayerEntity) entity).openContainer;
								if (_current instanceof Supplier) {
									Object invobj = ((Supplier) _current).get();
									if (invobj instanceof Map) {
										ItemStack _setstack = new ItemStack(DSharpMajorChordSheetItem.block);
										_setstack.setCount((int) 1);
										((Slot) ((Map) invobj).get((int) (2))).putStack(_setstack);
										_current.detectAndSendChanges();
									}
								}
							}
						}
						if ((entity.getCapability(MusicmodModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new MusicmodModVariables.PlayerVariables())).rootNote == 4) {
							if (entity instanceof PlayerEntity) {
								Container _current = ((PlayerEntity) entity).openContainer;
								if (_current instanceof Supplier) {
									Object invobj = ((Supplier) _current).get();
									if (invobj instanceof Map) {
										ItemStack _setstack = new ItemStack(EMajorChordSheetItem.block);
										_setstack.setCount((int) 1);
										((Slot) ((Map) invobj).get((int) (2))).putStack(_setstack);
										_current.detectAndSendChanges();
									}
								}
							}
						}
						if ((entity.getCapability(MusicmodModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new MusicmodModVariables.PlayerVariables())).rootNote == 5) {
							if (entity instanceof PlayerEntity) {
								Container _current = ((PlayerEntity) entity).openContainer;
								if (_current instanceof Supplier) {
									Object invobj = ((Supplier) _current).get();
									if (invobj instanceof Map) {
										ItemStack _setstack = new ItemStack(FMajorChordSheetItem.block);
										_setstack.setCount((int) 1);
										((Slot) ((Map) invobj).get((int) (2))).putStack(_setstack);
										_current.detectAndSendChanges();
									}
								}
							}
						}
						if ((entity.getCapability(MusicmodModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new MusicmodModVariables.PlayerVariables())).rootNote == 6) {
							if (entity instanceof PlayerEntity) {
								Container _current = ((PlayerEntity) entity).openContainer;
								if (_current instanceof Supplier) {
									Object invobj = ((Supplier) _current).get();
									if (invobj instanceof Map) {
										ItemStack _setstack = new ItemStack(FSharpMajorChordSheetItem.block);
										_setstack.setCount((int) 1);
										((Slot) ((Map) invobj).get((int) (2))).putStack(_setstack);
										_current.detectAndSendChanges();
									}
								}
							}
						}
						if ((entity.getCapability(MusicmodModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new MusicmodModVariables.PlayerVariables())).rootNote == 7) {
							if (entity instanceof PlayerEntity) {
								Container _current = ((PlayerEntity) entity).openContainer;
								if (_current instanceof Supplier) {
									Object invobj = ((Supplier) _current).get();
									if (invobj instanceof Map) {
										ItemStack _setstack = new ItemStack(GMajorChordSheetItem.block);
										_setstack.setCount((int) 1);
										((Slot) ((Map) invobj).get((int) (2))).putStack(_setstack);
										_current.detectAndSendChanges();
									}
								}
							}
						}
						if ((entity.getCapability(MusicmodModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new MusicmodModVariables.PlayerVariables())).rootNote == 8) {
							if (entity instanceof PlayerEntity) {
								Container _current = ((PlayerEntity) entity).openContainer;
								if (_current instanceof Supplier) {
									Object invobj = ((Supplier) _current).get();
									if (invobj instanceof Map) {
										ItemStack _setstack = new ItemStack(GSharpMajorChordSheetItem.block);
										_setstack.setCount((int) 1);
										((Slot) ((Map) invobj).get((int) (2))).putStack(_setstack);
										_current.detectAndSendChanges();
									}
								}
							}
						}
						if ((entity.getCapability(MusicmodModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new MusicmodModVariables.PlayerVariables())).rootNote == 9) {
							if (entity instanceof PlayerEntity) {
								Container _current = ((PlayerEntity) entity).openContainer;
								if (_current instanceof Supplier) {
									Object invobj = ((Supplier) _current).get();
									if (invobj instanceof Map) {
										ItemStack _setstack = new ItemStack(AMajorChordSheetItem.block);
										_setstack.setCount((int) 1);
										((Slot) ((Map) invobj).get((int) (2))).putStack(_setstack);
										_current.detectAndSendChanges();
									}
								}
							}
						}
						if ((entity.getCapability(MusicmodModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new MusicmodModVariables.PlayerVariables())).rootNote == 10) {
							if (entity instanceof PlayerEntity) {
								Container _current = ((PlayerEntity) entity).openContainer;
								if (_current instanceof Supplier) {
									Object invobj = ((Supplier) _current).get();
									if (invobj instanceof Map) {
										ItemStack _setstack = new ItemStack(ASharpMajorChordSheetItem.block);
										_setstack.setCount((int) 1);
										((Slot) ((Map) invobj).get((int) (2))).putStack(_setstack);
										_current.detectAndSendChanges();
									}
								}
							}
						}
						if ((entity.getCapability(MusicmodModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new MusicmodModVariables.PlayerVariables())).rootNote == 11) {
							if (entity instanceof PlayerEntity) {
								Container _current = ((PlayerEntity) entity).openContainer;
								if (_current instanceof Supplier) {
									Object invobj = ((Supplier) _current).get();
									if (invobj instanceof Map) {
										ItemStack _setstack = new ItemStack(BMajorChordSheetItem.block);
										_setstack.setCount((int) 1);
										((Slot) ((Map) invobj).get((int) (2))).putStack(_setstack);
										_current.detectAndSendChanges();
									}
								}
							}
						}
					}
					if ((entity.getCapability(MusicmodModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new MusicmodModVariables.PlayerVariables())).chordType == 1) {
						if ((entity.getCapability(MusicmodModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new MusicmodModVariables.PlayerVariables())).rootNote == 0) {
							if (entity instanceof PlayerEntity) {
								Container _current = ((PlayerEntity) entity).openContainer;
								if (_current instanceof Supplier) {
									Object invobj = ((Supplier) _current).get();
									if (invobj instanceof Map) {
										ItemStack _setstack = new ItemStack(CMinorChordSheetItem.block);
										_setstack.setCount((int) 1);
										((Slot) ((Map) invobj).get((int) (2))).putStack(_setstack);
										_current.detectAndSendChanges();
									}
								}
							}
						}
						if ((entity.getCapability(MusicmodModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new MusicmodModVariables.PlayerVariables())).rootNote == 1) {
							if (entity instanceof PlayerEntity) {
								Container _current = ((PlayerEntity) entity).openContainer;
								if (_current instanceof Supplier) {
									Object invobj = ((Supplier) _current).get();
									if (invobj instanceof Map) {
										ItemStack _setstack = new ItemStack(CSharpMinorChordSheetItem.block);
										_setstack.setCount((int) 1);
										((Slot) ((Map) invobj).get((int) (2))).putStack(_setstack);
										_current.detectAndSendChanges();
									}
								}
							}
						}
						if ((entity.getCapability(MusicmodModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new MusicmodModVariables.PlayerVariables())).rootNote == 2) {
							if (entity instanceof PlayerEntity) {
								Container _current = ((PlayerEntity) entity).openContainer;
								if (_current instanceof Supplier) {
									Object invobj = ((Supplier) _current).get();
									if (invobj instanceof Map) {
										ItemStack _setstack = new ItemStack(DMinorChordSheetItem.block);
										_setstack.setCount((int) 1);
										((Slot) ((Map) invobj).get((int) (2))).putStack(_setstack);
										_current.detectAndSendChanges();
									}
								}
							}
						}
						if ((entity.getCapability(MusicmodModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new MusicmodModVariables.PlayerVariables())).rootNote == 3) {
							if (entity instanceof PlayerEntity) {
								Container _current = ((PlayerEntity) entity).openContainer;
								if (_current instanceof Supplier) {
									Object invobj = ((Supplier) _current).get();
									if (invobj instanceof Map) {
										ItemStack _setstack = new ItemStack(DSharpMinorChordSheetItem.block);
										_setstack.setCount((int) 1);
										((Slot) ((Map) invobj).get((int) (2))).putStack(_setstack);
										_current.detectAndSendChanges();
									}
								}
							}
						}
						if ((entity.getCapability(MusicmodModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new MusicmodModVariables.PlayerVariables())).rootNote == 4) {
							if (entity instanceof PlayerEntity) {
								Container _current = ((PlayerEntity) entity).openContainer;
								if (_current instanceof Supplier) {
									Object invobj = ((Supplier) _current).get();
									if (invobj instanceof Map) {
										ItemStack _setstack = new ItemStack(EMinorChordSheetItem.block);
										_setstack.setCount((int) 1);
										((Slot) ((Map) invobj).get((int) (2))).putStack(_setstack);
										_current.detectAndSendChanges();
									}
								}
							}
						}
						if ((entity.getCapability(MusicmodModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new MusicmodModVariables.PlayerVariables())).rootNote == 5) {
							if (entity instanceof PlayerEntity) {
								Container _current = ((PlayerEntity) entity).openContainer;
								if (_current instanceof Supplier) {
									Object invobj = ((Supplier) _current).get();
									if (invobj instanceof Map) {
										ItemStack _setstack = new ItemStack(FMinorChordSheetItem.block);
										_setstack.setCount((int) 1);
										((Slot) ((Map) invobj).get((int) (2))).putStack(_setstack);
										_current.detectAndSendChanges();
									}
								}
							}
						}
						if ((entity.getCapability(MusicmodModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new MusicmodModVariables.PlayerVariables())).rootNote == 6) {
							if (entity instanceof PlayerEntity) {
								Container _current = ((PlayerEntity) entity).openContainer;
								if (_current instanceof Supplier) {
									Object invobj = ((Supplier) _current).get();
									if (invobj instanceof Map) {
										ItemStack _setstack = new ItemStack(FSharpMinorChordSheetItem.block);
										_setstack.setCount((int) 1);
										((Slot) ((Map) invobj).get((int) (2))).putStack(_setstack);
										_current.detectAndSendChanges();
									}
								}
							}
						}
						if ((entity.getCapability(MusicmodModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new MusicmodModVariables.PlayerVariables())).rootNote == 7) {
							if (entity instanceof PlayerEntity) {
								Container _current = ((PlayerEntity) entity).openContainer;
								if (_current instanceof Supplier) {
									Object invobj = ((Supplier) _current).get();
									if (invobj instanceof Map) {
										ItemStack _setstack = new ItemStack(GMinorChordSheetItem.block);
										_setstack.setCount((int) 1);
										((Slot) ((Map) invobj).get((int) (2))).putStack(_setstack);
										_current.detectAndSendChanges();
									}
								}
							}
						}
						if ((entity.getCapability(MusicmodModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new MusicmodModVariables.PlayerVariables())).rootNote == 8) {
							if (entity instanceof PlayerEntity) {
								Container _current = ((PlayerEntity) entity).openContainer;
								if (_current instanceof Supplier) {
									Object invobj = ((Supplier) _current).get();
									if (invobj instanceof Map) {
										ItemStack _setstack = new ItemStack(GSharpMinorChordSheetItem.block);
										_setstack.setCount((int) 1);
										((Slot) ((Map) invobj).get((int) (2))).putStack(_setstack);
										_current.detectAndSendChanges();
									}
								}
							}
						}
						if ((entity.getCapability(MusicmodModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new MusicmodModVariables.PlayerVariables())).rootNote == 9) {
							if (entity instanceof PlayerEntity) {
								Container _current = ((PlayerEntity) entity).openContainer;
								if (_current instanceof Supplier) {
									Object invobj = ((Supplier) _current).get();
									if (invobj instanceof Map) {
										ItemStack _setstack = new ItemStack(AMinorChordSheetItem.block);
										_setstack.setCount((int) 1);
										((Slot) ((Map) invobj).get((int) (2))).putStack(_setstack);
										_current.detectAndSendChanges();
									}
								}
							}
						}
						if ((entity.getCapability(MusicmodModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new MusicmodModVariables.PlayerVariables())).rootNote == 10) {
							if (entity instanceof PlayerEntity) {
								Container _current = ((PlayerEntity) entity).openContainer;
								if (_current instanceof Supplier) {
									Object invobj = ((Supplier) _current).get();
									if (invobj instanceof Map) {
										ItemStack _setstack = new ItemStack(ASharpMinorChordSheetItem.block);
										_setstack.setCount((int) 1);
										((Slot) ((Map) invobj).get((int) (2))).putStack(_setstack);
										_current.detectAndSendChanges();
									}
								}
							}
						}
						if ((entity.getCapability(MusicmodModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new MusicmodModVariables.PlayerVariables())).rootNote == 11) {
							if (entity instanceof PlayerEntity) {
								Container _current = ((PlayerEntity) entity).openContainer;
								if (_current instanceof Supplier) {
									Object invobj = ((Supplier) _current).get();
									if (invobj instanceof Map) {
										ItemStack _setstack = new ItemStack(BMinorChordSheetItem.block);
										_setstack.setCount((int) 1);
										((Slot) ((Map) invobj).get((int) (2))).putStack(_setstack);
										_current.detectAndSendChanges();
									}
								}
							}
						}
					}
					if ((entity.getCapability(MusicmodModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new MusicmodModVariables.PlayerVariables())).chordType == 2) {
						if ((entity.getCapability(MusicmodModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new MusicmodModVariables.PlayerVariables())).rootNote == 0) {
							if (entity instanceof PlayerEntity) {
								Container _current = ((PlayerEntity) entity).openContainer;
								if (_current instanceof Supplier) {
									Object invobj = ((Supplier) _current).get();
									if (invobj instanceof Map) {
										ItemStack _setstack = new ItemStack(CMajor7ChordSheetItem.block);
										_setstack.setCount((int) 1);
										((Slot) ((Map) invobj).get((int) (2))).putStack(_setstack);
										_current.detectAndSendChanges();
									}
								}
							}
						}
						if ((entity.getCapability(MusicmodModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new MusicmodModVariables.PlayerVariables())).rootNote == 1) {
							if (entity instanceof PlayerEntity) {
								Container _current = ((PlayerEntity) entity).openContainer;
								if (_current instanceof Supplier) {
									Object invobj = ((Supplier) _current).get();
									if (invobj instanceof Map) {
										ItemStack _setstack = new ItemStack(CSharpMajor7ChordSheetItem.block);
										_setstack.setCount((int) 1);
										((Slot) ((Map) invobj).get((int) (2))).putStack(_setstack);
										_current.detectAndSendChanges();
									}
								}
							}
						}
						if ((entity.getCapability(MusicmodModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new MusicmodModVariables.PlayerVariables())).rootNote == 2) {
							if (entity instanceof PlayerEntity) {
								Container _current = ((PlayerEntity) entity).openContainer;
								if (_current instanceof Supplier) {
									Object invobj = ((Supplier) _current).get();
									if (invobj instanceof Map) {
										ItemStack _setstack = new ItemStack(DMajor7ChordSheetItem.block);
										_setstack.setCount((int) 1);
										((Slot) ((Map) invobj).get((int) (2))).putStack(_setstack);
										_current.detectAndSendChanges();
									}
								}
							}
						}
						if ((entity.getCapability(MusicmodModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new MusicmodModVariables.PlayerVariables())).rootNote == 3) {
							if (entity instanceof PlayerEntity) {
								Container _current = ((PlayerEntity) entity).openContainer;
								if (_current instanceof Supplier) {
									Object invobj = ((Supplier) _current).get();
									if (invobj instanceof Map) {
										ItemStack _setstack = new ItemStack(DMajorSharp7ChordSheetItem.block);
										_setstack.setCount((int) 1);
										((Slot) ((Map) invobj).get((int) (2))).putStack(_setstack);
										_current.detectAndSendChanges();
									}
								}
							}
						}
						if ((entity.getCapability(MusicmodModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new MusicmodModVariables.PlayerVariables())).rootNote == 4) {
							if (entity instanceof PlayerEntity) {
								Container _current = ((PlayerEntity) entity).openContainer;
								if (_current instanceof Supplier) {
									Object invobj = ((Supplier) _current).get();
									if (invobj instanceof Map) {
										ItemStack _setstack = new ItemStack(EMajor7ChordSheetItem.block);
										_setstack.setCount((int) 1);
										((Slot) ((Map) invobj).get((int) (2))).putStack(_setstack);
										_current.detectAndSendChanges();
									}
								}
							}
						}
						if ((entity.getCapability(MusicmodModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new MusicmodModVariables.PlayerVariables())).rootNote == 5) {
							if (entity instanceof PlayerEntity) {
								Container _current = ((PlayerEntity) entity).openContainer;
								if (_current instanceof Supplier) {
									Object invobj = ((Supplier) _current).get();
									if (invobj instanceof Map) {
										ItemStack _setstack = new ItemStack(FMajor7ChordSheetItem.block);
										_setstack.setCount((int) 1);
										((Slot) ((Map) invobj).get((int) (2))).putStack(_setstack);
										_current.detectAndSendChanges();
									}
								}
							}
						}
						if ((entity.getCapability(MusicmodModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new MusicmodModVariables.PlayerVariables())).rootNote == 6) {
							if (entity instanceof PlayerEntity) {
								Container _current = ((PlayerEntity) entity).openContainer;
								if (_current instanceof Supplier) {
									Object invobj = ((Supplier) _current).get();
									if (invobj instanceof Map) {
										ItemStack _setstack = new ItemStack(FSharpMajor7ChordSheetItem.block);
										_setstack.setCount((int) 1);
										((Slot) ((Map) invobj).get((int) (2))).putStack(_setstack);
										_current.detectAndSendChanges();
									}
								}
							}
						}
						if ((entity.getCapability(MusicmodModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new MusicmodModVariables.PlayerVariables())).rootNote == 7) {
							if (entity instanceof PlayerEntity) {
								Container _current = ((PlayerEntity) entity).openContainer;
								if (_current instanceof Supplier) {
									Object invobj = ((Supplier) _current).get();
									if (invobj instanceof Map) {
										ItemStack _setstack = new ItemStack(GMajor7ChordSheetItem.block);
										_setstack.setCount((int) 1);
										((Slot) ((Map) invobj).get((int) (2))).putStack(_setstack);
										_current.detectAndSendChanges();
									}
								}
							}
						}
						if ((entity.getCapability(MusicmodModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new MusicmodModVariables.PlayerVariables())).rootNote == 8) {
							if (entity instanceof PlayerEntity) {
								Container _current = ((PlayerEntity) entity).openContainer;
								if (_current instanceof Supplier) {
									Object invobj = ((Supplier) _current).get();
									if (invobj instanceof Map) {
										ItemStack _setstack = new ItemStack(GSharpMajor7ChordItem.block);
										_setstack.setCount((int) 1);
										((Slot) ((Map) invobj).get((int) (2))).putStack(_setstack);
										_current.detectAndSendChanges();
									}
								}
							}
						}
						if ((entity.getCapability(MusicmodModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new MusicmodModVariables.PlayerVariables())).rootNote == 9) {
							if (entity instanceof PlayerEntity) {
								Container _current = ((PlayerEntity) entity).openContainer;
								if (_current instanceof Supplier) {
									Object invobj = ((Supplier) _current).get();
									if (invobj instanceof Map) {
										ItemStack _setstack = new ItemStack(AMajor7ChordSheetItem.block);
										_setstack.setCount((int) 1);
										((Slot) ((Map) invobj).get((int) (2))).putStack(_setstack);
										_current.detectAndSendChanges();
									}
								}
							}
						}
						if ((entity.getCapability(MusicmodModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new MusicmodModVariables.PlayerVariables())).rootNote == 10) {
							if (entity instanceof PlayerEntity) {
								Container _current = ((PlayerEntity) entity).openContainer;
								if (_current instanceof Supplier) {
									Object invobj = ((Supplier) _current).get();
									if (invobj instanceof Map) {
										ItemStack _setstack = new ItemStack(ASharpMajor7ChordItem.block);
										_setstack.setCount((int) 1);
										((Slot) ((Map) invobj).get((int) (2))).putStack(_setstack);
										_current.detectAndSendChanges();
									}
								}
							}
						}
						if ((entity.getCapability(MusicmodModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new MusicmodModVariables.PlayerVariables())).rootNote == 11) {
							if (entity instanceof PlayerEntity) {
								Container _current = ((PlayerEntity) entity).openContainer;
								if (_current instanceof Supplier) {
									Object invobj = ((Supplier) _current).get();
									if (invobj instanceof Map) {
										ItemStack _setstack = new ItemStack(BMajor7ChordSheetItem.block);
										_setstack.setCount((int) 1);
										((Slot) ((Map) invobj).get((int) (2))).putStack(_setstack);
										_current.detectAndSendChanges();
									}
								}
							}
						}
					}
					{
						Entity _ent = entity;
						if (_ent instanceof ServerPlayerEntity) {
							Container _current = ((ServerPlayerEntity) _ent).openContainer;
							if (_current instanceof Supplier) {
								Object invobj = ((Supplier) _current).get();
								if (invobj instanceof Map) {
									((Slot) ((Map) invobj).get((int) (0))).decrStackSize((int) (1));
									_current.detectAndSendChanges();
								}
							}
						}
					}
					{
						Entity _ent = entity;
						if (_ent instanceof ServerPlayerEntity) {
							Container _current = ((ServerPlayerEntity) _ent).openContainer;
							if (_current instanceof Supplier) {
								Object invobj = ((Supplier) _current).get();
								if (invobj instanceof Map) {
									((Slot) ((Map) invobj).get((int) (1))).decrStackSize((int) (1));
									_current.detectAndSendChanges();
								}
							}
						}
					}
				}
			}
		}
	}
}
