package cf.witcheskitchen.mixin.client;

import cf.witcheskitchen.common.item.WKSeedItem;
import cf.witcheskitchen.common.util.TypeHelper;
import net.minecraft.client.font.TextRenderer;
import net.minecraft.client.gui.hud.InGameHud;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.item.ItemStack;
import net.minecraft.text.MutableText;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.LocalCapture;

@Mixin(InGameHud.class)
public abstract class InGameHudMixin {

    @Shadow public abstract TextRenderer getTextRenderer();

    @Shadow private int scaledWidth;

    @Shadow private ItemStack currentStack;

    @Inject(method = "renderHeldItemTooltip", at = @At(value = "INVOKE", target = "Lnet/minecraft/client/gui/hud/InGameHud;getTextRenderer()Lnet/minecraft/client/font/TextRenderer;", ordinal = 1), locals = LocalCapture.CAPTURE_FAILHARD)
    private void wk$renderTypeColor(MatrixStack matrices, CallbackInfo ci, MutableText mutableText, int i, int x, int y, int l){
        if(this.currentStack.getItem() instanceof WKSeedItem){
            MutableText text = TypeHelper.getTypeText(this.currentStack);
            if(text != null){
                int io = this.getTextRenderer().getWidth(text);
                int xo = (this.scaledWidth - io) / 2;
                this.getTextRenderer().drawWithShadow(matrices, text, (float)xo, (float)y + 9, 16777215 + (l << 24));
            }
        }
    }
}
