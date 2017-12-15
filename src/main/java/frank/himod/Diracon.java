package frank.himod;

import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by j34liu on 2017/12/14.
 */
@Mod(modid="diracon", name="Diracon", version="1.0.0")
public class Diracon {

    public static MyBlock myBlock;

    @EventHandler
    public void preLoad(FMLPreInitializationEvent event)
    {
        System.out.println("This is for preLoad");
    }

    @EventHandler
    public void load(FMLInitializationEvent event)
    {
        System.out.println("This is for load");
    }

    @EventHandler
    public void postLoad(FMLPostInitializationEvent event)
    {
        System.out.println("This is for postload");
    }
}
