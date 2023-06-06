package com.sankuai.waimai.business.page.home.widget.gradient;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a extends GradientDrawable {
    public static ChangeQuickRedirect a;
    private float b;
    private float c;
    private double d;
    private double e;

    public a(GradientDrawable.Orientation orientation, int[] iArr, float f) {
        super(orientation, iArr);
        Object[] objArr = {orientation, iArr, Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5a33f7a2b204104eaa676b3d29374907", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5a33f7a2b204104eaa676b3d29374907");
            return;
        }
        Object[] objArr2 = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ab0ee910642274df452fc702e13c2b73", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ab0ee910642274df452fc702e13c2b73");
            return;
        }
        this.c = f;
        this.b = (float) ((f / 180.0f) * 3.141592653589793d);
        this.d = Math.abs(Math.sin(this.b));
        this.e = Math.abs(Math.cos(this.b));
    }

    @Override // android.graphics.drawable.GradientDrawable, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Object[] objArr = {canvas};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b513281bfca56cea84a3ae8f73d0745d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b513281bfca56cea84a3ae8f73d0745d");
            return;
        }
        canvas.save();
        Rect bounds = getBounds();
        double height = ((bounds.height() * this.d) + (bounds.width() * this.e)) / bounds.width();
        double height2 = ((bounds.height() * this.e) + (bounds.width() * this.d)) / bounds.height();
        canvas.rotate(this.c, bounds.centerX(), bounds.centerY());
        canvas.scale((float) height, (float) height2, bounds.centerX(), bounds.centerY());
        super.draw(canvas);
        canvas.restore();
    }
}
