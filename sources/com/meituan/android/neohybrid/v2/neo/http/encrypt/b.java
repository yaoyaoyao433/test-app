package com.meituan.android.neohybrid.v2.neo.http.encrypt;

import android.text.TextUtils;
import com.google.gson.reflect.TypeToken;
import com.meituan.android.neohybrid.v2.neo.http.c;
import com.meituan.android.paybase.utils.i;
import com.meituan.android.paybase.utils.n;
import com.meituan.android.payguard.RequestCryptUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.retrofit2.ak;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class b {
    public static ChangeQuickRedirect a;

    public static a a(ak akVar) throws IOException {
        List list;
        Object[] objArr = {akVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "69baabb1758a38a3f26abe011511dc4b", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "69baabb1758a38a3f26abe011511dc4b");
        }
        if (akVar == null || c.a(akVar)) {
            return null;
        }
        Map<String, String> a2 = com.meituan.android.paybase.retrofit.interceptor.a.a(akVar);
        HashMap hashMap = new HashMap();
        try {
            list = (List) n.a().fromJson(a2.get("encrypt_params"), new TypeToken<List<String>>() { // from class: com.meituan.android.neohybrid.v2.neo.http.encrypt.b.1
            }.getType());
        } catch (Exception unused) {
            list = null;
        }
        if (list == null) {
            return null;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            String str2 = a2.get(str);
            if (str == null || str2 == null) {
                it.remove();
            } else {
                hashMap.put(str, str2);
            }
        }
        a a3 = a(hashMap);
        if (a3.a()) {
            a2.putAll(a3.e);
            a2.put("encrypt_key", a3.c);
            a2.put("encrypt_params", n.a().toJson(list));
            a3.f = com.meituan.android.paybase.retrofit.interceptor.a.a(a2);
            return a3;
        }
        return a3;
    }

    public static a a(Map<String, String> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "884993bda3b73a9c79a3e1dba9e9d88e", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "884993bda3b73a9c79a3e1dba9e9d88e");
        }
        if (i.a(map)) {
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
        a a2 = a((String[]) i.a(arrayList2, String.class));
        if (a2.a()) {
            for (int i = 0; i < arrayList.size(); i++) {
                map.put(arrayList.get(i), a2.d[i]);
            }
            a2.e = map;
            return a2;
        }
        return a2;
    }

    private static a a(String[] strArr) {
        Object[] objArr = {strArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9757d12573ebdfb8b647cdddf3a93608", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9757d12573ebdfb8b647cdddf3a93608");
        }
        String j = com.meituan.android.neohybrid.init.a.c().j();
        if (TextUtils.isEmpty(j)) {
            j = "uuid";
        }
        String valueOf = String.valueOf(System.currentTimeMillis());
        if (strArr == null || strArr.length == 0) {
            strArr = new String[0];
        }
        try {
            String[] a2 = RequestCryptUtils.a(j, valueOf, strArr, 1);
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
    /* loaded from: classes2.dex */
    public static final class a {
        public static ChangeQuickRedirect a;
        public String b;
        public String c;
        String[] d;
        public transient Map<String, String> e;
        public transient ak f;
        private int g;
        private String h;

        private a(int i, String str) {
            Object[] objArr = {Integer.valueOf(i), str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2438f4df7280a4c2da63fac0ccf8fc22", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2438f4df7280a4c2da63fac0ccf8fc22");
                return;
            }
            this.g = i;
            this.h = str;
        }

        private a(String str, String str2, String[] strArr) {
            this(str, str2, strArr, (Map<String, String>) null);
            Object[] objArr = {str, str2, strArr};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "62482b4a85094f6a973fbaf492ad145d", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "62482b4a85094f6a973fbaf492ad145d");
            }
        }

        private a(String str, String str2, String[] strArr, Map<String, String> map) {
            Object[] objArr = {str, str2, strArr, null};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "619aedc3179686805d6be6a681052a18", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "619aedc3179686805d6be6a681052a18");
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
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "de9e87392a531612947c083704016f75", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "de9e87392a531612947c083704016f75")).booleanValue() : (TextUtils.isEmpty(this.b) || TextUtils.isEmpty(this.c) || this.d == null) ? false : true;
        }
    }
}
