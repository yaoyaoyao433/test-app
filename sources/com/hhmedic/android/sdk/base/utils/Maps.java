package com.hhmedic.android.sdk.base.utils;

import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class Maps {
    public static HashMap<String, Object> of(String str, Object obj) {
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put(str, obj);
        return hashMap;
    }

    public static HashMap<String, Object> of(String str, String str2, String str3, String str4) {
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put(str, str2);
        hashMap.put(str3, str4);
        return hashMap;
    }

    public static HashMap<String, Object> of(String str, Object obj, String str2, Object obj2) {
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put(str, obj);
        hashMap.put(str2, obj2);
        return hashMap;
    }

    public static HashMap<String, Object> of(String str, String str2, String str3, long j) {
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put(str, str2);
        hashMap.put(str3, Long.valueOf(j));
        return hashMap;
    }

    public static HashMap<String, Object> of(String str, Object obj, String str2, Object obj2, String str3, Object obj3) {
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put(str, obj);
        hashMap.put(str2, obj2);
        hashMap.put(str3, obj3);
        return hashMap;
    }

    public static HashMap<String, Object> of(String str, Object obj, String str2, Object obj2, String str3, Object obj3, String str4, Object obj4) {
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put(str, obj);
        hashMap.put(str2, obj2);
        hashMap.put(str3, obj3);
        hashMap.put(str4, obj4);
        return hashMap;
    }
}
