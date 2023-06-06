package com.meituan.msc.mmpviews.shell.scroll;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import com.meituan.msc.mmpviews.shell.e;
import com.meituan.msc.uimanager.l;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class a extends com.meituan.msc.mmpviews.scroll.c {
    public static ChangeQuickRedirect b;
    private final Rect c;
    private final e d;

    @Override // android.widget.HorizontalScrollView, android.view.View, android.view.ViewParent
    @SuppressLint({"MissingSuperCall"})
    public final void requestLayout() {
    }

    public a(Context context, e eVar) {
        super(context, eVar);
        Object[] objArr = {context, eVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f8c2076e54ff22339e46a6866731c3a7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f8c2076e54ff22339e46a6866731c3a7");
            return;
        }
        this.c = new Rect();
        this.d = eVar;
    }

    @Override // com.meituan.msc.mmpviews.scroll.c, android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1f4618136fc0ca7642cbbda572b00cd6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1f4618136fc0ca7642cbbda572b00cd6");
            return;
        }
        l.a(i, i2);
        setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
    }

    @Override // com.meituan.msc.mmpviews.scroll.c, android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c0086d96ba58514cb46abc441800fcd6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c0086d96ba58514cb46abc441800fcd6");
        } else {
            a(getScrollX(), getScrollY());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Object[] objArr = {canvas};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "881d09ce96ae38bf31d42d64bf8b4a07", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "881d09ce96ae38bf31d42d64bf8b4a07");
            return;
        }
        this.d.a(this.c, this);
        canvas.clipRect(this.c);
        super.dispatchDraw(canvas);
    }
}
