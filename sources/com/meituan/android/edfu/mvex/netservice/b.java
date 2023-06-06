package com.meituan.android.edfu.mvex.netservice;

import android.content.Context;
import com.meituan.android.singleton.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.retrofit2.raw.a;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class b {
    public static ChangeQuickRedirect a;
    private static a.InterfaceC0637a b;

    public static a.InterfaceC0637a a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ee31f06827fe9a0aa07f0a632b5349ae", RobustBitConfig.DEFAULT_VALUE)) {
            return (a.InterfaceC0637a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ee31f06827fe9a0aa07f0a632b5349ae");
        }
        if (b == null) {
            synchronized (b.class) {
                if (b == null) {
                    b = i.a("oknv");
                }
            }
        }
        return b;
    }
}
