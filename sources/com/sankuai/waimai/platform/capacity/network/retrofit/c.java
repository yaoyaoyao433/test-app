package com.sankuai.waimai.platform.capacity.network.retrofit;

import com.meituan.android.singleton.e;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.retrofit2.ar;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class c {
    public static ChangeQuickRedirect a;
    private static volatile e<ar> b;
    private static ConcurrentHashMap<Class, e<ar>> c = new ConcurrentHashMap<>();

    public static void a(e<ar> eVar) {
        b = eVar;
    }

    public static void a(Class cls, e<ar> eVar) {
        Object[] objArr = {cls, eVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3686400b981724c2b969e7ba630898db", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3686400b981724c2b969e7ba630898db");
        } else {
            c.put(cls, eVar);
        }
    }

    public static ar a(Class cls) {
        Object[] objArr = {cls};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3366c243730a90739aa60cafd703e30a", RobustBitConfig.DEFAULT_VALUE)) {
            return (ar) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3366c243730a90739aa60cafd703e30a");
        }
        e<ar> eVar = c.get(cls);
        if (eVar == null) {
            eVar = b;
        }
        return eVar.b();
    }
}
