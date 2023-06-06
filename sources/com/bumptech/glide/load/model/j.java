package com.bumptech.glide.load.model;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class j implements e {
    private final Map<String, List<i>> c;
    private volatile Map<String, String> d;

    public j(Map<String, List<i>> map) {
        this.c = Collections.unmodifiableMap(map);
    }

    @Override // com.bumptech.glide.load.model.e
    public final Map<String, String> a() {
        if (this.d == null) {
            synchronized (this) {
                if (this.d == null) {
                    HashMap hashMap = new HashMap();
                    for (Map.Entry<String, List<i>> entry : this.c.entrySet()) {
                        StringBuilder sb = new StringBuilder();
                        List<i> value = entry.getValue();
                        for (int i = 0; i < value.size(); i++) {
                            sb.append(value.get(i).a());
                            if (i != value.size() - 1) {
                                sb.append(',');
                            }
                        }
                        hashMap.put(entry.getKey(), sb.toString());
                    }
                    this.d = Collections.unmodifiableMap(hashMap);
                }
            }
        }
        return this.d;
    }

    public final String toString() {
        return "LazyHeaders{headers=" + this.c + '}';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j) {
            return this.c.equals(((j) obj).c);
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class a {
        private static final String a = System.getProperty("http.agent");
        private static final Map<String, List<i>> b;
        private boolean c = true;
        private Map<String, List<i>> d = b;
        private boolean e = true;
        private boolean f = true;

        static {
            HashMap hashMap = new HashMap(2);
            if (!TextUtils.isEmpty(a)) {
                hashMap.put("User-Agent", Collections.singletonList(new b(a)));
            }
            hashMap.put("Accept-Encoding", Collections.singletonList(new b("identity")));
            b = Collections.unmodifiableMap(hashMap);
        }

        public final a a(String str, String str2) {
            b bVar = new b(str2);
            if ((!this.e || !"Accept-Encoding".equalsIgnoreCase(str)) && (!this.f || !"User-Agent".equalsIgnoreCase(str))) {
                b();
                a(str).add(bVar);
                return this;
            }
            b();
            List<i> a2 = a(str);
            a2.clear();
            a2.add(bVar);
            if (this.e && "Accept-Encoding".equalsIgnoreCase(str)) {
                this.e = false;
            }
            if (this.f && "User-Agent".equalsIgnoreCase(str)) {
                this.f = false;
            }
            return this;
        }

        private List<i> a(String str) {
            List<i> list = this.d.get(str);
            if (list == null) {
                ArrayList arrayList = new ArrayList();
                this.d.put(str, arrayList);
                return arrayList;
            }
            return list;
        }

        private void b() {
            if (this.c) {
                this.c = false;
                this.d = c();
            }
        }

        public final j a() {
            this.c = true;
            return new j(this.d);
        }

        private Map<String, List<i>> c() {
            HashMap hashMap = new HashMap(this.d.size());
            for (Map.Entry<String, List<i>> entry : this.d.entrySet()) {
                hashMap.put(entry.getKey(), new ArrayList(entry.getValue()));
            }
            return hashMap;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    static final class b implements i {
        private final String a;

        b(String str) {
            this.a = str;
        }

        @Override // com.bumptech.glide.load.model.i
        public final String a() {
            return this.a;
        }

        public final String toString() {
            return "StringHeaderFactory{value='" + this.a + "'}";
        }

        public final boolean equals(Object obj) {
            if (obj instanceof b) {
                return this.a.equals(((b) obj).a);
            }
            return false;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }
    }
}
