package pl.asie.foamfix.coremod.injections.client;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.RenderGlobal;
import net.minecraft.util.math.BlockPos;

public class RenderGlobalImmediateInject extends RenderGlobal {
	public RenderGlobalImmediateInject(Minecraft mcIn) {
		super(mcIn);
	}

	@Override
	public void notifyLightSet(BlockPos blockpos) {
		int i = blockpos.getX();
		int j = blockpos.getY();
		int k = blockpos.getZ();
		this.markBlocksForUpdate(i - 1, j - 1, k - 1, i + 1, j + 1, k + 1, false);
	}
}
