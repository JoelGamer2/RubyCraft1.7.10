package Eventos.Navidad.Entidades.Render.Modelo;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class RenderModeloYetiLichEstatua extends ModelBase
{
  //fields
    ModelRenderer PieDerecho;
    ModelRenderer PieDerecho1;
    ModelRenderer PieDerecho2;
    ModelRenderer PieIzquierdo;
    ModelRenderer PieIzquierdo1;
    ModelRenderer PieIzquierdo2;
    ModelRenderer PiernaDerecha;
    ModelRenderer PiernaIzquierda;
    ModelRenderer CuerpoInferior;
    ModelRenderer CuerpoMedio;
    ModelRenderer CuerpoSuperior;
    ModelRenderer BrazoDerecho;
    ModelRenderer BrazoIzquierdo;
    ModelRenderer Cabeza;
    ModelRenderer Craneo1;
    ModelRenderer Craneo2;
    ModelRenderer Craneo3;
    ModelRenderer Craneo4;
    ModelRenderer Craneo5;
    ModelRenderer Craneo6;
    ModelRenderer OrejaDercha;
    ModelRenderer OrejaIzquierda;
    ModelRenderer Barbilla;
    ModelRenderer labioInferior;
    ModelRenderer DienteDerecho;
    ModelRenderer DienteIzquierdo;
    ModelRenderer nariz;
    ModelRenderer CejaDerecha;
    ModelRenderer CejaIzquierda;
  
  public RenderModeloYetiLichEstatua()
  {
    textureWidth = 256;
    textureHeight = 256;
    
      PieDerecho = new ModelRenderer(this, 1, 225);
      PieDerecho.addBox(0F, 0F, 0F, 12, 6, 24);
      PieDerecho.setRotationPoint(0F, 34F, -12F);
      PieDerecho.setTextureSize(64, 32);
      PieDerecho.mirror = true;
      setRotation(PieDerecho, 0F, 0F, 0F);
      PieDerecho1 = new ModelRenderer(this, 15, 212);
      PieDerecho1.addBox(0F, 0F, 0F, 12, 2, 8);
      PieDerecho1.setRotationPoint(0F, 32F, -8F);
      PieDerecho1.setTextureSize(64, 32);
      PieDerecho1.mirror = true;
      setRotation(PieDerecho1, 0F, 0F, 0F);
      PieDerecho2 = new ModelRenderer(this, 18, 204);
      PieDerecho2.addBox(0F, 0F, 0F, 12, 2, 4);
      PieDerecho2.setRotationPoint(0F, 30F, -4F);
      PieDerecho2.setTextureSize(64, 32);
      PieDerecho2.mirror = true;
      setRotation(PieDerecho2, 0F, 0F, 0F);
      PieIzquierdo = new ModelRenderer(this, 76, 225);
      PieIzquierdo.addBox(0F, 0F, 0F, 12, 6, 24);
      PieIzquierdo.setRotationPoint(0F, 34F, -12F);
      PieIzquierdo.setTextureSize(64, 32);
      PieIzquierdo.mirror = true;
      setRotation(PieIzquierdo, 0F, 0F, 0F);
      PieIzquierdo1 = new ModelRenderer(this, 92, 212);
      PieIzquierdo1.addBox(0F, 0F, 0F, 12, 2, 8);
      PieIzquierdo1.setRotationPoint(0F, 32F, -8F);
      PieIzquierdo1.setTextureSize(64, 32);
      PieIzquierdo1.mirror = true;
      setRotation(PieIzquierdo1, 0F, 0F, 0F);
      PieIzquierdo2 = new ModelRenderer(this, 95, 204);
      PieIzquierdo2.addBox(0F, 0F, 0F, 12, 2, 4);
      PieIzquierdo2.setRotationPoint(0F, 30F, -4F);
      PieIzquierdo2.setTextureSize(64, 32);
      PieIzquierdo2.mirror = true;
      setRotation(PieIzquierdo2, 0F, 0F, 0F);
      PiernaDerecha = new ModelRenderer(this, 1, 96);
      PiernaDerecha.addBox(0F, 0F, 0F, 12, 34, 12);
      PiernaDerecha.setRotationPoint(-18F, -16F, -2F);
      PiernaDerecha.setTextureSize(64, 32);
      PiernaDerecha.mirror = true;
      setRotation(PiernaDerecha, 0F, 0F, 0F);
      PiernaIzquierda = new ModelRenderer(this, 52, 96);
      PiernaIzquierda.addBox(0F, 0F, 0F, 12, 34, 12);
      PiernaIzquierda.setRotationPoint(4F, -16F, -2F);
      PiernaIzquierda.setTextureSize(64, 32);
      PiernaIzquierda.mirror = true;
      setRotation(PiernaIzquierda, 0F, 0F, 0F);
      CuerpoInferior = new ModelRenderer(this, 166, 215);
      CuerpoInferior.addBox(0F, 0F, 0F, 22, 18, 22);
      CuerpoInferior.setRotationPoint(-12F, -24F, -8F);
      CuerpoInferior.setTextureSize(64, 32);
      CuerpoInferior.mirror = true;
      setRotation(CuerpoInferior, 0F, 0F, 0F);
      CuerpoMedio = new ModelRenderer(this, 151, 181);
      CuerpoMedio.addBox(0F, 0F, 0F, 30, 10, 22);
      CuerpoMedio.setRotationPoint(-16F, -34F, -10F);
      CuerpoMedio.setTextureSize(64, 32);
      CuerpoMedio.mirror = true;
      setRotation(CuerpoMedio, 0F, 0F, 0F);
      CuerpoSuperior = new ModelRenderer(this, 135, 143);
      CuerpoSuperior.addBox(0F, 0F, 0F, 38, 14, 22);
      CuerpoSuperior.setRotationPoint(-20F, -48F, -12F);
      CuerpoSuperior.setTextureSize(64, 32);
      CuerpoSuperior.mirror = true;
      setRotation(CuerpoSuperior, 0F, 0F, 0F);
      BrazoDerecho = new ModelRenderer(this, 1, 42);
      BrazoDerecho.addBox(0F, 0F, 0F, 8, 44, 8);
      BrazoDerecho.setRotationPoint(-28F, -44F, -5F);
      BrazoDerecho.setTextureSize(64, 32);
      BrazoDerecho.mirror = true;
      setRotation(BrazoDerecho, 0F, 0F, 0F);
      BrazoIzquierdo = new ModelRenderer(this, 36, 42);
      BrazoIzquierdo.addBox(0F, 0F, 0F, 8, 44, 8);
      BrazoIzquierdo.setRotationPoint(18F, -44F, -5F);
      BrazoIzquierdo.setTextureSize(64, 32);
      BrazoIzquierdo.mirror = true;
      setRotation(BrazoIzquierdo, 0F, 0F, 0F);
      Cabeza = new ModelRenderer(this, 154, 85);
      Cabeza.addBox(0F, 0F, 0F, 20, 24, 20);
      Cabeza.setRotationPoint(-11F, -72F, -22F);
      Cabeza.setTextureSize(64, 32);
      Cabeza.mirror = true;
      setRotation(Cabeza, 0F, 0F, 0F);
      Craneo1 = new ModelRenderer(this, 156, 60);
      Craneo1.addBox(0F, 0F, 0F, 18, 4, 21);
      Craneo1.setRotationPoint(1F, -4F, 1F);
      Craneo1.setTextureSize(64, 32);
      Craneo1.mirror = true;
      setRotation(Craneo1, 0F, 0F, 0F);
      Craneo2 = new ModelRenderer(this, 164, 38);
      Craneo2.addBox(0F, 0F, 0F, 12, 4, 18);
      Craneo2.setRotationPoint(4F, -8F, 4F);
      Craneo2.setTextureSize(64, 32);
      Craneo2.mirror = true;
      setRotation(Craneo2, 0F, 0F, 0F);
      Craneo3 = new ModelRenderer(this, 173, 20);
      Craneo3.addBox(0F, 0F, 0F, 6, 4, 12);
      Craneo3.setRotationPoint(7F, -12F, 8F);
      Craneo3.setTextureSize(64, 32);
      Craneo3.mirror = true;
      setRotation(Craneo3, 0F, 0F, 0F);
      Craneo4 = new ModelRenderer(this, 100, 0);
      Craneo4.addBox(0F, 0F, 0F, 16, 22, 2);
      Craneo4.setRotationPoint(2F, 0F, 20F);
      Craneo4.setTextureSize(64, 32);
      Craneo4.mirror = true;
      setRotation(Craneo4, 0F, 0F, 0F);
      Craneo5 = new ModelRenderer(this, 104, 26);
      Craneo5.addBox(0F, 0F, 0F, 12, 22, 2);
      Craneo5.setRotationPoint(4F, -4F, 22F);
      Craneo5.setTextureSize(64, 32);
      Craneo5.mirror = true;
      setRotation(Craneo5, 0F, 0F, 0F);
      Craneo6 = new ModelRenderer(this, 109, 52);
      Craneo6.addBox(0F, 0F, 0F, 8, 16, 2);
      Craneo6.setRotationPoint(6F, -2F, 24F);
      Craneo6.setTextureSize(64, 32);
      Craneo6.mirror = true;
      setRotation(Craneo6, 0F, 0F, 0F);
      OrejaDercha = new ModelRenderer(this, 134, 89);
      OrejaDercha.addBox(0F, 0F, 0F, 3, 10, 6);
      OrejaDercha.setRotationPoint(-3F, 2F, 7F);
      OrejaDercha.setTextureSize(64, 32);
      OrejaDercha.mirror = true;
      setRotation(OrejaDercha, 0F, 0F, 0F);
      OrejaIzquierda = new ModelRenderer(this, 236, 90);
      OrejaIzquierda.addBox(0F, 0F, 0F, 3, 10, 6);
      OrejaIzquierda.setRotationPoint(20F, 2F, 7F);
      OrejaIzquierda.setTextureSize(64, 32);
      OrejaIzquierda.mirror = true;
      setRotation(OrejaIzquierda, 0F, 0F, 0F);
      Barbilla = new ModelRenderer(this, 7, 34);
      Barbilla.addBox(0F, 0F, 0F, 12, 3, 2);
      Barbilla.setRotationPoint(4F, 20F, -2F);
      Barbilla.setTextureSize(64, 32);
      Barbilla.mirror = true;
      setRotation(Barbilla, 0F, 0F, 0F);
      labioInferior = new ModelRenderer(this, 1, 25);
      labioInferior.addBox(0F, 0F, 0F, 16, 3, 4);
      labioInferior.setRotationPoint(2F, 17F, -4F);
      labioInferior.setTextureSize(64, 32);
      labioInferior.mirror = true;
      setRotation(labioInferior, 0F, 0F, 0F);
      DienteDerecho = new ModelRenderer(this, 1, 18);
      DienteDerecho.addBox(0F, 0F, 0F, 2, 3, 2);
      DienteDerecho.setRotationPoint(3F, 14F, -2F);
      DienteDerecho.setTextureSize(64, 32);
      DienteDerecho.mirror = true;
      setRotation(DienteDerecho, 0F, 0F, 0F);
      DienteIzquierdo = new ModelRenderer(this, 34, 18);
      DienteIzquierdo.addBox(0F, 0F, 0F, 2, 3, 2);
      DienteIzquierdo.setRotationPoint(15F, 14F, -2F);
      DienteIzquierdo.setTextureSize(64, 32);
      DienteIzquierdo.mirror = true;
      setRotation(DienteIzquierdo, 0F, 0F, 0F);
      nariz = new ModelRenderer(this, 11, 8);
      nariz.addBox(0F, 0F, 0F, 8, 3, 4);
      nariz.setRotationPoint(6F, 11F, -4F);
      nariz.setTextureSize(64, 32);
      nariz.mirror = true;
      setRotation(nariz, 0F, 0F, 0F);
      CejaDerecha = new ModelRenderer(this, 1, 2);
      CejaDerecha.addBox(0F, 0F, 0F, 6, 2, 2);
      CejaDerecha.setRotationPoint(2F, 5F, -2F);
      CejaDerecha.setTextureSize(64, 32);
      CejaDerecha.mirror = true;
      setRotation(CejaDerecha, 0F, 0F, 0F);
      CejaIzquierda = new ModelRenderer(this, 26, 2);
      CejaIzquierda.addBox(0F, 0F, 0F, 6, 2, 2);
      CejaIzquierda.setRotationPoint(12F, 5F, -2F);
      CejaIzquierda.setTextureSize(64, 32);
      CejaIzquierda.mirror = true;
      setRotation(CejaIzquierda, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    PiernaDerecha.render(f5);
    PiernaDerecha.addChild(PieDerecho);
    PiernaDerecha.addChild(PieDerecho1);
    PiernaDerecha.addChild(PieDerecho2);
    PiernaIzquierda.render(f5);
    PiernaIzquierda.addChild(PieIzquierdo);
    PiernaIzquierda.addChild(PieIzquierdo1);
    PiernaIzquierda.addChild(PieIzquierdo2);
    CuerpoInferior.render(f5);
    CuerpoMedio.render(f5);
    CuerpoSuperior.render(f5);
    BrazoDerecho.render(f5);
    BrazoIzquierdo.render(f5);
    Cabeza.render(f5);
    Cabeza.addChild(Craneo1);
    Cabeza.addChild(Craneo2);
    Cabeza.addChild(Craneo3);
    Cabeza.addChild(Craneo4);
    Cabeza.addChild(Craneo5);
    Cabeza.addChild(Craneo6);
    Cabeza.addChild(OrejaDercha);
    Cabeza.addChild(OrejaIzquierda);
    Cabeza.addChild(Barbilla);
    Cabeza.addChild(labioInferior);
    Cabeza.addChild(DienteDerecho);
    Cabeza.addChild(DienteIzquierdo);
    Cabeza.addChild(nariz);
    Cabeza.addChild(CejaDerecha);
    Cabeza.addChild(CejaIzquierda);

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
	    
	  this.Cabeza.rotateAngleX = f4 / (180F / (float)Math.PI);
	  this.BrazoDerecho.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 2.0F * f1 * 0.5F;
	  this.BrazoIzquierdo.rotateAngleX = MathHelper.cos(f * 0.6662F) * 2.0F * f1 * 0.5F;
	  this.BrazoDerecho.rotateAngleZ = 0.0F;
	  this.BrazoIzquierdo.rotateAngleZ = 0.0F;
	  this.PiernaDerecha.rotateAngleX = MathHelper.cos(f * 0.6662F) * 1.4F * f1;
	  this.PiernaIzquierda.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 1.4F * f1;
	  this.PiernaDerecha.rotateAngleY = 0.0F;
	  this.PiernaIzquierda.rotateAngleY = 0.0F;
	    super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
  }

}
