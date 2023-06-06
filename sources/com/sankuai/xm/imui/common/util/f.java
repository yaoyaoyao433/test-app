package com.sankuai.xm.imui.common.util;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.Observable;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class f extends Observable implements ViewTreeObserver.OnGlobalLayoutListener {
    public static ChangeQuickRedirect a;
    public Activity b;
    public int c;
    public boolean d;
    public boolean e;
    private boolean f;
    private int g;
    private View h;
    private int i;
    private ViewGroup.LayoutParams j;
    private int k;
    private int l;

    public f(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c71045f4a8f7c972adb293844bf02185", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c71045f4a8f7c972adb293844bf02185");
            return;
        }
        this.l = 0;
        this.b = activity;
        if (activity != null) {
            activity.getWindow().getDecorView().getViewTreeObserver().addOnGlobalLayoutListener(this);
            Rect rect = new Rect();
            this.b.getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
            this.l = rect.bottom;
            this.f = k.a(this.b);
            this.g = k.a((Context) this.b);
            this.h = activity.findViewById(16908290);
            this.j = this.h.getLayoutParams();
            this.k = this.j.height;
        }
        this.c = com.sankuai.xm.base.e.a().getInt("xm_sdk_keyboard_height", 0);
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e7bd1afb7c7ecd500a2386eef2cb5e0a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e7bd1afb7c7ecd500a2386eef2cb5e0a");
        } else if (this.j == null || !this.f) {
        } else {
            this.j.height = this.g - this.c;
            this.h.requestLayout();
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int i;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5b9b42dfc3b3df50a6800b4bca36d36a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5b9b42dfc3b3df50a6800b4bca36d36a");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a287efb671e6610bd2e96ca5ba3b58e4", 6917529027641081856L)) {
            i = ((Integer) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a287efb671e6610bd2e96ca5ba3b58e4")).intValue();
        } else {
            Rect rect = new Rect();
            this.b.getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
            this.l = Math.max(this.l, rect.bottom);
            if (this.l > this.g) {
                i = this.g - (rect.bottom - rect.top);
            } else {
                i = this.g - rect.bottom;
            }
        }
        this.e = i > 0;
        if (i == this.i) {
            return;
        }
        this.i = i;
        if (this.f) {
            int i2 = i > 0 ? this.g - i : this.k;
            if (this.j.height != i2) {
                this.j.height = i2;
                this.h.requestLayout();
            }
        }
        if (this.d) {
            if (i > 0 && this.c != i) {
                this.c = i;
                com.sankuai.xm.base.e.a().edit().putInt("xm_sdk_keyboard_height", i).apply();
            }
            setChanged();
            notifyObservers(Integer.valueOf(i));
        }
    }

    public final int a(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "18a66718cbdc469f5fa087e00980f7df", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "18a66718cbdc469f5fa087e00980f7df")).intValue();
        }
        Rect rect = new Rect();
        view.getRootView().getWindowVisibleDisplayFrame(rect);
        if (this.l > this.g) {
            return this.g - (rect.bottom - rect.top);
        }
        return this.g - rect.bottom;
    }
}
