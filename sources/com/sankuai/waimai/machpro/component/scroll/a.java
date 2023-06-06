package com.sankuai.waimai.machpro.component.scroll;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.HorizontalScrollView;
import android.widget.OverScroller;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.reflect.Field;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a extends HorizontalScrollView {
    public static ChangeQuickRedirect a;
    private boolean b;
    private boolean c;
    private OverScroller d;
    private b e;
    private boolean f;

    public a(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4bc22a5b3fd01de035250323a8e530d4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4bc22a5b3fd01de035250323a8e530d4");
            return;
        }
        this.b = false;
        this.c = false;
        this.f = true;
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c6bb4d4aefa426757dc301e5538b94ae", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c6bb4d4aefa426757dc301e5538b94ae");
            return;
        }
        try {
            if (this.d != null) {
                return;
            }
            Field declaredField = HorizontalScrollView.class.getDeclaredField("mScroller");
            declaredField.setAccessible(true);
            this.d = (OverScroller) declaredField.get(this);
        } catch (Exception e) {
            com.sankuai.waimai.machpro.util.a.a("MPHorizontalScrollView call initScroller failed！ | " + e.getMessage());
        }
    }

    public final void setScrollEnbaled(boolean z) {
        this.f = z;
    }

    public final void setScrollListener(b bVar) {
        this.e = bVar;
    }

    @Override // android.view.View
    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5adf4d8a803945cd4485e7d5638e85ea", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5adf4d8a803945cd4485e7d5638e85ea");
            return;
        }
        super.onScrollChanged(i, i2, i3, i4);
        if (!this.c) {
            this.c = true;
        }
        if (this.e != null) {
            this.e.a(this, i, i2, i3, i4);
        }
    }

    private void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "476e9fa5ab0f7e5c368b6d4419bc7835", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "476e9fa5ab0f7e5c368b6d4419bc7835");
        } else if (this.b || !this.c || this.d == null || !this.d.isFinished()) {
        } else {
            this.c = false;
            if (this.e != null) {
                this.e.a();
            }
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8a7fc16beb6375eb2ddedbe31464f627", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8a7fc16beb6375eb2ddedbe31464f627")).booleanValue();
        }
        if (this.f) {
            if (this.e != null) {
                this.e.a(true);
            }
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            switch (motionEvent.getActionMasked()) {
                case 0:
                case 2:
                    this.b = true;
                    break;
                case 1:
                case 3:
                    if (this.e != null) {
                        this.e.a(false);
                    }
                    this.b = false;
                    b();
                    break;
            }
            return onTouchEvent;
        }
        return false;
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public final void computeScroll() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1a7d17499f5d1bda194858a65c0639bf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1a7d17499f5d1bda194858a65c0639bf");
            return;
        }
        super.computeScroll();
        b();
    }
}
