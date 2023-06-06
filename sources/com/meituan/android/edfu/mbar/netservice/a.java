package com.meituan.android.edfu.mbar.netservice;

import com.meituan.android.singleton.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.retrofit2.raw.a;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class a {
    public static ChangeQuickRedirect a;
    private static a.InterfaceC0637a b;

    public static a.InterfaceC0637a a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "753e3195e087eb4b4c87eef6bfa61e9e", RobustBitConfig.DEFAULT_VALUE)) {
            return (a.InterfaceC0637a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "753e3195e087eb4b4c87eef6bfa61e9e");
        }
        if (b == null) {
            synchronized (a.class) {
                if (b == null) {
                    b = i.a("oknv");
                }
            }
        }
        return b;
    }
}
