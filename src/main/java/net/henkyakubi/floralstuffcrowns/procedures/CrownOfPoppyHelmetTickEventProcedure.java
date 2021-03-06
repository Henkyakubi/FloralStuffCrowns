package net.henkyakubi.floralstuffcrowns.procedures;

import net.minecraft.world.IWorld;
import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.henkyakubi.floralstuffcrowns.FloralstuffcrownsModElements;

import java.util.Map;

@FloralstuffcrownsModElements.ModElement.Tag
public class CrownOfPoppyHelmetTickEventProcedure extends FloralstuffcrownsModElements.ModElement {
	public CrownOfPoppyHelmetTickEventProcedure(FloralstuffcrownsModElements instance) {
		super(instance, 5);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				System.err.println("Failed to load dependency entity for procedure CrownOfPoppyHelmetTickEvent!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				System.err.println("Failed to load dependency world for procedure CrownOfPoppyHelmetTickEvent!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		IWorld world = (IWorld) dependencies.get("world");
		if ((!(world.getWorld().isDaytime()))) {
			if (entity instanceof LivingEntity)
				((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.REGENERATION, (int) 30, (int) 1, (true), (false)));
			if (entity instanceof LivingEntity)
				((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.SATURATION, (int) 30, (int) 1, (true), (false)));
		}
	}
}
