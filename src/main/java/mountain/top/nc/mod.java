package mountain.top.nc;

import net.fabricmc.api.ModInitializer;
import net.minecraft.item.BucketItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;

import net.minecraft.util.registry.Registry;

public class mod implements ModInitializer{

	//Currency
	public static final Item GALACTIC_CREDIT = new Item(new Item.Settings().group(ItemGroup.MISC));
	public static final Item DARZODIAN_CREDIT = new Item(new Item.Settings().group(ItemGroup.MISC));
	public static final Item DARCHMA = new Item(new Item.Settings().group(ItemGroup.MISC));

	//Food
	public static final Item APPLE_PIE = new Item(new Item.Settings().group(ItemGroup.FOOD).food(food.APPLE_PIE));
	public static final Item CHOCOLATE_MILK = new Item(new Item.Settings().group(ItemGroup.FOOD).food(food.CHOCOLATE_MILK));
	public static final Item HOT_CHOCOLATE = new Item(new Item.Settings().group(ItemGroup.FOOD).food(food.HOT_CHOCOLATE));
	public static final Item COKE = new Item(new Item.Settings().group(ItemGroup.FOOD).food(food.COKE));
	public static final Item RAW_WAFFLE = new Item(new Item.Settings().group(ItemGroup.FOOD).food(food.RAW_WAFFLE));
	public static final Item WAFFLE = new Item(new Item.Settings().group(ItemGroup.FOOD).food(food.WAFFLE));
	public static final Item CURRY_POWDER = new Item(new Item.Settings().group(ItemGroup.FOOD).food(food.CURRY_POWDER));
	public static final Item CURRY= new Item(new Item.Settings().group(ItemGroup.FOOD).food(food.CURRY));

	@Override
	public void onInitialize() {
		
		//Currency
		Registry.register(Registry.ITEM, new Identifier("nc", "galactic_credit"), GALACTIC_CREDIT);
		Registry.register(Registry.ITEM, new Identifier("nc", "darzodian_credit"), DARZODIAN_CREDIT);
		Registry.register(Registry.ITEM, new Identifier("nc", "drachma"), DARCHMA);

		//Food
		Registry.register(Registry.ITEM, new Identifier("nc", "apple_pie"), APPLE_PIE);
		Registry.register(Registry.ITEM, new Identifier("nc", "chocolate_milk"), CHOCOLATE_MILK);
		Registry.register(Registry.ITEM, new Identifier("nc", "hot_chocolate"), HOT_CHOCOLATE);
		Registry.register(Registry.ITEM, new Identifier("nc", "coke"), COKE);
		Registry.register(Registry.ITEM, new Identifier("nc", "raw_waffle"), RAW_WAFFLE);
		Registry.register(Registry.ITEM, new Identifier("nc", "waffle"), WAFFLE);
		Registry.register(Registry.ITEM, new Identifier("nc", "curry_powder"), CURRY_POWDER);
		Registry.register(Registry.ITEM, new Identifier("nc", "curry"), CURRY);
		
	}
}