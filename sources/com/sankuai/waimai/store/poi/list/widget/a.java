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
public final class a extends Drawable {
    public static ChangeQuickRedirect a;
    private int[] b;
    private float c;
    private Paint d;

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    public a(int[] iArr, int i) {
        Object[] objArr = {iArr, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6d75b06f81ddb98eef5244c0582cea0b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6d75b06f81ddb98eef5244c0582cea0b");
            return;
        }
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0078c5c182f118c5eacf089912539a59", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0078c5c182f118c5eacf089912539a59");
            return;
        }
        Path path = new Path();
        Rect bounds = getBounds();
        RectF rectF = new RectF(bounds.left, bounds.bottom - (this.c * 2.0f), bounds.right, bounds.bottom);
        path.addRect(bounds.left, bounds.top, bounds.right, bounds.bottom - this.c, Path.Direction.CW);
        path.addArc(rectF, 0.0f, 180.0f);
        this.d.setShader(new LinearGradient(bounds.left, bounds.top, bounds.right, bounds.bottom, this.b[0], this.b[1], Shader.TileMode.CLAMP));
        canvas.drawPath(path, this.d);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2475e98c0eb968b27d0bd81135975501", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2475e98c0eb968b27d0bd81135975501");
        } else {
            this.d.setAlpha(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(@Nullable ColorFilter colorFilter) {
        Object[] objArr = {colorFilter};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "311976b9372233cfef2a3e52e90b3179", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "311976b9372233cfef2a3e52e90b3179");
        } else {
            this.d.setColorFilter(colorFilter);
        }
    }
}
