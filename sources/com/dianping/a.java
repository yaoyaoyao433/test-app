package com.dianping;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import com.dianping.picasso.PicassoCanvasClipper;
import com.dianping.picasso.model.params.PicassoModelParams;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class a extends PicassoCanvasClipper {
    public static ChangeQuickRedirect a;

    @Override // com.dianping.picasso.PicassoCanvasClipper
    public final void setViewParam(View view, PicassoModelParams picassoModelParams) {
        Object[] objArr = {view, picassoModelParams};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "48fc706420b54725457dd3eed545af29", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "48fc706420b54725457dd3eed545af29");
            return;
        }
        this.mParams = picassoModelParams;
        setCornerPath();
        if (picassoModelParams.sdOpacity <= 0.0f || !(view.getParent() instanceof ViewGroup)) {
            return;
        }
        ((ViewGroup) view.getParent()).setClipChildren(false);
    }

    @Override // com.dianping.picasso.PicassoCanvasClipper
    public final void drawShadow(Canvas canvas, View view) {
        Object[] objArr = {canvas, view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "337031b3d1702bc77b827ebe768f9a56", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "337031b3d1702bc77b827ebe768f9a56");
        } else if (this.mParams == null || this.mParams.sdOpacity <= 0.0f) {
        } else {
            Paint paint = new Paint();
            paint.setColor(this.mParams.borderColor);
            paint.setStrokeWidth(this.mParams.borderWidth);
            paint.setStyle(Paint.Style.FILL);
            paint.setAntiAlias(true);
            paint.setShadowLayer(this.mParams.sdRadius, this.mParams.sdOffsetX, this.mParams.sdOffsetY, this.mParams.sdColor);
            canvas.drawRoundRect(new RectF(0.0f, 0.0f, this.mParams.width, this.mParams.height), this.mParams.cornerRadius + (this.mParams.borderWidth / 2), this.mParams.cornerRadius + (this.mParams.borderWidth / 2), paint);
        }
    }
}
