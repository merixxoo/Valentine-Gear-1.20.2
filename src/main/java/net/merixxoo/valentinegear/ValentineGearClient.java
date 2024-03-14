package net.merixxoo.valentinegear;

import net.fabricmc.api.ClientModInitializer;
import net.merixxoo.valentinegear.compat.DetailArmorBarCompat;
import net.minecraft.util.Identifier;

public class ValentineGearClient implements ClientModInitializer {
    @Override
    public void onInitializeClient()
    {
        Identifier texture = new Identifier(ValentineGear.MOD_ID, "textures/armor_bar/armor_bar.png");
        DetailArmorBarCompat.registerArmorBar();
    }
}
