
package net.lublink.zombiemods.item;

@ZombieModsModElements.ModElement.Tag
public class MrBearItem extends ZombieModsModElements.ModElement {

	@ObjectHolder("zombie_mods:mr_bear")
	public static final Item block = null;

	public MrBearItem(ZombieModsModElements instance) {
		super(instance, 31);

	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	public static class ItemCustom extends Item {

		public ItemCustom() {
			super(new Item.Properties().group(ItemGroup.MISC).maxStackSize(1).rarity(Rarity.COMMON));
			setRegistryName("mr_bear");
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
