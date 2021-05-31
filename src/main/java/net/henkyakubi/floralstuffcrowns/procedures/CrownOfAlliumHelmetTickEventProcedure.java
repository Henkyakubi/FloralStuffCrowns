package net.henkyakubi.floralstuffcrowns.procedures;

import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.henkyakubi.floralstuffcrowns.FloralstuffcrownsModElements;

import java.util.Map;

@FloralstuffcrownsModElements.ModElement.Tag
public class CrownOfAlliumHelmetTickEventProcedure extends FloralstuffcrownsModElements.ModElement {
	public CrownOfAlliumHelmetTickEventProcedure(FloralstuffcrownsModElements instance) {
		super(instance, 9);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				System.err.println("Failed to load dependency entity for procedure CrownOfAlliumHelmetTickEvent!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.STRENGTH, (int) 30, (int) 0, (true), (false)));
		if ((((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHealth() : -1) <= 8)) {
			if (entity instanceof LivingEntity)
				((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.STRENGTH, (int) 30, (int) 1, (true), (false)));
		}
	}
}
