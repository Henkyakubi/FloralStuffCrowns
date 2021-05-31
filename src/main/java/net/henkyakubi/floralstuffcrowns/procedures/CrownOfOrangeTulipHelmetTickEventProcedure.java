package net.henkyakubi.floralstuffcrowns.procedures;

import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.block.Blocks;

import net.henkyakubi.floralstuffcrowns.FloralstuffcrownsModElements;

import java.util.Map;

@FloralstuffcrownsModElements.ModElement.Tag
public class CrownOfOrangeTulipHelmetTickEventProcedure extends FloralstuffcrownsModElements.ModElement {
	public CrownOfOrangeTulipHelmetTickEventProcedure(FloralstuffcrownsModElements instance) {
		super(instance, 15);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				System.err.println("Failed to load dependency entity for procedure CrownOfOrangeTulipHelmetTickEvent!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if ((((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemOffhand() : ItemStack.EMPTY)
				.getItem() == new ItemStack(Blocks.ORANGE_TULIP, (int) (1)).getItem())) {
			if (entity instanceof LivingEntity)
				((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.JUMP_BOOST, (int) 30, (int) 1, (true), (false)));
		}
	}
}
