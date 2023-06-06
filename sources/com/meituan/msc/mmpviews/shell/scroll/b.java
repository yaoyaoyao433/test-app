package com.meituan.msc.mmpviews.shell.scroll;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import com.meituan.msc.mmpviews.scroll.f;
import com.meituan.msc.mmpviews.shell.e;
import com.meituan.msc.uimanager.l;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class b extends f {
    public static ChangeQuickRedirect b;
    private final Rect c;
    private final e d;

    @Override // android.widget.ScrollView, android.view.View, android.view.ViewParent
    @SuppressLint({"MissingSuperCall"})
    public final void requestLayout() {
    }

    public b(Context context, e eVar) {
        super(context, eVar);
        Object[] objArr = {context, eVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5a35187b669af3c9e1099403fc9d038d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5a35187b669af3c9e1099403fc9d038d");
            return;
        }
        this.c = new Rect();
        this.d = eVar;
    }

    @Override // com.meituan.msc.mmpviews.scroll.f, android.widget.ScrollView, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "32730fc7c138b0f38d10d0df5457bf59", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "32730fc7c138b0f38d10d0df5457bf59");
            return;
        }
        l.a(i, i2);
        setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
    }

    @Override // com.meituan.msc.mmpviews.scroll.f, android.widget.ScrollView, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "64f930022bf525552b2284ce65226035", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "64f930022bf525552b2284ce65226035");
        } else {
            a(getScrollX(), getScrollY());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Object[] objArr = {canvas};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b93ff3ae4841317b20ef4bc8ee1bc83b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b93ff3ae4841317b20ef4bc8ee1bc83b");
            return;
        }
        this.d.a(this.c, this);
        canvas.clipRect(this.c);
        super.dispatchDraw(canvas);
    }
}
