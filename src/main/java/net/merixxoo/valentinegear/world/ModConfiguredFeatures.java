package net.merixxoo.valentinegear.world;

import net.merixxoo.valentinegear.ValentineGear;
import net.merixxoo.valentinegear.block.ModBlocks;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.structure.rule.RuleTest;
import net.minecraft.structure.rule.TagMatchRuleTest;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.FeatureConfig;
import net.minecraft.world.gen.feature.OreFeatureConfig;

import java.util.List;

public class ModConfiguredFeatures {

    public static final RegistryKey<ConfiguredFeature<?,?>> VALENTINE_ORE_KEY = registerKey("valentine_ore");
    public static final RegistryKey<ConfiguredFeature<?,?>> DEEPSLATE_VALENTINE_ORE_KEY = registerKey("deepslate_valentine_ore");

    public static void bootstrap(Registerable<ConfiguredFeature<?,?>> context) {
        RuleTest stoneReplacables = new TagMatchRuleTest(BlockTags.STONE_ORE_REPLACEABLES);
        RuleTest deepslateReplacables = new TagMatchRuleTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);

        List<OreFeatureConfig.Target> overworldvalentineOres =
                List.of(OreFeatureConfig.createTarget(stoneReplacables, ModBlocks.VALENTINE_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplacables, ModBlocks.DEEPSLATE_VALENTINE_ORE.getDefaultState()));

        register(context,VALENTINE_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldvalentineOres,3));
        register(context,DEEPSLATE_VALENTINE_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldvalentineOres,3));

    }

    public static RegistryKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, new Identifier(ValentineGear.MOD_ID, name));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<ConfiguredFeature<?, ?>> context,
                                                                                   RegistryKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }

}

