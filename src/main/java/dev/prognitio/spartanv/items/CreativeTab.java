package dev.prognitio.spartanv.items;

import dev.prognitio.spartanv.SpartanV;
import dev.prognitio.spartanv.items.blocks.BlocksRegistry;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = SpartanV.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class CreativeTab {

    public static CreativeModeTab SPARTAN_V_TAB;

    @SubscribeEvent
    public static void registerCreativeModeTabs(CreativeModeTabEvent.Register event) {
        SPARTAN_V_TAB = event.registerCreativeModeTab(new ResourceLocation(SpartanV.MODID, "mod_tab"),
                builder -> builder.icon(() -> new ItemStack(BlocksRegistry.TITANIUM_ORE.get()))
                        .title(Component.translatable("creativemodetab.mod_tab")));
    }
}
