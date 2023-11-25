package net.t4lcall.bulb_flower;

import net.fabricmc.api.ModInitializer;

import net.t4lcall.bulb_flower.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BulbFlower implements ModInitializer {
	public static final String MOD_ID = "bulb_flower";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItems.registerModItems();
	}
}