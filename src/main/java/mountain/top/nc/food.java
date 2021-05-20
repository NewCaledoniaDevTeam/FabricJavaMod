package mountain.top.nc;

import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class food {
    
    public static final FoodComponent APPLE_PIE = (new FoodComponent.Builder()).hunger(10).saturationModifier((float) .4).build();
    public static final FoodComponent CHOCOLATE_MILK = (new FoodComponent.Builder()).hunger(2).saturationModifier((float) .4).build();
    public static final FoodComponent HOT_CHOCOLATE = (new FoodComponent.Builder()).hunger(8).saturationModifier((float) .4).statusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 2400, 10), 1.0F).build();
    public static final FoodComponent COKE = (new FoodComponent.Builder()).hunger(20).saturationModifier((float) .4).statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 600, 250), 1.0F).build();
    public static final FoodComponent RAW_WAFFLE = (new FoodComponent.Builder()).hunger(1).saturationModifier((float) .4).build();
    public static final FoodComponent WAFFLE = (new FoodComponent.Builder()).hunger(4).saturationModifier((float) .4).statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 2400, 10), 1.0F).statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 2400, 10), 1.0F).build();
    public static final FoodComponent CURRY_POWDER= (new FoodComponent.Builder()).hunger(-2).saturationModifier((float) .4).build();
    public static final FoodComponent CURRY = (new FoodComponent.Builder()).hunger(9).saturationModifier((float) .4).statusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 300, 4), 1.0F).build();

}
