package com.meituan.met.mercury.load.utils;

import android.text.TextUtils;
import android.util.Log;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.PrintStream;
import java.util.Map;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class c {
    public static ChangeQuickRedirect a;

    public static void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7e4bed0e1c2ae86d8936ad27d90c1aec", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7e4bed0e1c2ae86d8936ad27d90c1aec");
        } else {
            a(str, (Map<String, Object>) null);
        }
    }

    public static void a(String str, Map<String, Object> map) {
        Object[] objArr = {str, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "88ba691170cd0257021486489fbaa843", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "88ba691170cd0257021486489fbaa843");
        } else {
            a(str, null, map);
        }
    }

    private static void a(String str, String str2, Map<String, Object> map) {
        Object[] objArr = {str, null, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "41cff796696415a88997ccddb3a999dc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "41cff796696415a88997ccddb3a999dc");
        } else if (TextUtils.isEmpty(str)) {
        } else {
            b bVar = new b(str);
            if (!TextUtils.isEmpty(null)) {
                bVar.b(null);
            }
            if (map != null && !map.isEmpty()) {
                bVar.a(map);
            }
            a(bVar);
        }
    }

    public static void a(b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ded370841a3dab22c3faf5bd34331078", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ded370841a3dab22c3faf5bd34331078");
        } else if (bVar == null) {
        } else {
            d(bVar);
            f(bVar);
        }
    }

    public static void b(b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "daeae829bea4f5d4a0e0cd4d761e7b2e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "daeae829bea4f5d4a0e0cd4d761e7b2e");
            return;
        }
        e(bVar);
        f(bVar);
    }

    private static void d(b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3c517c1d3343fc9ceb328cd7a7b57209", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3c517c1d3343fc9ceb328cd7a7b57209");
        } else if (bVar == null) {
        } else {
            a(System.out, bVar);
        }
    }

    private static void e(b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4fc14266e7b7b1182230c8eb837ccfa7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4fc14266e7b7b1182230c8eb837ccfa7");
        } else if (bVar == null) {
        } else {
            a(System.err, bVar);
        }
    }

    private static void a(PrintStream printStream, b bVar) {
        Object[] objArr = {printStream, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "cb39240748f21a7b24e1f1f3865c8462", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "cb39240748f21a7b24e1f1f3865c8462");
        } else if (com.meituan.met.mercury.load.core.e.l() || com.meituan.met.mercury.load.core.e.e) {
            printStream.println(c(bVar));
        }
    }

    private static void f(b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "524d1bde63706d2480e92a8984d148d0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "524d1bde63706d2480e92a8984d148d0");
        } else if (bVar == null || !com.meituan.met.mercury.load.core.c.e) {
        } else {
            Set<String> set = bVar.c;
            if (!set.contains("DDD")) {
                set.add("DDD");
            }
            StringBuilder sb = new StringBuilder();
            sb.append(bVar.b);
            Map<String, Object> map = bVar.d;
            if (map != null && !map.isEmpty()) {
                sb.append(", extras:");
                sb.append("\n");
                sb.append(map.toString());
            }
            com.dianping.networklog.c.a(sb.toString(), 3, (String[]) set.toArray(new String[set.size()]));
        }
    }

    private static String c(b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        String str = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5668eaeb0019fa5984bb990525b70258", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5668eaeb0019fa5984bb990525b70258");
        }
        if (bVar == null) {
            return "";
        }
        Set<String> set = bVar.c;
        if (!set.contains("DDD")) {
            set.add("DDD");
        }
        StringBuilder sb = new StringBuilder();
        for (String str2 : set) {
            sb.append("[");
            sb.append(str2);
            sb.append(CommonConstant.Symbol.MIDDLE_BRACKET_RIGHT);
        }
        sb.append("msg:");
        sb.append(bVar.b);
        Map<String, Object> map = bVar.d;
        if (map != null && !map.isEmpty()) {
            sb.append(", extras:");
            sb.append(map.toString());
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = b.a;
        if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "4f88eb6f092d5cf8e81aadf5a3967452", RobustBitConfig.DEFAULT_VALUE)) {
            str = (String) PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "4f88eb6f092d5cf8e81aadf5a3967452");
        } else if (bVar.e != null) {
            str = Log.getStackTraceString(bVar.e);
        }
        if (!TextUtils.isEmpty(str)) {
            sb.append(", stackTrace:");
            sb.append("\n");
            sb.append(str);
        }
        return sb.toString();
    }
}
