package com.sankuai.shangou.stone.util;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class e {
    public static ChangeQuickRedirect a;
    public static volatile Object b;
    private static a c;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface a {
        Context a();
    }

    public static Context a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2d6fd193cdbf81ff208a13e277812ba8", RobustBitConfig.DEFAULT_VALUE)) {
            return (Context) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2d6fd193cdbf81ff208a13e277812ba8");
        }
        if (b != null) {
            return (Context) b;
        }
        if (c != null) {
            b = c.a();
        }
        return (Context) b;
    }
}
