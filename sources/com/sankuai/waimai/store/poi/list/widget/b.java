package com.sankuai.waimai.store.poi.list.widget;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b extends Drawable {
    public static ChangeQuickRedirect a;
    private int[] b;
    private float c;
    private Paint d;
    private float[] e;

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    public b(int[] iArr, int i) {
        Object[] objArr = {iArr, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "810102a1aea96934da5dd4b6d77f7568", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "810102a1aea96934da5dd4b6d77f7568");
            return;
        }
        this.e = new float[]{0.0f, 0.5f, 1.0f};
        this.b = iArr;
        this.c = i;
        this.d = new Paint();
        this.d.setStrokeWidth(1.0f);
        this.d.setAntiAlias(true);
        this.d.setStyle(Paint.Style.FILL);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(@NonNull Canvas canvas) {
        Object[] objArr = {canvas};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "406c877bef47f11d1e86bc7aab26cee0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "406c877bef47f11d1e86bc7aab26cee0");
            return;
        }
        Path path = new Path();
        Rect bounds = getBounds();
        RectF rectF = new RectF(bounds.left, bounds.bottom - (this.c * 2.0f), bounds.right, bounds.bottom);
        path.addRect(bounds.left, bounds.top, bounds.right, bounds.bottom - this.c, Path.Direction.CW);
        path.addArc(rectF, 0.0f, 180.0f);
        this.d.setShader(new LinearGradient(bounds.left, bounds.top, bounds.right, bounds.bottom, this.b, this.e, Shader.TileMode.CLAMP));
        canvas.drawPath(path, this.d);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5e066e961ca0bf03e9c45194eb4c64c6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5e066e961ca0bf03e9c45194eb4c64c6");
        } else {
            this.d.setAlpha(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(@Nullable ColorFilter colorFilter) {
        Object[] objArr = {colorFilter};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fc72c3e3633fcf468610b97bfd90a296", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fc72c3e3633fcf468610b97bfd90a296");
        } else {
            this.d.setColorFilter(colorFilter);
        }
    }
}
