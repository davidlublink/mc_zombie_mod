
package net.lublink.zombiemods.block;

import net.minecraft.block.material.Material;

@ZombieModsModElements.ModElement.Tag
public class BluerongrassBlock extends ZombieModsModElements.ModElement {

	@ObjectHolder("zombie_mods:bluerongrass")
	public static final Block block = null;

	public BluerongrassBlock(ZombieModsModElements instance) {
		super(instance, 36);

	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new CustomBlock());
		elements.items
				.add(() -> new BlockItem(block, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)).setRegistryName(block.getRegistryName()));
	}

	public static class CustomBlock extends Block {

		public CustomBlock() {
			super(

					Block.Properties.create(Material.ORGANIC).sound(SoundType.GROUND).hardnessAndResistance(1.5f, 10f).lightValue(0));

			setRegistryName("bluerongrass");
		}

		@Override
		public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {

			List<ItemStack> dropsOriginal = super.getDrops(state, builder);
			if (!dropsOriginal.isEmpty())
				return dropsOriginal;
			return Collections.singletonList(new ItemStack(this, 1));
		}

	}

}
