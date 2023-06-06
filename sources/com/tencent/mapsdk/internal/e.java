package com.tencent.mapsdk.internal;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class e extends c {
    protected HashMap<String, byte[]> e = null;
    private HashMap<String, Object> g = new HashMap<>();
    m f = new m();

    @Override // com.tencent.mapsdk.internal.c
    public final /* bridge */ /* synthetic */ String a() {
        return super.a();
    }

    @Override // com.tencent.mapsdk.internal.c
    public final /* bridge */ /* synthetic */ String a(Object obj) {
        return super.a((e) obj);
    }

    @Override // com.tencent.mapsdk.internal.c
    public final /* bridge */ /* synthetic */ void a(String str) {
        super.a(str);
    }

    public void g() {
        this.e = new HashMap<>();
    }

    @Override // com.tencent.mapsdk.internal.c
    public final void b() {
        this.g.clear();
    }

    @Override // com.tencent.mapsdk.internal.c
    public final Set<String> c() {
        if (this.e != null) {
            return Collections.unmodifiableSet(this.e.keySet());
        }
        return Collections.unmodifiableSet(this.a.keySet());
    }

    @Override // com.tencent.mapsdk.internal.c
    public final boolean d() {
        if (this.e != null) {
            return this.e.isEmpty();
        }
        return this.a.isEmpty();
    }

    @Override // com.tencent.mapsdk.internal.c
    public final int e() {
        if (this.e != null) {
            return this.e.size();
        }
        return this.a.size();
    }

    @Override // com.tencent.mapsdk.internal.c
    public final boolean b(String str) {
        if (this.e != null) {
            return this.e.containsKey(str);
        }
        return this.a.containsKey(str);
    }

    @Override // com.tencent.mapsdk.internal.c
    public <T> void a(String str, T t) {
        if (this.e == null) {
            super.a(str, (String) t);
        } else if (str == null) {
            throw new IllegalArgumentException("put key can not is null");
        } else {
            if (t == null) {
                throw new IllegalArgumentException("put value can not is null");
            }
            if (t instanceof Set) {
                throw new IllegalArgumentException("can not support Set");
            }
            n nVar = new n();
            nVar.a(this.c);
            nVar.a(t, 0);
            this.e.put(str, q.a(nVar.a));
        }
    }

    private <T> T b(String str, T t) throws b {
        if (this.e.containsKey(str)) {
            if (this.g.containsKey(str)) {
                return (T) this.g.get(str);
            }
            try {
                T t2 = (T) a(this.e.get(str), t);
                if (t2 != null) {
                    d(str, t2);
                }
                return t2;
            } catch (Exception e) {
                throw new b(e);
            }
        }
        return null;
    }

    private <T> T c(String str, T t) throws b {
        if (this.e != null) {
            if (this.e.containsKey(str)) {
                if (this.g.containsKey(str)) {
                    return (T) this.g.get(str);
                }
                try {
                    T t2 = (T) a(this.e.get(str), t);
                    if (t2 != null) {
                        d(str, t2);
                    }
                    return t2;
                } catch (Exception e) {
                    throw new b(e);
                }
            }
            return null;
        } else if (this.a.containsKey(str)) {
            if (this.g.containsKey(str)) {
                return (T) this.g.get(str);
            }
            byte[] bArr = new byte[0];
            Iterator<Map.Entry<String, byte[]>> it = this.a.get(str).entrySet().iterator();
            if (it.hasNext()) {
                Map.Entry<String, byte[]> next = it.next();
                next.getKey();
                bArr = next.getValue();
            }
            try {
                this.f.a(bArr);
                this.f.a(this.c);
                T t3 = (T) this.f.a((m) t, 0, true);
                d(str, t3);
                return t3;
            } catch (Exception e2) {
                throw new b(e2);
            }
        } else {
            return null;
        }
    }

    private <T> T a(String str, T t, T t2) throws b {
        if (this.e != null) {
            if (this.e.containsKey(str)) {
                if (this.g.containsKey(str)) {
                    return (T) this.g.get(str);
                }
                try {
                    T t3 = (T) a(this.e.get(str), t);
                    if (t3 != null) {
                        d(str, t3);
                    }
                    return t3;
                } catch (Exception e) {
                    throw new b(e);
                }
            }
            return t2;
        } else if (this.a.containsKey(str)) {
            if (this.g.containsKey(str)) {
                return (T) this.g.get(str);
            }
            byte[] bArr = new byte[0];
            Iterator<Map.Entry<String, byte[]>> it = this.a.get(str).entrySet().iterator();
            if (it.hasNext()) {
                Map.Entry<String, byte[]> next = it.next();
                next.getKey();
                bArr = next.getValue();
            }
            try {
                this.f.a(bArr);
                this.f.a(this.c);
                T t4 = (T) this.f.a((m) t, 0, true);
                d(str, t4);
                return t4;
            } catch (Exception e2) {
                throw new b(e2);
            }
        } else {
            return t2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private <T> T b(String str, T t, Object obj) {
        return !this.e.containsKey(str) ? obj : (T) c(str, t);
    }

    private Object a(byte[] bArr, Object obj) {
        this.f.a(bArr);
        this.f.a(this.c);
        return this.f.a((m) obj, 0, true);
    }

    private void d(String str, Object obj) {
        this.g.put(str, obj);
    }

    private <T> T c(String str) throws b {
        return (T) a(str, true, (ClassLoader) null);
    }

    @Override // com.tencent.mapsdk.internal.c
    public final <T> T a(String str, boolean z, ClassLoader classLoader) throws b {
        if (this.e != null) {
            throw new RuntimeException("data is encoded by new version, please use getJceStruct(String name,T proxy)");
        }
        return (T) super.a(str, z, classLoader);
    }

    private <T> T d(String str) throws b {
        return (T) b(str, true, (ClassLoader) null);
    }

    @Override // com.tencent.mapsdk.internal.c
    public final <T> T b(String str, boolean z, ClassLoader classLoader) throws b {
        if (this.e != null) {
            throw new RuntimeException("data is encoded by new version, please use getByClass(String name, T proxy)");
        }
        return (T) super.b(str, z, classLoader);
    }

    private <T> T e(String str, Object obj) {
        return (T) a(str, obj, true, null);
    }

    @Override // com.tencent.mapsdk.internal.c
    public final <T> T a(String str, Object obj, boolean z, ClassLoader classLoader) {
        if (this.e != null) {
            throw new RuntimeException("data is encoded by new version, please use getByClass(String name, T proxy, Object defaultValue)");
        }
        return (T) super.a(str, obj, z, classLoader);
    }

    private <T> T e(String str) throws b {
        return (T) c(str, true, null);
    }

    @Override // com.tencent.mapsdk.internal.c
    public final <T> T c(String str, boolean z, ClassLoader classLoader) throws b {
        if (this.e != null) {
            if (this.e.containsKey(str)) {
                this.e.remove(str);
                return null;
            }
            return null;
        }
        return (T) super.c(str, z, classLoader);
    }

    private <T> T f(String str, T t) throws b {
        if (this.e.containsKey(str)) {
            if (t != null) {
                return (T) a(this.e.remove(str), t);
            }
            this.e.remove(str);
            return null;
        }
        return null;
    }

    @Override // com.tencent.mapsdk.internal.c
    public byte[] f() {
        if (this.e != null) {
            n nVar = new n(0);
            nVar.a(this.c);
            nVar.a((Map) this.e, 0);
            return q.a(nVar.a);
        }
        return super.f();
    }

    public void b(byte[] bArr) {
        this.f.a(bArr);
        this.f.a(this.c);
        HashMap hashMap = new HashMap(1);
        hashMap.put("", new byte[0]);
        this.e = this.f.a((Map) hashMap, 0, false);
    }

    public void c(byte[] bArr) {
        super.a(bArr);
    }

    @Override // com.tencent.mapsdk.internal.c
    public void a(byte[] bArr) {
        try {
            super.a(bArr);
        } catch (Exception unused) {
            this.f.a(bArr);
            this.f.a(this.c);
            HashMap hashMap = new HashMap(1);
            hashMap.put("", new byte[0]);
            this.e = this.f.a((Map) hashMap, 0, false);
        }
    }
}
