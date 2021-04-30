
package net.lublink.zombiemods.item;

@ZombieModsModElements.ModElement.Tag
public class ChocalateItem extends ZombieModsModElements.ModElement {

	@ObjectHolder("zombie_mods:chocalate")
	public static final Item block = null;

	public ChocalateItem(ZombieModsModElements instance) {
		super(instance, 33);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new FoodItemCustom());
	}

	public static class FoodItemCustom extends Item {

		public FoodItemCustom() {
			super(new Item.Properties().group(ItemGroup.FOOD).maxStackSize(64).rarity(Rarity.COMMON)
					.food((new Food.Builder()).hunger(10).saturation(0.3f)

							.build()));
			setRegistryName("chocalate");
		}

		@Override
		public UseAction getUseAction(ItemStack itemstack) {
			return UseAction.EAT;
		}

	}

}
