package com.meituan.android.mrn.config;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class r {
    public static ChangeQuickRedirect a;
    private static Map<String, f> b = new HashMap();
    private static Map<String, f> c = new HashMap();

    public static synchronized f a(String str, String str2) {
        List a2;
        synchronized (r.class) {
            Object[] objArr = {str, str2};
            ChangeQuickRedirect changeQuickRedirect = a;
            f fVar = null;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "80523327898c42af6b514ec16bfac29b", RobustBitConfig.DEFAULT_VALUE)) {
                return (f) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "80523327898c42af6b514ec16bfac29b");
            }
            if (!TextUtils.isEmpty(str) && c.containsKey(str)) {
                return c.get(str);
            }
            if (TextUtils.isEmpty(str2)) {
                return null;
            }
            if (b.containsKey(str2)) {
                return b.get(str2);
            }
            if (com.sankuai.meituan.serviceloader.b.a() && (a2 = com.sankuai.meituan.serviceloader.b.a(f.class, str2)) != null && a2.size() > 0) {
                fVar = (f) a2.get(0);
                b.put(str2, fVar);
            }
            return fVar;
        }
    }
}
