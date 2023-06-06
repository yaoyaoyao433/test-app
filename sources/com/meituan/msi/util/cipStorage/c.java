package com.meituan.msi.util.cipStorage;

import com.meituan.android.cipstorage.q;
import com.meituan.android.cipstorage.u;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class c {
    public static ChangeQuickRedirect a = null;
    private static String c = "jsbridge_storage";
    private static q d = q.a(com.meituan.msi.a.f(), c, 2);
    public static final Map<String, String> b = new ConcurrentHashMap();

    public static boolean a(String str, String str2, int i) {
        Object[] objArr = {str, str2, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b2bf0ca82647294593eb3fe2d53c8afb", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b2bf0ca82647294593eb3fe2d53c8afb")).booleanValue();
        }
        switch (i) {
            case 0:
                if (d != null) {
                    d.a(str, str2, u.e);
                    b.put(str, str2);
                    return true;
                }
                return false;
            case 1:
                b.put(str, str2);
                d.b(str, u.e);
                return true;
            default:
                return false;
        }
    }

    public static boolean a(String str) {
        boolean z = false;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "467094f73baeea7e3446f0d23dba2b01", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "467094f73baeea7e3446f0d23dba2b01")).booleanValue();
        }
        if (b.size() > 0 && b.containsKey(str)) {
            b.remove(str);
            z = true;
        }
        if (d != null) {
            d.b(str, u.e);
            return true;
        }
        return z;
    }

    public static String b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "14ad0e3b3a09846d18fb2608f4d71403", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "14ad0e3b3a09846d18fb2608f4d71403");
        }
        if (b.size() > 0 && b.containsKey(str)) {
            return b.get(str);
        }
        String b2 = d.b(str, "MSI_#DEFAULT#_VALUE", u.e);
        return !"MSI_#DEFAULT#_VALUE".equals(b2) ? b2 : "";
    }
}
