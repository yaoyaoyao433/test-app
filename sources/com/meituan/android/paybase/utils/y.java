package com.meituan.android.paybase.utils;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.File;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class y {
    public static ChangeQuickRedirect a;
    private static final HashMap<String, HashMap<String, Object>> b = new HashMap<>();

    public static void a(String str, long j) {
        Object[] objArr = {str, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4a1666073bc0921f2dac377d7600fa4f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4a1666073bc0921f2dac377d7600fa4f");
            return;
        }
        String b2 = b(str);
        HashMap<String, Object> hashMap = b.get(b2);
        if (hashMap == null) {
            hashMap = new HashMap<>();
            b.put(b2, hashMap);
        }
        hashMap.put("response_convert_time", Long.valueOf(j));
    }

    public static void b(String str, long j) {
        Object[] objArr = {str, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "64719ce94f4189f2c6362fc97c5dcb5e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "64719ce94f4189f2c6362fc97c5dcb5e");
            return;
        }
        String b2 = b(str);
        HashMap<String, Object> hashMap = b.get(b2);
        if (hashMap == null) {
            hashMap = new HashMap<>();
            b.put(b2, hashMap);
        }
        hashMap.put("encrypt_intercept_request_time", Long.valueOf(j));
    }

    public static void c(String str, long j) {
        Object[] objArr = {str, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "57a689428222457a56ab7359d02cc71c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "57a689428222457a56ab7359d02cc71c");
            return;
        }
        String b2 = b(str);
        HashMap<String, Object> hashMap = b.get(b2);
        if (hashMap == null) {
            hashMap = new HashMap<>();
            b.put(b2, hashMap);
        }
        hashMap.put("encrypt_intercept_response_time", Long.valueOf(j));
    }

    public static void d(String str, long j) {
        Object[] objArr = {str, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f4c3dbb30a01f40504a63f23c19dc066", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f4c3dbb30a01f40504a63f23c19dc066");
            return;
        }
        String b2 = b(str);
        HashMap<String, Object> hashMap = b.get(b2);
        if (hashMap == null) {
            hashMap = new HashMap<>();
            b.put(b2, hashMap);
        }
        hashMap.put("neo_response_convert_time", Long.valueOf(j));
    }

    public static void e(String str, long j) {
        Object[] objArr = {str, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "be216b4486c4da21cdb4c83ea7735f76", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "be216b4486c4da21cdb4c83ea7735f76");
            return;
        }
        String b2 = b(str);
        HashMap<String, Object> hashMap = b.get(b2);
        if (hashMap == null) {
            hashMap = new HashMap<>();
            b.put(b2, hashMap);
        }
        hashMap.put("neo_encrypt_intercept_request_time", Long.valueOf(j));
    }

    public static void f(String str, long j) {
        Object[] objArr = {str, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "60c24d872af77b6c4d2d4d710426ed4b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "60c24d872af77b6c4d2d4d710426ed4b");
            return;
        }
        String b2 = b(str);
        HashMap<String, Object> hashMap = b.get(b2);
        if (hashMap == null) {
            hashMap = new HashMap<>();
            b.put(b2, hashMap);
        }
        hashMap.put("neo_encrypt_intercept_response_time", Long.valueOf(j));
    }

    private static String b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a825f65c1c829579fd064dd7ec415181", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a825f65c1c829579fd064dd7ec415181");
        }
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        if (!str.startsWith(File.separator)) {
            str = File.separator + str;
        }
        if (str.endsWith(File.separator)) {
            return str;
        }
        return str + File.separator;
    }

    public static HashMap<String, Object> a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d888a6f3833cd9d4cecd6343c139783c", RobustBitConfig.DEFAULT_VALUE)) {
            return (HashMap) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d888a6f3833cd9d4cecd6343c139783c");
        }
        HashMap<String, Object> remove = b.remove(b(str));
        return remove == null ? new HashMap<>() : remove;
    }
}
