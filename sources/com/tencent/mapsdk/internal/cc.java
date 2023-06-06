package com.tencent.mapsdk.internal;

import com.tencent.mapsdk.internal.ch;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public abstract class cc implements ce {
    String a;
    private cg g;
    private final Set<a> f = new LinkedHashSet();
    public final cn b = new cn();

    abstract <S extends ci> S b(Class<S> cls);

    @Override // com.tencent.mapsdk.internal.ce
    public final String a() {
        return this.a;
    }

    private cn d() {
        return this.b;
    }

    @Override // com.tencent.mapsdk.internal.ch
    public final ch.a a(String str) {
        return b(str);
    }

    @Override // com.tencent.mapsdk.internal.ch
    public final cg b() {
        return this.g;
    }

    private void c(String str) {
        this.a = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(cg cgVar) {
        if (this.g != cgVar) {
            this.g = cgVar;
            for (Class<? extends p> cls : this.g.a_()) {
                o.a(cls);
            }
            Map<String, Class<? extends ch.a>> a2 = this.g.a();
            this.f.clear();
            for (Map.Entry<String, Class<? extends ch.a>> entry : a2.entrySet()) {
                try {
                    this.f.add(new a(entry.getKey(), entry.getValue(), cc.class.getDeclaredMethod("b", Class.class)));
                } catch (NoSuchMethodException e) {
                    throw new IllegalStateException(e);
                }
            }
            Map<String, String> c = this.g.c();
            if (c == null || c.isEmpty()) {
                return;
            }
            for (Map.Entry<String, String> entry2 : c.entrySet()) {
                a(entry2.getKey(), entry2.getValue());
            }
        }
    }

    private void a(String str, String str2) {
        for (a aVar : this.f) {
            if (aVar.d == null) {
                aVar.d = new HashMap();
            }
            aVar.d.put(str, str2);
            if (aVar.e != 0) {
                aVar.e.a(aVar.d);
            }
        }
    }

    @Override // com.tencent.mapsdk.internal.ch
    public final <T extends ch.a> void a(String str, Class<T> cls) {
        try {
            this.f.add(new a(str, cls, cc.class.getDeclaredMethod("b", Class.class)));
        } catch (NoSuchMethodException e) {
            throw new IllegalStateException(e);
        }
    }

    @Override // com.tencent.mapsdk.internal.ch
    public final <T extends p> void a(Class<T> cls) {
        o.a(cls);
    }

    private a d(String str) {
        for (a aVar : this.f) {
            if (aVar.a.equals(str)) {
                return aVar;
            }
        }
        return null;
    }

    private a d(Class cls) {
        for (a aVar : this.f) {
            if (aVar.b.equals(cls)) {
                return aVar;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final <S extends ci> S b(String str) {
        a d = d(str);
        if (d != null) {
            if (d.e != null) {
                return d.e;
            }
            return (S) e(d.b);
        }
        return null;
    }

    private <S extends ci> S e(Class<S> cls) {
        for (a aVar : this.f) {
            if (aVar.b == cls) {
                Method method = aVar.c;
                if (method != null) {
                    try {
                        method.setAccessible(true);
                        Object invoke = method.invoke(this, aVar.b);
                        if (invoke == null || invoke.getClass() != cls) {
                            return null;
                        }
                        S s = (S) invoke;
                        s.a(aVar.d);
                        aVar.e = s;
                        return s;
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                        return null;
                    } catch (InvocationTargetException e2) {
                        e2.printStackTrace();
                        return null;
                    }
                }
                return null;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static final class a<S extends ci> {
        String a;
        Class<S> b;
        Method c;
        Map<String, String> d;
        S e;

        a(String str, Class cls, Method method) {
            this.a = str;
            this.b = cls;
            this.c = method;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final <S extends ci> S c(Class<S> cls) {
        a aVar;
        Iterator<a> it = this.f.iterator();
        while (true) {
            if (!it.hasNext()) {
                aVar = null;
                break;
            }
            aVar = it.next();
            if (aVar.b.equals(cls)) {
                break;
            }
        }
        if (aVar != null) {
            if (aVar.e != null) {
                return aVar.e;
            }
            return (S) e(aVar.b);
        }
        return null;
    }

    @Override // com.tencent.mapsdk.internal.cf
    public final /* bridge */ /* synthetic */ cm c() {
        return this.b;
    }
}
