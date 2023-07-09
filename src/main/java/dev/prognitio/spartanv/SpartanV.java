package dev.prognitio.spartanv;

import com.mojang.logging.LogUtils;
import dev.prognitio.spartanv.items.CreativeTab;
import dev.prognitio.spartanv.items.ItemsRegistry;
import dev.prognitio.spartanv.items.blocks.BlocksRegistry;
import net.minecraft.client.Minecraft;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

@Mod(SpartanV.MODID)

public class SpartanV {
    // Define mod id in a common place for everything to reference
    public static final String MODID = "spartanv";
    // Directly reference a slf4j logger
    private static final Logger LOGGER = LogUtils.getLogger();

    public SpartanV() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        // Register the commonSetup method for modloading
        modEventBus.addListener(this::commonSetup);

        //register things
        ItemsRegistry.ITEMS.register(modEventBus);
        BlocksRegistry.BLOCKITEMS.register(modEventBus);
        BlocksRegistry.BLOCKS.register(modEventBus);

        modEventBus.addListener(this::addCreative);

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {

    }

    private void addCreative(CreativeModeTabEvent.BuildContents event) {
        if (event.getTab() == CreativeTab.SPARTAN_V_TAB) {
            event.accept(BlocksRegistry.TITANIUM_ORE);
            event.accept(ItemsRegistry.RAW_TITANIUM);
            event.accept(BlocksRegistry.TUNGSTEN_ORE);
            event.accept(ItemsRegistry.RAW_TUNGSTEN);
            event.accept(BlocksRegistry.YTTRIUM_ORE);
            event.accept(ItemsRegistry.RAW_YTTRIUM);
        }
    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {
        // Do something when the server starts
        LOGGER.info("HELLO from server starting");
    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
            // Some client setup code
            LOGGER.info("HELLO FROM CLIENT SETUP");
            LOGGER.info("MINECRAFT NAME >> {}", Minecraft.getInstance().getUser().getName());
        }
    }
}
