package com.meituan.mtwebkit.internal.task;

import android.util.Log;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class a<Out> {
    private static b a;
    public static ChangeQuickRedirect c;
    public static final ThreadLocal<b> d = new ThreadLocal<>();
    public volatile boolean e;
    public Throwable f;
    public Out g;
    public b h;
    public LinkedList<c> i;
    public c j;

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class b {
        public HashMap<Class<?>, a<?>> a = new HashMap<>();
        public LinkedList<a<?>> b = new LinkedList<>();
        public LinkedList<c> c = new LinkedList<>();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class c {
        public a<?> a;
        public long b;
        public long c;
        public Throwable d;
    }

    public Out b() throws Throwable {
        return null;
    }

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c04ce48f5cf8af7ba392fe159b90d1fd", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c04ce48f5cf8af7ba392fe159b90d1fd");
        } else {
            this.e = false;
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.meituan.mtwebkit.internal.task.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    class C0501a implements com.meituan.mtwebkit.internal.task.b<Out> {
        public static ChangeQuickRedirect a;

        public C0501a() {
        }

        @Override // com.meituan.mtwebkit.internal.task.b
        public final void a(Out out) {
            Object[] objArr = {out};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c6cb0b74af9b515d70ea8445349283dc", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c6cb0b74af9b515d70ea8445349283dc");
                return;
            }
            a.this.g = out;
            b();
        }

        @Override // com.meituan.mtwebkit.internal.task.b
        public final void a(Throwable th) {
            Object[] objArr = {th};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fe6291c1608389c310a0a08c289629dc", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fe6291c1608389c310a0a08c289629dc");
                return;
            }
            a.this.f = th;
            b();
        }

        public final synchronized void a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d7ccf5d5be2e2ed575436d266f092f86", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d7ccf5d5be2e2ed575436d266f092f86");
                return;
            }
            while (!a.this.e) {
                try {
                    wait();
                    return;
                } catch (InterruptedException unused) {
                    try {
                        Thread.sleep(300L);
                    } catch (InterruptedException unused2) {
                    }
                }
            }
        }

        private synchronized void b() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "97a4c644ece277df810b4432c83c5153", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "97a4c644ece277df810b4432c83c5153");
                return;
            }
            a.this.e = true;
            notifyAll();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Out c() throws com.meituan.mtwebkit.internal.task.c {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1210c5299987398cac5cbdd98e1a28a1", RobustBitConfig.DEFAULT_VALUE)) {
            return (Out) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1210c5299987398cac5cbdd98e1a28a1");
        }
        if (this.e) {
            Log.e("StreamTask", "task " + this + " has called before, skip");
            return this.g;
        }
        this.j = new c();
        this.j.b = System.currentTimeMillis();
        if (a != null) {
            if (this.h != null) {
                this.h.a.putAll(a.a);
            } else {
                this.h = a;
            }
            a = null;
        }
        b bVar = d.get();
        if (bVar == null) {
            if (this.h != null) {
                bVar = this.h;
            } else {
                bVar = new b();
                this.h = bVar;
            }
            d.set(bVar);
        }
        if (bVar.b.size() == 0) {
            bVar.a.put(getClass(), this);
        }
        a((a<?>) this, (Map<Class<?>, a<?>>) bVar.a);
        Iterator<a<?>> it = bVar.b.iterator();
        while (it.hasNext()) {
            if (it.next() == this) {
                throw new com.meituan.mtwebkit.internal.task.c((a<?>) this, a(bVar.b, (a<?>) this));
            }
        }
        bVar.b.add(this);
        try {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = c;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f4b6141432a60ef0bc37acc91e309321", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f4b6141432a60ef0bc37acc91e309321");
            } else {
                Log.e("StreamTask", "task " + this + " begin run");
                try {
                    C0501a c0501a = new C0501a();
                    a(c0501a);
                    c0501a.a();
                    if (this.f != null) {
                        throw this.f;
                    }
                    Log.e("StreamTask", "task " + this + " end run, out is " + this.g);
                } catch (com.meituan.mtwebkit.internal.task.c e) {
                    throw e;
                }
            }
            return this.g;
        } finally {
            this.j.c = System.currentTimeMillis();
            this.j.a = this;
            bVar.c.addFirst(this.j);
            this.i = new LinkedList<>();
            this.i.addAll(bVar.c);
            bVar.b.removeLast();
            if (bVar.b.size() == 0) {
                d.remove();
            }
        }
    }

    public final LinkedList<c> d() throws Exception {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f793223aabd693100e30e398882271f0", RobustBitConfig.DEFAULT_VALUE)) {
            return (LinkedList) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f793223aabd693100e30e398882271f0");
        }
        if (!this.e) {
            throw new AssertionError("can not call getLog before getOut");
        }
        return this.i;
    }

    private String a(LinkedList<a<?>> linkedList, a<?> aVar) {
        boolean z = false;
        Object[] objArr = {linkedList, aVar};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d71e99a2ec5f2b735b3eaff026729b44", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d71e99a2ec5f2b735b3eaff026729b44");
        }
        StringBuilder sb = new StringBuilder("found circular dependency: ");
        Iterator<a<?>> it = linkedList.iterator();
        while (it.hasNext()) {
            a<?> next = it.next();
            if (next == aVar) {
                z = true;
            }
            if (z) {
                sb.append(next.a());
                sb.append(" -> ");
            }
        }
        sb.append(aVar.a());
        return sb.toString();
    }

    public void a(com.meituan.mtwebkit.internal.task.b<Out> bVar) throws Throwable {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "daeaafe553f3c037d6e82554d7b92615", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "daeaafe553f3c037d6e82554d7b92615");
            return;
        }
        try {
            this.g = b();
            bVar.a((com.meituan.mtwebkit.internal.task.b<Out>) this.g);
        } catch (Throwable th) {
            bVar.a(th);
        }
    }

    private static void a(a<?> aVar, Map<Class<?>, a<?>> map) {
        List<Field> list;
        Field[] declaredFields;
        Object[] objArr = {aVar, map};
        ChangeQuickRedirect changeQuickRedirect = c;
        ArrayList arrayList = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c2fa623786e90b627eacf1ff65bedb9c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c2fa623786e90b627eacf1ff65bedb9c");
            return;
        }
        Class<?> cls = aVar.getClass();
        Object[] objArr2 = {cls};
        ChangeQuickRedirect changeQuickRedirect2 = c;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "a3b168466a4fb78c27dcedd6cccb6b7e", RobustBitConfig.DEFAULT_VALUE)) {
            list = (List) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "a3b168466a4fb78c27dcedd6cccb6b7e");
        } else {
            while (cls != null) {
                ArrayList arrayList2 = arrayList;
                for (Field field : cls.getDeclaredFields()) {
                    if (field.isAnnotationPresent(Depend.class)) {
                        if (!a.class.isAssignableFrom(field.getType())) {
                            throw new AssertionError("field " + field.getName() + "in class " + cls.getName() + " not assign from StreamTask");
                        }
                        if (arrayList2 == null) {
                            arrayList2 = new ArrayList();
                        }
                        arrayList2.add(field);
                    }
                }
                cls = cls.getSuperclass();
                arrayList = arrayList2;
            }
            list = arrayList;
        }
        if (list != null) {
            for (Field field2 : list) {
                try {
                    field2.setAccessible(true);
                    if (((a) field2.get(aVar)) == null) {
                        Class<?> type = field2.getType();
                        a<?> aVar2 = map.get(type);
                        if (aVar2 == null) {
                            Constructor<?> declaredConstructor = type.getDeclaredConstructor(new Class[0]);
                            declaredConstructor.setAccessible(true);
                            aVar2 = (a) declaredConstructor.newInstance(new Object[0]);
                            map.put(type, aVar2);
                        }
                        field2.set(aVar, aVar2);
                    }
                } catch (IllegalAccessException | InstantiationException | InvocationTargetException e) {
                    e.printStackTrace();
                } catch (NoSuchMethodException e2) {
                    throw new AssertionError("field " + field2.getName() + "in class " + aVar + " must have a default class constructor or a default value", e2);
                }
            }
        }
    }

    private String a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2328a4304e90fa2a6a530b1a60d742c4", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2328a4304e90fa2a6a530b1a60d742c4");
        }
        return getClass().getSimpleName() + "@" + Integer.toHexString(hashCode());
    }
}
