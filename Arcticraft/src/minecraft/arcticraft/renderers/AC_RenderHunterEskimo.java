package arcticraft.renderers; 
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import arcticraft.entities.AC_EntityHunterEskimo;


public class AC_RenderHunterEskimo extends RenderLiving
{

    public AC_RenderHunterEskimo(ModelBase modelbase, float f)
    {
        super(modelbase, f); 
    }

    public void func_177_a(AC_EntityHunterEskimo entityeskimo, double d, double d1, double d2, 
            float f, float f1)
    {
        super.doRenderLiving(entityeskimo, d, d1, d2, f, f1);
    }

    public void doRenderLiving(EntityLiving entityliving, double d, double d1, double d2, 
            float f, float f1)
    {
    	func_177_a((AC_EntityHunterEskimo)entityliving, d, d1, d2, f, f1);
    }

    public void doRender(Entity entity, double d, double d1, double d2, 
            float f, float f1)
    {
    	func_177_a((AC_EntityHunterEskimo)entity, d, d1, d2, f, f1);
    }
}