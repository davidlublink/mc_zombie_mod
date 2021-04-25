
package net.lublink.zombiemods.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.world.World;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.entity.LivingEntity;
import net.minecraft.block.Blocks;

import net.lublink.zombiemods.procedures.GlicthSwordLivingEntityIsHitWithToolProcedure;
import net.lublink.zombiemods.ZombieModsModElements;

import java.util.Map;
import java.util.HashMap;

@ZombieModsModElements.ModElement.Tag
public class GlicthSwordItem extends ZombieModsModElements.ModElement {
	@ObjectHolder("zombie_mods:glicth_sword")
	public static final Item block = null;
	public GlicthSwordItem(ZombieModsModElements instance) {
		super(instance, 25);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 6000;
			}

			public float getEfficiency() {
				return 0.5f;
			}

			public float getAttackDamage() {
				return 98f;
			}

			public int getHarvestLevel() {
				return 1;
			}

			public int getEnchantability() {
				return 77;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(Blocks.BEACON, (int) (1)));
			}
		}, 3, 96f, new Item.Properties().group(ItemGroup.COMBAT)) {
			@Override
			public boolean hitEntity(ItemStack itemstack, LivingEntity entity, LivingEntity sourceentity) {
				boolean retval = super.hitEntity(itemstack, entity, sourceentity);
				double x = entity.getPosX();
				double y = entity.getPosY();
				double z = entity.getPosZ();
				World world = entity.world;
				{
					Map<String, Object> $_dependencies = new HashMap<>();
					$_dependencies.put("x", x);
					$_dependencies.put("y", y);
					$_dependencies.put("z", z);
					$_dependencies.put("world", world);
					GlicthSwordLivingEntityIsHitWithToolProcedure.executeProcedure($_dependencies);
				}
				return retval;
			}
		}.setRegistryName("glicth_sword"));
	}
}
