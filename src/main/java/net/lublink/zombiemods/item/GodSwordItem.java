
package net.lublink.zombiemods.item;

@ZombieModsModElements.ModElement.Tag
public class GodSwordItem extends ZombieModsModElements.ModElement {

	@ObjectHolder("zombie_mods:god_sword")
	public static final Item block = null;

	public GodSwordItem(ZombieModsModElements instance) {
		super(instance, 33);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 100;
			}

			public float getEfficiency() {
				return 4f;
			}

			public float getAttackDamage() {
				return 9998f;
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
		}, 3, -3f, new Item.Properties().group(ItemGroup.COMBAT)) {

		}.setRegistryName("god_sword"));
	}

}
