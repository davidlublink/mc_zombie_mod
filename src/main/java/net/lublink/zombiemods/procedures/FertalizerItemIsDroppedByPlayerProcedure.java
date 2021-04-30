package net.lublink.zombiemods.procedures;

@ZombieModsModElements.ModElement.Tag
public class FertalizerItemIsDroppedByPlayerProcedure extends ZombieModsModElements.ModElement {

	public FertalizerItemIsDroppedByPlayerProcedure(ZombieModsModElements instance) {
		super(instance, 27);

	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				System.err.println("Failed to load dependency x for procedure FertalizerItemIsDroppedByPlayer!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				System.err.println("Failed to load dependency y for procedure FertalizerItemIsDroppedByPlayer!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				System.err.println("Failed to load dependency z for procedure FertalizerItemIsDroppedByPlayer!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				System.err.println("Failed to load dependency world for procedure FertalizerItemIsDroppedByPlayer!");
			return;
		}

		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");

		if (world instanceof World && !world.getWorld().isRemote) {
			world.getWorld().createExplosion(null, (int) (x + 4), (int) y, (int) z, (float) 4, Explosion.Mode.BREAK);
		}

	}

}
