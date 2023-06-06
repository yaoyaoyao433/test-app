package com.meituan.android.neohybrid.v2.container;

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
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1b44152a6ba2e5955559f1a562a52115", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1b44152a6ba2e5955559f1a562a52115");
        } else if (b.containsKey(str) || !g.a((Class<?>) cls)) {
        } else {
            b.put(str, cls);
        }
    }

    public static NeoBaseFragment a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ab4fe0d0df9b5cb2042241f9db3da2ff", RobustBitConfig.DEFAULT_VALUE)) {
            return (NeoBaseFragment) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ab4fe0d0df9b5cb2042241f9db3da2ff");
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
