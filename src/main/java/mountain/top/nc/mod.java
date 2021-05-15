package mountain.top.nc;

import net.fabricmc.api.ModInitializer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;

import net.minecraft.util.registry.Registry;

public class mod implements ModInitializer {

	public static final Item GALACTIC_CREDIT = new Item(new Item.Settings().group(ItemGroup.MISC));
	public static final Item DARZODIAN_CREDIT = new Item(new Item.Settings().group(ItemGroup.MISC));
	public static final Item DARCHMA = new Item(new Item.Settings().group(ItemGroup.MISC));

	@Override
	public void onInitialize() {
		
		Registry.register(Registry.ITEM, new Identifier("nc", "galactic_credit"), GALACTIC_CREDIT);
		Registry.register(Registry.ITEM, new Identifier("nc", "darzodian_credit"), DARZODIAN_CREDIT);
		Registry.register(Registry.ITEM, new Identifier("nc", "drachma"), DARCHMA);

	}
}
