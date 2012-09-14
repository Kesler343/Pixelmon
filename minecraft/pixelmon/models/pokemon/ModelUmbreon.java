// Date: 9/12/2012 2:38:40 PM
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX




package pixelmon.models.pokemon;

import net.minecraft.src.Entity;
import net.minecraft.src.MathHelper;
import net.minecraft.src.ModelBase;
import net.minecraft.src.ModelRenderer;

public class ModelUmbreon extends ModelBase
{
  //fields
    ModelRenderer Mane;
    ModelRenderer BackTopLegR;
    ModelRenderer BackTopLegL;
    ModelRenderer FrontTopLegR;
    ModelRenderer FrontTopLegL;
    ModelRenderer EarRight2;
    ModelRenderer Body4;
    ModelRenderer Bodymed2;
    ModelRenderer Bodymed1;
    ModelRenderer Neck1;
    ModelRenderer BackBottomLegL;
    ModelRenderer NoseTop;
    ModelRenderer BackBottomLegR;
    ModelRenderer FrontBottomLegL;
    ModelRenderer FrontBottomLegR;
    ModelRenderer EarLeft1;
    ModelRenderer Body;
    ModelRenderer NoseBottom;
    ModelRenderer Neck;
    ModelRenderer Head;
    ModelRenderer EyeLeft;
    ModelRenderer UnderEyesLeft;
    ModelRenderer UnderEyesRight;
    ModelRenderer EyeRight;
    ModelRenderer EarLeft2;
    ModelRenderer EarRight1;
    ModelRenderer Jaw;
    ModelRenderer Tail1;
    ModelRenderer Tail2;
    ModelRenderer Tail3;
    ModelRenderer TailBase;
    ModelRenderer FrontLegR;
    ModelRenderer FrontLegL;
    ModelRenderer BackLegR;
    ModelRenderer BackLegL;
    ModelRenderer HeadBase;
  
  public ModelUmbreon()
  {
    textureWidth = 64;
    textureHeight = 32;
    
      Mane = new ModelRenderer(this, 22, 1);
      Mane.addBox(-2F, -2F, -6F, 4, 5, 5);
      Mane.setRotationPoint(-1F, 15.16667F, 1F);
      Mane.setTextureSize(64, 32);
      Mane.mirror = true;
      setRotation(Mane, -0.3080661F, 0F, 0F);
      Body4 = new ModelRenderer(this, 18, 14);
      Body4.addBox(-1.9F, -2F, -3F, 4, 4, 4);
      Body4.setRotationPoint(-1.1F, 14.2F, 6F);
      Body4.setTextureSize(64, 32);
      Body4.mirror = true;
      setRotation(Body4, 1.711042F, 0F, 0F);
      Bodymed2 = new ModelRenderer(this, 18, 14);
      Bodymed2.addBox(-1.9F, -3F, -5F, 4, 4, 5);
      Bodymed2.setRotationPoint(-1.133333F, 16.4F, 3.9F);
      Bodymed2.setTextureSize(64, 32);
      Bodymed2.mirror = true;
      setRotation(Bodymed2, 0.0698132F, 0F, 0F);
      Bodymed1 = new ModelRenderer(this, 18, 14);
      Bodymed1.addBox(-1.9F, -2F, -3F, 4, 4, 4);
      Bodymed1.setRotationPoint(-1.1F, 14.06667F, 1.233333F);
      Bodymed1.setTextureSize(64, 32);
      Bodymed1.mirror = true;
      setRotation(Bodymed1, 1.384077F, 0F, 0F);
      Neck1 = new ModelRenderer(this, 18, 14);
      Neck1.addBox(-1.333333F, -2F, 0F, 3, 2, 4);
      Neck1.setRotationPoint(-1.2F, 13F, -2F);
      Neck1.setTextureSize(64, 32);
      Neck1.mirror = true;
      setRotation(Neck1, 2.178357F, 0F, 0F);
      Body = new ModelRenderer(this, 18, 14);
      Body.addBox(-1.9F, -2F, -3F, 4, 5, 4);
      Body.setRotationPoint(-1.1F, 14.4F, 4F);
      Body.setTextureSize(64, 32);
      Body.mirror = true;
      setRotation(Body, 1.532791F, 0F, 0F);
      Neck = new ModelRenderer(this, 18, 14);
      Neck.addBox(-1.333333F, 0F, 0F, 3, 2, 6);
      Neck.setRotationPoint(-1.2F, 16.2F, -5.7F);
      Neck.setTextureSize(64, 32);
      Neck.mirror = true;
      setRotation(Neck, 1.697307F, 0F, 0F);
    TailBase = new ModelRenderer(this, "TailBase");
    TailBase.setRotationPoint(-1F, 14.6F, 7F);
    setRotation(TailBase, 0F, 0F, 0F);
    TailBase.mirror = true;
      Tail1 = new ModelRenderer(this, 36, 18);
      Tail1.addBox(-0.5F, 0F, -1F, 1, 8, 2);
      Tail1.setRotationPoint(0F, 0F, 0F);
      Tail1.setTextureSize(64, 32);
      Tail1.mirror = true;
      setRotation(Tail1, 2.542856F, 0F, 0F);
      Tail2 = new ModelRenderer(this, 36, 18);
      Tail2.addBox(-0.5F, 0F, -1F, 1, 8, 2);
      Tail2.setRotationPoint(0F, 0F, 0F);
      Tail2.setTextureSize(64, 32);
      Tail2.mirror = true;
      setRotation(Tail2, 2.543817F, 0.1487144F, 0F);
      Tail3 = new ModelRenderer(this, 36, 18);
      Tail3.addBox(-0.5F, 0F, -1F, 1, 8, 2);
      Tail3.setRotationPoint(0F, 0F, 0F);
      Tail3.setTextureSize(64, 32);
      Tail3.mirror = true;
      setRotation(Tail3, 2.54469F, -0.1487144F, 0F);
      
      TailBase.addChild(Tail1);
      TailBase.addChild(Tail2);
      TailBase.addChild(Tail3);
      
    FrontLegR = new ModelRenderer(this, "FrontLegR");
    FrontLegR.setRotationPoint(-2.5F, 13.5F, -4.1F);
    setRotation(FrontLegR, 0F, 0F, 0F);
    FrontLegR.mirror = true;
      FrontTopLegR = new ModelRenderer(this, 56, 18);
      FrontTopLegR.addBox(-1F, 0F, -1F, 2, 6, 2);
      FrontTopLegR.setRotationPoint(0F, 0F, 0F);
      FrontTopLegR.setTextureSize(64, 32);
      FrontTopLegR.mirror = true;
      setRotation(FrontTopLegR, 0.0963464F, 0F, 0F);
      FrontBottomLegR = new ModelRenderer(this, 8, 18);
      FrontBottomLegR.addBox(-0.5F, 0F, -1F, 1, 5, 2);
      FrontBottomLegR.setRotationPoint(0F, 5.5F, 0.6F);
      FrontBottomLegR.setTextureSize(64, 32);
      FrontBottomLegR.mirror = true;
      setRotation(FrontBottomLegR, -0.0349066F, 0F, 0F);
      
      FrontLegR.addChild(FrontTopLegR);
      FrontLegR.addChild(FrontBottomLegR);
      
    FrontLegL = new ModelRenderer(this, "FrontLegL");
    FrontLegL.setRotationPoint(0.5F, 13.5F, -4.1F);
    setRotation(FrontLegL, 0F, 0F, 0F);
    FrontLegL.mirror = true;
      FrontTopLegL = new ModelRenderer(this, 56, 18);
      FrontTopLegL.addBox(-1F, 0F, -1F, 2, 6, 2);
      FrontTopLegL.setRotationPoint(0F, 0F, 0F);
      FrontTopLegL.setTextureSize(64, 32);
      FrontTopLegL.mirror = true;
      setRotation(FrontTopLegL, 0.0986693F, 0F, 0F);
      FrontBottomLegL = new ModelRenderer(this, 8, 18);
      FrontBottomLegL.addBox(-0.5F, 0F, -1F, 1, 5, 2);
      FrontBottomLegL.setRotationPoint(0.1F, 5.5F, 0.6F);
      FrontBottomLegL.setTextureSize(64, 32);
      FrontBottomLegL.mirror = true;
      setRotation(FrontBottomLegL, -0.0349066F, 0F, 0F);
      
      FrontLegL.addChild(FrontTopLegL);
      FrontLegL.addChild(FrontBottomLegL);
      
    BackLegR = new ModelRenderer(this, "BackLegR");
    BackLegR.setRotationPoint(-2.5F, 14.7F, 6.5F);
    setRotation(BackLegR, 0F, 0F, 0F);
    BackLegR.mirror = true;
      BackTopLegR = new ModelRenderer(this, 56, 18);
      BackTopLegR.addBox(-1F, 0F, -1F, 2, 6, 2);
      BackTopLegR.setRotationPoint(0F, 0F, 0F);
      BackTopLegR.setTextureSize(64, 32);
      BackTopLegR.mirror = true;
      setRotation(BackTopLegR, 0.1994694F, 0F, 0F);
      BackBottomLegR = new ModelRenderer(this, 8, 18);
      BackBottomLegR.addBox(-0.6F, 0F, -1F, 1, 5, 2);
      BackBottomLegR.setRotationPoint(-0.1F, 5F, 1F);
      BackBottomLegR.setTextureSize(64, 32);
      BackBottomLegR.mirror = true;
      setRotation(BackBottomLegR, -0.240525F, 0F, 0.1115358F);
      
      BackLegR.addChild(BackTopLegR);
      BackLegR.addChild(BackBottomLegR);
      
    BackLegL = new ModelRenderer(this, "BackLegL");
    BackLegL.setRotationPoint(0.6F, 14.7F, 6.5F);
    setRotation(BackLegL, 0F, 0F, 0F);
    BackLegL.mirror = true;
      BackTopLegL = new ModelRenderer(this, 56, 18);
      BackTopLegL.addBox(-1F, 0F, -1F, 2, 6, 2);
      BackTopLegL.setRotationPoint(0F, 0F, 0F);
      BackTopLegL.setTextureSize(64, 32);
      BackTopLegL.mirror = true;
      setRotation(BackTopLegL, 0.1994737F, 0F, 0F);
      BackBottomLegL = new ModelRenderer(this, 8, 18);
      BackBottomLegL.addBox(-0.6F, 0F, -1F, 1, 5, 2);
      BackBottomLegL.setRotationPoint(0.4F, 5F, 1F);
      BackBottomLegL.setTextureSize(64, 32);
      BackBottomLegL.mirror = true;
      setRotation(BackBottomLegL, -0.240525F, 0F, -0.0743572F);
      
      BackLegL.addChild(BackTopLegL);
      BackLegL.addChild(BackBottomLegL);
      
    HeadBase = new ModelRenderer(this, "HeadBase");
    HeadBase.setRotationPoint(-1F, 10.9F, -5.4F);
    setRotation(HeadBase, 0F, 0F, 0F);
    HeadBase.mirror = true;
      UnderEyesRight = new ModelRenderer(this, 0, 25);
      UnderEyesRight.addBox(-0.5F, -1F, -2F, 1, 2, 2);
      UnderEyesRight.setRotationPoint(-1.5F, -0.7F, -1.4F);
      UnderEyesRight.setTextureSize(64, 32);
      UnderEyesRight.mirror = true;
      setRotation(UnderEyesRight, 0.1965241F, -0.2617994F, -0.0523599F);
      UnderEyesLeft = new ModelRenderer(this, 0, 25);
      UnderEyesLeft.addBox(-0.5F, -1F, -2F, 1, 2, 2);
      UnderEyesLeft.setRotationPoint(1.5F, -0.7F, -1.4F);
      UnderEyesLeft.setTextureSize(64, 32);
      UnderEyesLeft.mirror = true;
      setRotation(UnderEyesLeft, 0.1966288F, 0.2617994F, 0.0523599F);
      EyeRight = new ModelRenderer(this, 0, 29);
      EyeRight.addBox(-0.5F, -1F, -1F, 1, 1, 2);
      EyeRight.setRotationPoint(-1.2F, -1.4F, -2.1F);
      EyeRight.setTextureSize(64, 32);
      EyeRight.mirror = true;
      setRotation(EyeRight, 0.2708813F, -0.2617994F, -0.0523599F);
      EyeLeft = new ModelRenderer(this, 1, 29);
      EyeLeft.addBox(-0.5F, -1F, -1F, 1, 1, 2);
      EyeLeft.setRotationPoint(1.2F, -1.4F, -2.1F);
      EyeLeft.setTextureSize(64, 32);
      EyeLeft.mirror = true;
      setRotation(EyeLeft, 0.2708813F, 0.2094395F, 0F);
      NoseBottom = new ModelRenderer(this, 24, 5);
      NoseBottom.addBox(-1F, -0.6666667F, -3.9F, 3, 2, 3);
      NoseBottom.setRotationPoint(-0.5F, -2.1F, -0.2F);
      NoseBottom.setTextureSize(64, 32);
      NoseBottom.mirror = true;
      setRotation(NoseBottom, 0.4089647F, 0F, 0F);
      NoseTop = new ModelRenderer(this, 52, 0);
      NoseTop.addBox(-1F, -1F, -3F, 3, 2, 3);
      NoseTop.setRotationPoint(-0.5F, -3F, -1.5F);
      NoseTop.setTextureSize(64, 32);
      NoseTop.mirror = true;
      setRotation(NoseTop, 0.9456999F, 0F, 0F);
      Jaw = new ModelRenderer(this, 24, 5);
      Jaw.addBox(-1F, -0.6666667F, -2.9F, 3, 2, 3);
      Jaw.setRotationPoint(-0.5F, -1.2F, -0.2F);
      Jaw.setTextureSize(64, 32);
      Jaw.mirror = true;
      setRotation(Jaw, 0.1965241F, 0F, 0F);
      Head = new ModelRenderer(this, 0, 0);
      Head.addBox(-2F, -4F, -1.5F, 4, 4, 3);
      Head.setRotationPoint(0F, 0F, 0F);
      Head.setTextureSize(64, 32);
      Head.mirror = true;
      setRotation(Head, 0.2139836F, 0F, 0F);
      EarRight1 = new ModelRenderer(this, 16, 0);
      EarRight1.addBox(-1F, -9F, -0.5F, 1, 7, 1);
      EarRight1.setRotationPoint(0F, -1.4F, -0.6F);
      EarRight1.setTextureSize(64, 32);
      EarRight1.mirror = true;
      setRotation(EarRight1, -0.4833219F, 0F, -0.4089647F);
      EarRight2 = new ModelRenderer(this, 16, 0);
      EarRight2.addBox(-1F, -9F, -0.5F, 1, 7, 1);
      EarRight2.setRotationPoint(0F, -1.4F, -0.6F);
      EarRight2.setTextureSize(64, 32);
      EarRight2.mirror = true;
      setRotation(EarRight2, -0.5925858F, 0F, -0.4089647F);
      EarLeft1 = new ModelRenderer(this, 16, 0);
      EarLeft1.addBox(0F, -9F, -0.5F, 1, 7, 1);
      EarLeft1.setRotationPoint(0F, -1.4F, -0.6F);
      EarLeft1.setTextureSize(64, 32);
      EarLeft1.mirror = true;
      setRotation(EarLeft1, -0.5728604F, 0F, 0.2974289F);
      EarLeft2 = new ModelRenderer(this, 16, 0);
      EarLeft2.addBox(0F, -9F, -0.5F, 1, 7, 1);
      EarLeft2.setRotationPoint(0F, -1.4F, -0.6F);
      EarLeft2.setTextureSize(64, 32);
      EarLeft2.mirror = true;
      setRotation(EarLeft2, -0.4810499F, 0F, 0.2974289F);
      
      HeadBase.addChild(UnderEyesRight);
      HeadBase.addChild(UnderEyesLeft);
      HeadBase.addChild(EyeRight);
      HeadBase.addChild(EyeLeft);
      HeadBase.addChild(NoseBottom);
      HeadBase.addChild(NoseTop);
      HeadBase.addChild(Jaw);
      HeadBase.addChild(Head);
      HeadBase.addChild(EarRight1);
      HeadBase.addChild(EarRight2);
      HeadBase.addChild(EarLeft1);
      HeadBase.addChild(EarLeft2);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5);
    Mane.render(f5);
    Body4.render(f5);
    Bodymed2.render(f5);
    Bodymed1.render(f5);
    Neck1.render(f5);
    Body.render(f5);
    Neck.render(f5);
    TailBase.render(f5);
    FrontLegR.render(f5);
    FrontLegL.render(f5);
    BackLegR.render(f5);
    BackLegL.render(f5);
    HeadBase.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.setRotationAngles(f, f1, f2, f3, f4, f5);
  }

}