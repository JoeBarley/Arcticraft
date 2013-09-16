package arcticraft.renderers;

import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.texture.TextureMap;
import net.minecraft.entity.Entity;
import net.minecraft.entity.projectile.EntityPotion;
import net.minecraft.item.Item;
import net.minecraft.item.ItemPotion;
import net.minecraft.potion.PotionHelper;
import net.minecraft.util.Icon;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL12;

import arcticraft.entities.AC_EntityCannonball;
import arcticraft.lib.Strings;
import arcticraft.models.items.AC_ModelCannonball;
import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class AC_RenderCannonball extends Render
{

	private Item field_94151_a;
	private int field_94150_f;
	private AC_ModelCannonball cannonballModel;

	public AC_RenderCannonball(Item par1Item, int par2)
	{
		this.field_94151_a = par1Item;
		this.field_94150_f = par2;
		cannonballModel = new AC_ModelCannonball();
	}

	public AC_RenderCannonball(Item par1Item)
	{
		this(par1Item, 0);
	}

	/**
	 * Actually renders the given argument. This is a synthetic bridge method, always casting down its argument and then
	 * handing it off to a worker function which does the actual work. In all probabilty, the class Render is generic
	 * (Render<T extends Entity) and this method has signature public void doRender(T entity, double d, double d1,
	 * double d2, float f, float f1). But JAD is pre 1.5 so doesn't do that.
	 */
	public void doRender(Entity par1Entity, double par2, double par4, double par6, float par8, float par9)
	{
		this.renderEntityModel((AC_EntityCannonball) par1Entity, par2, par4, par6, par8, par9);

	}

	public void renderEntityModel(AC_EntityCannonball cannonball, double par2, double par4, double par6, float par8, float par9)
	{
		this.func_110777_b(cannonball);
		GL11.glPushMatrix();
		FMLClientHandler.instance().getClient().renderEngine.func_110577_a(new ResourceLocation(Strings.MOD_ID, "/textures/items/cannonball.png"));
		GL11.glTranslatef((float) par2, (float) par4, (float) par6);
		GL11.glRotatef(cannonball.prevRotationYaw + (cannonball.rotationYaw - cannonball.prevRotationYaw) * par9 - 90.0F, 0.0F, 1.0F, 0.0F);
		GL11.glRotatef(cannonball.prevRotationPitch + (cannonball.rotationPitch - cannonball.prevRotationPitch) * par9, 0.0F, 0.0F, 1.0F);
		float f10 = 0.05625F;
		GL11.glEnable(GL12.GL_RESCALE_NORMAL);

		GL11.glRotatef(45.0F, 1.0F, 0.0F, 0.0F);
		GL11.glScalef(f10, f10, f10);
		GL11.glTranslatef(- 4.0F, 0.0F, 0.0F);
		GL11.glNormal3f(f10, 0.0F, 0.0F);
		float f = 1.0625F;
		this.cannonballModel.render(cannonball, f, f, f, f, f, f);
		GL11.glDisable(GL12.GL_RESCALE_NORMAL);
		GL11.glPopMatrix();
	}

	protected ResourceLocation func_110775_a(Entity par1Entity)
	{
		return TextureMap.field_110576_c;
	}

	private void func_77026_a(Tessellator par1Tessellator, Icon par2Icon)
	{
		float f = par2Icon.getMinU();
		float f1 = par2Icon.getMaxU();
		float f2 = par2Icon.getMinV();
		float f3 = par2Icon.getMaxV();
		float f4 = 1.0F;
		float f5 = 0.5F;
		float f6 = 0.25F;
		GL11.glRotatef(180.0F - this.renderManager.playerViewY, 0.0F, 1.0F, 0.0F);
		GL11.glRotatef(- this.renderManager.playerViewX, 1.0F, 0.0F, 0.0F);
		par1Tessellator.startDrawingQuads();
		par1Tessellator.setNormal(0.0F, 1.0F, 0.0F);
		par1Tessellator.addVertexWithUV((double) (0.0F - f5), (double) (0.0F - f6), 0.0D, (double) f, (double) f3);
		par1Tessellator.addVertexWithUV((double) (f4 - f5), (double) (0.0F - f6), 0.0D, (double) f1, (double) f3);
		par1Tessellator.addVertexWithUV((double) (f4 - f5), (double) (f4 - f6), 0.0D, (double) f1, (double) f2);
		par1Tessellator.addVertexWithUV((double) (0.0F - f5), (double) (f4 - f6), 0.0D, (double) f, (double) f2);
		par1Tessellator.draw();
	}
}
