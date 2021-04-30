package net.lublink.zombiemods.procedures;

import net.minecraftforge.fml.server.ServerLifecycleHooks;

import net.minecraft.util.text.StringTextComponent;
import net.minecraft.server.MinecraftServer;

import net.lublink.zombiemods.ZombieModsModElements;

import java.util.Map;

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
