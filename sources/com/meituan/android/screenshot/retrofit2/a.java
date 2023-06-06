package com.meituan.android.screenshot.retrofit2;

import android.content.Context;
import com.meituan.android.singleton.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.retrofit2.raw.a;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class a {
    public static ChangeQuickRedirect a;
    private static a.InterfaceC0637a b;

    public static a.InterfaceC0637a a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "43199a51d54aff12d1b71a0ae8a8db6a", RobustBitConfig.DEFAULT_VALUE)) {
            return (a.InterfaceC0637a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "43199a51d54aff12d1b71a0ae8a8db6a");
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
