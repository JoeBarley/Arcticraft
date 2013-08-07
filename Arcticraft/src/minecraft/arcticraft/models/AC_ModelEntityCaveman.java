// Date: 06-Aug-13 14:32:32
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX

package arcticraft.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class AC_ModelEntityCaveman extends ModelBase
{

	//fields
	ModelRenderer Hair1;
	ModelRenderer Hair2;
	ModelRenderer Hair3;
	ModelRenderer Hair4;
	ModelRenderer Hair5;
	ModelRenderer Hair6;
	ModelRenderer Hair7;
	ModelRenderer Hair8;
	ModelRenderer Hair9;
	ModelRenderer Hair10;
	ModelRenderer Hair11;
	ModelRenderer Hair12;
	ModelRenderer Hair13;
	ModelRenderer Hair14;
	ModelRenderer Hair15;
	ModelRenderer Hair16;
	ModelRenderer AWESOMEMOUSTACHE1;
	ModelRenderer AWESOMEMOUSTACHE2;
	ModelRenderer AWESOMEMOUSTACHE3;
	ModelRenderer AWESOMEMOUSTACHE4;
	ModelRenderer AWESOMEMOUSTACHE5;
	ModelRenderer Eye1;
	ModelRenderer Eye2;
	ModelRenderer head;
	ModelRenderer body;
	ModelRenderer rightarm;
	ModelRenderer leftarm;
	ModelRenderer rightleg;
	ModelRenderer leftleg;

	public AC_ModelEntityCaveman()
	{
		textureWidth = 256;
		textureHeight = 256;

		Hair1 = new ModelRenderer(this, 110, 0);
		Hair1.addBox(0F, 0F, 0F, 9, 2, 9);
		Hair1.setRotationPoint(- 4.5F, - 8.5F, - 4.5F);
		Hair1.setTextureSize(256, 256);
		Hair1.mirror = true;
		setRotation(Hair1, 0F, 0F, 0F);
		Hair2 = new ModelRenderer(this, 150, 0);
		Hair2.addBox(0F, 0F, 0F, 1, 1, 9);
		Hair2.setRotationPoint(2F, - 8.7F, - 4.3F);
		Hair2.setTextureSize(256, 256);
		Hair2.mirror = true;
		setRotation(Hair2, 0F, 0F, 0F);
		Hair3 = new ModelRenderer(this, 150, 0);
		Hair3.addBox(0F, 0F, 0F, 1, 1, 9);
		Hair3.setRotationPoint(- 0.5F, - 8.7F, - 4.3F);
		Hair3.setTextureSize(256, 256);
		Hair3.mirror = true;
		setRotation(Hair3, 0F, 0F, 0F);
		Hair4 = new ModelRenderer(this, 150, 0);
		Hair4.addBox(0F, 0F, 0F, 1, 1, 9);
		Hair4.setRotationPoint(- 3F, - 8.7F, - 4.3F);
		Hair4.setTextureSize(256, 256);
		Hair4.mirror = true;
		setRotation(Hair4, 0F, 0F, 0F);
		Hair5 = new ModelRenderer(this, 150, 14);
		Hair5.addBox(0F, 0F, 0F, 9, 6, 1);
		Hair5.setRotationPoint(- 4.5F, - 6.5F, 3.5F);
		Hair5.setTextureSize(256, 256);
		Hair5.mirror = true;
		setRotation(Hair5, 0F, 0F, 0F);
		Hair6 = new ModelRenderer(this, 150, 24);
		Hair6.addBox(0F, 0F, 0F, 1, 9, 1);
		Hair6.setRotationPoint(- 0.5F, - 7.7F, 3.7F);
		Hair6.setTextureSize(256, 256);
		Hair6.mirror = true;
		setRotation(Hair6, 0F, 0F, 0F);
		Hair7 = new ModelRenderer(this, 158, 24);
		Hair7.addBox(0F, 0F, 0F, 1, 10, 1);
		Hair7.setRotationPoint(2F, - 7.7F, 3.7F);
		Hair7.setTextureSize(256, 256);
		Hair7.mirror = true;
		setRotation(Hair7, 0F, 0F, 0F);
		Hair8 = new ModelRenderer(this, 168, 24);
		Hair8.addBox(0F, 0F, 0F, 1, 11, 1);
		Hair8.setRotationPoint(- 3F, - 7.7F, 3.7F);
		Hair8.setTextureSize(256, 256);
		Hair8.mirror = true;
		setRotation(Hair8, 0F, 0F, 0F);
		Hair9 = new ModelRenderer(this, 120, 14);
		Hair9.addBox(0F, 0F, 0F, 9, 5, 1);
		Hair9.setRotationPoint(- 4.5F, - 6.5F, 2.5F);
		Hair9.setTextureSize(256, 256);
		Hair9.mirror = true;
		setRotation(Hair9, 0F, 0F, 0F);
		Hair10 = new ModelRenderer(this, 120, 25);
		Hair10.addBox(0F, 0F, 0F, 9, 3, 1);
		Hair10.setRotationPoint(- 4.5F, - 6.5F, 1.5F);
		Hair10.setTextureSize(256, 256);
		Hair10.mirror = true;
		setRotation(Hair10, 0F, 0F, 0F);
		Hair11 = new ModelRenderer(this, 120, 33);
		Hair11.addBox(0F, 0F, 0F, 9, 6, 1);
		Hair11.setRotationPoint(- 4.5F, - 6.5F, 0.5F);
		Hair11.setTextureSize(256, 256);
		Hair11.mirror = true;
		setRotation(Hair11, 0F, 0F, 0F);
		Hair12 = new ModelRenderer(this, 120, 44);
		Hair12.addBox(0F, 0F, 0F, 9, 4, 1);
		Hair12.setRotationPoint(- 4.5F, - 6.5F, - 0.5F);
		Hair12.setTextureSize(256, 256);
		Hair12.mirror = true;
		setRotation(Hair12, 0F, 0F, 0F);
		Hair13 = new ModelRenderer(this, 120, 14);
		Hair13.addBox(0F, 0F, 0F, 9, 5, 1);
		Hair13.setRotationPoint(- 4.5F, - 6.5F, - 1.5F);
		Hair13.setTextureSize(256, 256);
		Hair13.mirror = true;
		setRotation(Hair13, 0F, 0F, 0F);
		Hair14 = new ModelRenderer(this, 120, 14);
		Hair14.addBox(0F, 0F, 0F, 9, 6, 1);
		Hair14.setRotationPoint(- 4.5F, - 6.5F, - 2.5F);
		Hair14.setTextureSize(256, 256);
		Hair14.mirror = true;
		setRotation(Hair14, 0F, 0F, 0F);
		Hair15 = new ModelRenderer(this, 120, 52);
		Hair15.addBox(0F, 0F, 0F, 1, 7, 1);
		Hair15.setRotationPoint(- 4.5F, - 6.5F, - 3.5F);
		Hair15.setTextureSize(256, 256);
		Hair15.mirror = true;
		setRotation(Hair15, 0F, 0F, 0F);
		Hair16 = new ModelRenderer(this, 120, 52);
		Hair16.addBox(0F, 0F, 0F, 1, 7, 1);
		Hair16.setRotationPoint(3.5F, - 6.5F, - 3.5F);
		Hair16.setTextureSize(256, 256);
		Hair16.mirror = true;
		setRotation(Hair16, 0F, 0F, 0F);
		AWESOMEMOUSTACHE1 = new ModelRenderer(this, 120, 64);
		AWESOMEMOUSTACHE1.addBox(0F, 0F, 0F, 9, 2, 1);
		AWESOMEMOUSTACHE1.setRotationPoint(- 4.5F, - 1F, - 4.4F);
		AWESOMEMOUSTACHE1.setTextureSize(256, 256);
		AWESOMEMOUSTACHE1.mirror = true;
		setRotation(AWESOMEMOUSTACHE1, 0F, 0F, 0F);
		AWESOMEMOUSTACHE2 = new ModelRenderer(this, 120, 70);
		AWESOMEMOUSTACHE2.addBox(0F, 0F, 0F, 3, 1, 1);
		AWESOMEMOUSTACHE2.setRotationPoint(1.5F, - 2F, - 4.4F);
		AWESOMEMOUSTACHE2.setTextureSize(256, 256);
		AWESOMEMOUSTACHE2.mirror = true;
		setRotation(AWESOMEMOUSTACHE2, 0F, 0F, 0F);
		AWESOMEMOUSTACHE3 = new ModelRenderer(this, 120, 76);
		AWESOMEMOUSTACHE3.addBox(0F, 0F, 0F, 3, 1, 1);
		AWESOMEMOUSTACHE3.setRotationPoint(- 4.5F, - 2F, - 4.4F);
		AWESOMEMOUSTACHE3.setTextureSize(256, 256);
		AWESOMEMOUSTACHE3.mirror = true;
		setRotation(AWESOMEMOUSTACHE3, 0F, 0F, 0F);
		AWESOMEMOUSTACHE4 = new ModelRenderer(this, 120, 82);
		AWESOMEMOUSTACHE4.addBox(0F, 0F, 0F, 5, 1, 1);
		AWESOMEMOUSTACHE4.setRotationPoint(- 2.5F, - 3F, - 4.4F);
		AWESOMEMOUSTACHE4.setTextureSize(256, 256);
		AWESOMEMOUSTACHE4.mirror = true;
		setRotation(AWESOMEMOUSTACHE4, 0F, 0F, 0F);
		AWESOMEMOUSTACHE5 = new ModelRenderer(this, 120, 88);
		AWESOMEMOUSTACHE5.addBox(0F, 0F, 0F, 5, 1, 1);
		AWESOMEMOUSTACHE5.setRotationPoint(- 2.5F, 1F, - 4.4F);
		AWESOMEMOUSTACHE5.setTextureSize(256, 256);
		AWESOMEMOUSTACHE5.mirror = true;
		setRotation(AWESOMEMOUSTACHE5, 0F, 0F, 0F);
		Eye1 = new ModelRenderer(this, 94, 6);
		Eye1.addBox(0F, 0F, 0F, 2, 1, 1);
		Eye1.setRotationPoint(1F, - 5F, - 4.2F);
		Eye1.setTextureSize(256, 256);
		Eye1.mirror = true;
		setRotation(Eye1, 0F, 0F, 0F);
		Eye2 = new ModelRenderer(this, 94, 0);
		Eye2.addBox(0F, 0F, 0F, 2, 1, 1);
		Eye2.setRotationPoint(- 3F, - 5F, - 4.2F);
		Eye2.setTextureSize(256, 256);
		Eye2.mirror = true;
		setRotation(Eye2, 0F, 0F, 0F);
		head = new ModelRenderer(this, 0, 0);
		head.addBox(- 4F, - 8F, - 4F, 8, 8, 8);
		head.setRotationPoint(0F, 0F, 0F);
		head.setTextureSize(256, 256);
		head.mirror = true;
		setRotation(head, 0F, 0F, 0F);
		body = new ModelRenderer(this, 16, 16);
		body.addBox(- 4F, 0F, - 2F, 8, 12, 4);
		body.setRotationPoint(0F, 0F, 0F);
		body.setTextureSize(256, 256);
		body.mirror = true;
		setRotation(body, 0F, 0F, 0F);
		rightarm = new ModelRenderer(this, 40, 16);
		rightarm.addBox(- 3F, - 2F, - 2F, 4, 12, 4);
		rightarm.setRotationPoint(- 5F, 2F, 0F);
		rightarm.setTextureSize(256, 256);
		rightarm.mirror = true;
		setRotation(rightarm, 0F, 0F, 0F);
		leftarm = new ModelRenderer(this, 40, 16);
		leftarm.addBox(- 1F, - 2F, - 2F, 4, 12, 4);
		leftarm.setRotationPoint(5F, 2F, 0F);
		leftarm.setTextureSize(256, 256);
		leftarm.mirror = true;
		setRotation(leftarm, 0F, 0F, 0F);
		rightleg = new ModelRenderer(this, 0, 16);
		rightleg.addBox(- 2F, 0F, - 2F, 4, 12, 4);
		rightleg.setRotationPoint(- 2F, 12F, 0F);
		rightleg.setTextureSize(256, 256);
		rightleg.mirror = true;
		setRotation(rightleg, 0F, 0F, 0F);
		leftleg = new ModelRenderer(this, 0, 16);
		leftleg.addBox(- 2F, 0F, - 2F, 4, 12, 4);
		leftleg.setRotationPoint(2F, 12F, 0F);
		leftleg.setTextureSize(256, 256);
		leftleg.mirror = true;
		setRotation(leftleg, 0F, 0F, 0F);
	}

	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		super.render(entity, f, f1, f2, f3, f4, f5);
		setRotationAngles(f, f1, f2, f3, f4, f5, entity);
		Hair1.render(f5);
		Hair2.render(f5);
		Hair3.render(f5);
		Hair4.render(f5);
		Hair5.render(f5);
		Hair6.render(f5);
		Hair7.render(f5);
		Hair8.render(f5);
		Hair9.render(f5);
		Hair10.render(f5);
		Hair11.render(f5);
		Hair12.render(f5);
		Hair13.render(f5);
		Hair14.render(f5);
		Hair15.render(f5);
		Hair16.render(f5);
		AWESOMEMOUSTACHE1.render(f5);
		AWESOMEMOUSTACHE2.render(f5);
		AWESOMEMOUSTACHE3.render(f5);
		AWESOMEMOUSTACHE4.render(f5);
		AWESOMEMOUSTACHE5.render(f5);
		Eye1.render(f5);
		Eye2.render(f5);
		head.render(f5);
		body.render(f5);
		rightarm.render(f5);
		leftarm.render(f5);
		rightleg.render(f5);
		leftleg.render(f5);
	}

	private void setRotation(ModelRenderer model, float x, float y, float z)
	{

		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;

	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity)
	{
		super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
		this.rightarm.rotateAngleX =  MathHelper.cos(f * 0.6662F) * 1.4F * f1;
		this.leftarm.rotateAngleX =  MathHelper.cos(f * 0.6662F + (float)Math.PI) * 1.4F * f1;
		this.rightarm.rotateAngleZ = 0.0F;
		this.leftarm.rotateAngleZ = 0.0F;
		this.rightleg.rotateAngleX =  MathHelper.cos(f * 0.6662F) * 1.4F * f1;
		this.leftleg.rotateAngleX =  MathHelper.cos(f * 0.6662F + (float)Math.PI) * 1.4F * f1;
		this.rightleg.rotateAngleY = 0.0F;
		this.leftleg.rotateAngleY = 0.0F;

	}

}