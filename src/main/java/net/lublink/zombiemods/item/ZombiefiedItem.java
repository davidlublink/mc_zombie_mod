
package net.lublink.zombiemods.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.lublink.zombiemods.ZombieModsModElements;

@ZombieModsModElements.ModElement.Tag
public class ZombiefiedItem extends ZombieModsModElements.ModElement {
	@ObjectHolder("zombie_mods:zombiefied")
	public static final Item block = null;
	public ZombiefiedItem(ZombieModsModElements instance) {
		super(instance, 8);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 2800;
			}

			public float getEfficiency() {
				return 1f;
			}

			public float getAttackDamage() {
				return 11.5f;
			}

			public int getHarvestLevel() {
				return 1;
			}

			public int getEnchantability() {
				return 2;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(ZombiefeidIngotItem.block, (int) (1)));
			}
		}, 3, 5f, new Item.Properties().group(ItemGroup.COMBAT)) {
		}.setRegistryName("zombiefied"));
	}
}
