package net.prahas.prahasmod;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.prahas.prahasmod.block.ModBlocks;
import net.prahas.prahasmod.item.ModItems;

public class ModCreativeModTabs
{
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, PrahasMod.MODID);

    public static final RegistryObject<CreativeModeTab> PRAHAS_TAB = CREATIVE_MODE_TABS.register("prahas_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.LAETUS.get()))
                    .title(Component.translatable("creativetab.prahas_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.LAETUS.get());

                        pOutput.accept(ModBlocks.LAETUS_BLOCK.get());

                    })
                    .build());

    public static void register(IEventBus eventBus)
    {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
