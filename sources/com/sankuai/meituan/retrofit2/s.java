package com.sankuai.meituan.retrofit2;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class s {
    public static ChangeQuickRedirect a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "846fbe28dbfe9f2f3932857dd153fffa", 6917529027641081856L)) {
            return ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "846fbe28dbfe9f2f3932857dd153fffa")).longValue();
        }
        if (str == null) {
            return -1L;
        }
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    public static String a(String str, List<q> list) {
        Object[] objArr = {str, list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a0a8a77683af30613ba2843da3875caf", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a0a8a77683af30613ba2843da3875caf");
        }
        if (str.length() == 0 || list == null || list.isEmpty()) {
            return null;
        }
        for (q qVar : list) {
            if (str.equalsIgnoreCase(qVar.b)) {
                return qVar.c;
            }
        }
        return null;
    }
}
