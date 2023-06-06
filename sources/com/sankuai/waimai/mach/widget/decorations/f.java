package com.sankuai.waimai.mach.widget.decorations;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class f implements c {
    public static ChangeQuickRedirect a;
    private Paint b;
    private b c;
    private Path d;

    public f(b bVar, int i, int i2, float[] fArr) {
        Object[] objArr = {bVar, Integer.valueOf(i), Integer.valueOf(i2), fArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "950fc6864404daae812b8f47a5e07f61", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "950fc6864404daae812b8f47a5e07f61");
            return;
        }
        this.c = bVar;
        this.b = new Paint();
        this.b.setColor(this.c.d);
        this.b.setAntiAlias(true);
        this.b.setShadowLayer(this.c.e, this.c.b, this.c.c, this.c.d);
        RectF rectF = new RectF(this.c.b, this.c.c, i - this.c.b, i2 - this.c.c);
        this.d = new Path();
        this.d.addRoundRect(rectF, fArr, Path.Direction.CW);
    }

    @Override // com.sankuai.waimai.mach.widget.decorations.c
    public final void draw(Canvas canvas) {
        Object[] objArr = {canvas};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "625c8b70b0b91bec0c88972c2dc669f8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "625c8b70b0b91bec0c88972c2dc669f8");
        } else {
            canvas.drawPath(this.d, this.b);
        }
    }
}
