
package net.lublink.zombiemods.block;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.world.storage.loot.LootContext;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.BlockItem;
import net.minecraft.block.material.Material;
import net.minecraft.block.SoundType;
import net.minecraft.block.BlockState;
import net.minecraft.block.Block;

import net.lublink.zombiemods.item.MrsRainbowItem;
import net.lublink.zombiemods.ZombieModsModElements;

import java.util.List;
import java.util.Collections;

@ZombieModsModElements.ModElement.Tag
public class Present3Block extends ZombieModsModElements.ModElement {
	@ObjectHolder("zombie_mods:present_3")
	public static final Block block = null;
	public Present3Block(ZombieModsModElements instance) {
		super(instance, 42);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new CustomBlock());
		elements.items
				.add(() -> new BlockItem(block, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)).setRegistryName(block.getRegistryName()));
	}
	public static class CustomBlock extends Block {
		public CustomBlock() {
			super(Block.Properties.create(Material.EARTH).sound(SoundType.GLASS).hardnessAndResistance(1f, 10f).lightValue(0));
			setRegistryName("present_3");
		}

		@Override
		public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
			List<ItemStack> dropsOriginal = super.getDrops(state, builder);
			if (!dropsOriginal.isEmpty())
				return dropsOriginal;
			return Collections.singletonList(new ItemStack(MrsRainbowItem.block, (int) (1)));
		}
	}
}
