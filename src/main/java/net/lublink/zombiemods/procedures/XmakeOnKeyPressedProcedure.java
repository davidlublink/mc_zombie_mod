package net.lublink.zombiemods.procedures;

@ZombieModsModElements.ModElement.Tag
public class XmakeOnKeyPressedProcedure extends ZombieModsModElements.ModElement {

	public XmakeOnKeyPressedProcedure(ZombieModsModElements instance) {
		super(instance, 40);

	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				System.err.println("Failed to load dependency entity for procedure XmakeOnKeyPressed!");
			return;
		}

		Entity entity = (Entity) dependencies.get("entity");

		if (entity instanceof PlayerEntity) {
			ItemStack _setstack = new ItemStack(Present1Block.block, (int) (1));
			_setstack.setCount((int) 1);
			ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
		}

	}

}
