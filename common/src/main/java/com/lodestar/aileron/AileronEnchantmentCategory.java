package com.lodestar.aileron;

import dev.architectury.injectables.annotations.PlatformOnly;
import net.minecraft.world.item.ElytraItem;
import net.minecraft.world.item.enchantment.EnchantmentCategory;

public class AileronEnchantmentCategory {
    @PlatformOnly(PlatformOnly.Forge)
    public static EnchantmentCategory ELYTRA = EnchantmentCategory.create("elytra", (item -> instanceof ElytraItem));
}
