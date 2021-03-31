package crazycatzzz.cat.muds;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class MudFoodComponents {
    public static final FoodComponent DRIED_MUD_BALL = (new FoodComponent.Builder()).hunger(3).saturationModifier(.2F).statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 600, 1), 0.8F).snack().build();
}
