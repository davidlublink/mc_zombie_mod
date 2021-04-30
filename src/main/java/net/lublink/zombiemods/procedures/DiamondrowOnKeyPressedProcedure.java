package net.lublink.zombiemods.procedures;

@ZombieModsModElements.ModElement.Tag
public class DiamondrowOnKeyPressedProcedure extends ZombieModsModElements.ModElement {

	public DiamondrowOnKeyPressedProcedure(ZombieModsModElements instance) {
		super(instance, 44);

	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				System.err.println("Failed to load dependency entity for procedure DiamondrowOnKeyPressed!");
			return;
		}

		Entity entity = (Entity) dependencies.get("entity");

		if (entity instanceof PlayerEntity) {
			ItemStack _setstack = new ItemStack(Items.DIAMOND, (int) (1));
			_setstack.setCount((int) 1);
			ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
		}

	}

}
