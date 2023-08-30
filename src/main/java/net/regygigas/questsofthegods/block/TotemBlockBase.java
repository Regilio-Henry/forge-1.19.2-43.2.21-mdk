package net.regygigas.questsofthegods.block;

import net.minecraft.core.BlockPos;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;
import net.regygigas.questsofthegods.Item.ModItems;

public class TotemBlockBase extends Block
{
    public  TotemBlockBase(Properties properties)
    {
        super( properties);
    }

    @SuppressWarnings("deprecation")
    @Override
    public InteractionResult use(BlockState state, Level world, BlockPos pos, Player player, InteractionHand hand, BlockHitResult hit) {

        if (!world.isClientSide())
        {
            if( hand == InteractionHand.MAIN_HAND)
            {
                System.out.println("I've been right clicked");

                player.getInventory().add( new ItemStack(ModItems.RESTROTOTEM.get()));

                return InteractionResult.sidedSuccess(world.isClientSide());
            }

            return InteractionResult.CONSUME;
        }

        return super.use(state, world, pos, player, hand, hit);


    }
}
