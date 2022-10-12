package io.github.solclient.client.v1_19_2.mixins.platform.mc.sound;

import org.spongepowered.asm.mixin.*;

import io.github.solclient.client.platform.mc.sound.*;
import net.minecraft.client.sound.SoundManager;

@Mixin(SoundManager.class)
public abstract class SoundEngineImpl implements SoundEngine {

	@Override
	public void play(SoundInstance sound) {
		play((net.minecraft.client.sound.SoundInstance) sound);
	}

	@Shadow
	public abstract void play(net.minecraft.client.sound.SoundInstance sound);

}
