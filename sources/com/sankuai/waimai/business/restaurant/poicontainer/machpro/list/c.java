package com.sankuai.waimai.business.restaurant.poicontainer.machpro.list;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.View;
import android.view.ViewParent;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.widget.smoothnestedscroll.core.e;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class c {
    public static ChangeQuickRedirect a;
    @NonNull
    final View b;
    @NonNull
    final Context c;
    @NonNull
    final a d;

    public c(@NonNull View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "42d3d3426c95905f4c2608edf344e171", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "42d3d3426c95905f4c2608edf344e171");
            return;
        }
        this.d = new a();
        this.b = view;
        this.c = this.b.getContext();
    }

    public final void a(View view, int i, int i2, int i3, int i4, com.sankuai.waimai.platform.widget.smoothnestedscroll.core.c cVar) {
        Object[] objArr = {view, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f0435958c7164c044d208ef37e3156a6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f0435958c7164c044d208ef37e3156a6");
            return;
        }
        if (i2 != 0 || i4 != 0) {
            for (ViewParent parent = this.b.getParent(); parent != null; parent = parent.getParent()) {
                if (parent instanceof e) {
                    ((e) parent).a(view, i, i2, i3, i4, cVar);
                    return;
                }
            }
        }
        cVar.a(view, i, i2, i3, i4);
    }

    public final void a(View view, int i, int i2, int i3, int i4) {
        Object[] objArr = {view, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d5b4e68e20d7793f8e5d4d1e34280c58", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d5b4e68e20d7793f8e5d4d1e34280c58");
        } else if (i2 != 0 || i4 != 0) {
            for (ViewParent parent = this.b.getParent(); parent != null; parent = parent.getParent()) {
                if (parent instanceof e) {
                    ((e) parent).b(view, i, i2, i3, i4);
                    return;
                }
            }
        }
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c1fec8feca7a3751d2c9de0e22f8ebb8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c1fec8feca7a3751d2c9de0e22f8ebb8");
        } else {
            this.d.cancel();
        }
    }
}
