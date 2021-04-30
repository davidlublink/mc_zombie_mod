package net.lublink.zombiemods.procedures;

import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;

import net.lublink.zombiemods.block.TheDoNotBreakThisBlockBlock;
import net.lublink.zombiemods.ZombieModsModElements;

import java.util.Map;

@ZombieModsModElements.ModElement.Tag
public class TheDoNotBreakThisBlockBlockDestroyedByPlayerProcedure extends ZombieModsModElements.ModElement {
	public TheDoNotBreakThisBlockBlockDestroyedByPlayerProcedure(ZombieModsModElements instance) {
		super(instance, 31);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				System.err.println("Failed to load dependency x for procedure TheDoNotBreakThisBlockBlockDestroyedByPlayer!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				System.err.println("Failed to load dependency y for procedure TheDoNotBreakThisBlockBlockDestroyedByPlayer!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				System.err.println("Failed to load dependency z for procedure TheDoNotBreakThisBlockBlockDestroyedByPlayer!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				System.err.println("Failed to load dependency world for procedure TheDoNotBreakThisBlockBlockDestroyedByPlayer!");
			return;
		}
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		world.setBlockState(new BlockPos((int) (x + 2), (int) y, (int) (z + 2)), TheDoNotBreakThisBlockBlock.block.getDefaultState(), 3);
	}
}
