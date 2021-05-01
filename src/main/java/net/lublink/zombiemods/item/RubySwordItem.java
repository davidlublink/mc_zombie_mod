
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
public class RubySwordItem extends ZombieModsModElements.ModElement {
	@ObjectHolder("zombie_mods:ruby_sword")
	public static final Item block = null;
	public RubySwordItem(ZombieModsModElements instance) {
		super(instance, 47);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 3800;
			}

			public float getEfficiency() {
				return 4f;
			}

			public float getAttackDamage() {
				return 26f;
			}

			public int getHarvestLevel() {
				return 1;
			}

			public int getEnchantability() {
				return 2;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(RubyItem.block, (int) (1)));
			}
		}, 3, -3f, new Item.Properties().group(ItemGroup.COMBAT)) {
		}.setRegistryName("ruby_sword"));
	}
}
