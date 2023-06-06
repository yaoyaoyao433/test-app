package com.facebook.react.common;

import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class c {
    public static <K, V> HashMap<K, V> a() {
        return new HashMap<>();
    }

    public static <K, V> a<K, V> b() {
        return new a<>();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static final class a<K, V> {
        private Map a;
        private boolean b;

        private a() {
            this.a = new HashMap();
            this.b = true;
        }

        public final a<K, V> a(K k, V v) {
            if (!this.b) {
                throw new IllegalStateException("Underlying map has already been built");
            }
            this.a.put(k, v);
            return this;
        }

        public final Map<K, V> a() {
            if (!this.b) {
                throw new IllegalStateException("Underlying map has already been built");
            }
            this.b = false;
            return this.a;
        }
    }

    public static <K, V> Map<K, V> a(K k, V v) {
        HashMap hashMap = new HashMap();
        hashMap.put(k, v);
        return hashMap;
    }

    public static <K, V> Map<K, V> a(K k, V v, K k2, V v2) {
        HashMap hashMap = new HashMap();
        hashMap.put(k, v);
        hashMap.put(k2, v2);
        return hashMap;
    }

    public static <K, V> Map<K, V> a(K k, V v, K k2, V v2, K k3, V v3) {
        HashMap hashMap = new HashMap();
        hashMap.put(k, v);
        hashMap.put(k2, v2);
        hashMap.put(k3, v3);
        return hashMap;
    }

    public static <K, V> Map<K, V> a(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4) {
        HashMap hashMap = new HashMap();
        hashMap.put(k, v);
        hashMap.put(k2, v2);
        hashMap.put(k3, v3);
        hashMap.put(k4, v4);
        return hashMap;
    }

    public static <K, V> Map<K, V> a(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5) {
        HashMap hashMap = new HashMap();
        hashMap.put(k, v);
        hashMap.put(k2, v2);
        hashMap.put(k3, v3);
        hashMap.put(k4, v4);
        hashMap.put(k5, v5);
        return hashMap;
    }

    public static <K, V> Map<K, V> a(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5, K k6, V v6) {
        HashMap hashMap = new HashMap();
        hashMap.put(k, v);
        hashMap.put(k2, v2);
        hashMap.put(k3, v3);
        hashMap.put(k4, v4);
        hashMap.put(k5, v5);
        hashMap.put(k6, v6);
        return hashMap;
    }

    public static <K, V> Map<K, V> a(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5, K k6, V v6, K k7, V v7) {
        HashMap hashMap = new HashMap();
        hashMap.put(k, v);
        hashMap.put(k2, v2);
        hashMap.put(k3, v3);
        hashMap.put(k4, v4);
        hashMap.put(k5, v5);
        hashMap.put(k6, v6);
        hashMap.put(k7, v7);
        return hashMap;
    }
}
