// Date: 27-Jun-13 15:38:36
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX






package com.arcticraft.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class AC_ModelYeti extends ModelBase
{
  //fields
    ModelRenderer BodyFL;
    ModelRenderer BodyFR;
    ModelRenderer BodyF;
    ModelRenderer Body;
    ModelRenderer Ab1;
    ModelRenderer Ab2;
    ModelRenderer Ab3;
    ModelRenderer Ab4;
    ModelRenderer Ab5;
    ModelRenderer Ab6;
    ModelRenderer Pelvis;
    ModelRenderer PeckR;
    ModelRenderer PeckL;
    ModelRenderer ThighL;
    ModelRenderer LegL;
    ModelRenderer ThighR;
    ModelRenderer LegR;
    ModelRenderer ShoulderR;
    ModelRenderer UpperArmR;
    ModelRenderer LowerArmR;
    ModelRenderer ShoulderL;
    ModelRenderer UpperArmL;
    ModelRenderer LowerArmL;
    ModelRenderer Head;
    ModelRenderer Neck;
  
  public AC_ModelYeti()
  {
    textureWidth = 128;
    textureHeight = 128;
    
      BodyFL = new ModelRenderer(this, 74, 0);
      BodyFL.addBox(-1F, 0F, -6F, 4, 12, 4);
      BodyFL.setRotationPoint(0F, -5F, 0F);
      BodyFL.setTextureSize(128, 128);
      BodyFL.mirror = true;
      setRotation(BodyFL, 0.1858931F, -0.37179F, -0.074351F);
      BodyFR = new ModelRenderer(this, 74, 0);
      BodyFR.addBox(-3F, 0F, -6F, 4, 12, 4);
      BodyFR.setRotationPoint(0F, -5F, 0F);
      BodyFR.setTextureSize(128, 128);
      BodyFR.mirror = true;
      setRotation(BodyFR, 0.1858931F, 0.3717861F, 0.0743572F);
      BodyF = new ModelRenderer(this, 95, 0);
      BodyF.addBox(-2F, 0F, -5.9F, 4, 12, 4);
      BodyF.setRotationPoint(0F, -5F, 0F);
      BodyF.setTextureSize(128, 128);
      BodyF.mirror = true;
      setRotation(BodyF, 0.1858931F, 0F, 0F);
      Body = new ModelRenderer(this, 72, 20);
      Body.addBox(-4F, 0F, -2F, 8, 12, 4);
      Body.setRotationPoint(0F, -5F, 0F);
      Body.setTextureSize(128, 128);
      Body.mirror = true;
      setRotation(Body, 0F, 0F, 0F);
      Ab1 = new ModelRenderer(this, 29, 0);
      Ab1.addBox(0F, 6F, -6.4F, 2, 1, 1);
      Ab1.setRotationPoint(0F, -5F, 0F);
      Ab1.setTextureSize(128, 128);
      Ab1.mirror = true;
      setRotation(Ab1, 0.185895F, 0.37179F, 0.074351F);
      Ab2 = new ModelRenderer(this, 29, 0);
      Ab2.addBox(0F, 8F, -6.4F, 2, 1, 1);
      Ab2.setRotationPoint(0F, -5F, 0F);
      Ab2.setTextureSize(128, 128);
      Ab2.mirror = true;
      setRotation(Ab2, 0.185895F, 0.37179F, 0.074351F);
      Ab3 = new ModelRenderer(this, 29, 0);
      Ab3.addBox(0F, 10F, -6.4F, 2, 1, 1);
      Ab3.setRotationPoint(0F, -5F, 0F);
      Ab3.setTextureSize(128, 128);
      Ab3.mirror = true;
      setRotation(Ab3, 0.185895F, 0.37179F, 0.074351F);
      Ab4 = new ModelRenderer(this, 29, 0);
      Ab4.addBox(-2F, 6F, -6.4F, 2, 1, 1);
      Ab4.setRotationPoint(0F, -5F, 0F);
      Ab4.setTextureSize(128, 128);
      Ab4.mirror = true;
      setRotation(Ab4, 0.185895F, -0.37179F, -0.074351F);
      Ab5 = new ModelRenderer(this, 29, 0);
      Ab5.addBox(-2F, 8F, -6.4F, 2, 1, 1);
      Ab5.setRotationPoint(0F, -5F, 0F);
      Ab5.setTextureSize(128, 128);
      Ab5.mirror = true;
      setRotation(Ab5, 0.185895F, -0.37179F, -0.074351F);
      Ab6 = new ModelRenderer(this, 29, 0);
      Ab6.addBox(-2F, 10F, -6.4F, 2, 1, 1);
      Ab6.setRotationPoint(0F, -5F, 0F);
      Ab6.setTextureSize(128, 128);
      Ab6.mirror = true;
      setRotation(Ab6, 0.185895F, -0.37179F, -0.074351F);
      Pelvis = new ModelRenderer(this, 29, 18);
      Pelvis.addBox(-3F, 12F, -5F, 6, 3, 4);
      Pelvis.setRotationPoint(0F, -5F, 0F);
      Pelvis.setTextureSize(128, 128);
      Pelvis.mirror = true;
      setRotation(Pelvis, 0.185895F, 0F, 0F);
      PeckR = new ModelRenderer(this, 29, 30);
      PeckR.addBox(-3F, 1F, -6.4F, 4, 3, 1);
      PeckR.setRotationPoint(0F, -5F, 0F);
      PeckR.setTextureSize(128, 128);
      PeckR.mirror = true;
      setRotation(PeckR, 0.185895F, 0.185897F, 0.2230655F);
      PeckL = new ModelRenderer(this, 42, 30);
      PeckL.addBox(-1F, 1F, -6.4F, 4, 3, 1);
      PeckL.setRotationPoint(0F, -5F, 0F);
      PeckL.setTextureSize(128, 128);
      PeckL.mirror = true;
      setRotation(PeckL, 0.185895F, -0.185895F, -0.2230705F);
      ThighL = new ModelRenderer(this, 29, 70);
      ThighL.addBox(0F, -0.9F, -1.7F, 4, 7, 4);
      ThighL.setRotationPoint(2F, 9F, 0F);
      ThighL.setTextureSize(128, 128);
      ThighL.mirror = true;
      setRotation(ThighL, -0.2602503F, 0F, 0F);
      LegL = new ModelRenderer(this, 29, 38);
      LegL.addBox(0F, 0F, 0F, 4, 10, 4);
      LegL.setRotationPoint(2F, 14F, -3F);
      LegL.setTextureSize(128, 128);
      LegL.mirror = true;
      setRotation(LegL, 0F, 0F, 0F);
      ThighR = new ModelRenderer(this, 29, 70);
      ThighR.addBox(-2F, -0.9F, -1.7F, 4, 7, 4);
      ThighR.setRotationPoint(-4F, 9F, 0F);
      ThighR.setTextureSize(128, 128);
      ThighR.mirror = true;
      setRotation(ThighR, -0.2974289F, 0F, 0F);
      LegR = new ModelRenderer(this, 29, 38);
      LegR.addBox(0F, 0F, 0F, 4, 10, 4);
      LegR.setRotationPoint(-6F, 14F, -3F);
      LegR.setTextureSize(128, 128);
      LegR.mirror = true;
      setRotation(LegR, 0F, 0F, 0F);
      ShoulderR = new ModelRenderer(this, 0, 20);
      ShoulderR.addBox(-3F, -2F, -2F, 4, 4, 4);
      ShoulderR.setRotationPoint(-5F, -4F, 0F);
      ShoulderR.setTextureSize(128, 128);
      ShoulderR.mirror = true;
      setRotation(ShoulderR, 0F, 0F, 0.8551081F);
      UpperArmR = new ModelRenderer(this, 0, 40);
      UpperArmR.addBox(-2.5F, 2F, -1.5F, 3, 5, 3);
      UpperArmR.setRotationPoint(-4F, -5F, 0F);
      UpperArmR.setTextureSize(128, 128);
      UpperArmR.mirror = true;
      setRotation(UpperArmR, 0F, 0F, 0.8551081F);
      LowerArmR = new ModelRenderer(this, 0, 60);
      LowerArmR.addBox(-1.5F, -1.1F, -1.5F, 3, 7, 3);
      LowerArmR.setRotationPoint(-10F, -1F, 0F);
      LowerArmR.setTextureSize(128, 128);
      LowerArmR.mirror = true;
      setRotation(LowerArmR, -0.7853982F, 0F, 0.8551081F);
      ShoulderL = new ModelRenderer(this, 0, 20);
      ShoulderL.addBox(-2F, -3F, -2F, 4, 4, 4);
      ShoulderL.setRotationPoint(4F, -4F, 0F);
      ShoulderL.setTextureSize(128, 128);
      ShoulderL.mirror = true;
      setRotation(ShoulderL, 0F, 0F, 0.8551066F);
      UpperArmL = new ModelRenderer(this, 0, 40);
      UpperArmL.addBox(-1F, 2F, -1.5F, 3, 5, 3);
      UpperArmL.setRotationPoint(4F, -5F, 0F);
      UpperArmL.setTextureSize(128, 128);
      UpperArmL.mirror = true;
      setRotation(UpperArmL, 0F, 0F, -0.8551066F);
      LowerArmL = new ModelRenderer(this, 0, 60);
      LowerArmL.addBox(-2F, -1.1F, -1.5F, 3, 7, 3);
      LowerArmL.setRotationPoint(10F, -1F, 0F);
      LowerArmL.setTextureSize(128, 128);
      LowerArmL.mirror = true;
      setRotation(LowerArmL, -0.7853982F, 0F, -0.8551066F);
      Head = new ModelRenderer(this, 42, 0);
      Head.addBox(-2F, -6F, -3F, 7, 7, 5);
      Head.setRotationPoint(-2F, -8F, 0F);
      Head.setTextureSize(128, 128);
      Head.mirror = true;
      setRotation(Head, 0F, 0F, 0F);
      Neck = new ModelRenderer(this, 40, 12);
      Neck.addBox(-2F, -2F, -2F, 7, 2, 3);
      Neck.setRotationPoint(-2F, -5F, 0F);
      Neck.setTextureSize(128, 128);
      Neck.mirror = true;
      setRotation(Neck, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    BodyFL.render(f5);
    BodyFR.render(f5);
    BodyF.render(f5);
    Body.render(f5);
    Ab1.render(f5);
    Ab2.render(f5);
    Ab3.render(f5);
    Ab4.render(f5);
    Ab5.render(f5);
    Ab6.render(f5);
    Pelvis.render(f5);
    PeckR.render(f5);
    PeckL.render(f5);
    ThighL.render(f5);
    LegL.render(f5);
    ThighR.render(f5);
    LegR.render(f5);
    ShoulderR.render(f5);
    UpperArmR.render(f5);
    LowerArmR.render(f5);
    ShoulderL.render(f5);
    UpperArmL.render(f5);
    LowerArmL.render(f5);
    Head.render(f5);
    Neck.render(f5);
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