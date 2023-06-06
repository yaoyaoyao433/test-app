package com.sankuai.waimai.platform.widget.roundview;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.g;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class RoundCornerImageView extends ImageView {
    public static ChangeQuickRedirect a;
    private float[] b;

    public RoundCornerImageView(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e1038f39a9e3cca3032d1f8d6bd3f7fb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e1038f39a9e3cca3032d1f8d6bd3f7fb");
        } else {
            a(context);
        }
    }

    public RoundCornerImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f0276e02171965a67d666cdf1b511480", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f0276e02171965a67d666cdf1b511480");
        } else {
            a(context);
        }
    }

    public RoundCornerImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f6090df0b0eb973a516c6b462488f916", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f6090df0b0eb973a516c6b462488f916");
        } else {
            a(context);
        }
    }

    private void a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8c3428b3f449c90f7215165682abf70c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8c3428b3f449c90f7215165682abf70c");
            return;
        }
        float a2 = g.a(context, 2.0f);
        this.b = new float[]{a2, a2, a2, a2, 0.0f, 0.0f, 0.0f, 0.0f};
    }

    @Override // android.widget.ImageView, android.view.View
    @SuppressLint({"DrawAllocation"})
    public void onDraw(Canvas canvas) {
        Object[] objArr = {canvas};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6a3bead6dc9a75ec4eba941c4ce64f80", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6a3bead6dc9a75ec4eba941c4ce64f80");
            return;
        }
        Path path = new Path();
        path.addRoundRect(new RectF(0.0f, 0.0f, getWidth(), getHeight()), this.b, Path.Direction.CW);
        canvas.clipPath(path);
        super.onDraw(canvas);
    }
}
