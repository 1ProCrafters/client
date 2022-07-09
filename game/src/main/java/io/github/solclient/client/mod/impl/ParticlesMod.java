package io.github.solclient.client.mod.impl;

import com.google.gson.annotations.Expose;

import io.github.solclient.abstraction.mc.Environment;
import io.github.solclient.abstraction.mc.world.entity.LivingEntity;
import io.github.solclient.abstraction.mc.world.entity.effect.StatusEffectType;
import io.github.solclient.abstraction.mc.world.item.enchantment.EnchantmentHelper;
import io.github.solclient.abstraction.mc.world.particle.ParticleType;
import io.github.solclient.client.event.EventHandler;
import io.github.solclient.client.event.impl.world.entity.EntityAttackEvent;
import io.github.solclient.client.mod.Mod;
import io.github.solclient.client.mod.ModCategory;
import io.github.solclient.client.mod.PrimaryIntegerSettingMod;
import io.github.solclient.client.mod.annotation.Option;
import io.github.solclient.client.mod.annotation.Slider;

public class ParticlesMod extends Mod implements PrimaryIntegerSettingMod {

	@Expose
	@Option
	@Slider(min = 1, max = 10, step = 1)
	private float multiplier = 4;
	@Expose
	@Option
	private boolean sharpness = true;
	@Expose
	@Option
	private boolean snow;
	@Expose
	@Option
	private boolean slime;
	@Expose
	@Option
	private boolean flames;

	@Override
	public String getId() {
		return "particles";
	}

	@Override
	public ModCategory getCategory() {
		return ModCategory.VISUAL;
	}

	@Override
	public void decrement() {
		multiplier = Math.max(1, multiplier - 1);
	}

	@Override
	public void increment() {
		multiplier = Math.min(10, multiplier + 1);
	}

	@EventHandler
	public void onAttack(EntityAttackEvent event) {
		if(!(event.getEntity() instanceof LivingEntity)) {
			return;
		}

		boolean crit = mc.getPlayer().getFallDistance() > 0 && !mc.getPlayer().isOnGround()
				&& !mc.getPlayer().isClimbing() && !mc.getPlayer().isInWater()
				&& !mc.getPlayer().hasStatusEffect(StatusEffectType.BLINDNESS) && !mc.getPlayer().isPassenger();

		if(Environment.MINOR_RELEASE <= 9) {
			crit = crit && !mc.getPlayer().isSprinting();
		}

		if(crit) {
			for(int i = 0; i < multiplier - 1; i++) {
				mc.getParticleEngine().emit(event.getEntity(), ParticleType.CRIT);
			}
		}

		boolean alreadySharp = EnchantmentHelper.getExtraDamage(mc.getPlayer().getMainHandItem(),
				((LivingEntity) event.getEntity()).getLivingEntityType()) > 0;

		if(sharpness || alreadySharp) {
			for(int i = 0; i < (alreadySharp ? multiplier - 1 : multiplier); i++) {
				mc.getParticleEngine().emit(event.getEntity(), ParticleType.MAGIC);
			}
		}

		if(snow) {
			for(int i = 0; i < multiplier; i++) {
				mc.getParticleEngine().emit(event.getEntity(), ParticleType.SNOWBALL);
			}
		}

		if(slime) {
			for(int i = 0; i < multiplier; i++) {
				mc.getParticleEngine().emit(event.getEntity(), ParticleType.SLIME);
			}
		}

		if(flames) {
			for(int i = 0; i < multiplier; i++) {
				mc.getParticleEngine().emit(event.getEntity(), ParticleType.FLAME);
			}
		}
	}

}
