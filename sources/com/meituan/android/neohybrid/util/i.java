package com.meituan.android.neohybrid.util;

import android.os.Bundle;
import com.meituan.android.neohybrid.util.g;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.reflect.Type;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class i {
    public static ChangeQuickRedirect a;

    public static void a(Bundle bundle, String str, Map<String, Object> map) {
        Object[] objArr = {bundle, str, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3502b701c9ff860b53507826c3315409", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3502b701c9ff860b53507826c3315409");
        } else {
            a(bundle, str, (Object) map);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void a(android.os.Bundle r11, java.lang.String r12, java.lang.Object r13) {
        /*
            r0 = 3
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r11
            r8 = 1
            r0[r8] = r12
            r1 = 2
            r0[r1] = r13
            com.meituan.robust.ChangeQuickRedirect r9 = com.meituan.android.neohybrid.util.i.a
            java.lang.String r10 = "ec61176e2259dc57ca8e4dc83faa2a32"
            r2 = 0
            r4 = 1
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r0
            r3 = r9
            r5 = r10
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L21
            com.meituan.robust.PatchProxy.accessDispatch(r0, r2, r9, r8, r10)
            return
        L21:
            if (r11 == 0) goto L46
            if (r12 == 0) goto L46
            if (r13 != 0) goto L28
            goto L46
        L28:
            boolean r0 = r13 instanceof java.lang.String     // Catch: java.lang.Exception -> L3f
            if (r0 != 0) goto L3a
            boolean r0 = r13 instanceof org.json.JSONObject     // Catch: java.lang.Exception -> L3f
            if (r0 == 0) goto L31
            goto L3a
        L31:
            com.google.gson.Gson r0 = com.meituan.android.neohybrid.util.gson.b.a()     // Catch: java.lang.Exception -> L3f
            java.lang.String r13 = r0.toJson(r13)     // Catch: java.lang.Exception -> L3f
            goto L40
        L3a:
            java.lang.String r13 = r13.toString()     // Catch: java.lang.Exception -> L3f
            goto L40
        L3f:
            r13 = r2
        L40:
            if (r13 == 0) goto L45
            r11.putString(r12, r13)
        L45:
            return
        L46:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.neohybrid.util.i.a(android.os.Bundle, java.lang.String, java.lang.Object):void");
    }

    public static Map<String, Object> a(Bundle bundle, String str) {
        Object[] objArr = {bundle, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3af66c48eadbb123def65dd041a1c2fe", RobustBitConfig.DEFAULT_VALUE) ? (Map) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3af66c48eadbb123def65dd041a1c2fe") : (Map) a(bundle, str, g.d.a);
    }

    public static <T> T a(Bundle bundle, String str, Type type) {
        Object[] objArr = {bundle, str, type};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a3bddaea3e7692d6972f0d45032f1f09", RobustBitConfig.DEFAULT_VALUE)) {
            return (T) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a3bddaea3e7692d6972f0d45032f1f09");
        }
        if (bundle == null || str == null || type == null) {
            return null;
        }
        Object obj = bundle.get(str);
        if (obj instanceof String) {
            try {
                return (T) com.meituan.android.neohybrid.util.gson.b.a().fromJson((String) obj, type);
            } catch (Exception unused) {
                return null;
            }
        }
        return null;
    }
}
