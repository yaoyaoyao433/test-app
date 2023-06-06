package com.sankuai.xm.im.cache;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.base.util.ac;
import java.util.HashSet;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class e {
    public static ChangeQuickRedirect a;

    public static Set<String> a(int... iArr) {
        Object[] objArr = {iArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2c988e6b45b2de6690a6c91ed7e22673", 6917529027641081856L)) {
            return (Set) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2c988e6b45b2de6690a6c91ed7e22673");
        }
        HashSet hashSet = new HashSet();
        if (iArr == null || iArr.length <= 0) {
            return hashSet;
        }
        for (int i : iArr) {
            StringBuilder sb = new StringBuilder();
            sb.append(i);
            hashSet.add(sb.toString());
        }
        return hashSet;
    }

    public static Set<String> a(short... sArr) {
        int i = 0;
        Object[] objArr = {sArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "cb4b03fb1cf38e40053a6eaf8cdf2bf9", 6917529027641081856L)) {
            return (Set) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "cb4b03fb1cf38e40053a6eaf8cdf2bf9");
        }
        HashSet hashSet = new HashSet();
        if (sArr == null || sArr.length <= 0) {
            return hashSet;
        }
        int length = sArr.length;
        while (true) {
            if (i >= length) {
                break;
            }
            short s = sArr[i];
            if (s == -1) {
                hashSet.clear();
                break;
            }
            StringBuilder sb = new StringBuilder();
            sb.append((int) s);
            hashSet.add(sb.toString());
            i++;
        }
        return hashSet;
    }

    public static String a(String str, j... jVarArr) {
        Object[] objArr = {str, jVarArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "531b25bc72116f6f6600893d1f1047e8", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "531b25bc72116f6f6600893d1f1047e8");
        }
        StringBuilder sb = new StringBuilder();
        if (!com.sankuai.xm.base.util.b.b(jVarArr)) {
            for (j jVar : jVarArr) {
                if (jVar != null) {
                    String a2 = jVar.a();
                    if (!ac.a(a2)) {
                        if (!sb.toString().isEmpty()) {
                            sb.append(str);
                        }
                        sb.append(a2);
                    }
                }
            }
        }
        return sb.toString();
    }
}
