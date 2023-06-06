package com.meituan.android.paybase.utils;

import com.meituan.android.paybase.moduleinterface.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Collection;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class h {
    public static ChangeQuickRedirect a;
    private static final List<com.meituan.android.paybase.moduleinterface.a> b = com.sankuai.meituan.serviceloader.b.a(com.meituan.android.paybase.moduleinterface.a.class, "check_report");

    public static void a(a.EnumC0334a enumC0334a, String str, String str2, Map<String, Object> map) {
        Object[] objArr = {enumC0334a, str, str2, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f5ffbb0eed9eb15b64703e456c40a7f0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f5ffbb0eed9eb15b64703e456c40a7f0");
        } else if (i.a((Collection) b)) {
        } else {
            b.get(0);
        }
    }

    public static void a(String str, Map<String, Object> map) {
        Object[] objArr = {str, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "28c5d19700113f423974dcfeba5ac8a3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "28c5d19700113f423974dcfeba5ac8a3");
        } else if (i.a((Collection) b)) {
        } else {
            b.get(0);
        }
    }
}
