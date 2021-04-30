
package net.lublink.zombiemods.item;

@ZombieModsModElements.ModElement.Tag
public class MrsRainbowItem extends ZombieModsModElements.ModElement {

	@ObjectHolder("zombie_mods:mrs_rainbow")
	public static final Item block = null;

	public MrsRainbowItem(ZombieModsModElements instance) {
		super(instance, 41);

	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	public static class ItemCustom extends Item {

		public ItemCustom() {
			super(new Item.Properties().group(ItemGroup.MISC).maxStackSize(64).rarity(Rarity.COMMON));
			setRegistryName("mrs_rainbow");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}

	}

}
