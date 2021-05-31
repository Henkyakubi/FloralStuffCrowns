package net.henkyakubi.floralstuffcrowns.procedures;

import net.minecraft.potion.Effects;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.block.Blocks;

import net.henkyakubi.floralstuffcrowns.FloralstuffcrownsModElements;

import java.util.Map;

@FloralstuffcrownsModElements.ModElement.Tag
public class CrownOfWhiteTulipHelmetTickEventProcedure extends FloralstuffcrownsModElements.ModElement {
	public CrownOfWhiteTulipHelmetTickEventProcedure(FloralstuffcrownsModElements instance) {
		super(instance, 17);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				System.err.println("Failed to load dependency entity for procedure CrownOfWhiteTulipHelmetTickEvent!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if ((((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemOffhand() : ItemStack.EMPTY)
				.getItem() == new ItemStack(Blocks.WHITE_TULIP, (int) (1)).getItem())) {
			if (entity instanceof LivingEntity) {
				((LivingEntity) entity).removePotionEffect(Effects.SLOWNESS);
			}
			if (entity instanceof LivingEntity) {
				((LivingEntity) entity).removePotionEffect(Effects.MINING_FATIGUE);
			}
			if (entity instanceof LivingEntity) {
				((LivingEntity) entity).removePotionEffect(Effects.INSTANT_DAMAGE);
			}
			if (entity instanceof LivingEntity) {
				((LivingEntity) entity).removePotionEffect(Effects.NAUSEA);
			}
			if (entity instanceof LivingEntity) {
				((LivingEntity) entity).removePotionEffect(Effects.BLINDNESS);
			}
			if (entity instanceof LivingEntity) {
				((LivingEntity) entity).removePotionEffect(Effects.HUNGER);
			}
			if (entity instanceof LivingEntity) {
				((LivingEntity) entity).removePotionEffect(Effects.WEAKNESS);
			}
			if (entity instanceof LivingEntity) {
				((LivingEntity) entity).removePotionEffect(Effects.BAD_OMEN);
			}
		}
	}
}
