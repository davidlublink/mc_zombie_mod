package net.lublink.zombiemods.procedures;

@ZombieModsModElements.ModElement.Tag
public class BlueronSwordLivingEntityIsHitWithToolProcedure extends ZombieModsModElements.ModElement {

	public BlueronSwordLivingEntityIsHitWithToolProcedure(ZombieModsModElements instance) {
		super(instance, 30);

	}

	public static void executeProcedure(Map<String, Object> dependencies) {

		{
			MinecraftServer mcserv = ServerLifecycleHooks.getCurrentServer();
			if (mcserv != null)
				mcserv.getPlayerList().sendMessage(new StringTextComponent("i killed somthing"));
		}

	}

}
