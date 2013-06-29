// Date: 28-Jun-13 13:14:15
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX






package arcticraft.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class AC_ModelChefEskimo extends ModelBase
{
  //fields
    ModelRenderer body1;
    ModelRenderer body2;
    ModelRenderer body3;
    ModelRenderer head1;
    ModelRenderer head3;
    ModelRenderer head4;
    ModelRenderer leftarm1;
    ModelRenderer leftarm2;
    ModelRenderer rightarm1;
    ModelRenderer rightarm2;
    ModelRenderer leftleg;
    ModelRenderer rightleg;
    ModelRenderer Stick1;
    ModelRenderer String1;
    ModelRenderer Mouth1;
    ModelRenderer Head1;
    ModelRenderer Mouth2;
    ModelRenderer Body1;
    ModelRenderer LowerBody1;
    ModelRenderer LowerFin1;
    ModelRenderer UpperFin1;
    ModelRenderer SideFin1;
    ModelRenderer SideFin2;
    ModelRenderer Tail1;
    ModelRenderer TailFin1;
    ModelRenderer TailFin2;
  
  public AC_ModelChefEskimo()
  {
    textureWidth = 70;
    textureHeight = 128;
    
      body1 = new ModelRenderer(this, 0, 0);
      body1.addBox(-8F, -16F, -8F, 16, 16, 16);
      body1.setRotationPoint(0F, 18F, 0F);
      body1.setTextureSize(70, 128);
      body1.mirror = true;
      setRotation(body1, 0F, 0F, 0F);
      body2 = new ModelRenderer(this, 0, 32);
      body2.addBox(-8.5F, 0F, -8.5F, 17, 2, 17);
      body2.setRotationPoint(0F, 18F, 0F);
      body2.setTextureSize(70, 128);
      body2.mirror = true;
      setRotation(body2, 0F, 0F, 0F);
      body3 = new ModelRenderer(this, 0, 32);
      body3.addBox(-1F, -10F, -8.5F, 2, 10, 2);
      body3.setRotationPoint(0F, 18F, 0F);
      body3.setTextureSize(70, 128);
      body3.mirror = true;
      setRotation(body3, 0F, 0F, 0F);
      head1 = new ModelRenderer(this, 0, 51);
      head1.addBox(-4F, -4F, -8F, 8, 8, 8);
      head1.setRotationPoint(0F, 7F, -4F);
      head1.setTextureSize(70, 128);
      head1.mirror = true;
      setRotation(head1, 0F, 0F, 0F);
      head3 = new ModelRenderer(this, 32, 51);
      head3.addBox(-4.5F, -4.5F, -9F, 9, 9, 2);
      head3.setRotationPoint(0F, 7F, -4F);
      head3.setTextureSize(70, 128);
      head3.mirror = true;
      setRotation(head3, 0F, 0F, 0F);
      head4 = new ModelRenderer(this, 0, 67);
      head4.addBox(-1F, 1F, -10F, 2, 4, 2);
      head4.setRotationPoint(0F, 7F, -4F);
      head4.setTextureSize(70, 128);
      head4.mirror = true;
      setRotation(head4, 0F, 0F, 0F);
      leftarm1 = new ModelRenderer(this, 0, 73);
      leftarm1.addBox(0F, -2F, -2F, 4, 8, 4);
      leftarm1.setRotationPoint(6.5F, 9F, 0F);
      leftarm1.setTextureSize(70, 128);
      leftarm1.mirror = true;
      setRotation(leftarm1, 0F, 0F, -0.0872665F);
      leftarm2 = new ModelRenderer(this, 0, 85);
      leftarm2.addBox(-0.5F, 3F, -2.5F, 5, 2, 5);
      leftarm2.setRotationPoint(6.5F, 9F, 0F);
      leftarm2.setTextureSize(70, 128);
      leftarm2.mirror = true;
      setRotation(leftarm2, 0F, 0F, -0.0872665F);
      rightarm1 = new ModelRenderer(this, 0, 73);
      rightarm1.addBox(-4F, -2F, -2F, 4, 8, 4);
      rightarm1.setRotationPoint(-6.5F, 9F, 0F);
      rightarm1.setTextureSize(70, 128);
      rightarm1.mirror = true;
      setRotation(rightarm1, 0F, 0F, 0.0872665F);
      rightarm2 = new ModelRenderer(this, 0, 85);
      rightarm2.addBox(-4.5F, 3F, -2.5F, 5, 2, 5);
      rightarm2.setRotationPoint(-6.5F, 9F, 0F);
      rightarm2.setTextureSize(70, 128);
      rightarm2.mirror = true;
      setRotation(rightarm2, 0F, 0F, 0.0872665F);
      leftleg = new ModelRenderer(this, 0, 92);
      leftleg.addBox(-2.5F, 0F, -2.5F, 5, 4, 5);
      leftleg.setRotationPoint(3.5F, 20F, 0F);
      leftleg.setTextureSize(70, 128);
      leftleg.mirror = true;
      setRotation(leftleg, 0F, 0F, 0F);
      rightleg = new ModelRenderer(this, 0, 92);
      rightleg.addBox(-2.5F, 0F, -2.5F, 5, 4, 5);
      rightleg.setRotationPoint(-3.5F, 20F, 0F);
      rightleg.setTextureSize(70, 128);
      rightleg.mirror = true;
      setRotation(rightleg, 0F, 0F, 0F);
      Stick1 = new ModelRenderer(this, 26, 69);
      Stick1.addBox(0F, 0F, 0F, 1, 1, 16);
      Stick1.setRotationPoint(-10F, 7F, -13F);
      Stick1.setTextureSize(70, 128);
      Stick1.mirror = true;
      setRotation(Stick1, -0.5205006F, 0F, 0F);
      String1 = new ModelRenderer(this, 31, 92);
      String1.addBox(0F, 0F, 0F, 1, 6, 0);
      String1.setRotationPoint(-10F, 8F, -13F);
      String1.setTextureSize(70, 128);
      String1.mirror = true;
      setRotation(String1, 0F, 0F, 0F);
      Mouth1 = new ModelRenderer(this, 3, 105);
      Mouth1.addBox(0F, 0F, 0F, 2, 2, 2);
      Mouth1.setRotationPoint(-10F, 14F, -15F);
      Mouth1.setTextureSize(70, 128);
      Mouth1.mirror = true;
      setRotation(Mouth1, 0.7807508F, 0F, 0F);
      Head1 = new ModelRenderer(this, 17, 105);
      Head1.addBox(0F, 0F, 0F, 2, 2, 3);
      Head1.setRotationPoint(-10F, 14F, -15F);
      Head1.setTextureSize(70, 128);
      Head1.mirror = true;
      setRotation(Head1, 0F, 0F, 0F);
      Mouth2 = new ModelRenderer(this, 5, 112);
      Mouth2.addBox(0F, 0F, 0F, 2, 2, 1);
      Mouth2.setRotationPoint(-10F, 15F, -13F);
      Mouth2.setTextureSize(70, 128);
      Mouth2.mirror = true;
      setRotation(Mouth2, 2.453788F, 0F, 0F);
      Body1 = new ModelRenderer(this, 22, 114);
      Body1.addBox(0F, 0F, 0F, 2, 3, 5);
      Body1.setRotationPoint(-10F, 16F, -16F);
      Body1.setTextureSize(70, 128);
      Body1.mirror = true;
      setRotation(Body1, 0F, 0F, 0F);
      LowerBody1 = new ModelRenderer(this, 3, 118);
      LowerBody1.addBox(0F, 0F, 0F, 2, 1, 3);
      LowerBody1.setRotationPoint(-10F, 19F, -15F);
      LowerBody1.setTextureSize(70, 128);
      LowerBody1.mirror = true;
      setRotation(LowerBody1, 0F, 0F, 0F);
      LowerFin1 = new ModelRenderer(this, 40, 93);
      LowerFin1.addBox(0F, 0F, 0F, 0, 2, 2);
      LowerFin1.setRotationPoint(-9F, 17F, -11F);
      LowerFin1.setTextureSize(70, 128);
      LowerFin1.mirror = true;
      setRotation(LowerFin1, 0F, 0F, 0F);
      UpperFin1 = new ModelRenderer(this, 39, 102);
      UpperFin1.addBox(0F, 0F, 0F, 0, 3, 2);
      UpperFin1.setRotationPoint(-9F, 16F, -18F);
      UpperFin1.setTextureSize(70, 128);
      UpperFin1.mirror = true;
      setRotation(UpperFin1, 0F, 0F, 0F);
      SideFin1 = new ModelRenderer(this, 32, 104);
      SideFin1.addBox(0F, 0F, 0F, 0, 2, 2);
      SideFin1.setRotationPoint(-10F, 16F, -14F);
      SideFin1.setTextureSize(70, 128);
      SideFin1.mirror = true;
      setRotation(SideFin1, 0F, -0.0743572F, 0.9294653F);
      SideFin2 = new ModelRenderer(this, 48, 97);
      SideFin2.addBox(0F, 0F, 0F, 0, 2, 2);
      SideFin2.setRotationPoint(-8F, 16F, -14F);
      SideFin2.setTextureSize(70, 128);
      SideFin2.mirror = true;
      setRotation(SideFin2, 0F, -0.0743572F, -0.7063936F);
      Tail1 = new ModelRenderer(this, 42, 117);
      Tail1.addBox(0F, 0F, 0F, 2, 1, 2);
      Tail1.setRotationPoint(-10F, 20F, -15F);
      Tail1.setTextureSize(70, 128);
      Tail1.mirror = true;
      setRotation(Tail1, 0F, 0F, 0F);
      TailFin1 = new ModelRenderer(this, 58, 96);
      TailFin1.addBox(0F, 0F, 0F, 0, 2, 2);
      TailFin1.setRotationPoint(-9F, 21F, -15F);
      TailFin1.setTextureSize(70, 128);
      TailFin1.mirror = true;
      setRotation(TailFin1, 0F, 0.1115358F, 0.6320364F);
      TailFin2 = new ModelRenderer(this, 53, 105);
      TailFin2.addBox(0F, 0F, 0F, 0, 2, 2);
      TailFin2.setRotationPoint(-9F, 21F, -15F);
      TailFin2.setTextureSize(70, 128);
      TailFin2.mirror = true;
      setRotation(TailFin2, 0F, -0.0743572F, -0.4833219F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    body1.render(f5);
    body2.render(f5);
    body3.render(f5);
    head1.render(f5);
    head3.render(f5);
    head4.render(f5);
    leftarm1.render(f5);
    leftarm2.render(f5);
    rightarm1.render(f5);
    rightarm2.render(f5);
    leftleg.render(f5);
    rightleg.render(f5);
    Stick1.render(f5);
    String1.render(f5);
    Mouth1.render(f5);
    Head1.render(f5);
    Mouth2.render(f5);
    Body1.render(f5);
    LowerBody1.render(f5);
    LowerFin1.render(f5);
    UpperFin1.render(f5);
    SideFin1.render(f5);
    SideFin2.render(f5);
    Tail1.render(f5);
    TailFin1.render(f5);
    TailFin2.render(f5);
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

  }

}
