package net.henkyakubi.floralstuffcrowns.procedures;

import net.minecraft.world.IWorld;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.merchant.villager.VillagerEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.henkyakubi.floralstuffcrowns.FloralstuffcrownsModElements;

import java.util.function.Function;
import java.util.Map;
import java.util.Comparator;

@FloralstuffcrownsModElements.ModElement.Tag
public class CrownOfAzureBluetHelmetTickEventProcedure extends FloralstuffcrownsModElements.ModElement {
	public CrownOfAzureBluetHelmetTickEventProcedure(FloralstuffcrownsModElements instance) {
		super(instance, 11);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				System.err.println("Failed to load dependency entity for procedure CrownOfAzureBluetHelmetTickEvent!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				System.err.println("Failed to load dependency x for procedure CrownOfAzureBluetHelmetTickEvent!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				System.err.println("Failed to load dependency y for procedure CrownOfAzureBluetHelmetTickEvent!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				System.err.println("Failed to load dependency z for procedure CrownOfAzureBluetHelmetTickEvent!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				System.err.println("Failed to load dependency world for procedure CrownOfAzureBluetHelmetTickEvent!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		if ((((Entity) world
				.getEntitiesWithinAABB(VillagerEntity.class,
						new AxisAlignedBB(x - (40 / 2d), y - (40 / 2d), z - (40 / 2d), x + (40 / 2d), y + (40 / 2d), z + (40 / 2d)), null)
				.stream().sorted(new Object() {
					Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
						return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
					}
				}.compareDistOf(x, y, z)).findFirst().orElse(null)) != null)) {
			if (entity instanceof LivingEntity)
				((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.RESISTANCE, (int) 60, (int) 1, (true), (false)));
			if (entity instanceof LivingEntity)
				((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.STRENGTH, (int) 60, (int) 1, (true), (false)));
		}
	}
}
