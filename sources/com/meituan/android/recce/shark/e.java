package com.meituan.android.recce.shark;

import android.text.TextUtils;
import com.google.gson.reflect.TypeToken;
import com.meituan.android.payguard.RequestCryptUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.retrofit2.ak;
import java.io.IOException;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class e {
    public static ChangeQuickRedirect a;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.util.Map] */
    public static a a(ak akVar) throws IOException {
        LinkedHashMap linkedHashMap;
        String[] split;
        List list;
        Object[] objArr = {akVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1397e5baa4972a9e572d30d72448f690", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1397e5baa4972a9e572d30d72448f690");
        }
        if (akVar == null || o.a(akVar)) {
            return null;
        }
        Object[] objArr2 = {akVar};
        ChangeQuickRedirect changeQuickRedirect2 = i.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "c9c49c2d4057ab9d0a03c9b9dd20cb87", RobustBitConfig.DEFAULT_VALUE)) {
            linkedHashMap = (Map) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "c9c49c2d4057ab9d0a03c9b9dd20cb87");
        } else {
            linkedHashMap = new LinkedHashMap();
            okio.c cVar = new okio.c();
            cVar.s();
            if (akVar != null) {
                akVar.writeTo(cVar.b());
                String p = cVar.p();
                if (!TextUtils.isEmpty(p)) {
                    for (String str : p.split("&")) {
                        if (!"=".equals(str.trim())) {
                            String[] split2 = str.split("=");
                            if (split2.length == 1) {
                                linkedHashMap.put(URLDecoder.decode(split2[0]), null);
                            } else {
                                linkedHashMap.put(URLDecoder.decode(split2[0]), URLDecoder.decode(split2[1]));
                            }
                        }
                    }
                }
            }
        }
        HashMap hashMap = new HashMap();
        try {
            list = (List) g.a().fromJson((String) linkedHashMap.get("encrypt_params"), new TypeToken<List<String>>() { // from class: com.meituan.android.recce.shark.e.1
            }.getType());
        } catch (Exception e) {
            e.printStackTrace();
            list = null;
        }
        if (list == null) {
            return null;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            String str3 = (String) linkedHashMap.get(str2);
            if (str2 == null || str3 == null) {
                it.remove();
            } else {
                hashMap.put(str2, str3);
            }
        }
        a a2 = a(hashMap);
        if (a2.a()) {
            linkedHashMap.putAll(a2.e);
            linkedHashMap.put("encrypt_key", a2.c);
            linkedHashMap.put("encrypt_params", g.a().toJson(list));
            a2.f = i.a(linkedHashMap);
            return a2;
        }
        return a2;
    }

    private static a a(Map<String, String> map) {
        boolean z = true;
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "cbb5841c45a483ba3bd8254a0078838a", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "cbb5841c45a483ba3bd8254a0078838a");
        }
        Object[] objArr2 = {map};
        ChangeQuickRedirect changeQuickRedirect2 = b.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "d13a0cd6a4816f24003b5e755bf62c09", RobustBitConfig.DEFAULT_VALUE)) {
            z = ((Boolean) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "d13a0cd6a4816f24003b5e755bf62c09")).booleanValue();
        } else if (map != null && !map.isEmpty()) {
            z = false;
        }
        if (z) {
            return new a(-1, "encrypt error: params is empty");
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (value == null) {
                return new a(-106, "encrypt error: key <" + key + ">'s value is null");
            }
            arrayList.add(key);
            arrayList2.add(value);
        }
        a a2 = a((String[]) b.a(arrayList2, String.class));
        if (a2.a()) {
            for (int i = 0; i < arrayList.size(); i++) {
                map.put((String) arrayList.get(i), a2.d[i]);
            }
            a2.e = map;
            return a2;
        }
        return a2;
    }

    private static a a(String[] strArr) {
        Object[] objArr = {strArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "18c15fd362588f42f41671c73d30b039", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "18c15fd362588f42f41671c73d30b039");
        }
        String c = com.meituan.android.recce.a.c();
        if (TextUtils.isEmpty(c)) {
            c = "uuid";
        }
        String valueOf = String.valueOf(System.currentTimeMillis());
        if (strArr == null || strArr.length == 0) {
            strArr = new String[0];
        }
        try {
            String[] a2 = RequestCryptUtils.a(c, valueOf, strArr, 1);
            if (a2 == null || a2.length < 2) {
                return new a(-104, "encrypt error: result illegal");
            }
            String str = a2[a2.length - 1];
            String str2 = a2[a2.length - 2];
            String[] strArr2 = new String[a2.length - 2];
            System.arraycopy(a2, 0, strArr2, 0, a2.length - 2);
            return new a(str, str2, strArr2);
        } catch (Throwable th) {
            return new a(-103, "encrypt error: " + th.getMessage());
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static final class a {
        public static ChangeQuickRedirect a;
        String b;
        String c;
        String[] d;
        transient Map<String, String> e;
        transient ak f;
        private int g;
        private String h;

        private a(int i, String str) {
            Object[] objArr = {Integer.valueOf(i), str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d0b94159893b492d11b3ad4f384f46a2", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d0b94159893b492d11b3ad4f384f46a2");
                return;
            }
            this.g = i;
            this.h = str;
        }

        private a(String str, String str2, String[] strArr) {
            this(str, str2, strArr, (Map<String, String>) null);
            Object[] objArr = {str, str2, strArr};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "30d79e7015e0c6d4f30322d6f8837419", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "30d79e7015e0c6d4f30322d6f8837419");
            }
        }

        private a(String str, String str2, String[] strArr, Map<String, String> map) {
            Object[] objArr = {str, str2, strArr, null};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d46b68e4fe1974b0a6e7088e85a0f345", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d46b68e4fe1974b0a6e7088e85a0f345");
                return;
            }
            this.b = str;
            this.c = str2;
            this.d = strArr;
            this.e = null;
        }

        public final boolean a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "00571a559fd39f7de4a043d58c803237", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "00571a559fd39f7de4a043d58c803237")).booleanValue() : (TextUtils.isEmpty(this.b) || TextUtils.isEmpty(this.c) || this.d == null) ? false : true;
        }
    }
}
