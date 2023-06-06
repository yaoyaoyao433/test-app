package com.meituan.android.paybase.password.utils;

import com.meituan.android.paybase.utils.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class a {
    public static ChangeQuickRedirect a;
    public static HashMap<String, String> b;

    public static synchronized void a(HashMap<String, String> hashMap) {
        synchronized (a.class) {
            Object[] objArr = {hashMap};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "44bc1ca80fc695055a3640b765297c59", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "44bc1ca80fc695055a3640b765297c59");
                return;
            }
            if (b == null) {
                b = new HashMap<>();
            }
            if (!i.a(hashMap)) {
                b.putAll(hashMap);
            }
        }
    }

    public static synchronized void a(String str, String str2) {
        synchronized (a.class) {
            Object[] objArr = {str, str2};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "42c50623b7e05cdfac1430b920018e26", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "42c50623b7e05cdfac1430b920018e26");
                return;
            }
            if (b == null) {
                b = new HashMap<>();
            }
            if (str != null) {
                b.put(str, str2);
            }
        }
    }

    public static synchronized void a() {
        synchronized (a.class) {
            b = null;
        }
    }
}
