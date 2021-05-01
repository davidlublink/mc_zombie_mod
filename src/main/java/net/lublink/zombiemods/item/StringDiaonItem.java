
package net.lublink.zombiemods.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

import net.lublink.zombiemods.itemgroup.MergeItemGroup;
import net.lublink.zombiemods.ZombieModsModElements;

@ZombieModsModElements.ModElement.Tag
public class StringDiaonItem extends ZombieModsModElements.ModElement {
	@ObjectHolder("zombie_mods:string_diaon")
	public static final Item block = null;
	public StringDiaonItem(ZombieModsModElements instance) {
		super(instance, 41);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(MergeItemGroup.tab).maxStackSize(64).rarity(Rarity.COMMON));
			setRegistryName("string_diaon");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}
	}
}
