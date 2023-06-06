package com.dianping.picassomodule.widget.scroll;

import android.content.Context;
import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import com.dianping.picassomodule.widget.scroll.ScrollView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class e {
    public static ChangeQuickRedirect a;
    Context b;
    RecyclerView c;
    d d;
    a e;

    public e(Context context, RecyclerView recyclerView) {
        Object[] objArr = {context, recyclerView};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "56b35d6951ca8cb60e4e33465138d955", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "56b35d6951ca8cb60e4e33465138d955");
            return;
        }
        this.b = context;
        this.c = recyclerView;
    }

    public final void a(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4504060b45e6c897632edf4394a2e845", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4504060b45e6c897632edf4394a2e845");
        } else {
            this.d.b(i, i2);
        }
    }

    public final void a(int i, int i2, int i3, int i4) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cd7dbc24d5f0e8d67069f6d41627ecfc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cd7dbc24d5f0e8d67069f6d41627ecfc");
        } else {
            this.d.a(i, i2, i3, i4);
        }
    }

    public final Rect a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7af913acdb852b275f3e78052c8915a9", RobustBitConfig.DEFAULT_VALUE) ? (Rect) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7af913acdb852b275f3e78052c8915a9") : this.d.a();
    }

    public final void a(ScrollView.f fVar) {
        Object[] objArr = {fVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "061fccd4b1011c372ac386e789b2db8c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "061fccd4b1011c372ac386e789b2db8c");
            return;
        }
        int a2 = fVar.a();
        this.d.a(fVar);
        this.d.c(a2);
    }

    public final void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2a0df7703894be867f617a1b1aed9718", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2a0df7703894be867f617a1b1aed9718");
        } else {
            this.d.a(z);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public enum a {
        NORMAL,
        PAGE;
        
        public static ChangeQuickRedirect a;

        a() {
            Object[] objArr = {r10, Integer.valueOf(r11)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1451be453d705c9bcbbdbcba749046b5", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1451be453d705c9bcbbdbcba749046b5");
            }
        }

        public static a valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4365fcd3a56bd5c6204dda2060f8cc7f", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4365fcd3a56bd5c6204dda2060f8cc7f") : (a) Enum.valueOf(a.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static a[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ff03b17f4d435b35d3662859e10319a6", RobustBitConfig.DEFAULT_VALUE) ? (a[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ff03b17f4d435b35d3662859e10319a6") : (a[]) values().clone();
        }
    }
}
