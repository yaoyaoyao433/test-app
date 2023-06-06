package com.meituan.msc.mmpviews.shell.scroll;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.support.v4.internal.view.SupportMenu;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.msc.mmpviews.shell.e;
import com.meituan.msc.uimanager.l;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class c extends ViewGroup implements View.OnLayoutChangeListener {
    public static ChangeQuickRedirect a;
    private View b;
    private View c;
    private int d;
    private int e;
    private boolean f;
    private final e g;

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    @Override // android.view.View, android.view.ViewParent
    @SuppressLint({"MissingSuperCall"})
    public final void requestLayout() {
    }

    public c(Context context, e eVar) {
        super(context);
        Object[] objArr = {context, eVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7ac56c93d74c8d49f09fca0c23e66660", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7ac56c93d74c8d49f09fca0c23e66660");
            return;
        }
        this.f = true;
        this.g = eVar;
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e03f2787effa6e690fab734897bf5e82", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e03f2787effa6e690fab734897bf5e82");
            return;
        }
        l.a(i, i2);
        setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Object[] objArr = {canvas};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9d70d7d03188fdd3203dcbf352be32c3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9d70d7d03188fdd3203dcbf352be32c3");
            return;
        }
        super.onDraw(canvas);
        Paint paint = new Paint();
        paint.setColor(SupportMenu.CATEGORY_MASK);
        paint.setStyle(Paint.Style.FILL);
        paint.setStrokeWidth(10.0f);
        canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
    }

    @Override // android.view.ViewGroup
    public final void onViewRemoved(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "06125707ca6bbc4d552288f1f0a71222", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "06125707ca6bbc4d552288f1f0a71222");
            return;
        }
        super.onViewRemoved(view);
        view.removeOnLayoutChangeListener(this);
        if (this.f) {
            if (view == this.b || view == this.c) {
                c();
                d();
            }
        }
    }

    @Override // android.view.ViewGroup
    public final void removeAllViews() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e9a3806a5716b602ae60e3052eb7e550", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e9a3806a5716b602ae60e3052eb7e550");
            return;
        }
        a();
        b();
        this.f = false;
        super.removeAllViews();
        this.f = true;
        d();
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "af096b24ac2376b36e90773aa6a2e091", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "af096b24ac2376b36e90773aa6a2e091");
            return;
        }
        super.onViewAdded(view);
        if (view.getWidth() > 0 && view.getHeight() > 0) {
            c(view);
        }
        view.addOnLayoutChangeListener(this);
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        Object[] objArr = {view, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(i7), Integer.valueOf(i8)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c472734a9663bbceb2033e4941f2409d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c472734a9663bbceb2033e4941f2409d");
        } else {
            c(view);
        }
    }

    private void a() {
        this.b = null;
        this.d = 0;
    }

    private void b() {
        this.c = null;
        this.e = 0;
    }

    private void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4472081d93850bc06ae62e1b3f524c27", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4472081d93850bc06ae62e1b3f524c27");
            return;
        }
        a();
        b();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getWidth() > 0 && childAt.getHeight() > 0) {
                int e = e(childAt);
                int d = d(childAt);
                if (e > this.e) {
                    this.e = e;
                    this.c = childAt;
                }
                if (d > this.d) {
                    this.d = d;
                    this.b = childAt;
                }
            }
        }
    }

    private void a(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6f973d5d0e5d85468965a08508aef983", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6f973d5d0e5d85468965a08508aef983");
            return;
        }
        int d = d(view);
        if (this.b == null) {
            this.b = view;
            this.d = d;
        } else if (d > this.d) {
            this.d = d;
            this.b = view;
        }
    }

    private void b(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f8f68f5f0545b8a27bfb35920ee20061", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f8f68f5f0545b8a27bfb35920ee20061");
            return;
        }
        int e = e(view);
        if (this.c == null) {
            this.c = view;
            this.e = e;
        } else if (e > this.e) {
            this.e = e;
            this.c = view;
        }
    }

    private void c(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a28ab0bc042c0ba9fab5c949e21c4aef", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a28ab0bc042c0ba9fab5c949e21c4aef");
            return;
        }
        if (view == this.c || view == this.b) {
            c();
        } else {
            a(view);
            b(view);
        }
        d();
    }

    private void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "17c5c0893e0af0edfb33213d2a210b50", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "17c5c0893e0af0edfb33213d2a210b50");
            return;
        }
        int i = this.d;
        if (this.g != null) {
            i += this.g.c();
        }
        int i2 = this.e;
        if (this.g != null) {
            i2 += this.g.d();
        }
        layout(0, 0, i, i2);
    }

    private int d(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ea7b1c0d743d738d86a1f8b5f330fb9a", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ea7b1c0d743d738d86a1f8b5f330fb9a")).intValue();
        }
        if (view instanceof com.meituan.msc.mmpviews.shell.a) {
            return view.getRight() + ((com.meituan.msc.mmpviews.shell.a) view).getDelegate().g();
        }
        return view.getRight();
    }

    private int e(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9a558fb2c5aef397c6c684727e53189e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9a558fb2c5aef397c6c684727e53189e")).intValue();
        }
        if (view instanceof com.meituan.msc.mmpviews.shell.a) {
            return view.getBottom() + ((com.meituan.msc.mmpviews.shell.a) view).getDelegate().h();
        }
        return view.getBottom();
    }
}
