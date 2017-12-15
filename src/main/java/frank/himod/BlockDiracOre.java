package frank.himod;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

/**
 * Created by j34liu on 2017/12/14.
 */
public class BlockDiracOre extends Block {
    public BlockDiracOre() {
        super(Material.ROCK);
        setHardness(1.5f);
        setResistance(10.0f);
        setLightLevel(0.0f);
        setHarvestLevel("pickaxe", 0);
        setSoundType(SoundType.STONE);
    }
}

