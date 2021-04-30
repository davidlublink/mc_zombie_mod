
package net.lublink.zombiemods.item;

@ZombieModsModElements.ModElement.Tag
public class GlitchItem extends ZombieModsModElements.ModElement {

	@ObjectHolder("zombie_mods:glitch")
	public static final Item block = null;

	public GlitchItem(ZombieModsModElements instance) {
		super(instance, 34);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new FoodItemCustom());
	}

	public static class FoodItemCustom extends Item {

		public FoodItemCustom() {
			super(new Item.Properties().group(ItemGroup.FOOD).maxStackSize(64).rarity(Rarity.COMMON)
					.food((new Food.Builder()).hunger(4).saturation(0.3f)

							.build()));
			setRegistryName("glitch");
		}

		@Override
		public int getUseDuration(ItemStack stack) {
			return 40;
		}

		@Override
		public UseAction getUseAction(ItemStack itemstack) {
			return UseAction.BOW;
		}

	}

}
