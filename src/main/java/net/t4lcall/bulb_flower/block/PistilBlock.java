package net.t4lcall.bulb_flower.block;

import net.minecraft.block.*;
import net.minecraft.entity.AreaEffectCloudEntity;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;

import java.util.List;

public class PistilBlock extends FlowerBlock {
    private final StatusEffect blockEffects;
    private final List<SuspiciousStewIngredient.StewEffect> stewEffects;
    public PistilBlock(StatusEffect suspiciousStewEffect, int effectDuration, Settings settings) {
        super(suspiciousStewEffect, effectDuration, settings);
        this.blockEffects = suspiciousStewEffect;
        int i = suspiciousStewEffect.isInstant() ? effectDuration : effectDuration * 20;
        this.stewEffects = List.of(new SuspiciousStewIngredient.StewEffect(suspiciousStewEffect, i));
    }
    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context){
        return VoxelShapes.cuboid(0f, 0f, 0f, 1f, 0.3125f, 1f);
    }
    @Override
    protected boolean canPlantOnTop(BlockState floor, BlockView world, BlockPos pos) {
        return floor.isOpaqueFullCube(world, pos);
    }

    @Override
    public void onEntityCollision(BlockState state, World world, BlockPos pos, Entity entity) {
        LivingEntity livingEntity;
        if (entity instanceof LivingEntity && !((livingEntity = (LivingEntity)entity).isSneaking() || (entity.getType().equals(EntityType.ENDERMAN)))) {
            livingEntity.addStatusEffect(new StatusEffectInstance(this.blockEffects, 100));
        }
    }
    public void onBreak(World world, BlockPos pos, BlockState state, PlayerEntity player) {
        if(!player.getMainHandStack().isIn(ItemTags.HOES)) {
                AreaEffectCloudEntity areaEffectCloudEntity = new AreaEffectCloudEntity(world, pos.getX(), pos.getY(), pos.getZ());
                areaEffectCloudEntity.setRadius(2.5f);
                areaEffectCloudEntity.setRadiusOnUse(-0.5f);
                areaEffectCloudEntity.setWaitTime(10);
                areaEffectCloudEntity.setDuration(areaEffectCloudEntity.getDuration() / 2);
                areaEffectCloudEntity.setRadiusGrowth(-areaEffectCloudEntity.getRadius() / (float)areaEffectCloudEntity.getDuration());
                areaEffectCloudEntity.addEffect(new StatusEffectInstance(this.blockEffects));
                world.spawnEntity(areaEffectCloudEntity);
        }
        super.onBreak(world, pos, this.getDefaultState(), player);
    }
    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        if(player.getMainHandStack().isEmpty()) {
            AreaEffectCloudEntity areaEffectCloudEntity = new AreaEffectCloudEntity(world, pos.getX() + 0.5f, pos.getY(), pos.getZ() + 0.5f);
            areaEffectCloudEntity.setRadius(1.5f);
            areaEffectCloudEntity.setRadiusOnUse(-0.5f);
            areaEffectCloudEntity.setWaitTime(6);
            areaEffectCloudEntity.setDuration(areaEffectCloudEntity.getDuration() / 2);
            areaEffectCloudEntity.setRadiusGrowth(-areaEffectCloudEntity.getRadius() / (float) areaEffectCloudEntity.getDuration());
            areaEffectCloudEntity.addEffect(new StatusEffectInstance(this.blockEffects));
            world.spawnEntity(areaEffectCloudEntity);
            return ActionResult.success(world.isClient);
        }
        return super.onUse(state, world, pos, player, hand, hit);
    }
    @Override
    public List<SuspiciousStewIngredient.StewEffect> getStewEffects() {
        return this.stewEffects;
    }
}
