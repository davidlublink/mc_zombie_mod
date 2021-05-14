package net.lublink.zombiemods.procedures;

import net.minecraft.world.GameType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;

import net.lublink.zombiemods.ZombieModsModElements;

import java.util.Map;

@ZombieModsModElements.ModElement.Tag
public class CreativeModeRightClickedInAirProcedure extends ZombieModsModElements.ModElement {
	public CreativeModeRightClickedInAirProcedure(ZombieModsModElements instance) {
		super(instance, 65);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				System.err.println("Failed to load dependency entity for procedure CreativeModeRightClickedInAir!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof PlayerEntity)
			((PlayerEntity) entity).setGameType(GameType.CREATIVE);
	}
}
