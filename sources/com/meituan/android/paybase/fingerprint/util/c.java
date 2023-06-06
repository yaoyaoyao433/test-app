package com.meituan.android.paybase.fingerprint.util;

import android.content.Context;
import com.meituan.android.paybase.fingerprint.soter.soterexternal.e;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class c {
    public static ChangeQuickRedirect a;

    public static boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "725011277f4b409a39fe6c1dc181eaca", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "725011277f4b409a39fe6c1dc181eaca")).booleanValue();
        }
        com.meituan.android.paybase.fingerprint.manager.a a2 = com.meituan.android.paybase.fingerprint.manager.c.a(2);
        boolean z = a2 != null && a2.c();
        com.meituan.android.paybase.fingerprint.manager.a a3 = com.meituan.android.paybase.fingerprint.manager.c.a(1);
        return z || (a3 != null && a3.c());
    }

    public static boolean b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5c573cf8e9cb4e70dac1050d028b8b6c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5c573cf8e9cb4e70dac1050d028b8b6c")).booleanValue();
        }
        com.meituan.android.paybase.fingerprint.manager.a a2 = com.meituan.android.paybase.fingerprint.manager.c.a(2);
        boolean z = a2 != null && a2.d();
        com.meituan.android.paybase.fingerprint.manager.a a3 = com.meituan.android.paybase.fingerprint.manager.c.a(1);
        return z || (a3 != null && a3.d());
    }

    public static String c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "eb0b33915e9177206e95d73c83f08bcc", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "eb0b33915e9177206e95d73c83f08bcc") : a() ? "1" : "0";
    }

    public static String d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "007453dd4da808c015c192cf161252a1", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "007453dd4da808c015c192cf161252a1") : b() ? "1" : "0";
    }

    public static HashMap<String, String> a(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ba92aa3206627c16041769226ad416df", RobustBitConfig.DEFAULT_VALUE)) {
            return (HashMap) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ba92aa3206627c16041769226ad416df");
        }
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("has_touchid", c());
        hashMap.put("google_fingerprint_locked", b.c(com.meituan.android.paybase.config.a.d().i()) ? "0" : "1");
        hashMap.put("model_key", com.meituan.android.paybase.fingerprint.soter.sotercore.external.a.f());
        hashMap.put("support_finger_type", String.valueOf(a.a(context)));
        hashMap.put("need_update_soter_key", String.valueOf(e.a(context, str)));
        return hashMap;
    }

    public static HashMap<String, String> a(String str) {
        com.meituan.android.paybase.fingerprint.soter.sotercore.external.b c;
        com.meituan.android.paybase.fingerprint.soter.sotercore.external.b e;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "bd442cf348bfaa9356d0694d203c276f", RobustBitConfig.DEFAULT_VALUE)) {
            return (HashMap) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "bd442cf348bfaa9356d0694d203c276f");
        }
        long currentTimeMillis = System.currentTimeMillis();
        HashMap<String, String> hashMap = new HashMap<>();
        if (e.a(com.meituan.android.paybase.fingerprint.soter.a.c(str).b) && (e = com.meituan.android.paybase.fingerprint.soter.sotercore.external.a.e()) != null) {
            hashMap.put("ask_json", e.b);
            hashMap.put("ask_json_signature", e.c);
        }
        if (e.b(com.meituan.android.paybase.fingerprint.soter.a.c(str).b) && (c = com.meituan.android.paybase.fingerprint.soter.sotercore.external.a.c(com.meituan.android.paybase.fingerprint.soter.b.a().a(str))) != null) {
            hashMap.put("auth_key_json", c.b);
            hashMap.put("auth_key_json_signature", c.c);
        }
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        StringBuilder sb = new StringBuilder();
        sb.append(currentTimeMillis2);
        com.meituan.android.paybase.common.analyse.a.e("PayFingerprintUtil", sb.toString(), null);
        hashMap.put("has_touchid", c());
        return hashMap;
    }
}
