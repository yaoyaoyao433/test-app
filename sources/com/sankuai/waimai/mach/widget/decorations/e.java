package com.sankuai.waimai.mach.widget.decorations;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Region;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class e implements c {
    public static ChangeQuickRedirect a;
    private Bitmap b;
    private b c;

    public e(b bVar, int i, int i2, float[] fArr) {
        Object[] objArr = {bVar, Integer.valueOf(i), Integer.valueOf(i2), fArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "88d17344e6179169e288c595bf8880ed", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "88d17344e6179169e288c595bf8880ed");
            return;
        }
        this.c = bVar;
        int i3 = bVar.e;
        int i4 = i3 * 2;
        try {
            this.b = Bitmap.createBitmap(i + i4, i2 + i4, Bitmap.Config.ARGB_4444);
            if (this.b == null) {
                return;
            }
            Canvas canvas = new Canvas(this.b);
            Paint paint = new Paint();
            paint.setAntiAlias(true);
            paint.setColor(bVar.d);
            paint.setStyle(Paint.Style.FILL);
            paint.setShadowLayer(bVar.e, bVar.b, bVar.c, bVar.d);
            Path path = new Path();
            float f = i3;
            path.addRoundRect(new RectF(f, f, i + i3, i2 + i3), fArr, Path.Direction.CW);
            canvas.translate(-bVar.b, -bVar.c);
            canvas.clipPath(path, Region.Op.DIFFERENCE);
            canvas.drawPath(path, paint);
        } catch (Throwable unused) {
        }
    }

    @Override // com.sankuai.waimai.mach.widget.decorations.c
    public final void draw(Canvas canvas) {
        Object[] objArr = {canvas};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ce0024b164c62d5365c830b2a6fa5414", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ce0024b164c62d5365c830b2a6fa5414");
        } else if (this.b == null || this.b.isRecycled() || this.c == null) {
        } else {
            canvas.drawBitmap(this.b, (-this.c.e) + this.c.b, (-this.c.e) + this.c.c, (Paint) null);
        }
    }
}
