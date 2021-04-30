package net.lublink.zombiemods.procedures;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;

import net.lublink.zombiemods.block.Present1Block;
import net.lublink.zombiemods.ZombieModsModElements;

import java.util.Map;

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
