package com.meituan.msc.mmpviews.scroll;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class i extends com.meituan.msc.mmpviews.shell.d implements com.meituan.msc.mmpviews.util.a {
    public static ChangeQuickRedirect a;

    /* JADX WARN: Multi-variable type inference failed */
    public i(Context context, boolean z, boolean z2, boolean z3) {
        super(context);
        final c cVar;
        Object[] objArr = {context, Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0), Byte.valueOf(z3 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "46b77030851e5d95946397441b50ea62", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "46b77030851e5d95946397441b50ea62");
            return;
        }
        if (!z) {
            c cVar2 = new c(context, getDelegate());
            cVar2.setScrollEnabled(z2);
            cVar2.addView(new com.meituan.msc.mmpviews.shell.scroll.c(context, getDelegate()));
            cVar2.setOverScrollMode(2);
            cVar = cVar2;
        } else if (z3) {
            MPNestedScrollView mPNestedScrollView = new MPNestedScrollView(context, getDelegate());
            mPNestedScrollView.setScrollEnabled(z2);
            mPNestedScrollView.addView(new com.meituan.msc.mmpviews.shell.scroll.c(context, getDelegate()));
            mPNestedScrollView.setDelegate(getDelegate());
            mPNestedScrollView.setOverScrollMode(2);
            cVar = mPNestedScrollView;
        } else {
            f fVar = new f(context, getDelegate());
            fVar.setScrollEnabled(z2);
            fVar.addView(new com.meituan.msc.mmpviews.shell.scroll.c(context, getDelegate()));
            fVar.setOverScrollMode(2);
            cVar = fVar;
        }
        addView(cVar);
        addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.meituan.msc.mmpviews.scroll.i.1
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                Object[] objArr2 = {view, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(i7), Integer.valueOf(i8)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6e372e3de08fab2401b05da7e56ce545", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6e372e3de08fab2401b05da7e56ce545");
                } else {
                    cVar.layout(0, 0, view.getWidth(), view.getHeight());
                }
            }
        });
    }

    @Override // com.meituan.msc.mmpviews.shell.d, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Object[] objArr = {canvas};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4caa4f8a91e64c3a469ff32ac59707ca", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4caa4f8a91e64c3a469ff32ac59707ca");
            return;
        }
        Rect rect = new Rect();
        com.meituan.msc.mmpviews.shell.f delegate = getDelegate();
        Object[] objArr2 = {rect, this};
        ChangeQuickRedirect changeQuickRedirect2 = com.meituan.msc.mmpviews.shell.e.a;
        if (PatchProxy.isSupport(objArr2, delegate, changeQuickRedirect2, false, "04cf43f430f3e6bfa04d41955f2b198c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, delegate, changeQuickRedirect2, false, "04cf43f430f3e6bfa04d41955f2b198c");
        } else {
            getDrawingRect(rect);
            rect.left += delegate.a();
            rect.top += delegate.b();
            rect.right -= delegate.c();
            rect.bottom -= delegate.d();
        }
        canvas.clipRect(rect);
        super.dispatchDraw(canvas);
    }

    @Override // com.meituan.msc.mmpviews.util.a
    public final int getScrollLeft() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eaa5798b823b58ffcb0ee2e29dfaa52a", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eaa5798b823b58ffcb0ee2e29dfaa52a")).intValue();
        }
        View childAt = getChildAt(0);
        if (childAt == null) {
            return 0;
        }
        return childAt.getScrollX();
    }

    @Override // com.meituan.msc.mmpviews.util.a
    public final int getScrollTop() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c33e9b5460760eec5c1ded4e299db9cc", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c33e9b5460760eec5c1ded4e299db9cc")).intValue();
        }
        View childAt = getChildAt(0);
        if (childAt == null) {
            return 0;
        }
        return childAt.getScrollY();
    }
}
