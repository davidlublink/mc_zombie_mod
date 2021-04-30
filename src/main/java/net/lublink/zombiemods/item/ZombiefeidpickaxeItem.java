
package net.lublink.zombiemods.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.lublink.zombiemods.ZombieModsModElements;

@ZombieModsModElements.ModElement.Tag
public class ZombiefeidpickaxeItem extends ZombieModsModElements.ModElement {
	@ObjectHolder("zombie_mods:zombiefeidpickaxe")
	public static final Item block = null;
	public ZombiefeidpickaxeItem(ZombieModsModElements instance) {
		super(instance, 14);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new PickaxeItem(new IItemTier() {
			public int getMaxUses() {
				return 2800;
			}

			public float getEfficiency() {
				return 20f;
			}

			public float getAttackDamage() {
				return 9.5f;
			}

			public int getHarvestLevel() {
				return 5;
			}

			public int getEnchantability() {
				return 15;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(ZombiefeidIngotItem.block, (int) (1)));
			}
		}, 1, 7f, new Item.Properties().group(ItemGroup.TOOLS)) {
		}.setRegistryName("zombiefeidpickaxe"));
	}
}
