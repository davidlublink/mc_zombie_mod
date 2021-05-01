
package net.lublink.zombiemods.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.lublink.zombiemods.item.DiamondAndIronSwordTopItem;
import net.lublink.zombiemods.ZombieModsModElements;

@ZombieModsModElements.ModElement.Tag
public class MergeItemGroup extends ZombieModsModElements.ModElement {
	public MergeItemGroup(ZombieModsModElements instance) {
		super(instance, 62);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabmerge") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(DiamondAndIronSwordTopItem.block, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static ItemGroup tab;
}
