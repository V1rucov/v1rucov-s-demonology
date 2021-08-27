package net.fabricmc.v1rucovsdemons.common.entity.model;

import com.google.common.collect.ImmutableList;
import net.fabricmc.v1rucovsdemons.common.block.*;
import net.fabricmc.v1rucovsdemons.common.entity.*;
import net.fabricmc.v1rucovsdemons.common.item.*;
import net.fabricmc.v1rucovsdemons.common.ritual.*;
import net.fabricmc.v1rucovsdemons.common.entity.render.*;
import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.model.CompositeEntityModel;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.util.math.MatrixStack;
import org.apache.http.annotation.Immutable;

import javax.swing.text.html.parser.Entity;

public class ghostEntityModel extends EntityModel<ghostEntity> {
    private final ModelPart VoxelShapes;
    private final ModelPart right_leg;
    private final ModelPart up3;
    private final ModelPart cube_r1;
    private final ModelPart down3;
    private final ModelPart cube_r2;
    private final ModelPart cube_r3;
    private final ModelPart cube_r4;
    private final ModelPart cube_r5;
    private final ModelPart cube_r6;
    private final ModelPart foot2;
    private final ModelPart cube_r7;
    private final ModelPart cube_r8;
    private final ModelPart cube_r9;
    private final ModelPart cube_r10;
    private final ModelPart head;
    private final ModelPart hat;
    private final ModelPart cube_r11;
    private final ModelPart cube_r12;
    private final ModelPart cube_r13;
    private final ModelPart main2;
    private final ModelPart cube_r14;
    private final ModelPart cube_r15;
    private final ModelPart cape;
    private final ModelPart cube_r16;
    private final ModelPart cube_r17;
    private final ModelPart cube_r18;
    private final ModelPart cube_r19;
    private final ModelPart cube_r20;
    private final ModelPart cube_r21;
    private final ModelPart cube_r22;
    private final ModelPart left_hand;
    private final ModelPart wrist;
    private final ModelPart cube_r23;
    private final ModelPart cube_r24;
    private final ModelPart cube_r25;
    private final ModelPart cube_r26;
    private final ModelPart cube_r27;
    private final ModelPart cube_r28;
    private final ModelPart cube_r29;
    private final ModelPart up2;
    private final ModelPart cube_r30;
    private final ModelPart cube_r31;
    private final ModelPart cube_r32;
    private final ModelPart cube_r33;
    private final ModelPart down2;
    private final ModelPart body;
    private final ModelPart rebra;
    private final ModelPart main;
    private final ModelPart left_leg;
    private final ModelPart down;
    private final ModelPart cube_r34;
    private final ModelPart cube_r35;
    private final ModelPart cube_r36;
    private final ModelPart cube_r37;
    private final ModelPart cube_r38;
    private final ModelPart up;
    private final ModelPart cube_r39;
    private final ModelPart foot;
    private final ModelPart cube_r40;
    private final ModelPart cube_r41;
    private final ModelPart cube_r42;
    private final ModelPart right_hand;
    private final ModelPart wrist2;
    private final ModelPart cube_r43;
    private final ModelPart cube_r44;
    private final ModelPart cube_r45;
    private final ModelPart cube_r46;
    private final ModelPart cube_r47;
    private final ModelPart cube_r48;
    private final ModelPart cube_r49;
    private final ModelPart up4;
    private final ModelPart up4_r1;
    private final ModelPart up4_r2;
    private final ModelPart down4;
    private final ModelPart down4_r1;
    private final ModelPart down4_r2;
    private final ModelPart Root;

    public ghostEntityModel(ModelPart root){
        this.Root = root;
        this.VoxelShapes = this.Root.getChild("VoxelShapes");
        this.right_hand = this.VoxelShapes.getChild("right_hand");
        this.down4 = this.right_hand.getChild("down4");
        down4_r2 = down4.getChild("down4_r2");
        down4_r1 = down4.getChild("down4_r1");
        up4 = right_hand.getChild("up4");
        up4_r2 = up4.getChild("up4_r2");
        up4_r1 = up4.getChild("up4_r1");
        wrist2 = right_hand.getChild("wrist2");
        cube_r49 = wrist2.getChild("cube_r49");
        cube_r48 = wrist2.getChild("cube_r48");
        cube_r47 = wrist2.getChild("cube_r47");
        cube_r46 = wrist2.getChild("cube_r46");
        cube_r45 = wrist2.getChild("cube_r45");
        cube_r44 = wrist2.getChild("cube_r44");
        cube_r43 = wrist2.getChild("cube_r43");
        left_leg = VoxelShapes.getChild("left_leg");
        foot = left_leg.getChild("foot");
        cube_r42 = foot.getChild("cube_r42");
        cube_r41 = foot.getChild("cube_r41");
        cube_r40 = foot.getChild("cube_r40");
        up = left_leg.getChild("up");
        cube_r39 = up.getChild("cube_r39");
        down = left_leg.getChild("down");
        cube_r38 = down.getChild("cube_r38");
        cube_r37 = down.getChild("cube_r37");
        cube_r36 = down.getChild("cube_r36");
        cube_r35 = down.getChild("cube_r35");
        cube_r34 = down.getChild("cube_r34");
        body = VoxelShapes.getChild("body");
        main = body.getChild("main");
        rebra = body.getChild("rebra");
        left_hand = VoxelShapes.getChild("left_hand");
        down2 = left_hand.getChild("down2");
        up2 = left_hand.getChild("up2");
        cube_r33 = up2.getChild("cube_r33");
        cube_r32 = up2.getChild("cube_r32");
        cube_r31 = up2.getChild("cube_r31");
        cube_r30 = up2.getChild("cube_r30");
        wrist = left_hand.getChild("wrist");
        cube_r29 = wrist.getChild("cube_r29");
        cube_r28 = wrist.getChild("cube_r28");
        cube_r27 = wrist.getChild("cube_r27");
        cube_r26 = wrist.getChild("cube_r26");
        cube_r25 = wrist.getChild("cube_r25");
        cube_r24 = wrist.getChild("cube_r24");
        cube_r23 = wrist.getChild("cube_r23");
        cape = VoxelShapes.getChild("cape");
        cube_r22 = cape.getChild("cube_r22");
        cube_r21 = cape.getChild("cube_r21");
        cube_r20 = cape.getChild("cube_r20");
        cube_r19 = cape.getChild("cube_r19");
        cube_r18 = cape.getChild("cube_r18");
        cube_r17 = cape.getChild("cube_r17");
        cube_r16 = cape.getChild("cube_r16");
        head = VoxelShapes.getChild("head");
        main2 = head.getChild("main2");
        cube_r15 = main2.getChild("cube_r15");
        cube_r14 = main2.getChild("cube_r14");
        hat = head.getChild("hat");
        cube_r13 = hat.getChild("cube_r13");
        cube_r12 = hat.getChild("cube_r12");
        cube_r11 = hat.getChild("cube_r11");
        right_leg = VoxelShapes.getChild("right_leg");
        foot2 = right_leg.getChild("foot2");
        cube_r10 = foot2.getChild("cube_r10");
        cube_r9 = foot2.getChild("cube_r9");
        cube_r8 = foot2.getChild("cube_r8");
        cube_r7 = foot2.getChild("cube_r7");
        down3 = right_leg.getChild("down3");
        cube_r6 = down3.getChild("cube_r6");
        cube_r5 = down3.getChild("cube_r5");
        cube_r4 = down3.getChild("cube_r4");
        cube_r3 = down3.getChild("cube_r3");
        cube_r2 = down3.getChild("cube_r2");
        up3 = right_leg.getChild("up3");
        cube_r1 = up3.getChild("cube_r1");
    }

    public static TexturedModelData getTexturedModelData() {
        ModelData modelData = new ModelData();
        ModelPartData modelPartData = modelData.getRoot();

        /*setRotationAngle(cube_r1, -0.3257F, 0.6286F, -0.196F);

        setRotationAngle(cube_r2, 0.8493F, 0.3488F, 0.1149F);
        setRotationAngle(cube_r3, 1.2856F, 0.3488F, 0.1149F);
        setRotationAngle(cube_r4, 1.2856F, 0.3488F, 0.1149F);
        setRotationAngle(cube_r5, 0.8493F, 0.3488F, 0.1149F);
        setRotationAngle(cube_r6, 0.6404F, 0.3671F, 0.0381F);

        setRotationAngle(cube_r7, 0.0516F, 0.3608F, -0.0792F);
        setRotationAngle(cube_r8, -0.48F, 0.6109F, 0.0F);
        setRotationAngle(cube_r9, 2.2253F, 0.6109F, 0.0F);
        setRotationAngle(cube_r10, 0.0F, 0.6109F, 0.0F);

        setRotationAngle(cube_r11, 0.0F, 0.0F, -0.4363F);
        setRotationAngle(cube_r12, 0.0F, 0.0F, 0.4363F);
        setRotationAngle(cube_r13, 0.5672F, 0.0F, 0.0F);

        setRotationAngle(cube_r15, 0.5236F, 0.0F, 0.0F);
        setRotationAngle(cube_r16, 0.1476F, 0.0934F, -0.5603F);
        setRotationAngle(cube_r17, 0.1745F, 0.0F, 0.0F);
        setRotationAngle(cube_r18, 0.0F, 0.0F, 0.3054F);
        setRotationAngle(cube_r19, 0.0F, 0.0F, -0.2618F);
        setRotationAngle(cube_r20, 0.1551F, -0.0803F, 0.4737F);
        setRotationAngle(cube_r21, -0.2182F, 0.0F, 0.0F);
        setRotationAngle(cube_r22, 0.3927F, 0.0F, 0.0F);

        setRotationAngle(wrist, 0.0F, 1.3526F, 0.0F);

        setRotationAngle(cube_r23, 0.0F, 0.0F, 0.5672F);
        setRotationAngle(cube_r24, 0.0F, 0.0F, 0.2618F);
        setRotationAngle(cube_r25, 0.0251F, -0.0951F, 0.259F);
        setRotationAngle(cube_r26, 0.0254F, 0.1666F, 0.2656F);
        setRotationAngle(cube_r27, 0.0F, 0.0436F, -0.3491F);
        setRotationAngle(cube_r28, 0.0F, 0.3927F, -0.3491F);
        setRotationAngle(cube_r29, 0.0F, 0.0F, -0.3491F);
        setRotationAngle(up2, 0.0F, 0.0F, 0.9163F);
        setRotationAngle(cube_r30, 0.0F, -0.4363F, 0.0F);
        setRotationAngle(cube_r31, 0.0F, -0.6981F, 0.0F);
        setRotationAngle(cube_r32, 0.0F, -0.6981F, 0.0F);
        setRotationAngle(cube_r33, 0.0F, -0.4363F, 0.0F);
        setRotationAngle(down2, 1.2877F, 1.2535F, 1.3011F);

        setRotationAngle(rebra, 0.1745F, 0.0F, 0.0F);

        setRotationAngle(cube_r34, 0.9599F, -0.2443F, 0.0F);
        setRotationAngle(cube_r35, 0.5236F, -0.2443F, 0.0F);
        setRotationAngle(cube_r36, 0.9599F, -0.2443F, 0.0F);
        setRotationAngle(cube_r37, 0.5236F, -0.2443F, 0.0F);
        setRotationAngle(cube_r38, 0.3602F, -0.2483F, -0.0764F);

        setRotationAngle(cube_r39, -0.2618F, 0.0F, 0.0F);
        setRotationAngle(foot, 0.0F, -0.2182F, 0.0F);
        setRotationAngle(cube_r40, 0.0984F, -0.2483F, -0.0764F);
        setRotationAngle(cube_r41, -0.48F, 0.0F, 0.0F);
        setRotationAngle(cube_r42, 2.2253F, 0.0F, 0.0F);

        setRotationAngle(wrist2, 1.0457F, 1.1243F, 1.0892F);

        setRotationAngle(cube_r43, 0.054F, 0.3892F, 0.7088F);
        setRotationAngle(cube_r44, 0.0F, 0.2182F, 0.2618F);
        setRotationAngle(cube_r45, 0.0251F, -0.0951F, 0.259F);
        setRotationAngle(cube_r46, 0.0254F, 0.1666F, 0.2656F);
        setRotationAngle(cube_r47, 0.1407F, 0.3678F, 0.0262F);
        setRotationAngle(cube_r48, 0.0F, 0.3927F, -0.3491F);
        setRotationAngle(cube_r49, 0.0F, 0.0F, -0.3491F);

        setRotationAngle(up4_r1, 0.0F, 0.0F, -0.5236F);
        setRotationAngle(up4_r2, 0.0F, 0.0F, -0.5236F);

        setRotationAngle(down4_r1, 0.1745F, 0.3054F, 0.0F);
        setRotationAngle(down4_r2, 0.1745F, 0.3054F, 0.0F);*/

        ModelPartData modelPartData1 = modelPartData.addChild("VoxelShapes", ModelPartBuilder.create(), ModelTransform.pivot(0.0F,24.0F,0.0F));
        ModelPartData modelPartData2 = modelPartData1.addChild("right_leg", ModelPartBuilder.create(), ModelTransform.pivot(0.0F,0.0F,-1.0F));
        ModelPartData modelPartData3 = modelPartData2.addChild("up3", ModelPartBuilder.create(), ModelTransform.pivot(1.5F,0.0F,-0.1F));
        modelPartData3.addChild("cube_r1", ModelPartBuilder.create().uv(63,2).cuboid(-7.7F, -3.0F, -8.5F, 3.0F, 2.0F, 3.0F).uv(0,61).cuboid(-7.2F, -11.0F, -8.0F, 2.0F, 8.0F, 2.0F).uv(62,44).cuboid(-7.7F, -12.3F, -8.5F, 3.0F, 2.0F, 3.0F), ModelTransform.pivot(3.0F,-16.0F,0.0F));
        ModelPartData modelPartData4 = modelPartData2.addChild("down3", ModelPartBuilder.create(), ModelTransform.pivot(0.0F,0.0F,0.0F));
        modelPartData4.addChild("cube_r2", ModelPartBuilder.create().uv(0,71).cuboid(-1.0F, -0.3F, -0.2F, 1.0F, 1.0F, 3.0F), ModelTransform.pivot(-3.5F,-13.2F,1.0F));
        modelPartData4.addChild("cube_r3", ModelPartBuilder.create().uv(25,73).cuboid(-1.0F, 0.9F, 2.2F, 1.0F, 1.0F, 2.0F), ModelTransform.pivot(-3.5F,-13.2F,1.0F));
        modelPartData4.addChild("cube_r4", ModelPartBuilder.create().uv(70,72).cuboid(-1.0F, 0.9F, 2.2F, 1.0F, 1.0F, 2.0F), ModelTransform.pivot(-3.5F,-15.9F,0.9F));
        modelPartData4.addChild("cube_r5", ModelPartBuilder.create().uv(53,70).cuboid(-1.0F, -0.3F, -0.2F, 1.0F, 1.0F, 3.0F), ModelTransform.pivot(-3.5F,-15.9F,0.9F));
        modelPartData4.addChild("cube_r6", ModelPartBuilder.create().uv(62,27).cuboid(-1.5F, 7.0F, -1.0F, 3.0F, 2.0F, 3.0F).uv(48,59).cuboid(-1.0F, -1.0F, -0.5F, 2.0F, 8.0F, 2.0F), ModelTransform.pivot(-4.7F,-16.7F,-1.2F));
        ModelPartData modelPartData5 = modelPartData2.addChild("foot2", ModelPartBuilder.create(), ModelTransform.pivot(0.0F,0.0F,0.0F));
        modelPartData5.addChild("cube_r7", ModelPartBuilder.create().uv(13,71).cuboid(-2.5F, 7.5F, 3.3F, 2.0F, 2.0F, 2.0F), ModelTransform.pivot(-2.6F,-18.6F,1.1F));
        modelPartData5.addChild("cube_r8", ModelPartBuilder.create().uv(31,73).cuboid(0.4F, 11.7F, 5.4F, 1.0F, 3.0F, 1.0F).uv(35,73).cuboid(-1.4F, 11.7F, 5.4F, 1.0F, 2.0F, 1.0F), ModelTransform.pivot(-2.6F,-19.4F,4.2F));
        modelPartData5.addChild("cube_r9", ModelPartBuilder.create().uv(71,19).cuboid(-1.5F, -8.5F, -10.8F, 3.0F, 2.0F, 1.0F), ModelTransform.pivot(-2.6F,-19.4F,4.2F));
        modelPartData5.addChild("cube_r10", ModelPartBuilder.create().uv(42,71).cuboid(-1.0F, 9.0F, 0.0F, 2.0F, 3.0F, 1.0F), ModelTransform.pivot(-2.6F,-19.4F,4.2F));
        ModelPartData modelPartData6 = modelPartData1.addChild("head", ModelPartBuilder.create(), ModelTransform.pivot(0.0F,0.0F,0.0F));
        ModelPartData modelPartData7 = modelPartData6.addChild("hat", ModelPartBuilder.create().uv(0,0).cuboid(-6.0F, -1.0F, -8.0F, 10.0F, 0.0F, 10.0F).uv(44,8).cuboid(-6.0F, -1.0F, -8.0F, 10.0F, 7.0F, 0.0F).uv(24,43).cuboid(-6.0F, -1.0F, 2.0F, 10.0F, 8.0F, 0.0F).uv(20,16).cuboid(-6.0F, -1.0F, -8.0F, 0.0F, 9.0F, 10.0F).uv(0,16).cuboid(4.0F, -1.0F, -8.0F, 0.0F, 9.0F, 10.0F), ModelTransform.pivot(0.0F,-54.0F,-3.0F));
        modelPartData7.addChild("cube_r11", ModelPartBuilder.create().uv(24,3).cuboid(0.4F, 9.0F, -8.0F, 0.0F, 3.0F, 10.0F), ModelTransform.pivot(0.0F,0.0F,0.0F));
        modelPartData7.addChild("cube_r12", ModelPartBuilder.create().uv(24,0).cuboid(-2.2F, 9.6F, -8.0F, 0.0F, 3.0F, 10.0F), ModelTransform.pivot(0.0F,0.0F,0.0F));
        modelPartData7.addChild("cube_r13", ModelPartBuilder.create().uv(0,49).cuboid(-6.0F, 7.0F, -2.0F, 10.0F, 4.0F, 0.0F), ModelTransform.pivot(0.0F,0.0F,0.0F));
        ModelPartData modelPartData8 = modelPartData6.addChild("main2", ModelPartBuilder.create(), ModelTransform.pivot(0.0F,0.0F,0.0F));
        modelPartData8.addChild("cube_r14", ModelPartBuilder.create().uv(0,10).cuboid(-5.0F, -53.9F, -9.8F, 8.0F, 8.0F, 8.0F), ModelTransform.pivot(0.0F,0.0F,0.0F));
        modelPartData8.addChild("cube_r15", ModelPartBuilder.create().uv(0,11).cuboid(-2.0F, -41.6F, 19.8F, 2.0F, 4.0F, 2.0F), ModelTransform.pivot(0.0F,0.0F,0.0F));
        ModelPartData modelPartData9 = modelPartData1.addChild("cape", ModelPartBuilder.create().uv(24,35).cuboid(-10.0F, -19.1F, -3.3F, 12.0F, 8.0F, 0.0F).uv(0,43).cuboid(-10.0F, -19.6F, 2.1F, 12.0F, 6.0F, 0.0F).uv(30,54).cuboid(2.1F, -19.127F, -3.1501F, 0.0F, 8.0F, 5.0F).uv(20,54).cuboid(-10.1F, -19.127F, -3.1501F, 0.0F, 8.0F, 5.0F), ModelTransform.pivot(3.0F,-16.0F,0.0F));
        modelPartData9.addChild("cube_r16", ModelPartBuilder.create().uv(50,46).cuboid(16.1F, -29.327F, 0.1499F, 0.0F, 8.0F, 5.0F), ModelTransform.pivot(-12.2F,0.0F,0.0F));
        modelPartData9.addChild("cube_r17", ModelPartBuilder.create().uv(10,48).cuboid(2.1F, -26.727F, 0.1499F, 0.0F, 8.0F, 5.0F).uv(0,48).cuboid(14.3F, -26.727F, 0.1499F, 0.0F, 8.0F, 5.0F).uv(0,35).cuboid(2.2F, -27.0F, 5.3F, 12.0F, 8.0F, 0.0F).uv(32,16).cuboid(2.2F, -27.0F, 0.0F, 12.0F, 8.0F, 0.0F), ModelTransform.pivot(-12.2F,0.0F,0.0F));
        modelPartData9.addChild("cube_r18", ModelPartBuilder.create().uv(40,46).cuboid(-13.2F, -7.827F, -3.1501F, 0.0F, 8.0F, 5.0F), ModelTransform.pivot(0.0F,0.0F,0.0F));
        modelPartData9.addChild("cube_r19", ModelPartBuilder.create().uv(30,46).cuboid(5.0F, -10.227F, -3.1501F, 0.0F, 8.0F, 5.0F), ModelTransform.pivot(0.0F,0.0F,0.0F));
        modelPartData9.addChild("cube_r20", ModelPartBuilder.create().uv(20,46).cuboid(-10.4F, -32.627F, 0.1499F, 0.0F, 8.0F, 5.0F), ModelTransform.pivot(0.0F,0.0F,0.0F));
        modelPartData9.addChild("cube_r21", ModelPartBuilder.create().uv(40,24).cuboid(-10.0F, -10.1F, -5.6F, 12.0F, 6.0F, 0.0F), ModelTransform.pivot(0.0F,0.0F,0.0F));
        modelPartData9.addChild("cube_r22", ModelPartBuilder.create().uv(30,0).cuboid(-10.0F, -11.8F, 7.1F, 12.0F, 8.0F, 0.0F), ModelTransform.pivot(0.0F,0.0F,0.0F));
        ModelPartData modelPartData10 = modelPartData1.addChild("left_hand", ModelPartBuilder.create(), ModelTransform.pivot(0.0F,-2.4F,0.0F));
        ModelPartData modelPartData11 = modelPartData10.addChild("wrist", ModelPartBuilder.create(), ModelTransform.pivot(6.2F,7.6F,7.0F));
        modelPartData11.addChild("cube_r23", ModelPartBuilder.create().uv(72,56).cuboid(3.2138F, -46.6662F, 0.904F, 2.0F, 1.0F, 1.0F), ModelTransform.pivot(0.0F,0.0F,0.0F));
        modelPartData11.addChild("cube_r24", ModelPartBuilder.create().uv(65,70).cuboid(13.0677F, -43.5388F, 0.904F, 4.0F, 1.0F, 1.0F), ModelTransform.pivot(0.0F,0.0F,0.0F));
        modelPartData11.addChild("cube_r25", ModelPartBuilder.create().uv(72,1).cuboid(9.951F, -39.5697F, 1.7117F, 3.0F, 1.0F, 1.0F), ModelTransform.pivot(0.0F,0.0F,0.0F));
        modelPartData11.addChild("cube_r26", ModelPartBuilder.create().uv(72,39).cuboid(11.968F, -39.5697F, 5.1767F, 2.0F, 1.0F, 1.0F), ModelTransform.pivot(0.0F,0.0F,0.0F));
        modelPartData11.addChild("cube_r27", ModelPartBuilder.create().uv(70,64).cuboid(32.6541F, -27.0569F, 0.1166F, 4.0F, 1.0F, 1.0F), ModelTransform.pivot(0.0F,0.0F,0.0F));
        modelPartData11.addChild("cube_r28", ModelPartBuilder.create().uv(70,13).cuboid(26.56F, -27.0569F, 11.3858F, 4.0F, 1.0F, 1.0F), ModelTransform.pivot(0.0F,0.0F,0.0F));
        modelPartData11.addChild("cube_r29", ModelPartBuilder.create().uv(48,41).cuboid(30.7746F, -28.1569F, 0.904F, 5.0F, 1.0F, 1.0F), ModelTransform.pivot(0.0F,0.0F,0.0F));
        ModelPartData modelPartData12 = modelPartData10.addChild("up2", ModelPartBuilder.create().uv(48,37).cuboid(5.0F, -40.0F, -2.0F, 8.0F, 2.0F, 2.0F).uv(65,38).cuboid(13.0F, -40.6F, -2.6F, 2.0F, 3.0F, 3.0F), ModelTransform.pivot(-28.8F,-18.4F,-1.3F));
        modelPartData12.addChild("cube_r30", ModelPartBuilder.create().uv(5,70).cuboid(10.5F, -39.8F, -5.3F, 1.0F, 1.0F, 3.0F), ModelTransform.pivot(-3.3F,0.0F,-1.2F));
        modelPartData12.addChild("cube_r31", ModelPartBuilder.create().uv(64,72).cuboid(9.5F, -39.8F, -5.4F, 1.0F, 1.0F, 2.0F), ModelTransform.pivot(-3.3F,0.0F,-1.2F));
        modelPartData12.addChild("cube_r32", ModelPartBuilder.create().uv(72,53).cuboid(9.5F, -39.8F, -5.4F, 1.0F, 1.0F, 2.0F), ModelTransform.pivot(0.0F,0.0F,0.0F));
        modelPartData12.addChild("cube_r33", ModelPartBuilder.create().uv(48,69).cuboid(10.5F, -39.8F, -5.3F, 1.0F, 1.0F, 3.0F), ModelTransform.pivot(0.0F,0.0F,0.0F));
        modelPartData10.addChild("down2", ModelPartBuilder.create().uv(63,64).cuboid(18.2649F, -35.542F, -0.4657F, 2.0F, 3.0F, 3.0F).uv(48,33).cuboid(10.2649F, -34.942F, 0.1343F, 8.0F, 2.0F, 2.0F), ModelTransform.pivot(8.2F,-1.4F,17.8F));
        ModelPartData modelPartData13 = modelPartData1.addChild("body", ModelPartBuilder.create(), ModelTransform.pivot(3.0F,-16.0F,0.0F));
        modelPartData13.addChild("rebra", ModelPartBuilder.create().uv(69,51).cuboid(-3.0F, -19.727F, 4.2499F, 4.0F, 1.0F, 1.0F).uv(26,69).cuboid(1.0F, -19.727F, 1.2499F, 1.0F, 1.0F, 3.0F).uv(71,60).cuboid(-2.0F, -19.727F, 0.2499F, 3.0F, 1.0F, 1.0F).uv(41,69).cuboid(-3.0F, -22.727F, 4.2499F, 4.0F, 1.0F, 1.0F).uv(58,71).cuboid(-2.0F, -22.727F, 0.2499F, 3.0F, 1.0F, 1.0F).uv(58,67).cuboid(1.0F, -22.727F, 1.2499F, 1.0F, 1.0F, 3.0F).uv(71,44).cuboid(-2.0F, -25.727F, 0.2499F, 3.0F, 1.0F, 1.0F).uv(33,67).cuboid(1.0F, -25.727F, 1.2499F, 1.0F, 1.0F, 3.0F).uv(68,17).cuboid(-3.0F, -25.727F, 4.2499F, 4.0F, 1.0F, 1.0F).uv(71,34).cuboid(-9.0F, -19.727F, 0.2499F, 3.0F, 1.0F, 1.0F).uv(26,67).cuboid(-9.0F, -19.727F, 4.2499F, 4.0F, 1.0F, 1.0F).uv(21,67).cuboid(-10.0F, -19.727F, 1.2499F, 1.0F, 1.0F, 3.0F).uv(34,71).cuboid(-9.0F, -22.727F, 0.2499F, 3.0F, 1.0F, 1.0F).uv(13,67).cuboid(-10.0F, -22.727F, 1.2499F, 1.0F, 1.0F, 3.0F).uv(66,32).cuboid(-9.0F, -22.727F, 4.2499F, 4.0F, 1.0F, 1.0F).uv(32,24).cuboid(-9.0F, -25.727F, 0.2499F, 3.0F, 1.0F, 1.0F).uv(66,60).cuboid(-10.0F, -25.727F, 1.2499F, 1.0F, 1.0F, 3.0F).uv(64,49).cuboid(-9.0F, -25.727F, 4.2499F, 4.0F, 1.0F, 1.0F).uv(0,0).cuboid(-5.0F, -27.2F, 3.0F, 2.0F, 9.0F, 2.0F), ModelTransform.pivot(0.0F,0.0F,0.0F));
        modelPartData13.addChild("main", ModelPartBuilder.create().uv(40,30).cuboid(-9.0F, -12.0F, 0.0F, 10.0F, 1.0F, 2.0F).uv(8,61).cuboid(-5.0F, -19.0F, 0.0F, 2.0F, 7.0F, 2.0F), ModelTransform.pivot(0.0F,0.0F,0.0F));
        ModelPartData modelPartData14 = modelPartData1.addChild("left_leg", ModelPartBuilder.create(), ModelTransform.pivot(3.0F,-16.0F,0.0F));
        ModelPartData modelPartData15 = modelPartData14.addChild("down", ModelPartBuilder.create(), ModelTransform.pivot(0.0F,0.0F,0.0F));
        modelPartData15.addChild("cube_r34", ModelPartBuilder.create().uv(72,36).cuboid(-1.0F, 0.9F, 2.2F, 1.0F, 1.0F, 2.0F), ModelTransform.pivot(0.3F,2.7F,0.1F));
        modelPartData15.addChild("cube_r35", ModelPartBuilder.create().uv(53,66).cuboid(-1.0F, -0.3F, -0.2F, 1.0F, 1.0F, 3.0F), ModelTransform.pivot(0.3F,2.7F,0.1F));
        modelPartData15.addChild("cube_r36", ModelPartBuilder.create().uv(21,71).cuboid(-1.0F, 0.9F, 2.2F, 1.0F, 1.0F, 2.0F), ModelTransform.pivot(0.3F,0.0F,0.0F));
        modelPartData15.addChild("cube_r37", ModelPartBuilder.create().uv(66,34).cuboid(-1.0F, -0.3F, -0.2F, 1.0F, 1.0F, 3.0F), ModelTransform.pivot(0.3F,0.0F,0.0F));
        modelPartData15.addChild("cube_r38", ModelPartBuilder.create().uv(60,51).cuboid(-1.5F, 7.0F, -1.0F, 3.0F, 2.0F, 3.0F).uv(40,59).cuboid(-1.0F, -1.0F, -0.5F, 2.0F, 8.0F, 2.0F), ModelTransform.pivot(0.0F,-0.8F,-2.1F));
        ModelPartData modelPartData16 = modelPartData14.addChild("up", ModelPartBuilder.create(), ModelTransform.pivot(0.0F,0.0F,0.0F));
        modelPartData16.addChild("cube_r39", ModelPartBuilder.create().uv(56,15).cuboid(-1.5F, -12.3F, -3.5F, 3.0F, 2.0F, 3.0F).uv(54,0).cuboid(-1.5F, -3.0F, -3.5F, 3.0F, 2.0F, 3.0F).uv(58,57).cuboid(-1.0F, -11.0F, -3.0F, 2.0F, 8.0F, 2.0F), ModelTransform.pivot(0.0F,0.0F,0.0F));
        ModelPartData modelPartData17 = modelPartData14.addChild("foot", ModelPartBuilder.create().uv(71,26).cuboid(-1.0F, 9.0F, 0.0F, 2.0F, 3.0F, 1.0F), ModelTransform.pivot(0.0F,-1.6F,1.0F));
        modelPartData17.addChild("cube_r40", ModelPartBuilder.create().uv(66,56).cuboid(-1.0F, 8.4F, 3.3F, 2.0F, 2.0F, 2.0F), ModelTransform.pivot(0.0F,0.8F,-3.1F));
        modelPartData17.addChild("cube_r41", ModelPartBuilder.create().uv(10,70).cuboid(0.4F, 11.7F, 5.4F, 1.0F, 2.0F, 1.0F).uv(16,63).cuboid(-1.4F, 11.7F, 5.4F, 1.0F, 3.0F, 1.0F), ModelTransform.pivot(0.0F,0.0F,0.0F));
        modelPartData17.addChild("cube_r42", ModelPartBuilder.create().uv(71,7).cuboid(-1.5F, -8.5F, -10.8F, 3.0F, 2.0F, 1.0F), ModelTransform.pivot(0.0F,0.0F,0.0F));
        ModelPartData modelPartData18 = modelPartData1.addChild("right_hand", ModelPartBuilder.create(), ModelTransform.pivot(-12.6F,4.6F,0.0F));
        ModelPartData modelPartData19 = modelPartData18.addChild("wrist2", ModelPartBuilder.create(), ModelTransform.pivot(-11.8F,-10.5F,27.7F));
        modelPartData19.addChild("cube_r43", ModelPartBuilder.create().uv(72,3).cuboid(-0.1F, -53.0F, -0.5F, 2.0F, 1.0F, 1.0F), ModelTransform.pivot(0.0F,0.0F,0.0F));
        modelPartData19.addChild("cube_r44", ModelPartBuilder.create().uv(63,0).cuboid(17.7F, -48.3F, 1.7F, 4.0F, 1.0F, 1.0F), ModelTransform.pivot(0.0F,0.0F,0.0F));
        modelPartData19.addChild("cube_r45", ModelPartBuilder.create().uv(24,16).cuboid(14.3F, -44.4F, -1.5F, 3.0F, 1.0F, 1.0F), ModelTransform.pivot(0.0F,0.0F,0.6F));
        modelPartData19.addChild("cube_r46", ModelPartBuilder.create().uv(14,61).cuboid(17.0F, -44.4F, 3.2F, 2.0F, 1.0F, 1.0F), ModelTransform.pivot(0.0F,0.0F,0.6F));
        modelPartData19.addChild("cube_r47", ModelPartBuilder.create().uv(54,6).cuboid(25.6F, -40.1F, 10.9F, 4.0F, 1.0F, 1.0F), ModelTransform.pivot(0.0F,0.0F,0.0F));
        modelPartData19.addChild("cube_r48", ModelPartBuilder.create().uv(40,33).cuboid(33.7F, -28.8F, 11.2F, 4.0F, 1.0F, 1.0F), ModelTransform.pivot(0.0F,0.0F,0.0F));
        modelPartData19.addChild("cube_r49", ModelPartBuilder.create().uv(30,8).cuboid(37.3F, -29.4F, -2.0F, 5.0F, 1.0F, 1.0F), ModelTransform.pivot(0.0F,0.0F,0.0F));
        ModelPartData modelPartData20 = modelPartData18.addChild("up4", ModelPartBuilder.create(), ModelTransform.pivot(-9.9F,-75.6F,-20.2F));
        modelPartData20.addChild("up4_r1", ModelPartBuilder.create().uv(64,20).cuboid(4.4F, -39.2F, -2.8F, 2.0F, 3.0F, 3.0F), ModelTransform.pivot(22.5F,71.0F,20.2F));
        modelPartData20.addChild("up4_r2", ModelPartBuilder.create().uv(44,47).cuboid(5.6F, -38.7F, -2.3F, 8.0F, 2.0F, 2.0F), ModelTransform.pivot(22.5F,71.0F,20.2F));
        ModelPartData modelPartData21 = modelPartData18.addChild("down4", ModelPartBuilder.create(), ModelTransform.pivot(-22.7F,-15.4F,18.7F));
        modelPartData21.addChild("down4_r1", ModelPartBuilder.create().uv(44,43).cuboid(10.9F, -24.0F, -1.5F, 2.0F, 2.0F, 8.0F), ModelTransform.pivot(8.3F,-0.2F,-18.7F));
        modelPartData21.addChild("down4_r2", ModelPartBuilder.create().uv(64,7).cuboid(10.2F, -24.1F, -2.9F, 3.0F, 3.0F, 2.0F), ModelTransform.pivot(8.3F,-0.2F,-18.7F));

        return TexturedModelData.of(modelData,128,128);
    }

    @Override
    public void setAngles(ghostEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
        //previously the render function, render code was moved to a method below
    }
    @Override
    public void render(MatrixStack matrixStack, VertexConsumer	buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){

        VoxelShapes.render(matrixStack, buffer, packedLight, packedOverlay);
    }
    public void setRotationAngle(ModelPart bone, float x, float y, float z) {
        bone.pitch = x;
        bone.yaw = y;
        bone.roll = z;
    }
}
