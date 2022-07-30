package io.github.solclient.client.v1_8_9.mixins.platform.world.level;

import org.jetbrains.annotations.NotNull;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;

import io.github.solclient.client.platform.mc.world.level.Level;
import io.github.solclient.client.platform.mc.world.level.block.BlockPos;
import io.github.solclient.client.platform.mc.world.level.block.BlockState;
import io.github.solclient.client.platform.mc.world.level.chunk.Chunk;
import io.github.solclient.client.platform.mc.world.level.chunk.ChunkPos;
import net.minecraft.world.World;

@Mixin(World.class)
public abstract class LevelImpl implements Level {

	@Override
	public boolean isOpaqueFullCube(@NotNull BlockPos pos) {
		return method_8565(pos);
	}

	@Shadow
	public abstract boolean method_8565(BlockPos pos);

	@Override
	public @NotNull BlockState getBlockState(@NotNull BlockPos pos) {
		return (BlockState) getBlockState((net.minecraft.util.math.BlockPos) pos);
	}

	@Shadow
	public abstract net.minecraft.block.BlockState getBlockState(net.minecraft.util.math.BlockPos pos);

	@Override
	public @NotNull Chunk getChunk(@NotNull ChunkPos pos) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public @NotNull Chunk getChunk(int x, int z) {
		// TODO Auto-generated method stub
		return null;
	}

}
