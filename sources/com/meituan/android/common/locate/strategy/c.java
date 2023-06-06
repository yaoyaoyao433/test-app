package com.meituan.android.common.locate.strategy;

import android.content.Context;
import com.meituan.android.common.locate.reporter.e;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* loaded from: classes2.dex */
public class c {
    private static volatile c a;
    public static ChangeQuickRedirect changeQuickRedirect;

    public static c a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "4f11fc948a60cdddc678c8b484566b0d", RobustBitConfig.DEFAULT_VALUE)) {
            return (c) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "4f11fc948a60cdddc678c8b484566b0d");
        }
        if (a == null) {
            synchronized (c.class) {
                if (a == null) {
                    a = new c();
                }
            }
        }
        return a;
    }

    public boolean a(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "770000e79ecbd266fda81f481e6fd9dc", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "770000e79ecbd266fda81f481e6fd9dc")).booleanValue();
        }
        if ("biz_bike".equals(str)) {
            return e.a(context).i();
        }
        return false;
    }
}
