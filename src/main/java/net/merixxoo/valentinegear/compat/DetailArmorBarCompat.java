package net.merixxoo.valentinegear.compat;

import com.redlimerl.detailab.api.DetailArmorBarAPI;
import com.redlimerl.detailab.api.render.ArmorBarRenderManager;
import com.redlimerl.detailab.api.render.TextureOffset;
import net.merixxoo.valentinegear.ValentineGear;
import net.merixxoo.valentinegear.item.ModItems;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class DetailArmorBarCompat {

        public static void registerArmorBar() {

                Identifier texture = new Identifier(ValentineGear.MOD_ID, "textures/armor_bar/armor_bar.png");


                TextureOffset full = new TextureOffset(9, 0);
                TextureOffset half = new TextureOffset(0, 0);

        ArmorItem[] valentineSet = {(ArmorItem) ModItems.VALENTINE_HELMET, (ArmorItem) ModItems.VALENTINE_CHESTPLATE,
                (ArmorItem) ModItems.VALENTINE_LEGGINGS, (ArmorItem) ModItems.VALENTINE_BOOTS};


        DetailArmorBarAPI.customArmorBarBuilder().armor(valentineSet)
                .render((ItemStack stack) -> new ArmorBarRenderManager(texture, 18, 9, new TextureOffset(9, 9),
                        new TextureOffset(0, 9), full, half)).register();


        }
}

