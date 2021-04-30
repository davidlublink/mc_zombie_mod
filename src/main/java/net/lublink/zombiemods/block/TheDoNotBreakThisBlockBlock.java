
package net.lublink.zombiemods.block;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.world.storage.loot.LootContext;
import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.BlockItem;
import net.minecraft.fluid.IFluidState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.block.material.Material;
import net.minecraft.block.SoundType;
import net.minecraft.block.BlockState;
import net.minecraft.block.Block;

import net.lublink.zombiemods.procedures.TheDoNotBreakThisBlockBlockDestroyedByPlayerProcedure;
import net.lublink.zombiemods.ZombieModsModElements;

import java.util.Map;
import java.util.List;
import java.util.HashMap;
import java.util.Collections;

@ZombieModsModElements.ModElement.Tag
public class TheDoNotBreakThisBlockBlock extends ZombieModsModElements.ModElement {
	@ObjectHolder("zombie_mods:the_do_not_break_this_block")
	public static final Block block = null;
	public TheDoNotBreakThisBlockBlock(ZombieModsModElements instance) {
		super(instance, 31);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new CustomBlock());
		elements.items
				.add(() -> new BlockItem(block, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)).setRegistryName(block.getRegistryName()));
	}
	public static class CustomBlock extends Block {
		public CustomBlock() {
			super(Block.Properties.create(Material.ROCK).sound(SoundType.SCAFFOLDING).hardnessAndResistance(4f, 10f).lightValue(0));
			setRegistryName("the_do_not_break_this_block");
		}

		@Override
		public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
			List<ItemStack> dropsOriginal = super.getDrops(state, builder);
			if (!dropsOriginal.isEmpty())
				return dropsOriginal;
			return Collections.singletonList(new ItemStack(this, 1));
		}

		@Override
		public boolean removedByPlayer(BlockState state, World world, BlockPos pos, PlayerEntity entity, boolean willHarvest, IFluidState fluid) {
			boolean retval = super.removedByPlayer(state, world, pos, entity, willHarvest, fluid);
			int x = pos.getX();
			int y = pos.getY();
			int z = pos.getZ();
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("x", x);
				$_dependencies.put("y", y);
				$_dependencies.put("z", z);
				$_dependencies.put("world", world);
				TheDoNotBreakThisBlockBlockDestroyedByPlayerProcedure.executeProcedure($_dependencies);
			}
			return retval;
		}
	}
}
