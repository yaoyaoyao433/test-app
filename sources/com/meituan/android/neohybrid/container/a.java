package com.meituan.android.neohybrid.container;

import com.meituan.android.neohybrid.neo.report.b;
import com.meituan.android.neohybrid.util.g;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class a {
    public static ChangeQuickRedirect a;
    private static final Map<String, Class<? extends NeoBaseFragment>> b = new HashMap();

    public static void a(String str, Class<? extends NeoBaseFragment> cls) {
        Object[] objArr = {str, cls};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e840d866c1b9a7f46fba43a6d2fe4fd1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e840d866c1b9a7f46fba43a6d2fe4fd1");
        } else if (b.containsKey(str) || !g.a((Class<?>) cls)) {
        } else {
            b.put(str, cls);
        }
    }

    public static NeoBaseFragment a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "82410febac34f0db1e8246b35c463e17", RobustBitConfig.DEFAULT_VALUE)) {
            return (NeoBaseFragment) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "82410febac34f0db1e8246b35c463e17");
        }
        Class<? extends NeoBaseFragment> cls = b.get(str);
        if (cls != null) {
            try {
                return cls.newInstance();
            } catch (IllegalAccessException | InstantiationException e) {
                b.a(e, "NeoFragmentRegister_newInstance", (Map<String, Object>) null);
            }
        }
        return null;
    }
}
