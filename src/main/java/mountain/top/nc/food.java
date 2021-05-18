package mountain.top.nc;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class food {
    
    public static final FoodComponent APPLE_PIE = (new FoodComponent.Builder()).hunger(10).saturationModifier((float) .4).build();
    public static final FoodComponent COKE = (new FoodComponent.Builder()).hunger(20).saturationModifier((float) .4).statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 600, 250), 1.0F).build();
    public static final FoodComponent RAW_WAFFLE = (new FoodComponent.Builder()).hunger(1).saturationModifier((float) .4).build();

}
