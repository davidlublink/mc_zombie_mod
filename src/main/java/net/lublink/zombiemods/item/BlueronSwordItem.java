
package net.lublink.zombiemods.item;

@ZombieModsModElements.ModElement.Tag
public class BlueronSwordItem extends ZombieModsModElements.ModElement {

	@ObjectHolder("zombie_mods:blueron_sword")
	public static final Item block = null;

	public BlueronSwordItem(ZombieModsModElements instance) {
		super(instance, 30);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 3000;
			}

			public float getEfficiency() {
				return 4f;
			}

			public float getAttackDamage() {
				return 13f;
			}

			public int getHarvestLevel() {
				return 1;
			}

			public int getEnchantability() {
				return 13;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(BlueronItem.block, (int) (1)));
			}
		}, 3, 9f, new Item.Properties().group(ItemGroup.COMBAT)) {

			@Override
			public boolean hitEntity(ItemStack itemstack, LivingEntity entity, LivingEntity sourceentity) {
				boolean retval = super.hitEntity(itemstack, entity, sourceentity);
				double x = entity.getPosX();
				double y = entity.getPosY();
				double z = entity.getPosZ();
				World world = entity.world;
				{
					Map<String, Object> $_dependencies = new HashMap<>();

					BlueronSwordLivingEntityIsHitWithToolProcedure.executeProcedure($_dependencies);
				}
				return retval;
			}

		}.setRegistryName("blueron_sword"));
	}

}
