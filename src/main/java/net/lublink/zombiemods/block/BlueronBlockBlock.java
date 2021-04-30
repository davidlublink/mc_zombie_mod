
package net.lublink.zombiemods.block;

import net.minecraft.block.material.Material;

@ZombieModsModElements.ModElement.Tag
public class BlueronBlockBlock extends ZombieModsModElements.ModElement {

	@ObjectHolder("zombie_mods:blueron_block")
	public static final Block block = null;

	public BlueronBlockBlock(ZombieModsModElements instance) {
		super(instance, 35);

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

					Block.Properties.create(Material.IRON).sound(SoundType.METAL).hardnessAndResistance(5f, 10f).lightValue(0));

			setRegistryName("blueron_block");
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
