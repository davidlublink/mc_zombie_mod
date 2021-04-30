
package net.lublink.zombiemods.item;

@ZombieModsModElements.ModElement.Tag
public class StoneHammerItem extends ZombieModsModElements.ModElement {

	@ObjectHolder("zombie_mods:stone_hammer")
	public static final Item block = null;

	public StoneHammerItem(ZombieModsModElements instance) {
		super(instance, 48);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new PickaxeItem(new IItemTier() {
			public int getMaxUses() {
				return 172;
			}

			public float getEfficiency() {
				return 4.5f;
			}

			public float getAttackDamage() {
				return -0.1f;
			}

			public int getHarvestLevel() {
				return 1;
			}

			public int getEnchantability() {
				return 9;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(Blocks.COBBLESTONE, (int) (1)));
			}
		}, 1, -2.7999999999999998f, new Item.Properties().group(ItemGroup.TOOLS)) {

		}.setRegistryName("stone_hammer"));
	}

}
