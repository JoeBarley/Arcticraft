package arcticraft.renderers;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.ResourceLocation;
import arcticraft.entities.AC_EntityChefEskimo;
import arcticraft.lib.Strings;
import arcticraft.models.AC_ModelChefEskimo;

public class AC_RenderChefEskimo extends RenderLiving
{

	private AC_ModelChefEskimo modelChef;
	private static final ResourceLocation chef = new ResourceLocation(Strings.MOD_ID, "textures/mobs/eskimo_chef.png");

	public AC_RenderChefEskimo(ModelBase modelbase, float f)
	{
		super(modelbase, 0.5F);
		this.modelChef = (AC_ModelChefEskimo) this.mainModel;
	}

	public void func_177_a(AC_EntityChefEskimo entityeskimo, double d, double d1, double d2, float f, float f1)
	{
		super.doRenderLiving(entityeskimo, d, d1, d2, f, f1);
	}

	public void doRenderLiving(EntityLiving entityliving, double d, double d1, double d2, float f, float f1)
	{
		func_177_a((AC_EntityChefEskimo) entityliving, d, d1, d2, f, f1);
	}

	public void doRender(Entity entity, double d, double d1, double d2, float f, float f1)
	{
		func_177_a((AC_EntityChefEskimo) entity, d, d1, d2, f, f1);
	}

	@Override
	protected ResourceLocation func_110775_a(Entity entity)
	{
		return chef;
	}
}
