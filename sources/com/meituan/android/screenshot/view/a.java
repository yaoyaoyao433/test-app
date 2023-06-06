package com.meituan.android.screenshot.view;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class a extends BitmapDrawable {
    public static ChangeQuickRedirect a;
    private RectF b;
    private Path c;
    private float d;

    private a(Bitmap bitmap, float f) {
        super((Resources) null, bitmap);
        Object[] objArr = {bitmap, Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a0930d38e5041462f54c3743afd474b4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a0930d38e5041462f54c3743afd474b4");
            return;
        }
        this.b = new RectF();
        this.d = f;
        this.c = new Path();
    }

    public static a a(Bitmap bitmap, float f) {
        Object[] objArr = {bitmap, Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "398efe6f0536b8a4872feb10cee4101c", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "398efe6f0536b8a4872feb10cee4101c");
        }
        if (bitmap != null) {
            return new a(bitmap, f);
        }
        return null;
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Object[] objArr = {rect};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4af9b2004cb8a82d64f02024c7c63d9c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4af9b2004cb8a82d64f02024c7c63d9c");
            return;
        }
        this.b.set(rect);
        super.onBoundsChange(rect);
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Object[] objArr = {canvas};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0bad6bb701c62840b0a036823a134b4b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0bad6bb701c62840b0a036823a134b4b");
            return;
        }
        int save = canvas.save();
        this.c.reset();
        this.c.addRoundRect(this.b, this.d, this.d, Path.Direction.CW);
        canvas.clipPath(this.c);
        super.draw(canvas);
        canvas.restoreToCount(save);
    }
}
