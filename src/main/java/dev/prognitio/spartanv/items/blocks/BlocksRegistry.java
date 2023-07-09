package dev.prognitio.spartanv.items.blocks;

import dev.prognitio.spartanv.SpartanV;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BlocksRegistry {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, SpartanV.MODID);
    public static final DeferredRegister<Item> BLOCKITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, SpartanV.MODID);


    //tungsten: ore found in overworld, good for early-game components and part of late game components
    public static final RegistryObject<Block> TUNGSTEN_ORE = BLOCKS.register("tungsten_ore", () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(4.0f, 4.0f), UniformInt.of(6, 8)));
    public static final RegistryObject<Item> TUNGSTEN_ORE_ITEM = BLOCKITEMS.register("tungsten_ore_item", () -> new BlockItem(TUNGSTEN_ORE.get(), new Item.Properties()));
    //yttrium: ore found in end, good for accessing the new dimension, good for magic, used for endgame magic material along with something else
    public static final RegistryObject<Block> YTTRIUM_ORE = BLOCKS.register("yttrium_ore", () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.SAND).requiresCorrectToolForDrops().strength(4.5f, 10.0f), UniformInt.of(18, 28)));
    public static final RegistryObject<Item> YTTRIUM_ORE_ITEM = BLOCKITEMS.register("yttrium_ore_item", () -> new BlockItem(YTTRIUM_ORE.get(), new Item.Properties()));
    //Titanium; best material, used for alloying to get even stronger materials.
    public static final RegistryObject<Block> TITANIUM_ORE = BLOCKS.register("titanium_ore", () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(5.0f, 5.0f), UniformInt.of(15, 17)));
    public static final RegistryObject<Item> TITANIUM_ORE_ITEM = BLOCKITEMS.register("titanium_ore_item", () -> new BlockItem(TITANIUM_ORE.get(), new Item.Properties()));

}
