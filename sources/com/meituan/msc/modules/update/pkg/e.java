package com.meituan.msc.modules.update.pkg;

import com.meituan.msc.common.utils.ad;
import com.meituan.msc.modules.update.bean.PackageInfoWrapper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashSet;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class e {
    public static ChangeQuickRedirect a;
    public static final ad<String, Set<String>> b = new ad<>();
    private static volatile e c;

    public static e a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "bf50e0405475a33e27c1186d7e7d87f3", RobustBitConfig.DEFAULT_VALUE)) {
            return (e) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "bf50e0405475a33e27c1186d7e7d87f3");
        }
        if (c == null) {
            synchronized (e.class) {
                if (c == null) {
                    c = new e();
                }
            }
        }
        return c;
    }

    public static boolean a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3cec2183870d3a6ffad3a5761d9c5939", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3cec2183870d3a6ffad3a5761d9c5939")).booleanValue();
        }
        Set<String> set = b.get(str);
        if (set == null) {
            return false;
        }
        return set.contains(str2);
    }

    public static void a(String str, PackageInfoWrapper packageInfoWrapper) {
        Object[] objArr = {str, packageInfoWrapper};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6ddd07d372ee510892818545ef23c91e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6ddd07d372ee510892818545ef23c91e");
            return;
        }
        Set<String> set = b.get(str);
        if (set == null) {
            set = new HashSet<>();
            b.put(str, set);
        }
        set.add(packageInfoWrapper.getMd5());
    }
}
