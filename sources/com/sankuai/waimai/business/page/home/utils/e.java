package com.sankuai.waimai.business.page.home.utils;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.page.home.utils.d;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class e {
    public static ChangeQuickRedirect a;
    private static e c;
    public volatile View b;
    private volatile d d;
    private volatile d.c e;

    public e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b7555da09450a52b622f85b21c4f9a89", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b7555da09450a52b622f85b21c4f9a89");
            return;
        }
        this.d = null;
        this.e = null;
        this.b = null;
    }

    public static e a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "30218a1ed4276cc4457f95b0534b8771", RobustBitConfig.DEFAULT_VALUE)) {
            return (e) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "30218a1ed4276cc4457f95b0534b8771");
        }
        if (c == null) {
            c = new e();
        }
        return c;
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dfbaa8f892e5d9e8b8b3a039429d359d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dfbaa8f892e5d9e8b8b3a039429d359d");
            return;
        }
        this.e = null;
        if (this.d != null) {
            this.d.a();
        }
        this.d = null;
        this.b = null;
    }
}
