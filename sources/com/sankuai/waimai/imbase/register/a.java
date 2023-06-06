package com.sankuai.waimai.imbase.register;

import android.support.annotation.RestrictTo;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class a {
    public static ChangeQuickRedirect a = null;
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static boolean b = true;
    private static List<Short> c;
    private static Set<Short> d;

    static {
        HashSet hashSet = new HashSet();
        d = hashSet;
        hashSet.add((short) 1001);
        d.add((short) 1024);
        d.add((short) 1025);
        d.add((short) 1036);
        d.add((short) 1050);
        d.add((short) 1013);
        d.add((short) 1029);
        d.add((short) 1031);
        d.add((short) 1034);
        d.add((short) 1038);
        d.add((short) 1052);
        d.add((short) 1057);
    }

    public static Set<Short> a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8f6e2fbfc928536b0dce756d1aa41678", RobustBitConfig.DEFAULT_VALUE)) {
            return (Set) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8f6e2fbfc928536b0dce756d1aa41678");
        }
        HashSet hashSet = new HashSet();
        synchronized (a.class) {
            if (c != null && c.size() > 0) {
                for (Short sh : d) {
                    if (!c.contains(sh)) {
                        hashSet.add(sh);
                    }
                }
                return hashSet;
            }
            return d;
        }
    }

    public static boolean a(short s) {
        Object[] objArr = {Short.valueOf(s)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4bea8944678bb0516a7974c67705ed22", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4bea8944678bb0516a7974c67705ed22")).booleanValue() : a().contains(Short.valueOf(s));
    }
}
