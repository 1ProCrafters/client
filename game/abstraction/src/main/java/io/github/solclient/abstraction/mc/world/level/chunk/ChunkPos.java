package io.github.solclient.abstraction.mc.world.level.chunk;

import org.jetbrains.annotations.NotNull;

public interface ChunkPos {

	static @NotNull ChunkPos create(int x, int z) {
		throw new UnsupportedOperationException();
	}

	int getX();

	int getZ();

}