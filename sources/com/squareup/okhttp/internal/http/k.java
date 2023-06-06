package com.squareup.okhttp.internal.http;

import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.common.StringUtil;
import com.squareup.okhttp.r;
import com.squareup.okhttp.x;
import com.squareup.okhttp.z;
import java.io.IOException;
import java.net.Proxy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class k {
    static final String a;
    public static final String b;
    public static final String c;
    public static final String d;
    public static final String e;
    private static final Comparator<String> f = new Comparator<String>() { // from class: com.squareup.okhttp.internal.http.k.1
        @Override // java.util.Comparator
        public final /* bridge */ /* synthetic */ int compare(String str, String str2) {
            String str3 = str;
            String str4 = str2;
            if (str3 == str4) {
                return 0;
            }
            if (str3 == null) {
                return -1;
            }
            if (str4 == null) {
                return 1;
            }
            return String.CASE_INSENSITIVE_ORDER.compare(str3, str4);
        }
    };

    static {
        com.squareup.okhttp.internal.h.a();
        a = com.squareup.okhttp.internal.h.b();
        b = a + "-Sent-Millis";
        c = a + "-Received-Millis";
        d = a + "-Selected-Protocol";
        e = a + "-Response-Source";
    }

    public static long a(com.squareup.okhttp.r rVar) {
        return b(rVar.a("Content-Length"));
    }

    private static long b(String str) {
        if (str == null) {
            return -1L;
        }
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    public static Map<String, List<String>> a(com.squareup.okhttp.r rVar, String str) {
        TreeMap treeMap = new TreeMap(f);
        int length = rVar.a.length / 2;
        for (int i = 0; i < length; i++) {
            String a2 = rVar.a(i);
            String b2 = rVar.b(i);
            ArrayList arrayList = new ArrayList();
            List list = (List) treeMap.get(a2);
            if (list != null) {
                arrayList.addAll(list);
            }
            arrayList.add(b2);
            treeMap.put(a2, Collections.unmodifiableList(arrayList));
        }
        return Collections.unmodifiableMap(treeMap);
    }

    public static void a(x.a aVar, Map<String, List<String>> map) {
        String sb;
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            String key = entry.getKey();
            if ("Cookie".equalsIgnoreCase(key) || "Cookie2".equalsIgnoreCase(key)) {
                if (!entry.getValue().isEmpty()) {
                    List<String> value = entry.getValue();
                    if (value.size() == 1) {
                        sb = value.get(0);
                    } else {
                        StringBuilder sb2 = new StringBuilder();
                        int size = value.size();
                        for (int i = 0; i < size; i++) {
                            if (i > 0) {
                                sb2.append("; ");
                            }
                            sb2.append(value.get(i));
                        }
                        sb = sb2.toString();
                    }
                    aVar.b(key, sb);
                }
            }
        }
    }

    private static Set<String> b(com.squareup.okhttp.r rVar) {
        Set<String> emptySet = Collections.emptySet();
        int length = rVar.a.length / 2;
        Set<String> set = emptySet;
        for (int i = 0; i < length; i++) {
            if ("Vary".equalsIgnoreCase(rVar.a(i))) {
                String b2 = rVar.b(i);
                if (set.isEmpty()) {
                    set = new TreeSet<>(String.CASE_INSENSITIVE_ORDER);
                }
                for (String str : b2.split(CommonConstant.Symbol.COMMA)) {
                    set.add(str.trim());
                }
            }
        }
        return set;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean a(String str) {
        return ("Connection".equalsIgnoreCase(str) || "Keep-Alive".equalsIgnoreCase(str) || "Proxy-Authenticate".equalsIgnoreCase(str) || "Proxy-Authorization".equalsIgnoreCase(str) || "TE".equalsIgnoreCase(str) || "Trailers".equalsIgnoreCase(str) || "Transfer-Encoding".equalsIgnoreCase(str) || "Upgrade".equalsIgnoreCase(str)) ? false : true;
    }

    public static List<com.squareup.okhttp.h> b(com.squareup.okhttp.r rVar, String str) {
        ArrayList arrayList = new ArrayList();
        int length = rVar.a.length / 2;
        for (int i = 0; i < length; i++) {
            if (str.equalsIgnoreCase(rVar.a(i))) {
                String b2 = rVar.b(i);
                int i2 = 0;
                while (i2 < b2.length()) {
                    int a2 = d.a(b2, i2, StringUtil.SPACE);
                    String trim = b2.substring(i2, a2).trim();
                    int a3 = d.a(b2, a2);
                    if (b2.regionMatches(true, a3, "realm=\"", 0, 7)) {
                        int i3 = a3 + 7;
                        int a4 = d.a(b2, i3, CommonConstant.Symbol.DOUBLE_QUOTES);
                        String substring = b2.substring(i3, a4);
                        i2 = d.a(b2, d.a(b2, a4 + 1, CommonConstant.Symbol.COMMA) + 1);
                        arrayList.add(new com.squareup.okhttp.h(trim, substring));
                    }
                }
            }
        }
        return arrayList;
    }

    public static long a(x xVar) {
        return a(xVar.c);
    }

    public static long a(z zVar) {
        return a(zVar.f);
    }

    public static boolean a(z zVar, com.squareup.okhttp.r rVar, x xVar) {
        for (String str : b(zVar.f)) {
            if (!com.squareup.okhttp.internal.j.a(rVar.c(str), xVar.c.c(str))) {
                return false;
            }
        }
        return true;
    }

    public static boolean b(z zVar) {
        return b(zVar.f).contains("*");
    }

    public static com.squareup.okhttp.r c(z zVar) {
        com.squareup.okhttp.r rVar = zVar.h.a.c;
        Set<String> b2 = b(zVar.f);
        if (b2.isEmpty()) {
            return new r.a().a();
        }
        r.a aVar = new r.a();
        int length = rVar.a.length / 2;
        for (int i = 0; i < length; i++) {
            String a2 = rVar.a(i);
            if (b2.contains(a2)) {
                aVar.a(a2, rVar.b(i));
            }
        }
        return aVar.a();
    }

    public static x a(com.squareup.okhttp.b bVar, z zVar, Proxy proxy) throws IOException {
        return zVar.c == 407 ? bVar.b(proxy, zVar) : bVar.a(proxy, zVar);
    }
}
