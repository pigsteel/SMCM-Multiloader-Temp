package com.github.pigsteel.smcm;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;

@Mod(SMCM.MOD_ID)
public class SMCMNeoForge {

    public SMCMNeoForge(IEventBus eventBus) {

        // This method is invoked by the NeoForge mod loader when it is ready
        // to load your mod. You can access NeoForge and Common code in this
        // project.

        // Use NeoForge to bootstrap the Common mod.
        SMCM.LOGGER.info("Hello NeoForge world!");
        SMCM.init();
    }
}