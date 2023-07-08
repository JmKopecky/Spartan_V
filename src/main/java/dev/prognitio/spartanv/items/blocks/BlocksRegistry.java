package dev.prognitio.spartanv.items.blocks;

import dev.prognitio.spartanv.SpartanV;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlocksRegistry {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, SpartanV.MODID);
    public static final DeferredRegister<Item> BLOCKITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, SpartanV.MODID);


}
