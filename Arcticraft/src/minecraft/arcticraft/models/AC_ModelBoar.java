// Date: 09-Jul-13 18:40:31
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX

package arcticraft.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class AC_ModelBoar extends ModelBase
{

	//fields
	ModelRenderer Body1;
	ModelRenderer Body2;
	ModelRenderer Ear1;
	ModelRenderer Ear2;
	ModelRenderer Ear3;
	ModelRenderer Ear4;
	ModelRenderer Fur1;
	ModelRenderer Fur2;
	ModelRenderer Nose;
	ModelRenderer Mouth;
	ModelRenderer Tusk1;
	ModelRenderer Tusk2;
	ModelRenderer Tusk3;
	ModelRenderer Tusk4;
	ModelRenderer Tusk5;
	ModelRenderer Tusk6;
	ModelRenderer Tusk7;
	ModelRenderer Tusk8;
	ModelRenderer head;
	ModelRenderer leg1;
	ModelRenderer leg2;
	ModelRenderer leg3;
	ModelRenderer leg4;
	ModelRenderer Leg5;
	ModelRenderer Leg6;

	public AC_ModelBoar()
	{
		textureWidth = 256;
		textureHeight = 256;

		Body1 = new ModelRenderer(this, 66, 9);
		Body1.addBox(0F, 0F, 0F, 10, 9, 10);
		Body1.setRotationPoint(- 5F, 9F, - 7F);
		Body1.setTextureSize(256, 256);
		Body1.mirror = true;
		setRotation(Body1, 0F, 0F, 0F);
		Body2 = new ModelRenderer(this, 66, 35);
		Body2.addBox(0F, 0F, 0F, 10, 8, 8);
		Body2.setRotationPoint(- 5F, 10F, 3F);
		Body2.setTextureSize(256, 256);
		Body2.mirror = true;
		setRotation(Body2, - 0.2602503F, 0F, 0F);
		Ear1 = new ModelRenderer(this, 78, 2);
		Ear1.addBox(0F, 0F, 0F, 2, 3, 0);
		Ear1.setRotationPoint(2F, 5F, - 13F);
		Ear1.setTextureSize(256, 256);
		Ear1.mirror = true;
		setRotation(Ear1, 0F, 0F, 0F);
		Ear2 = new ModelRenderer(this, 85, 2);
		Ear2.addBox(0F, 0F, 0F, 0, 3, 2);
		Ear2.setRotationPoint(2F, 5F, - 15F);
		Ear2.setTextureSize(256, 256);
		Ear2.mirror = true;
		setRotation(Ear2, 0F, 0F, 0F);
		Ear3 = new ModelRenderer(this, 95, 2);
		Ear3.addBox(0F, 0F, 0F, 2, 3, 0);
		Ear3.setRotationPoint(- 4F, 5F, - 13F);
		Ear3.setTextureSize(256, 256);
		Ear3.mirror = true;
		setRotation(Ear3, 0F, 0F, 0F);
		Ear4 = new ModelRenderer(this, 105, 2);
		Ear4.addBox(0F, 0F, 0F, 0, 3, 2);
		Ear4.setRotationPoint(- 2F, 5F, - 15F);
		Ear4.setTextureSize(256, 256);
		Ear4.mirror = true;
		setRotation(Ear4, 0F, 0F, 0F);
		Fur1 = new ModelRenderer(this, 7, 74);
		Fur1.addBox(0F, 0F, 0F, 6, 3, 10);
		Fur1.setRotationPoint(- 3F, 6F, - 7F);
		Fur1.setTextureSize(256, 256);
		Fur1.mirror = true;
		setRotation(Fur1, - 0.2230717F, 0F, 0F);
		Fur2 = new ModelRenderer(this, 12, 93);
		Fur2.addBox(0F, 0F, 0F, 6, 3, 6);
		Fur2.setRotationPoint(- 3F, 7F, - 13F);
		Fur2.setTextureSize(256, 256);
		Fur2.mirror = true;
		setRotation(Fur2, 0.1487144F, 0F, 0F);
		Nose = new ModelRenderer(this, 61, 68);
		Nose.addBox(0F, 0F, 0F, 4, 3, 5);
		Nose.setRotationPoint(- 2F, 11F, - 20F);
		Nose.setTextureSize(256, 256);
		Nose.mirror = true;
		setRotation(Nose, 0F, 0F, 0F);
		Mouth = new ModelRenderer(this, 68, 84);
		Mouth.addBox(0F, 0F, 0F, 2, 1, 4);
		Mouth.setRotationPoint(- 1F, 14.5F, - 19F);
		Mouth.setTextureSize(256, 256);
		Mouth.mirror = true;
		setRotation(Mouth, 0.1487144F, 0F, 0F);
		Tusk1 = new ModelRenderer(this, 129, 0);
		Tusk1.addBox(0F, 0F, 0F, 2, 3, 2);
		Tusk1.setRotationPoint(2F, 13F, - 15F);
		Tusk1.setTextureSize(256, 256);
		Tusk1.mirror = true;
		setRotation(Tusk1, - 1.970466F, - 0.3346075F, 0F);
		Tusk2 = new ModelRenderer(this, 146, 0);
		Tusk2.addBox(0F, 0F, 0F, 2, 2, 2);
		Tusk2.setRotationPoint(3F, 10.9F, - 18F);
		Tusk2.setTextureSize(256, 256);
		Tusk2.mirror = true;
		setRotation(Tusk2, - 0.7435722F, - 0.0743572F, 0F);
		Tusk3 = new ModelRenderer(this, 129, 7);
		Tusk3.addBox(0F, 0F, 0F, 2, 2, 2);
		Tusk3.setRotationPoint(- 4F, 12F, - 16F);
		Tusk3.setTextureSize(256, 256);
		Tusk3.mirror = true;
		setRotation(Tusk3, - 0.2602503F, 0.4089647F, 0F);
		Tusk4 = new ModelRenderer(this, 130, 15);
		Tusk4.addBox(0F, 0F, 0F, 2, 2, 2);
		Tusk4.setRotationPoint(3F, 9.6F, - 18.7F);
		Tusk4.setTextureSize(256, 256);
		Tusk4.mirror = true;
		setRotation(Tusk4, - 1.041001F, 0F, 0F);
		Tusk5 = new ModelRenderer(this, 130, 29);
		Tusk5.addBox(0F, 0F, 0F, 2, 1, 1);
		Tusk5.setRotationPoint(3F, 9.533334F, - 20F);
		Tusk5.setTextureSize(256, 256);
		Tusk5.mirror = true;
		setRotation(Tusk5, - 0.1858931F, 0F, 0F);
		Tusk6 = new ModelRenderer(this, 146, 0);
		Tusk6.addBox(0F, 0F, 0F, 2, 2, 2);
		Tusk6.setRotationPoint(- 4F, 11.13333F, - 16.4F);
		Tusk6.setTextureSize(256, 256);
		Tusk6.mirror = true;
		setRotation(Tusk6, - 1.003822F, 0.4089647F, 0F);
		Tusk7 = new ModelRenderer(this, 130, 15);
		Tusk7.addBox(0F, 0F, 0F, 2, 2, 2);
		Tusk7.setRotationPoint(- 4.3F, 9.5F, - 16.9F);
		Tusk7.setTextureSize(256, 256);
		Tusk7.mirror = true;
		setRotation(Tusk7, - 1.228001F, 0.4861989F, 0F);
		Tusk8 = new ModelRenderer(this, 130, 29);
		Tusk8.addBox(0F, 0F, 0F, 2, 1, 1);
		Tusk8.setRotationPoint(- 4.9F, 9.2F, - 18F);
		Tusk8.setTextureSize(256, 256);
		Tusk8.mirror = true;
		setRotation(Tusk8, - 0.448799F, 0.411399F, 0F);
		head = new ModelRenderer(this, 0, 0);
		head.addBox(- 4F, - 3F, - 8F, 8, 8, 8);
		head.setRotationPoint(0F, 11F, - 7F);
		head.setTextureSize(256, 256);
		head.mirror = true;
		setRotation(head, 0F, 0F, 0F);
		leg1 = new ModelRenderer(this, 0, 53);
		leg1.addBox(- 2F, 0F, - 2F, 4, 6, 4);
		leg1.setRotationPoint(- 3F, 18F, 7F);
		leg1.setTextureSize(256, 256);
		leg1.mirror = true;
		setRotation(leg1, 0F, 0F, 0F);
		leg2 = new ModelRenderer(this, 0, 53);
		leg2.addBox(- 2F, 0F, - 2F, 4, 6, 4);
		leg2.setRotationPoint(3F, 18F, 7F);
		leg2.setTextureSize(256, 256);
		leg2.mirror = true;
		setRotation(leg2, 0F, 0F, 0F);
		leg3 = new ModelRenderer(this, 21, 53);
		leg3.addBox(- 2F, 18F, - 2F, 3, 7, 4);
		leg3.setRotationPoint(- 4.5F, - 1F, - 5F);
		leg3.setTextureSize(256, 256);
		leg3.mirror = true;
		setRotation(leg3, 0F, 0F, 0F);
		leg4 = new ModelRenderer(this, 21, 53);
		leg4.addBox(- 2F, 0F, - 2F, 3, 7, 4);
		leg4.setRotationPoint(5.5F, 17F, - 4F);
		leg4.setTextureSize(256, 256);
		leg4.mirror = true;
		setRotation(leg4, 0F, 0F, 0F);
		Leg5 = new ModelRenderer(this, 0, 34);
		Leg5.addBox(0F, 0F, 0F, 5, 6, 5);
		Leg5.setRotationPoint(2F, 12F, - 8F);
		Leg5.setTextureSize(256, 256);
		Leg5.mirror = true;
		setRotation(Leg5, 0.2243995F, 0F, 0F);
		Leg6 = new ModelRenderer(this, 0, 34);
		Leg6.addBox(0F, 0F, 0F, 5, 6, 5);
		Leg6.setRotationPoint(- 7F, 12F, - 8F);
		Leg6.setTextureSize(256, 256);
		Leg6.mirror = true;
		setRotation(Leg6, 0.2243995F, 0F, 0F);
	}

	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		super.render(entity, f, f1, f2, f3, f4, f5);
		setRotationAngles(f, f1, f2, f3, f4, f5, entity);
		Body1.render(f5);
		Body2.render(f5);
		Ear1.render(f5);
		Ear2.render(f5);
		Ear3.render(f5);
		Ear4.render(f5);
		Fur1.render(f5);
		Fur2.render(f5);
		Nose.render(f5);
		Mouth.render(f5);
		Tusk1.render(f5);
		Tusk2.render(f5);
		Tusk3.render(f5);
		Tusk4.render(f5);
		Tusk5.render(f5);
		Tusk6.render(f5);
		Tusk7.render(f5);
		Tusk8.render(f5);
		head.render(f5);
		leg1.render(f5);
		leg2.render(f5);
		leg3.render(f5);
		leg4.render(f5);
		Leg5.render(f5);
		Leg6.render(f5);
	}

	private void setRotation(ModelRenderer model, float x, float y, float z)
	{
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity par6Entity)
	{
		super.setRotationAngles(f, f1, f2, f3, f4, f5, par6Entity);
		this.head.rotateAngleX = f5 / (180F / (float) Math.PI);
		this.head.rotateAngleY = f5 / (180F / (float) Math.PI);
		this.leg1.rotateAngleX = MathHelper.cos(f * 0.6662F) * 1.4F * f1;
		this.leg2.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * 1.4F * f1;
		this.leg1.rotateAngleY = 0.0F;
		this.leg2.rotateAngleY = 0.0F;
		//keep
		this.leg3.rotateAngleX = MathHelper.cos(f * 0.6662F) * 0.4F * f1;
		this.leg4.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * 1.4F * f1;
		this.leg3.rotateAngleY = 0.0F;
		this.leg4.rotateAngleY = 0.0F;
	}

}
