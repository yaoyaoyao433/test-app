package com.meituan.android.cashier.common;

import android.net.Uri;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.math.BigDecimal;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.UUID;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class r {
    public static ChangeQuickRedirect a;

    public static String a(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f3cf586167330b8b0337962ff073b6e1", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f3cf586167330b8b0337962ff073b6e1") : String.format("%.2f", Float.valueOf(new BigDecimal(f).setScale(2, 4).floatValue()));
    }

    public static String a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "468fb6563bf127f3c6d2ec38a01a1d1e", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "468fb6563bf127f3c6d2ec38a01a1d1e");
        }
        try {
            String a2 = com.meituan.android.paybase.utils.s.a(UUID.randomUUID().toString());
            return a2.substring(a2.length() / 2);
        } catch (Exception e) {
            com.meituan.android.paybase.common.analyse.a.a(e, "CashierUtil_getUniqueId()", (Map<String, Object>) null);
            return "";
        }
    }

    public static boolean b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f468884fae3ee4f31c39c9e976566dc5", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f468884fae3ee4f31c39c9e976566dc5")).booleanValue() : TextUtils.equals("1", c());
    }

    public static String c() {
        com.sankuai.meituan.library.a aVar;
        int i = 0;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a8cb51f95668e36a2ed614f3aecf664e", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a8cb51f95668e36a2ed614f3aecf664e");
        }
        List a2 = com.sankuai.meituan.serviceloader.b.a(com.sankuai.meituan.library.a.class, "app_display_type_provider");
        if (!com.meituan.android.paybase.utils.i.a((Collection) a2) && a2.size() > 0 && (aVar = (com.sankuai.meituan.library.a) a2.get(0)) != null) {
            i = aVar.a();
        }
        return String.valueOf(i);
    }

    public static boolean a(Uri uri) {
        Object[] objArr = {uri};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8df7d338acfd41f588fb74a93f2563ab", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8df7d338acfd41f588fb74a93f2563ab")).booleanValue() : uri != null && TextUtils.equals(uri.getPath(), "/launch") && TextUtils.equals(uri.getHost(), "conchpay");
    }
}
