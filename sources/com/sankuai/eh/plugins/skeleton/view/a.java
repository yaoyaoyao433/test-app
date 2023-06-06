package com.sankuai.eh.plugins.skeleton.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.eh.plugins.skeleton.view.d;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class a extends View {
    public static ChangeQuickRedirect a;
    d.a b;
    private int c;
    private RectF d;
    private Path e;

    public a(Context context, d.a aVar) {
        super(context);
        Object[] objArr = {context, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8da21302af226f1b926d79667865c488", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8da21302af226f1b926d79667865c488");
            return;
        }
        this.b = aVar;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4e30c3df479d8a3e417339fa16649112", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4e30c3df479d8a3e417339fa16649112");
            return;
        }
        this.e = new Path();
        this.d = new RectF();
        int a2 = com.sankuai.eh.plugins.skeleton.util.b.a(com.sankuai.eh.component.service.utils.b.b(this.b.f.get(com.huawei.hms.opendevice.c.a), ""), this.b.c);
        this.b.a(this);
        setBackgroundColor(a2);
        this.c = this.b.e.get(4).intValue();
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "19a64a133c019d7bf10c5a0bcd2cb78c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "19a64a133c019d7bf10c5a0bcd2cb78c");
            return;
        }
        super.onLayout(z, i, i2, i3, i4);
        this.d.set(0.0f, 0.0f, getWidth(), getHeight());
        this.e.addRoundRect(this.d, this.c, this.c, Path.Direction.CCW);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        Object[] objArr = {canvas};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f67ed3349b9997806807deb4f6b2c2db", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f67ed3349b9997806807deb4f6b2c2db");
            return;
        }
        canvas.clipPath(this.e);
        super.draw(canvas);
    }
}
