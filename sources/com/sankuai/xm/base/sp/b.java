package com.sankuai.xm.base.sp;

import android.content.SharedPreferences;
import com.meituan.android.cipstorage.q;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.Map;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class b {
    public static ChangeQuickRedirect a;

    public static void a(SharedPreferences sharedPreferences, q qVar) {
        Object[] objArr = {sharedPreferences, qVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "bab3cc21299be1083335e3b0f6879dba", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "bab3cc21299be1083335e3b0f6879dba");
        } else if (qVar != null && sharedPreferences != null) {
            Map<String, ?> all = sharedPreferences.getAll();
            Object[] objArr2 = {all, qVar};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "f0daaac5f6f743ad128d33dc2d108c87", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "f0daaac5f6f743ad128d33dc2d108c87");
            } else if (all != null && !all.isEmpty() && qVar != null) {
                for (Map.Entry<String, ?> entry : all.entrySet()) {
                    String key = entry.getKey();
                    Object value = entry.getValue();
                    if (value != null) {
                        if (value instanceof String) {
                            qVar.a(key, (String) value);
                        } else if (value instanceof Integer) {
                            qVar.a(key, ((Integer) value).intValue());
                        } else if (value instanceof Long) {
                            qVar.a(key, ((Long) value).longValue());
                        } else if (value instanceof Float) {
                            qVar.a(key, ((Float) value).floatValue());
                        } else if (value instanceof Double) {
                            qVar.a(key, ((Double) value).doubleValue());
                        } else if (value instanceof Boolean) {
                            qVar.a(key, ((Boolean) value).booleanValue());
                        } else if (value instanceof Set) {
                            Set<String> set = (Set) value;
                            if (com.sankuai.xm.base.util.b.c(set) instanceof String) {
                                qVar.a(key, set);
                            }
                        }
                        com.sankuai.xm.log.c.a("SPUtils", "copyToCIPS::XMCIPS:: key = %s, value = %s", key, String.valueOf(value));
                    }
                }
            }
        }
    }
}
