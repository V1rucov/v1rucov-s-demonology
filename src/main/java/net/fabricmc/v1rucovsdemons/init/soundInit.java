package net.fabricmc.v1rucovsdemons.init;

import net.fabricmc.fabric.api.networking.v1.S2CPlayChannelEvents;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class soundInit {
    public static final Identifier GHOST_DAMAGED_IDENTIFIER = new Identifier("v1rucovsdemons:ghost_damaged");
    public static SoundEvent GHOST_DAMAGED = new SoundEvent(GHOST_DAMAGED_IDENTIFIER);
    static{
        Registry.register(Registry.SOUND_EVENT,GHOST_DAMAGED_IDENTIFIER, GHOST_DAMAGED);
    }
}
