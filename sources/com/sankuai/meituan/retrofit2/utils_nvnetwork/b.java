package com.sankuai.meituan.retrofit2.utils_nvnetwork;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b {
    public static ChangeQuickRedirect a;

    public static void a(HashMap<String, String> hashMap, String str, String str2) {
        Object[] objArr = {hashMap, str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "044fe06622816c1510a3db9a5eaba79b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "044fe06622816c1510a3db9a5eaba79b");
            return;
        }
        a(hashMap, str);
        hashMap.put(str, str2);
    }

    public static void a(HashMap<String, String> hashMap, String str) {
        Object[] objArr = {hashMap, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f3f076fafb4ddc5c5704bcb7fe8110b5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f3f076fafb4ddc5c5704bcb7fe8110b5");
            return;
        }
        Iterator<Map.Entry<String, String>> it = hashMap.entrySet().iterator();
        while (it.hasNext()) {
            if (it.next().getKey().equalsIgnoreCase(str)) {
                it.remove();
            }
        }
    }

    public static String b(HashMap<String, String> hashMap, String str) {
        Object[] objArr = {hashMap, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "97baf7bac27a493f416645733282cc1d", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "97baf7bac27a493f416645733282cc1d");
        }
        if (hashMap == null) {
            return null;
        }
        for (Map.Entry<String, String> entry : hashMap.entrySet()) {
            if (str.equalsIgnoreCase(entry.getKey())) {
                return entry.getValue();
            }
        }
        return null;
    }

    public static long a(HashMap<String, String> hashMap) {
        Object[] objArr = {hashMap};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3bfe77f79708dd731a523f024b66eec9", 6917529027641081856L) ? ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3bfe77f79708dd731a523f024b66eec9")).longValue() : a(b(hashMap, "Content-Length"));
    }

    private static long a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3c9da021fdbf2f1d889495da0c159b89", 6917529027641081856L)) {
            return ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3c9da021fdbf2f1d889495da0c159b89")).longValue();
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
}
