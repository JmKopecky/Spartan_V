package dev.prognitio.spartanv.items;

import dev.prognitio.spartanv.SpartanV;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemsRegistry {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, SpartanV.MODID);

    public static final RegistryObject<Item> RAW_TUNGSTEN = ITEMS.register("raw_tungsten",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TUNGSTEN_INGOT = ITEMS.register("tungsten_ingot",
            ()-> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_YTTRIUM = ITEMS.register("raw_yttrium",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> YTTRIUM_DUST = ITEMS.register("yttrium_dust",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_TITANIUM = ITEMS.register("raw_titanium",
            () -> new Item(new Item.Properties()));


    /*
    MJOLNIR ARMOR COMPONENTS:

    Techsuit:
        Hydrostatic Gel Layer (for impacts)
        Liquid Metal Crystal piezoelectric layer (increase physical performance)
        AI Integration Layer (Allow ship AI in armor)
        Pressure Seal (Allow life in 0-oxygen)
        BodySuit
        Reactive Circuits

    Outer Suit:
        Armor Shell
        Power Supply
        Shielding
        Refractive Coating
        Computer system
     */
}
