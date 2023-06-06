package com.sankuai.waimai.foundation.location.net;

import com.meituan.android.singleton.e;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.retrofit2.ar;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a {
    public static ChangeQuickRedirect a;
    private static volatile e<ar> b;
    private static ConcurrentHashMap<Class, e<ar>> c = new ConcurrentHashMap<>();

    public static void a(Class cls, e<ar> eVar) {
        Object[] objArr = {cls, eVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "fea63ed8a11096ad14fe940f89ab5c61", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "fea63ed8a11096ad14fe940f89ab5c61");
        } else {
            c.put(cls, eVar);
        }
    }

    public static void a(e<ar> eVar) {
        b = eVar;
    }

    public static ar a(Class cls) {
        Object[] objArr = {cls};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "14f9e649b708eef022752152cda44f6c", RobustBitConfig.DEFAULT_VALUE)) {
            return (ar) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "14f9e649b708eef022752152cda44f6c");
        }
        e<ar> eVar = c.get(cls);
        if (eVar == null) {
            eVar = b;
        }
        return eVar.b();
    }
}
