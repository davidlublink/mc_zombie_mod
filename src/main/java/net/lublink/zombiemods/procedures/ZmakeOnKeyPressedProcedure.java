package net.lublink.zombiemods.procedures;

@ZombieModsModElements.ModElement.Tag
public class ZmakeOnKeyPressedProcedure extends ZombieModsModElements.ModElement {

	public ZmakeOnKeyPressedProcedure(ZombieModsModElements instance) {
		super(instance, 39);

	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				System.err.println("Failed to load dependency entity for procedure ZmakeOnKeyPressed!");
			return;
		}

		Entity entity = (Entity) dependencies.get("entity");

		if (entity instanceof PlayerEntity) {
			ItemStack _setstack = new ItemStack(PresentItem.block, (int) (1));
			_setstack.setCount((int) 1);
			ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
		}

	}

}
