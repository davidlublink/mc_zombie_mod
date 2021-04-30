
package net.lublink.zombiemods.item;

@ZombieModsModElements.ModElement.Tag
public class WoodenHammerItem extends ZombieModsModElements.ModElement {

	@ObjectHolder("zombie_mods:wooden_hammer")
	public static final Item block = null;

	public WoodenHammerItem(ZombieModsModElements instance) {
		super(instance, 45);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new PickaxeItem(new IItemTier() {
			public int getMaxUses() {
				return 200;
			}

			public float getEfficiency() {
				return 1.5f;
			}

			public float getAttackDamage() {
				return -1.5f;
			}

			public int getHarvestLevel() {
				return 1;
			}

			public int getEnchantability() {
				return 2;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(Blocks.OAK_PLANKS, (int) (1)));
			}
		}, 1, -3f, new Item.Properties().group(ItemGroup.TOOLS)) {

		}.setRegistryName("wooden_hammer"));
	}

}
