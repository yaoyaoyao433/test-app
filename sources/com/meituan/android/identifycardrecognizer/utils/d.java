package com.meituan.android.identifycardrecognizer.utils;

import com.meituan.android.paybase.utils.ae;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class d {
    public static ChangeQuickRedirect a;

    public static void a(HashMap<String, Object> hashMap) {
        Object[] objArr = {hashMap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b024f9639b97e628810bf39a22381c28", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b024f9639b97e628810bf39a22381c28");
            return;
        }
        a();
        ae.a("com.meituan.android.identifycardrecognizer.utils.OcrStaticsUtils", hashMap);
    }

    private static void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a83bb8a4042a4136edb5e2ceaf2f21f9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a83bb8a4042a4136edb5e2ceaf2f21f9");
        } else {
            ae.a("com.meituan.android.identifycardrecognizer.utils.OcrStaticsUtils");
        }
    }

    public static void a(String str, Map<String, Object> map) {
        Object[] objArr = {str, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "09559ce2c6ea8de77822d29630ed3367", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "09559ce2c6ea8de77822d29630ed3367");
        } else {
            ae.a(str, map, "com.meituan.android.identifycardrecognizer.utils.OcrStaticsUtils");
        }
    }
}
