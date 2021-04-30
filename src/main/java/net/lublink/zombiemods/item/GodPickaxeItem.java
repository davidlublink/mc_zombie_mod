
package net.lublink.zombiemods.item;

@ZombieModsModElements.ModElement.Tag
public class GodPickaxeItem extends ZombieModsModElements.ModElement {

	@ObjectHolder("zombie_mods:god_pickaxe")
	public static final Item block = null;

	public GodPickaxeItem(ZombieModsModElements instance) {
		super(instance, 34);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new PickaxeItem(new IItemTier() {
			public int getMaxUses() {
				return 100000;
			}

			public float getEfficiency() {
				return 10000f;
			}

			public float getAttackDamage() {
				return 2f;
			}

			public int getHarvestLevel() {
				return 1;
			}

			public int getEnchantability() {
				return 2;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.EMPTY;
			}
		}, 1, -3f, new Item.Properties().group(ItemGroup.TOOLS)) {

		}.setRegistryName("god_pickaxe"));
	}

}
