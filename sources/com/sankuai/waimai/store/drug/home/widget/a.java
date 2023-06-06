package com.sankuai.waimai.store.drug.home.widget;

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
    private boolean e;

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    public a(int[] iArr, int i, boolean z) {
        Object[] objArr = {iArr, 0, (byte) 1};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "986c777b3756ab92b3ca56b8f874e140", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "986c777b3756ab92b3ca56b8f874e140");
            return;
        }
        this.b = iArr;
        this.c = 0.0f;
        this.d = new Paint();
        this.d.setStrokeWidth(1.0f);
        this.d.setAntiAlias(true);
        this.d.setStyle(Paint.Style.FILL);
        this.e = true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(@NonNull Canvas canvas) {
        Object[] objArr = {canvas};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c31f78d210e2c317f56f224bd79425a1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c31f78d210e2c317f56f224bd79425a1");
            return;
        }
        Path path = new Path();
        Rect bounds = getBounds();
        RectF rectF = new RectF(bounds.left, bounds.bottom - (this.c * 2.0f), bounds.right, bounds.bottom);
        path.addRect(bounds.left, bounds.top, bounds.right, bounds.bottom - this.c, Path.Direction.CW);
        path.addArc(rectF, 0.0f, 180.0f);
        if (this.e) {
            this.d.setShader(new LinearGradient(bounds.left, bounds.top, bounds.left, bounds.bottom, this.b[0], this.b[1], Shader.TileMode.CLAMP));
        } else {
            this.d.setShader(new LinearGradient(bounds.left, bounds.top, bounds.right, bounds.bottom, this.b[0], this.b[1], Shader.TileMode.CLAMP));
        }
        canvas.drawPath(path, this.d);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b99c134050f5b17468c750b7eedfe5b4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b99c134050f5b17468c750b7eedfe5b4");
        } else {
            this.d.setAlpha(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(@Nullable ColorFilter colorFilter) {
        Object[] objArr = {colorFilter};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "43d3edb8ac1c53bbdcdd9033e49d48d6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "43d3edb8ac1c53bbdcdd9033e49d48d6");
        } else {
            this.d.setColorFilter(colorFilter);
        }
    }
}
