package pixelmon.items.weapons;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemSpade;

public class PixelmonItemSpade extends ItemSpade {

	public PixelmonItemSpade(int par1, EnumToolMaterial par2EnumToolMaterial, String textureName) {
		super(par1, par2EnumToolMaterial);
		this.textureName = textureName;
		setUnlocalizedName("Aluminium Spade");
	}

	String textureName;

	@Override
	@SideOnly(Side.CLIENT)
	public void updateIcons(IconRegister par1IconRegister) {
		this.iconIndex = par1IconRegister.registerIcon(textureName);
	}
}
