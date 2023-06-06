package com.dianping.picassocontroller.vc;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class c {
    public static ChangeQuickRedirect a;
    public static WeakReference<e> b;
    private static Map<String, b> d = new ConcurrentHashMap();
    public static Set<String> c = new HashSet();

    public static void a(b bVar, String str) {
        Object[] objArr = {bVar, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "61c56454c640136a56224a4097af6f07", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "61c56454c640136a56224a4097af6f07");
        } else {
            d.put(str, bVar);
        }
    }

    public static void a(b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "37f281a16c96d5869f3731a9c23f0712", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "37f281a16c96d5869f3731a9c23f0712");
        } else {
            d.remove(bVar.a());
        }
    }

    public static b a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "bcdd011e393e6d19756c4fef654d8548", RobustBitConfig.DEFAULT_VALUE)) {
            return (b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "bcdd011e393e6d19756c4fef654d8548");
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return d.get(str);
    }

    public static Collection<b> a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a07e7a92ada729dcd9c5a82e4ea18c2c", RobustBitConfig.DEFAULT_VALUE) ? (Collection) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a07e7a92ada729dcd9c5a82e4ea18c2c") : d.values();
    }
}
