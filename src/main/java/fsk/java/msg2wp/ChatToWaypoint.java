package fsk.java.msg2wp;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ChatToWaypoint implements ModInitializer {
	public static final String MOD_ID = "chat-to-waypoint";

	// Allows writing to the log
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		// Runs on Fabric initialization, some things may not be loaded.

		LOGGER.info("Chat to Waypoint has been initialized with (probably) no errors!");
	}
}